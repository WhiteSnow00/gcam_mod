// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.camerafatalerror;

import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public final class CameraFatalErrorTrackerDatabase_Impl extends CameraFatalErrorTrackerDatabase
{
    private volatile cte j;
    private volatile csx k;
    private volatile ctl l;
    
    @Override
    protected final an a() {
        return new an(this, new HashMap(0), new HashMap(0), new String[] { "FatalErrorCounts", "EnumerationErrorCounts", "HardwareHelpDialogCounts" });
    }
    
    @Override
    protected final afd b(final af af) {
        final aez c = new aez(af, new csp(this), "e7b45086cd950266a3a3a8f0da0a57b0", "c9b58355d6a76cd8d24dcaa135d48342");
        final afa a = afb.a(af.b);
        a.b = af.c;
        a.c = c;
        return af.a.a(a.a());
    }
    
    @Override
    protected final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put(cte.class, Collections.emptyList());
        hashMap.put(csx.class, Collections.emptyList());
        hashMap.put(ctl.class, Collections.emptyList());
        return hashMap;
    }
    
    @Override
    public final Set d() {
        return new HashSet();
    }
    
    @Override
    public final List n() {
        return Arrays.asList(new be[0]);
    }
    
    @Override
    public final csx r() {
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k == null) {
                this.k = new ctc(this);
            }
            return this.k;
        }
    }
    
    @Override
    public final cte s() {
        if (this.j != null) {
            return this.j;
        }
        synchronized (this) {
            if (this.j == null) {
                this.j = new ctj(this);
            }
            return this.j;
        }
    }
    
    @Override
    public final ctl t() {
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new ctp(this);
            }
            return this.l;
        }
    }
}
