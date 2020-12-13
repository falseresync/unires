package ru.falseresync.unires.common.resource.type;

import ru.falseresync.unires.api.resource.ResourceType;

public class DefaultResourceTypes {
    public static final ResourceType GEM;
    public static final ResourceType GEM_WITH_ORE;
    public static final ResourceType METAL;
    public static final ResourceType METAL_WITH_ORE;

    static {
        METAL_WITH_ORE = new MetalWithOreResourceType();
    }
}
