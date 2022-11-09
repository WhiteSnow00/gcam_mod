// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.debug.shottracker.db;

import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public final class ShotDatabase_Impl extends ShotDatabase
{
    private volatile dcu j;
    private volatile ddd k;
    
    @Override
    protected final an a() {
        return new an(this, new HashMap(0), new HashMap(0), new String[] { "shots", "shot_log" });
    }
    
    @Override
    protected final afd b(final af af) {
        final aez c = new aez(af, new ddb(this), "d5a320f0e030e16072c0c60f65398e1d", "9330e297cee824d2d260a862d56ce4e4");
        final afa a = afb.a(af.b);
        a.b = af.c;
        a.c = c;
        return af.a.a(a.a());
    }
    
    @Override
    protected final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put(dcu.class, Collections.emptyList());
        hashMap.put(ddd.class, Collections.emptyList());
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
    public final dcu r() {
        if (this.j != null) {
            return this.j;
        }
        synchronized (this) {
            if (this.j == null) {
                this.j = new dda(this);
            }
            return this.j;
        }
    }
    
    @Override
    public final ddd s() {
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k == null) {
                this.k = new ddh(this);
            }
            return this.k;
        }
    }
}
