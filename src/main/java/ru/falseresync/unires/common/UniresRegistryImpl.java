package ru.falseresync.unires.common;

import com.mojang.serialization.Lifecycle;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.util.registry.SimpleRegistry;
import ru.falseresync.unires.api.UniresApi;
import ru.falseresync.unires.api.UniresRegistry;
import ru.falseresync.unires.api.request.RequestManager;
import ru.falseresync.unires.api.resource.Resource;
import ru.falseresync.unires.api.resource.ResourceType;
import ru.falseresync.unires.api.resource.ResourceFeature;

class UniresRegistryImpl<T> extends SimpleRegistry<T> implements UniresRegistry<T> {
    static final UniresRegistry<ResourceFeature> RESOURCE_FEATURES = new UniresRegistryImpl<>(
        RegistryKey.ofRegistry(new Identifier("unires", "resource/features")),
        Lifecycle.experimental()
    );

    static final UniresRegistry<ResourceType> RESOURCE_TYPES = new UniresRegistryImpl<>(
        RegistryKey.ofRegistry(new Identifier("unires", "resource/types")),
        Lifecycle.experimental()
    );

    static final UniresRegistry<Resource> RESOURCES = new UniresRegistryImpl<>(
        RegistryKey.ofRegistry(new Identifier("unires", "resources")),
        Lifecycle.experimental()
    );

    private UniresRegistryImpl(RegistryKey<? extends Registry<T>> registryKey, Lifecycle lifecycle) {
        super(registryKey, lifecycle);
    }

    static void callApiEntrypoints(RequestManager requestManager) {
        FabricLoader.getInstance().getEntrypoints("unires", UniresApi.class).stream().parallel().forEach(api -> {
            api.registerFeatures(RESOURCE_FEATURES);
            api.registerResourceTypes(RESOURCE_TYPES);
            api.registerResources(RESOURCES);
            api.requestResources(requestManager);
        });
    }

    @Override
    public void register(Identifier id, T entry) {
        register(this, id, entry);
    }
}
