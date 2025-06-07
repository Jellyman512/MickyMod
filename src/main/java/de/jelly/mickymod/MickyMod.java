package de.jelly.mickymod;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import de.jelly.mickymod.Toggler.CapeToggler;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.minecraft.client.MinecraftClient;
import net.minecraft.command.CommandSource;
import net.minecraft.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.mojang.datafixers.DSL.string;

public class MickyMod implements ModInitializer {
	public static MinecraftClient MC;

	public static final String MOD_ID = "micky-mod";
	public static final String MOD_DISPLAYNAME = "Micky Mod";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("MickyMod");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		MC = MinecraftClient.getInstance();

		ClientCommandRegistrationCallback.EVENT.register((commandDispatcher, commandRegistryAccess) -> {

			// Hier wird das Kommando mit FabricClientCommandSource registriert
			commandDispatcher.register(
					LiteralArgumentBuilder.<FabricClientCommandSource>literal("cape-default")
							.executes(context -> {
								// Deine Logik für das Toggeln des Capes
								CapeToggler.toggleDefaultCape();

								// Erfolgreiche Ausführung des Kommandos
								return 1;
							})
			);
		});
		ClientCommandRegistrationCallback.EVENT.register((commandDispatcher, commandRegistryAccess) -> {

			// Hier wird das Kommando mit FabricClientCommandSource registriert
			commandDispatcher.register(
					LiteralArgumentBuilder.<FabricClientCommandSource>literal("cape-RainerStinkler")
							.executes(context -> {
								// Deine Logik für das Toggeln des Capes
								CapeToggler.toggleRainerStinklerCape();

								// Erfolgreiche Ausführung des Kommandos
								return 1;
							})
			);
		});
		ClientCommandRegistrationCallback.EVENT.register((commandDispatcher, commandRegistryAccess) -> {

			// Hier wird das Kommando mit FabricClientCommandSource registriert
			commandDispatcher.register(
					LiteralArgumentBuilder.<FabricClientCommandSource>literal("cape-Special-Notch")
							.executes(context -> {
								// Deine Logik für das Toggeln des Capes
								CapeToggler.toggleNotchCape();

								// Erfolgreiche Ausführung des Kommandos
								return 1;
							})
			);
		});
		ClientCommandRegistrationCallback.EVENT.register((commandDispatcher, commandRegistryAccess) -> {

			// Hier wird das Kommando mit FabricClientCommandSource registriert
			commandDispatcher.register(
					LiteralArgumentBuilder.<FabricClientCommandSource>literal("cape-AxoBucket")
							.executes(context -> {
								// Deine Logik für das Toggeln des Capes
								CapeToggler.toggleAxoBucketCape();

								// Erfolgreiche Ausführung des Kommandos
								return 1;
							})
			);
		});
		ClientCommandRegistrationCallback.EVENT.register((commandDispatcher, commandRegistryAccess) -> {

			// Hier wird das Kommando mit FabricClientCommandSource registriert
			commandDispatcher.register(
					LiteralArgumentBuilder.<FabricClientCommandSource>literal("cape-Fox")
							.executes(context -> {
								// Deine Logik für das Toggeln des Capes
								CapeToggler.toggleFoxCape();

								// Erfolgreiche Ausführung des Kommandos
								return 1;
							})
			);
		});
		ClientCommandRegistrationCallback.EVENT.register((commandDispatcher, commandRegistryAccess) -> {

			// Hier wird das Kommando mit FabricClientCommandSource registriert
			commandDispatcher.register(
					LiteralArgumentBuilder.<FabricClientCommandSource>literal("cape-minecon-2013")
							.executes(context -> {
								// Deine Logik für das Toggeln des Capes
								CapeToggler.toggleMinecon13();

								// Erfolgreiche Ausführung des Kommandos
								return 1;
							})
			);
		});
		ClientCommandRegistrationCallback.EVENT.register((commandDispatcher, commandRegistryAccess) -> {

			// Hier wird das Kommando mit FabricClientCommandSource registriert
			commandDispatcher.register(
					LiteralArgumentBuilder.<FabricClientCommandSource>literal("cape-minecon-2015")
							.executes(context -> {
								// Deine Logik für das Toggeln des Capes
								CapeToggler.toggleMinecon15();

								// Erfolgreiche Ausführung des Kommandos
								return 1;
							})
			);
		});
		ClientCommandRegistrationCallback.EVENT.register((commandDispatcher, commandRegistryAccess) -> {

			// Hier wird das Kommando mit FabricClientCommandSource registriert
			commandDispatcher.register(
					LiteralArgumentBuilder.<FabricClientCommandSource>literal("cape-minecon-migrator")
							.executes(context -> {
								// Deine Logik für das Toggeln des Capes
								CapeToggler.toggleMineconMigrator();

								// Erfolgreiche Ausführung des Kommandos
								return 1;
							})
			);
		});
		ClientCommandRegistrationCallback.EVENT.register((commandDispatcher, commandRegistryAccess) -> {

			// Hier wird das Kommando mit FabricClientCommandSource registriert
			commandDispatcher.register(
					LiteralArgumentBuilder.<FabricClientCommandSource>literal("cape-EnderDragon")
							.executes(context -> {
								// Deine Logik für das Toggeln des Capes
								CapeToggler.toggleEnderDragon();

								// Erfolgreiche Ausführung des Kommandos
								return 1;
							})
			);
		});
		ClientCommandRegistrationCallback.EVENT.register((commandDispatcher, commandRegistryAccess) -> {

			// Hier wird das Kommando mit FabricClientCommandSource registriert
			commandDispatcher.register(
					LiteralArgumentBuilder.<FabricClientCommandSource>literal("cape-duck")
							.executes(context -> {
								// Deine Logik für das Toggeln des Capes
								CapeToggler.toggleDuckCape();

								// Erfolgreiche Ausführung des Kommandos
								return 1;
							})
			);
		});
		ClientCommandRegistrationCallback.EVENT.register((commandDispatcher, commandRegistryAccess) -> {

			// Hier wird das Kommando mit FabricClientCommandSource registriert
			commandDispatcher.register(
					LiteralArgumentBuilder.<FabricClientCommandSource>literal("cape-glass")
							.executes(context -> {
								// Deine Logik für das Toggeln des Capes
								CapeToggler.toggleGlasCape();

								// Erfolgreiche Ausführung des Kommandos
								return 1;
							})
			);
		});
		ClientCommandRegistrationCallback.EVENT.register((commandDispatcher, commandRegistryAccess) -> {

			// Hier wird das Kommando mit FabricClientCommandSource registriert
			commandDispatcher.register(
					LiteralArgumentBuilder.<FabricClientCommandSource>literal("cape-chicken")
							.executes(context -> {
								// Deine Logik für das Toggeln des Capes
								CapeToggler.toggleChickenCape();

								// Erfolgreiche Ausführung des Kommandos
								return 1;
							})
			);
		});

		LOGGER.info("Micky Mod Loaded Good Skibidi Ohio Downtown Gigachad Skibidi Rizzler");
	}
}