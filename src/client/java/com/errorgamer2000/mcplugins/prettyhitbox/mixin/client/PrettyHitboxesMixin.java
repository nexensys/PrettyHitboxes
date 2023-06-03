package com.errorgamer2000.mcplugins.prettyhitbox.mixin.client;

import com.errorgamer2000.mcplugins.prettyhitbox.PrettyHitboxesConfig;
import me.shedaniel.autoconfig.AutoConfig;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class PrettyHitboxesMixin {
	@Inject(at = @At("HEAD"), method = "run")
	private void run(CallbackInfo info) {
		PrettyHitboxesConfig config = AutoConfig.getConfigHolder(PrettyHitboxesConfig.class).getConfig();
		MinecraftClient.getInstance().getEntityRenderDispatcher().setRenderHitboxes(config.hitboxesEnabledByDefault);
	}
}