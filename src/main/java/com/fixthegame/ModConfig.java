package com.fixthegame;

import me.lortseam.completeconfig.api.ConfigEntry;
import me.lortseam.completeconfig.data.Config;
import me.lortseam.completeconfig.data.ConfigOptions;

public class ModConfig extends Config{
    public ModConfig() {
        super(ConfigOptions.mod(FixTheGame.MODID));
    }

    @ConfigEntry(comment = "Disables villager breeding, but villagers will continue to pick up food. ")
    boolean disableVillagerBreeding = false;

    @ConfigEntry(comment = "Scales the health of all mobs (not including the player) by specified value.")
    @ConfigEntry.BoundedFloat(min = 0)
    float scalehealth = 1;

    @ConfigEntry(comment = "Sets the amount to slow down crop growth by, as a decimal (not a percent!). Set this to less than 1 in order to slow down the crop speed.")
    @ConfigEntry.BoundedFloat(min = 0)
    float cropGrowthSlownessMultiplier = 1;

    @ConfigEntry(comment = "Scales the amount of time it takes for a baby passive mob to grow.")
    @ConfigEntry.BoundedFloat(min = 0)
    float scaleBabyTime = 1;
}
