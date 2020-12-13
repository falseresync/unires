package ru.falseresync.unires.api.color;

import java.util.function.IntUnaryOperator;

public class ToneSwapMode implements BlendingMode {
    @Override
    public IntUnaryOperator getPixelColorTransformer(int tintHex) {
        ArgbColor tint = new ArgbColor(tintHex);

        return pixelHex -> {
            ArgbColor pixel = new ArgbColor(pixelHex);
            ArgbColor result = new ArgbColor(
                pixel.a,
                mix(pixel.r, pixel.r * tint.r, tint.a),
                mix(pixel.g, pixel.g * tint.g, tint.a),
                mix(pixel.b, pixel.b * tint.b, tint.a)
            );
            return result.toHex();
        };
    }

    private static float mix(float x, float y, float a) {
        return x + (y - x) * a;
    }
}
