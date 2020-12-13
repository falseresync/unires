package ru.falseresync.unires.common.resource;

import ru.falseresync.unires.api.resource.Resource;
import ru.falseresync.unires.common.resource.type.DefaultResourceTypes;

public class DefaultResources {
    public static final Resource COPPER;
    public static final Resource ZINC;
    public static final Resource SILVER;
    public static final Resource LEAD;
    public static final Resource BRONZE;
    public static final Resource BRASS;
    public static final Resource STEEL;
    public static final Resource ELECTRUM;

    static {
        ZINC = new Resource.Builder().tint(0xFF001122).build(DefaultResourceTypes.METAL_WITH_ORE);
    }
}
