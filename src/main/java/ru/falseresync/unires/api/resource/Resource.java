package ru.falseresync.unires.api.resource;

import ru.falseresync.unires.api.color.BlendingMode;
import ru.falseresync.unires.api.color.ScaleSwapMode;

public class Resource {
    private final ResourceType type;
    private final int tint;
    private final BlendingMode blendingMode;

    private Resource(ResourceType type, int tint, BlendingMode blendingMode) {
        this.type = type;
        this.tint = tint;
        this.blendingMode = blendingMode;
    }

    public ResourceType getType() {
        return type;
    }

    public int getTint() {
        return tint;
    }

    public BlendingMode getBlendingMode() {
        return blendingMode;
    }

    public static class Builder {
        private int tint = 0xFFFFFFFF;
        private BlendingMode blendingMode = new ScaleSwapMode();

        public Builder tint(int tint) {
            this.tint = tint;
            return this;
        }

        public Builder blendingMode(BlendingMode blendingMode) {
            this.blendingMode = blendingMode;
            return this;
        }

        public Resource build(ResourceType type) {
            return new Resource(type, tint, blendingMode);
        }
    }
}
