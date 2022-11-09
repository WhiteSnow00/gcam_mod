// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.jni.federatedphoto;

public final class ModeSuggestionClient implements krc
{
    public static final nsd a;
    public final long b;
    public boolean c;
    
    static {
        a = nsd.g("com/google/android/apps/camera/jni/federatedphoto/ModeSuggestionClient");
    }
    
    public ModeSuggestionClient() {
        krk.b(ModeSuggestionClient.class, "modesuggestion-jni");
        final long nativeCreateClient = nativeCreateClient("ICALabelSensorDenseV1");
        this.b = nativeCreateClient;
        if (nativeCreateClient != 0L) {
            this.c = false;
            return;
        }
        throw new IllegalStateException("Could not initialize ModeSuggestionClient.");
    }
    
    private native void nativeClose(final long p0);
    
    private static native long nativeCreateClient(final String p0);
    
    @Override
    public final void close() {
        synchronized (this) {
            if (!this.c) {
                this.nativeClose(this.b);
                this.c = true;
            }
        }
    }
    
    public native byte[] nativeProcess(final long p0, final byte[] p1);
}
