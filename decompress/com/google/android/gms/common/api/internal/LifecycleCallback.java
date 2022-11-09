// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;

public class LifecycleCallback
{
    public final jsx f;
    
    protected LifecycleCallback(final jsx f) {
        this.f = f;
    }
    
    private static jsx getChimeraLifecycleFragmentImpl(final jsw jsw) {
        throw new IllegalStateException("Method not available in SDK.");
    }
    
    public void c(final int n, final int n2, final Intent intent) {
    }
    
    public void d(final Bundle bundle) {
    }
    
    public void g(final Bundle bundle) {
    }
    
    public void h() {
    }
    
    public void i() {
    }
    
    public void j() {
    }
    
    public final Activity l() {
        final Activity a = this.f.a();
        jvu.a(a);
        return a;
    }
}
