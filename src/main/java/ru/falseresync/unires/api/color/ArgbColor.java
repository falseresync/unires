package ru.falseresync.unires.api.color;

public class ArgbColor {
    public final float a;
    public final float r;
    public final float g;
    public final float b;

    public ArgbColor(int hex) {
        a = (float) ((hex & 0xFF000000) >>> 24) / 0xFF;
        r = (float) ((hex & 0x00FF0000) >>> 16) / 0xFF;
        g = (float) ((hex & 0x0000FF00) >>> 8) / 0xFF;
        b = (float) (hex & 0x000000FF) / 0xFF;
    }

    public ArgbColor(float a, float r, float g, float b) {
        this.a = a;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int toHex() {
        return ((int) (a * 0xFF) << (3 * 8)) + ((int) (r * 0xFF) << (2 * 8)) + ((int) (g * 0xFF) << 8) + (int) (b * 0xFF);
    }
}
