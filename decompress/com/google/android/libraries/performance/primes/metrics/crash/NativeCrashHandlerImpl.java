// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.performance.primes.metrics.crash;

import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

public final class NativeCrashHandlerImpl implements mhs
{
    private static final nsd c;
    final CountDownLatch a;
    final CountDownLatch b;
    private boolean d;
    private final niz e;
    
    static {
        c = nsd.g("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl");
    }
    
    public NativeCrashHandlerImpl(final niz e) {
        this.a = new CountDownLatch(1);
        this.b = new CountDownLatch(1);
        this.e = e;
    }
    
    private static native ByteBuffer awaitSignal();
    
    private static native boolean initializeSignalHandler();
    
    private static native void unblockSignalHandler();
    
    @Override
    public final void a(final mhn mhn) {
        synchronized (this) {
            if (this.d) {
                return;
            }
            this.d = true;
            final Thread thread = new Thread(new mht(this, mhn), "Primes-nativecrash-sidecar");
            thread.setDaemon(true);
            thread.setPriority(10);
            thread.start();
        }
    }
}
