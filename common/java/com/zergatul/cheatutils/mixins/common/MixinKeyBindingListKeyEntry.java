package com.zergatul.cheatutils.mixins.common;

import net.minecraft.client.gui.screens.options.controls.KeyBindsList;
import net.minecraft.network.chat.Component;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(KeyBindsList.KeyEntry.class)
public abstract class MixinKeyBindingListKeyEntry {

    @ModifyArg(
            method = "renderContent",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiGraphics;drawString(Lnet/minecraft/client/gui/Font;Lnet/minecraft/network/chat/Component;III)V"))
    private Component onRenderKeyName(Component component) {
        // Просто возвращаем оригинальный компонент без изменений
        return component;
    }
}
