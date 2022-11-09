// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.vision.visionkit.f250.internal.airlock.room;

import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public final class F250RoomDatabase_Impl extends F250RoomDatabase
{
    private volatile mxt j;
    private volatile mwy k;
    private volatile mye l;
    private volatile mxf m;
    
    @Override
    protected final an a() {
        final HashMap hashMap = new HashMap(1);
        hashMap.put("ResourceFts", "ResourceEntity");
        return new an(this, hashMap, new HashMap(0), new String[] { "ResourceEntity", "ResourceFts", "AnnotachmentEntity" });
    }
    
    @Override
    protected final afd b(final af af) {
        final aez c = new aez(af, new mxs(this), "c277ec47daa9c8ec4aae322c60562992", "10f6a0caed808e92ef24c4ddbb3c1432");
        final afa a = afb.a(af.b);
        a.b = af.c;
        a.c = c;
        return af.a.a(a.a());
    }
    
    @Override
    protected final Map c() {
        final HashMap hashMap = new HashMap();
        hashMap.put(mxt.class, Collections.emptyList());
        hashMap.put(mwy.class, Collections.emptyList());
        hashMap.put(mye.class, Collections.emptyList());
        hashMap.put(mxf.class, Collections.emptyList());
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
    public final mwy r() {
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k == null) {
                this.k = new mxd(this);
            }
            return this.k;
        }
    }
    
    @Override
    public final mxf s() {
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new mxj(this);
            }
            return this.m;
        }
    }
    
    @Override
    public final mxt t() {
        if (this.j != null) {
            return this.j;
        }
        synchronized (this) {
            if (this.j == null) {
                this.j = new mxz(this);
            }
            return this.j;
        }
    }
    
    @Override
    public final mye u() {
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new myi(this);
            }
            return this.l;
        }
    }
}
