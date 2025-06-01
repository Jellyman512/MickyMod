package de.jelly.mickymod.mixin;

import de.jelly.mickymod.MickyMod;
import de.jelly.mickymod.Toggler.CapeToggler;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.util.SkinTextures;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Objects;

@Mixin(AbstractClientPlayerEntity.class)
public abstract class AbstractClientPlayerEntityMixin {

    @Shadow
    protected abstract PlayerListEntry getPlayerListEntry();

    @Inject(method = "getSkinTextures", at = @At("TAIL"), cancellable = true)
    public void onGetSkinTextures(CallbackInfoReturnable<SkinTextures> cir) {
        PlayerListEntry playerListEntry = this.getPlayerListEntry();
        if (playerListEntry == null) return;

        if (Objects.equals(
                playerListEntry.getProfile().getId(),
                MinecraftClient.getInstance().getSession().getUuidOrNull()
        )) {
            SkinTextures original = cir.getReturnValue();
            Identifier capeIdentifier = Identifier.of(MickyMod.MOD_ID, "cape/" + CapeToggler.capevar + ".png");

            SkinTextures modified = new SkinTextures(
                    original.texture(),
                    original.textureUrl(),
                    capeIdentifier,
                    capeIdentifier,
                    original.model(),
                    original.secure()
            );

            cir.setReturnValue(modified);
        }
    }

}
