package ru.falseresync.unires.api;

import ru.falseresync.unires.api.request.RequestManager;
import ru.falseresync.unires.api.resource.ResourceFeature;
import ru.falseresync.unires.api.resource.Resource;
import ru.falseresync.unires.api.resource.ResourceType;

public interface UniresApi {
    void requestResources(RequestManager manager);
    default void registerFeatures(UniresRegistry<ResourceFeature> registry) {}
    default void registerResourceTypes(UniresRegistry<ResourceType> registry) {}
    default void registerResources(UniresRegistry<Resource> registry) {}
}
