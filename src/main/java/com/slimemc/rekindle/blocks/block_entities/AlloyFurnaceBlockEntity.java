package com.slimemc.rekindle.blocks.block_entities;

import com.google.common.collect.Maps;
import com.slimemc.rekindle.blocks.AlloyFurnaceBlock;
import com.slimemc.rekindle.recipes.AlloyFurnaceRecipe;
import com.slimemc.rekindle.registery.ModItems;
import com.slimemc.rekindle.screen.AlloyFurnaceScreenHandler;
import com.slimemc.rekindle.util.ImplementedInventory;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SidedInventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.Optional;

public class AlloyFurnaceBlockEntity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory, SidedInventory {
    private static final int[] TOP_SLOTS = new int[]{0, 1};
    private static final int[] BOTTOM_SLOTS = new int[]{2};
    private static final int[] SIDE_SLOTS = new int[]{3};
    private final DefaultedList<ItemStack> inventory =
            DefaultedList.ofSize(4, ItemStack.EMPTY);
    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress;
    private int fuelTime = 0;
    private int maxFuelTime = 0;
    private int count;

    public AlloyFurnaceBlockEntity(BlockPos pos, BlockState state) {
        super(RekindleBlockEntities.ALLOY_FURNACE_BLOCK_ENTITY, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            public int get(int index) {
                switch (index) {
                    case 0: return AlloyFurnaceBlockEntity.this.progress;
                    case 1: return AlloyFurnaceBlockEntity.this.maxProgress;
                    case 2: return AlloyFurnaceBlockEntity.this.fuelTime;
                    case 3: return AlloyFurnaceBlockEntity.this.maxFuelTime;
                    default: return 0;
                }
            }

            public void set(int index, int value) {
                switch(index) {
                    case 0: AlloyFurnaceBlockEntity.this.progress = value; break;
                    case 1: AlloyFurnaceBlockEntity.this.maxProgress = value; break;
                    case 2: AlloyFurnaceBlockEntity.this.fuelTime = value; break;
                    case 3: AlloyFurnaceBlockEntity.this.maxFuelTime = value; break;
                }
            }

            public int size() {
                return 4;
            }
        };
    }


    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    public Text getDisplayName() {
        return new TranslatableText("block.rekindle.alloy_furnace");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new AlloyFurnaceScreenHandler(syncId, inv, this, this.propertyDelegate);
    }
    @Override
    public void writeNbt(NbtCompound nbt) {
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("alloy.progress", progress);
        nbt.putInt("alloy.fuelTime", fuelTime);
        nbt.putInt("alloy.maxFuelTime", maxFuelTime);
        super.writeNbt(nbt);
    }
    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        super.readNbt(nbt);
        progress = nbt.getInt("alloy.progress");
        fuelTime = nbt.getInt("alloy.fuelTime");
        maxFuelTime = nbt.getInt("alloy.maxFuelTime");
    }
    // we were cheking if the entity wansnt brning to and has a recipe and we should check if it has fuel

    public static void tick(World world, BlockPos pos, BlockState state, AlloyFurnaceBlockEntity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.inventory.size());
        for (int i = 0; i < entity.inventory.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }
        entity.maxProgress = world.getRecipeManager()
                .getFirstMatch(AlloyFurnaceRecipe.Type.INSTANCE, inventory, world)
                .map(AlloyFurnaceRecipe::getProcessTime).orElse(200);
        boolean bl = entity.isBurning();
        boolean bl2 = false;
        entity.count = world.getRecipeManager()
                .getFirstMatch(AlloyFurnaceRecipe.Type.INSTANCE, inventory, world)
                .map(AlloyFurnaceRecipe::getOutputCount).orElse(1);
        if(entity.isBurning()) {
            entity.fuelTime--;
        }
        if (hasRecipe(entity)) {
            if(!entity.isBurning() && hasNotReachedStackLimit(entity)) {
                entity.fuelTime = FuelRegistry.INSTANCE.get(entity.removeStack(3, 1).getItem()) /15;
                entity.maxFuelTime = entity.fuelTime;
            } else {
                entity.progress++;
                entity.fuelTime--;
                if (entity.progress > entity.maxProgress) {
                    craftItem(entity);
                }
            }
        } else {
            entity.resetProgress();
        }
        if (bl != entity.isBurning()) {
            bl2 = true;
            state = state.with(AlloyFurnaceBlock.LIT, entity.isBurning());
            world.setBlockState(pos, state, Block.NOTIFY_ALL);
        }
        if (bl2) {
            markDirty(world, pos, state);
        }
    }
    private boolean isBurning() {
        return this.fuelTime > 0;
    }
    public static boolean canUseAsFuel(ItemStack stack) {
        return createFuelTimeMap().containsKey(stack.getItem());
    }
    public static Map<Item, Integer> createFuelTimeMap() {
        Map<Item, Integer> map = Maps.newLinkedHashMap();
        addFuel(map, Items.LAVA_BUCKET, 20000);
        addFuel(map, Items.BLAZE_ROD, 2400);
        addFuel(map, ModItems.BLAST_FUEL, 32000);
        return map;
    }
    private static void addFuel(Map<Item, Integer> fuelTimes, ItemConvertible item, int fuelTime) {
        Item item2 = item.asItem();
        fuelTimes.put(item2, fuelTime);
    }

    private static boolean hasRecipe(AlloyFurnaceBlockEntity entity) {
        World world = entity.world;
        SimpleInventory inventory = new SimpleInventory(entity.inventory.size());
        for (int i = 0; i < entity.inventory.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<AlloyFurnaceRecipe> match = world.getRecipeManager()
                .getFirstMatch(AlloyFurnaceRecipe.Type.INSTANCE, inventory, world);
        return match.isPresent()
                && canInsertAmountIntoOutputSlot(inventory)
                && canInsertItemIntoOutputSlot(inventory, match.get().getOutput())
                && !inventory.getStack(3).isEmpty();
    }
    private void resetProgress() {
        this.progress = 0;
    }
    private static void craftItem(AlloyFurnaceBlockEntity entity) {
        World world = entity.world;
        SimpleInventory inventory = new SimpleInventory(entity.inventory.size());
        for (int i = 0; i < entity.inventory.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        Optional<AlloyFurnaceRecipe> match = world.getRecipeManager()
                .getFirstMatch(AlloyFurnaceRecipe.Type.INSTANCE, inventory, world);


        if(match.isPresent() && hasNotReachedStackLimit(entity)) {
            entity.removeStack(0,1);
            entity.removeStack(1,1);
            entity.setStack(2, new ItemStack(match.get().getOutput().getItem(),
                    entity.getStack(2).getCount() + entity.count));

            entity.resetProgress();
        }
    }
    public int[] getAvailableSlots(Direction side) {
        if (side == Direction.DOWN) {
            return BOTTOM_SLOTS;
        } else {
            return side == Direction.UP ? TOP_SLOTS : SIDE_SLOTS;
        }
    }

    @Override
    public boolean canInsert(int slot, ItemStack stack, @Nullable Direction dir) {
        return this.isValid(slot, stack);
    }

    @Override
    public boolean canExtract(int slot, ItemStack stack, Direction dir) {
        if (dir == Direction.DOWN && slot == 1) {
            return stack.isOf(Items.WATER_BUCKET) || stack.isOf(Items.BUCKET);
        } else {
            return true;
        }
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleInventory inventory, ItemStack output) {
        return inventory.getStack(2).getItem() == output.getItem() || inventory.getStack(2).isEmpty();
    }
    private static boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory) {
        return inventory.getStack(2).getMaxCount() > inventory.getStack(2).getCount();
    }
    private static boolean hasNotReachedStackLimit(AlloyFurnaceBlockEntity entity) {
        return entity.getStack(2).getCount() < entity.getStack(2).getMaxCount();
    }
}
