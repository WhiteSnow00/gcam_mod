import android.graphics.Bitmap;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auw extends bhf implements Cloneable
{
    private auw A;
    private auw B;
    private boolean C;
    private boolean D;
    private boolean E;
    private final Context t;
    private final auz u;
    private final Class v;
    private final auk w;
    private ava x;
    private Object y;
    private List z;
    
    static {
        final bho bho = (bho)new bho().n(ayg.b).v(auo.d).H();
    }
    
    protected auw(final auf auf, final auz u, final Class v, final Context t) {
        this.C = true;
        this.u = u;
        this.v = v;
        this.t = t;
        final auk b = u.a.b;
        ava ava = b.e.get(v);
        if (ava == null) {
            for (final Map.Entry<Class, V> entry : b.e.entrySet()) {
                if (entry.getKey().isAssignableFrom(v)) {
                    ava = (ava)entry.getValue();
                }
            }
        }
        ava a;
        if ((a = ava) == null) {
            a = auk.a;
        }
        this.x = a;
        this.w = auf.b;
        final Iterator iterator2 = u.d.iterator();
        while (iterator2.hasNext()) {
            this.a((bhn)iterator2.next());
        }
        this.b(u.e());
    }
    
    private final bhj N(Object o, final bhy bhy, final bhn bhn, final bhl bhl, final ava ava, final auo auo, int h, int i, final bhf bhf, final Executor executor) {
        bhg bhg;
        bhl bhl2;
        if (this.B != null) {
            bhl2 = (bhg = new bhg(o, bhl));
        }
        else {
            bhg = null;
            bhl2 = bhl;
        }
        final auw a = this.A;
        bhj o3;
        if (a != null) {
            if (this.E) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            ava x = a.x;
            if (a.C) {
                x = ava;
            }
            auo auo2 = null;
            if (a.C(8)) {
                auo2 = this.A.c;
            }
            else {
                switch (auv.b[auo.ordinal()]) {
                    default: {
                        final String value = String.valueOf(super.c);
                        o = new StringBuilder(String.valueOf(value).length() + 18);
                        ((StringBuilder)o).append("unknown priority: ");
                        ((StringBuilder)o).append(value);
                        throw new IllegalArgumentException(((StringBuilder)o).toString());
                    }
                    case 3:
                    case 4: {
                        auo2 = auo.a;
                        break;
                    }
                    case 2: {
                        auo2 = auo.b;
                        break;
                    }
                    case 1: {
                        auo2 = auo.c;
                        break;
                    }
                }
            }
            final auw a2 = this.A;
            final int j = a2.i;
            final int h2 = a2.h;
            int k;
            int h3;
            if (biv.o(h, i) && !this.A.D()) {
                k = bhf.i;
                h3 = bhf.h;
            }
            else {
                h3 = h2;
                k = j;
            }
            final bhr bhr = new bhr(o, bhl2);
            final bhj o2 = this.O(o, bhy, bhn, bhf, bhr, ava, auo, h, i, executor);
            this.E = true;
            final auw a3 = this.A;
            final bhj n = a3.N(o, bhy, bhn, bhr, x, auo2, k, h3, a3, executor);
            this.E = false;
            bhr.a = o2;
            bhr.b = n;
            o3 = bhr;
        }
        else {
            o3 = this.O(o, bhy, bhn, bhf, bhl2, ava, auo, h, i, executor);
        }
        if (bhg == null) {
            return o3;
        }
        final auw b = this.B;
        final int l = b.i;
        final int h4 = b.h;
        if (biv.o(h, i) && !this.B.D()) {
            i = bhf.i;
            h = bhf.h;
        }
        else {
            h = h4;
            i = l;
        }
        final auw b2 = this.B;
        final bhj n2 = b2.N(o, bhy, bhn, bhg, b2.x, b2.c, i, h, b2, executor);
        bhg.a = o3;
        bhg.b = n2;
        return bhg;
    }
    
    private final bhj O(final Object o, final bhy bhy, final bhn bhn, final bhf bhf, final bhl bhl, final ava ava, final auo auo, final int n, final int n2, final Executor executor) {
        final Context t = this.t;
        final auk w = this.w;
        final Object y = this.y;
        final Class v = this.v;
        final List z = this.z;
        final ayn f = w.f;
        final bit a = ava.a;
        return new bhq(t, w, o, y, v, bhf, n, n2, auo, bhy, bhn, z, bhl, f, executor);
    }
    
    private final void P(final bhy bhy, final bhn bhn, final bhf bhf, final Executor executor) {
        bit.a(bhy);
        if (!this.D) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        final bhj n = this.N(new Object(), bhy, bhn, null, this.x, bhf.c, bhf.i, bhf.h, bhf, executor);
        final bhj c = bhy.c();
        if (n.m(c) && (bhf.g || !c.l())) {
            bit.a(c);
            if (!c.n()) {
                c.b();
            }
            return;
        }
        this.u.f(bhy);
        bhy.k(n);
        this.u.m(bhy, n);
    }
    
    public final auw a(final bhn bhn) {
        if (super.p) {
            return this.c().a(bhn);
        }
        if (bhn != null) {
            if (this.z == null) {
                this.z = new ArrayList();
            }
            this.z.add(bhn);
        }
        this.L();
        return this;
    }
    
    public final auw b(final bhf bhf) {
        bit.a(bhf);
        return (auw)super.g(bhf);
    }
    
    public final auw c() {
        final auw auw = (auw)super.h();
        auw.x = auw.x.a();
        final List z = auw.z;
        if (z != null) {
            auw.z = new ArrayList(z);
        }
        final auw a = auw.A;
        if (a != null) {
            auw.A = a.c();
        }
        final auw b = auw.B;
        if (b != null) {
            auw.B = b.c();
        }
        return auw;
    }
    
    public final auw d(final Drawable drawable) {
        return this.e(drawable).b(bho.c(ayg.a));
    }
    
    public final auw e(final Object y) {
        if (super.p) {
            return this.c().e(y);
        }
        this.y = y;
        this.D = true;
        this.L();
        return this;
    }
    
    public final auw f(final auw a) {
        if (super.p) {
            return this.c().f(a);
        }
        this.A = a;
        this.L();
        return this;
    }
    
    public final bhi i() {
        final bhm bhm = new bhm();
        this.P(bhm, bhm, this, bin.b);
        return bhm;
    }
    
    public final bib j(final ImageView imageView) {
        biv.i();
        bit.a(imageView);
        bhf bhf = null;
        Label_0152: {
            if (!super.C(2048)) {
                if (super.l && imageView.getScaleType() != null) {
                    switch (auv.a[imageView.getScaleType().ordinal()]) {
                        case 6: {
                            bhf = this.c().q();
                            break Label_0152;
                        }
                        case 3:
                        case 4:
                        case 5: {
                            bhf = this.c().r(bdt.a, new beb());
                            break Label_0152;
                        }
                        case 2: {
                            bhf = this.c().q();
                            break Label_0152;
                        }
                        case 1: {
                            bhf = this.c().s(bdt.c, new bdh());
                            break Label_0152;
                        }
                    }
                }
            }
            bhf = this;
        }
        final Class v = this.v;
        bhw bhw;
        if (Bitmap.class.equals(v)) {
            bhw = new bht(imageView);
        }
        else {
            if (!Drawable.class.isAssignableFrom(v)) {
                final String value = String.valueOf(v);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 64);
                sb.append("Unhandled class: ");
                sb.append(value);
                sb.append(", try .as*(Class).transcode(ResourceTranscoder)");
                throw new IllegalArgumentException(sb.toString());
            }
            bhw = new bhv(imageView);
        }
        this.P(bhw, null, bhf, bin.a);
        return bhw;
    }
    
    public final void k(final bhy bhy) {
        this.P(bhy, null, this, bin.a);
    }
}
