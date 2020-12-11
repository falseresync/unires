package ru.falseresync.unires.common;

import net.devtech.arrp.api.RRPPreGenEntrypoint;
import net.devtech.arrp.api.RuntimeResourcePack;
import net.devtech.arrp.impl.RuntimeResourcePackImpl;
import net.minecraft.util.Identifier;
import ru.falseresync.unires.common.request.RequestManagerImpl;

public class UniresPreGen implements RRPPreGenEntrypoint {
    private static final RuntimeResourcePack PACK = new RuntimeResourcePackImpl(new Identifier("unires", "default"));

    @Override
    public void pregen() {
        RequestManagerImpl requestManager = new RequestManagerImpl();

        UniresRegistryImpl.callApiEntrypoints(requestManager);
    }
}
