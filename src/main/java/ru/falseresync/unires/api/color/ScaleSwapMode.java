package ru.falseresync.unires.api.color;

import java.util.function.IntUnaryOperator;

public class ScaleSwapMode implements BlendingMode {
    @Override
    public IntUnaryOperator getPixelColorTransformer(int tint) {
        return null;
    }
}
