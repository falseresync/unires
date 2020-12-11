package ru.falseresync.unires.common.resource.type;

import ru.falseresync.unires.api.resource.ResourceType;

public class DefaultResourceTypes {
    public static final ResourceType ORE_METAL;

    static {
        ORE_METAL = new OreMetalResourceType();
    }
}
