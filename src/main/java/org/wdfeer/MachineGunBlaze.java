package org.wdfeer;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MachineGunBlaze implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("machine_gun_blaze");

	@Override
	public void onInitialize() {
		LOGGER.info("Machine Gun Blaze initialized!");
	}
}