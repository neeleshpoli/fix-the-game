package com.fixthegame;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FixTheGame implements ModInitializer {
	public static final String MODID = "fix-the-game";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
	

	public static boolean disableVillagerBreeding;
	public static float scalehealth, cropGrowthSlownessMultiplier, scaleBabyTime;
	@Override
	public void onInitialize() {
		ModConfig config = new ModConfig();
		config.load();

		disableVillagerBreeding = config.disableVillagerBreeding;
		scalehealth = config.scalehealth;
		cropGrowthSlownessMultiplier = config.cropGrowthSlownessMultiplier;
		scaleBabyTime = config.scaleBabyTime;

		LOGGER.info("Fixing your game...");
	}
}