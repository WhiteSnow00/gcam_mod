// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.performance.primes.metrics.storage;

import android.content.pm.PackageStats;
import java.util.concurrent.Semaphore;
import android.content.pm.IPackageStatsObserver$Stub;

final class PackageStatsCapture$PackageStatsCallback extends IPackageStatsObserver$Stub
{
    private final Semaphore a;
    private volatile PackageStats b;
    
    private PackageStatsCapture$PackageStatsCallback() {
        this.a = new Semaphore(1);
    }
    
    public void onGetStatsCompleted(final PackageStats b, final boolean b2) {
        if (b2) {
            this.b = b;
        }
        else {
            a.l(mkv.a.c(), "Failure getting PackageStats", '\u0c3e');
        }
        this.a.release();
    }
}
