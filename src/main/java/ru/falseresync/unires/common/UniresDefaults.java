package ru.falseresync.unires.common;

import net.minecraft.util.Identifier;
import ru.falseresync.unires.api.UniresApi;
import ru.falseresync.unires.api.UniresRegistry;
import ru.falseresync.unires.api.request.RequestManager;
import ru.falseresync.unires.api.resource.ResourceFeature;
import ru.falseresync.unires.api.resource.Resource;
import ru.falseresync.unires.api.resource.ResourceType;
import ru.falseresync.unires.common.resource.feature.BlockFeature;
import ru.falseresync.unires.common.resource.feature.ItemFeature;
import ru.falseresync.unires.common.resource.feature.OreFeature;
import ru.falseresync.unires.common.resource.type.GemResourceType;
import ru.falseresync.unires.common.resource.type.MetalResourceType;
import ru.falseresync.unires.common.resource.type.MetalWithOreResourceType;

public class UniresDefaults implements UniresApi {
    @Override
    public void requestResources(RequestManager manager) {

    }

    @Override
    public void registerFeatures(UniresRegistry<ResourceFeature> registry) {
        registry.register(new Identifier("unires", "ingot"), new ItemFeature());
        registry.register(new Identifier("unires", "nugget"), new ItemFeature());
        registry.register(new Identifier("unires", "plate"), new ItemFeature());
        registry.register(new Identifier("unires", "gem"), new ItemFeature());
        registry.register(new Identifier("unires", "dust"), new ItemFeature());
        registry.register(new Identifier("unires", "block"), new BlockFeature());
        registry.register(new Identifier("unires", "ore"), new OreFeature());
    }

    @Override
    public void registerResourceTypes(UniresRegistry<ResourceType> registry) {
        registry.register(new Identifier("unires", "metal"), new MetalResourceType());
        registry.register(new Identifier("unires", "ore_metal"), new MetalWithOreResourceType());
        registry.register(new Identifier("unires", "gem"), new GemResourceType());
    }

    @Override
    public void registerResources(UniresRegistry<Resource> registry) {

    }
}
