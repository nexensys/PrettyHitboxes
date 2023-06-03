package com.errorgamer2000.mcplugins.prettyhitbox;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "pretty-hitboxes")
public class PrettyHitboxesConfig implements ConfigData {
    public boolean hitboxesEnabledByDefault = false;

    public boolean hideBigDragonBox = false;

    public boolean showBoundingBox = true;
    public boolean showEyeHeight = true;
    public boolean showEntityRotationVector = true;
    public boolean differentColorWhenTargeted = false;

    @ConfigEntry.Gui.CollapsibleObject
    public Color boundingBoxColor = new Color(255, 255, 255);
    @ConfigEntry.Gui.CollapsibleObject
    public Color dragonPartColor = new Color(0, 255, 0);
    @ConfigEntry.Gui.CollapsibleObject
    public Color eyeHeightColor = new Color(255, 0, 0);
    @ConfigEntry.Gui.CollapsibleObject
    public Color entityRotationVectorColor = new Color(0, 0, 255);
    @ConfigEntry.Gui.CollapsibleObject
    public Color entityTargetedColor = new Color(100, 100, 100);


    public static class Color {
        public Color(int r, int g, int b) {
            this.red = r;
            this.green = g;
            this.blue = b;
        }
        public int red;
        public int green;
        public int blue;
        public int alpha = 100;
    }

    @Override
    public void validatePostLoad() throws ValidationException {

    }
}
