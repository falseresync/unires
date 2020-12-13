package ru.falseresync.unires.api.color;

import java.util.function.IntUnaryOperator;

public interface BlendingMode {
    IntUnaryOperator getPixelColorTransformer(int tintHex);
}
