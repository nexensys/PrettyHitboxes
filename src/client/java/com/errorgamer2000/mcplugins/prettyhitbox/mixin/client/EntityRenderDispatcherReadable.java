package com.errorgamer2000.mcplugins.prettyhitbox.mixin.client;

import net.minecraft.client.render.entity.EntityRenderDispatcher;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(EntityRenderDispatcher.class)
public interface EntityRenderDispatcherReadable {
    @Accessor("renderHitboxes")
    boolean renderHitboxes();
}
