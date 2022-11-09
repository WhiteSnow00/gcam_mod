// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl;

import java.util.Map;
import java.util.HashMap;

public final class WorkDatabase_Impl extends WorkDatabase
{
    private volatile anb j;
    private volatile ami k;
    private volatile ano l;
    private volatile amp m;
    private volatile ams n;
    private volatile amx o;
    private volatile aml p;
    
    @Override
    protected final an a() {
        return new an(this, new HashMap(0), new HashMap(0), new String[] { "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference" });
    }
    
    @Override
    protected final afd b(final af af) {
        final aez c = new aez(af, new akg(this), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
        final afa a = afb.a(af.b);
        a.b = af.c;
        a.c = c;
        return af.a.a(a.a());
    }
    
    @Override
    public final anb s() {
        if (this.j != null) {
            return this.j;
        }
        synchronized (this) {
            if (this.j == null) {
                this.j = new anl(this);
            }
            return this.j;
        }
    }
    
    @Override
    public final ami u() {
        if (this.k != null) {
            return this.k;
        }
        synchronized (this) {
            if (this.k == null) {
                this.k = new ami(this);
            }
            return this.k;
        }
    }
    
    @Override
    public final aml v() {
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            if (this.p == null) {
                this.p = new aml(this);
            }
            return this.p;
        }
    }
    
    @Override
    public final amp w() {
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            if (this.m == null) {
                this.m = new amp(this);
            }
            return this.m;
        }
    }
    
    @Override
    public final ams x() {
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            if (this.n == null) {
                this.n = new ams(this);
            }
            return this.n;
        }
    }
    
    @Override
    public final amx y() {
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            if (this.o == null) {
                this.o = new amx(this);
            }
            return this.o;
        }
    }
    
    @Override
    public final ano z() {
        if (this.l != null) {
            return this.l;
        }
        synchronized (this) {
            if (this.l == null) {
                this.l = new ano(this);
            }
            return this.l;
        }
    }
}
