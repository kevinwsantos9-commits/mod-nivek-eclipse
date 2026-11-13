package com.nivek.eclipse.client;

import com.nivek.eclipse.NivekEclipse;
import net.fabricmc.api.ClientModInitializer;

public class NivekEclipseClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        NivekEclipse.LOGGER.info("NIVEK: ECLIPSE cliente inicializado");
    }
}
