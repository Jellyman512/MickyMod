package de.jelly.mickymod.mixin;

import de.jelly.mickymod.MickyMod;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameHud.class)
public class InGameHudMixin {

    @Inject(method = "render", at = @At("HEAD"))
    private void onRender(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player == null || client.world == null) return;

        TextRenderer renderer = client.textRenderer;
        MatrixStack matrices = context.getMatrices();

        int x = 5;
        int y = 5;

        // Farben
        int shadowColor = 0x000000; // Schwarz
        int mainColor = 0xFF5151;   // Pink für Alpha hack
        int subColor = 0xFFFFFF;    // Weiß für FPS & Koordinaten

        // === ALPHA HACK (groß + pink) ===
        matrices.push();
        float scaleMain = 2.0f;
        matrices.scale(scaleMain, scaleMain, 1.0f);

        Text alphaText = Text.literal(MickyMod.MOD_DISPLAYNAME).formatted(Formatting.BOLD);
        int mainX = (int)(x / scaleMain);
        int mainY = (int)(y / scaleMain);

        context.drawText(renderer, alphaText, mainX + 1, mainY + 1, shadowColor, false);
        context.drawText(renderer, alphaText, mainX, mainY, mainColor, false);

        matrices.pop();

        // === FPS + COORDINATES (klein + weiß) ===
        String[] infoLines = new String[] {
                "FPS: " + client.getCurrentFps(),
                String.format("XYZ: %.1f / %.1f / %.1f",
                        client.player.getX(),
                        client.player.getY(),
                        client.player.getZ())
        };

        int smallTextY = y + 25; // Etwas Abstand unter dem großen Titel
        int lineHeight = 10;

        for (int i = 0; i < infoLines.length; i++) {
            Text infoText = Text.literal(infoLines[i]);

            int drawX = x;
            int drawY = smallTextY + i * lineHeight;

            context.drawText(renderer, infoText, drawX + 1, drawY + 1, shadowColor, false); // Schatten
            context.drawText(renderer, infoText, drawX, drawY, subColor, false);             // Weißer Text
        }
    }
}
