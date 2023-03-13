package com.fixthegame;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FixTheGame implements ModInitializer {
	public static final String MODID = "fix-the-game";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
	

	public static boolean disableVillagerBreeding;
	public static float scalehealth;
	@Override
	public void onInitialize() {
		ModConfig config = new ModConfig();
		config.load();

		disableVillagerBreeding = config.disableVillagerBreeding;
		scalehealth = config.scalehealth;

		LOGGER.info("Fixing your game...");
	}
	
}