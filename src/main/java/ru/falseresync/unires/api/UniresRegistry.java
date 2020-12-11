package ru.falseresync.unires.api;

import net.minecraft.util.Identifier;

public interface UniresRegistry<T> {
    void register(Identifier id, T entry);
}
