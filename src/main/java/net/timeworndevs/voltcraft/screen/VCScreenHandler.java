package net.timeworndevs.voltcraft.screen;

import net.minecraft.screen.ScreenHandlerType;

public class VCScreenHandler {

    public static ScreenHandlerType<PoweredFurnaceScreenHandler> POWERED_FURNACE_SCREENHANDLER;

    public static void register() {
        POWERED_FURNACE_SCREENHANDLER = new ScreenHandlerType<>(PoweredFurnaceScreenHandler::new);
    }
}
