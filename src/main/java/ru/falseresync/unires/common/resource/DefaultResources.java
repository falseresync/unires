package ru.falseresync.unires.common.resource;

import ru.falseresync.unires.api.resource.Resource;
import ru.falseresync.unires.common.resource.type.DefaultResourceTypes;

public class DefaultResources {
    public static final Resource ZINC;

    static {
        ZINC = new Resource.Builder().tint(0xFF001122).build(DefaultResourceTypes.ORE_METAL);
    }
}
