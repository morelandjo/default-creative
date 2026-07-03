package com.vodmordia.defaultcreative;

public final class DefaultCreative {
    public static final String MOD_ID = "defaultcreative";

    public static void init() {
        // Nothing to register: all behaviour lives in the client-only CreateWorldScreen mixin,
        // since the "create world" screen only exists on the client.
    }
}
