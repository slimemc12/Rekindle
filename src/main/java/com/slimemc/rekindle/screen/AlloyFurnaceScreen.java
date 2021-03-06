package com.slimemc.rekindle.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import com.slimemc.rekindle.Rekindle;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class AlloyFurnaceScreen extends HandledScreen<AlloyFurnaceScreenHandler> {
    private static final Identifier TEXTURE =
            new Identifier(Rekindle.MOD_ID, "textures/gui/alloy_furnace_gui.png");
    public AlloyFurnaceScreen(AlloyFurnaceScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }
    @Override
    protected void init() {
        super.init();
        // Center the title
        titleX = (backgroundWidth - textRenderer.getWidth(title)) / 2;
    }

    @Override
    protected void drawBackground(MatrixStack matrices, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);
        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;
        drawTexture(matrices, x, y, 0, 0, backgroundWidth, backgroundHeight);
        if(handler.isCrafting()) {
            this.drawTexture(matrices, x + 98, y + 37, 176, 37, handler.getScaledProgress(), 24);

        }
        if(handler.hasFuel()) {
            this.drawTexture(matrices, x + 27, y + 35 + 14 - handler.getScaledFuelProgress(), 176,
                     14 - handler.getScaledFuelProgress(),14, handler.getScaledFuelProgress());
        }
    }


    @Override
    public void render(MatrixStack matrices, int mouseX, int mouseY, float delta) {
        renderBackground(matrices);
        super.render(matrices, mouseX, mouseY, delta);
        drawMouseoverTooltip(matrices, mouseX, mouseY);
    }
}
