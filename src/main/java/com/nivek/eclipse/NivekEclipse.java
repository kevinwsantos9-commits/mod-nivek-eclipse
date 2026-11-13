package com.nivek.eclipse;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NivekEclipse implements ModInitializer {
    public static final String MOD_ID = "nivekeclipse";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("NIVEK: ECLIPSE inicializado (Fase 01 - Fundacao)");
    }
}
