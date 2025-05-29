package de.jelly.mickymod;

import de.jelly.mickymod.modules.TestModule;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MickyMod implements ModInitializer {
	public static final String MOD_ID = "micky-mod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("MickyMod");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		TestModule testModule = new TestModule();

		LOGGER.info("Micky Mod Loaded Good Skibidi Ohio Downtown Gigachad Skibidi Rizzler");
	}
}