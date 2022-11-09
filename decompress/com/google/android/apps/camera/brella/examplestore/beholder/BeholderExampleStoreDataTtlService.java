// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.brella.examplestore.beholder;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class BeholderExampleStoreDataTtlService extends byh
{
    public hjx a;
    public bzi b;
    public cai c;
    public ExecutorService d;
    
    public final bzi a() {
        synchronized (this) {
            return this.b;
        }
    }
    
    protected final hjx b() {
        synchronized (this) {
            return this.a;
        }
    }
    
    @Override
    public final oey c() {
        return odg.i(oet.q(odg.i(oet.q(this.a().f()), new bxx(this, 1), this.d)), new bxx(this), this.d);
    }
    
    @Override
    public final oey d() {
        return odg.h(oet.q(this.a().i()), new bxw(this.b()), this.d);
    }
    
    @Override
    protected final ExecutorService e() {
        return this.d;
    }
    
    public final void onCreate() {
        super.onCreate();
        final Context applicationContext = this.getApplicationContext();
        applicationContext.getClass();
        ((bxy)((egp)applicationContext).c(bxy.class)).c(this);
    }
}
