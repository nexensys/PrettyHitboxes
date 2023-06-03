package com.errorgamer2000.mcplugins.prettyhitbox;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ClientModInitializer;

public class PrettyHitboxesModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		AutoConfig.register(PrettyHitboxesConfig.class, GsonConfigSerializer::new);
	}
}