package com.fixthegame;

import me.lortseam.completeconfig.api.ConfigEntry;
import me.lortseam.completeconfig.data.Config;
import me.lortseam.completeconfig.data.ConfigOptions;

public class ModConfig extends Config{
    public ModConfig() {
        super(ConfigOptions.mod(FixTheGame.MODID));
    }

    @ConfigEntry(comment = "This is the config file for Nerf the game.\nALL FEATURES ARE DISABLED BY DEFAULT!\nEnable the features you would like to\n\nDisables villager breeding, but villagers will continue\nto pick up food. ")
    boolean disableVillagerBreeding = false;

    @ConfigEntry(comment = "Scales the health of all mobs (not including the player) by specified value.")
    float scalehealth = 1;
}
