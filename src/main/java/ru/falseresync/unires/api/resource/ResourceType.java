package ru.falseresync.unires.api.resource;

import java.util.Collection;
import java.util.Collections;

public interface ResourceType {
    Collection<ResourceFeature> getNecessaryFeatures();

    default Collection<ResourceFeature> getDefaultFeatures() {
        return getNecessaryFeatures();
    }

    default Collection<ResourceFeature> getOptionalFeatures() {
        return Collections.emptyList();
    }
}
