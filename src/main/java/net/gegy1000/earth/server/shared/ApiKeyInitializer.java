package net.gegy1000.earth.server.shared;

import com.google.gson.Gson;
import net.gegy1000.earth.TerrariumEarth;
import net.gegy1000.earth.server.util.ProcessTracker;
import net.gegy1000.earth.server.util.TrackedInputStream;
import net.gegy1000.earth.server.world.data.EarthApiKeys;
import net.minecraft.util.text.TextComponentTranslation;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public final class ApiKeyInitializer implements SharedDataInitializer {
    private final static String KEYS_URL = "https://terrarium.gegy.dev/geo3/keys.json";

    private final static Gson GSON = new Gson();

    @Override
    public void initialize(SharedEarthData data, ProcessTracker processTracker) {
        try (TrackedInputStream input = new TrackedInputStream(new URL(KEYS_URL).openStream())) {
            input.submitTo(new TextComponentTranslation("initializer.terrarium.api_keys"), processTracker);
            EarthApiKeys keys = loadKeys(input);
            data.put(SharedEarthData.API_KEYS, keys);
        } catch (IOException e) {
            TerrariumEarth.LOGGER.warn("Failed to get API keys", e);
        }
    }

    private static EarthApiKeys loadKeys(InputStream input) throws IOException {
        try (InputStreamReader reader = new InputStreamReader(new BufferedInputStream(input))) {
            return GSON.fromJson(reader, EarthApiKeys.class);
        }
    }
}
