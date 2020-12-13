package ru.falseresync.unires.api.color;

import java.util.function.IntUnaryOperator;

public class ScaleSwapMode implements BlendingMode {
    @Override
    public IntUnaryOperator getPixelColorTransformer(int tintHex) {
        ArgbColor tint = new ArgbColor(tintHex);

        return pixelHex -> {
            ArgbColor pixel = new ArgbColor(pixelHex);
            ArgbColor result = new ArgbColor(
                (pixel.a + tint.a) / 2,
                mix(pixel.r, tint.r, pixel.a, tint.a),
                mix(pixel.g, tint.g, pixel.a, tint.a),
                mix(pixel.b, tint.b, pixel.a, tint.a)
            );
            return result.toHex();
        };
    }

    private static float mix(float x, float y, float ax, float ay) {
        return (x * ax + y * ay) / (ax + ay);
    }
}
