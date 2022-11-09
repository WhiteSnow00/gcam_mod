import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dxk
{
    private final Map a;
    
    public dxk() {
        this.a = new HashMap();
    }
    
    public final dxi a(final him him) {
        synchronized (this) {
            dxi o;
            if ((o = this.a.get(him)) == null) {
                o = dxj.o();
                this.a.put(him, o);
            }
            return o;
        }
    }
    
    public final dxj b(final him him) {
        dxi o;
        if ((o = this.a.remove(him)) == null) {
            o = dxj.o();
        }
        final nog a = o.a;
        if (a != null) {
            o.b = a.f();
        }
        else if (o.b == null) {
            o.b = nqr.a;
        }
        final nog c = o.c;
        if (c != null) {
            o.d = c.f();
        }
        else if (o.d == null) {
            o.d = nqr.a;
        }
        final nog e = o.e;
        if (e != null) {
            o.f = e.f();
        }
        else if (o.f == null) {
            o.f = nqr.a;
        }
        final nog g = o.g;
        if (g != null) {
            o.h = g.f();
        }
        else if (o.h == null) {
            o.h = nqr.a;
        }
        final nog i = o.i;
        if (i != null) {
            o.j = i.f();
        }
        else if (o.j == null) {
            o.j = nqr.a;
        }
        final nog k = o.k;
        if (k != null) {
            o.l = k.f();
        }
        else if (o.l == null) {
            o.l = nqr.a;
        }
        final nog m = o.m;
        if (m != null) {
            o.n = m.f();
        }
        else if (o.n == null) {
            o.n = nqr.a;
        }
        final nog o2 = o.o;
        if (o2 != null) {
            o.p = o2.f();
        }
        else if (o.p == null) {
            o.p = nqr.a;
        }
        final nog q = o.q;
        if (q != null) {
            o.r = q.f();
        }
        else if (o.r == null) {
            o.r = nqr.a;
        }
        final nog s = o.s;
        if (s != null) {
            o.t = s.f();
        }
        else if (o.t == null) {
            o.t = nqr.a;
        }
        final nog u = o.u;
        if (u != null) {
            o.v = u.f();
        }
        else if (o.v == null) {
            o.v = nqr.a;
        }
        final nog w = o.w;
        if (w != null) {
            o.x = w.f();
        }
        else if (o.x == null) {
            o.x = nqr.a;
        }
        if (o.y == null) {
            o.y = nqr.a;
        }
        final nog z = o.z;
        if (z != null) {
            o.A = z.f();
        }
        else if (o.A == null) {
            o.A = nqr.a;
        }
        return new dxj(o.b, o.d, o.f, o.h, o.j, o.l, o.n, o.p, o.r, o.t, o.v, o.x, o.y, o.A);
    }
}
