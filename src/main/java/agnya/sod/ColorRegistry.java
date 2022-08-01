package agnya.sod;

import net.fabricmc.api.ClientModInitializer;

public class ColorRegistry implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		SodBlocks.colorreg();
	}
}
