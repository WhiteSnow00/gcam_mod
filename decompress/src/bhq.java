import java.util.Map;
import java.io.Serializable;
import java.util.Iterator;
import android.util.Log;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;
import java.util.concurrent.Executor;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bhq implements bhj, bhx, bhp
{
    private final bjd a;
    private final Object b;
    private final bhn c;
    private final bhl d;
    private final Context e;
    private final auk f;
    private final Object g;
    private final Class h;
    private final bhf i;
    private final int j;
    private final int k;
    private final auo l;
    private final bhy m;
    private final List n;
    private final Executor o;
    private aza p;
    private aym q;
    private long r;
    private volatile ayn s;
    private Drawable t;
    private Drawable u;
    private int v;
    private int w;
    private boolean x;
    private RuntimeException y;
    private int z;
    
    public bhq(final Context e, final auk f, final Object b, final Object g, final Class h, final bhf i, final int j, final int k, final auo l, final bhy m, final bhn c, final List n, final bhl d, final ayn s, final Executor o) {
        this.a = bjd.a();
        this.b = b;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.c = c;
        this.n = n;
        this.d = d;
        this.s = s;
        this.o = o;
        this.z = 1;
        if (this.y == null && f.g.a(auh.class)) {
            this.y = new RuntimeException("Glide request origin trace");
        }
    }
    
    private static int h(final int n, final float n2) {
        if (n == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return Math.round(n2 * n);
    }
    
    private final Drawable i() {
        if (this.u == null) {
            final bhf i = this.i;
            if ((this.u = i.e) == null) {
                final int f = i.f;
                if (f > 0) {
                    this.u = this.o(f);
                }
            }
        }
        return this.u;
    }
    
    private final Drawable o(final int n) {
        final Resources$Theme theme = this.e.getTheme();
        final auk f = this.f;
        return bfb.a((Context)f, (Context)f, n, theme);
    }
    
    private final void p() {
        if (!this.x) {
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }
    
    private final boolean q() {
        final bhl d = this.d;
        return d == null || d.h(this);
    }
    
    private final void r() {
        final bhl d = this.d;
        if (d != null) {
            d.a().j();
        }
    }
    
    private final void s(final ayv ayv) {
        this.a.b();
        final Object b = this.b;
        monitorenter(b);
        try {
            final String value = String.valueOf(this.g);
            final int v = this.v;
            final int w = this.w;
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 52);
            sb.append("Load failed for ");
            sb.append(value);
            sb.append(" with size [");
            sb.append(v);
            sb.append("x");
            sb.append(w);
            sb.append("]");
            Log.w("Glide", sb.toString(), (Throwable)ayv);
            final List a = ayv.a();
            for (int size = a.size(), i = 0; i < size; ++i) {
                final Throwable t = a.get(i);
            }
            this.q = null;
            this.z = 5;
            this.x = true;
            try {
                final List n = this.n;
                if (n != null) {
                    for (final bhn bhn : n) {
                        this.r();
                        bhn.l(ayv);
                    }
                }
                final bhn c = this.c;
                if (c != null) {
                    this.r();
                    c.l(ayv);
                }
                if (this.q()) {
                    if (this.t == null) {
                        this.t = null;
                        final int d = this.i.d;
                        if (d > 0) {
                            this.t = this.o(d);
                        }
                    }
                    Drawable drawable;
                    if ((drawable = this.t) == null) {
                        drawable = this.i();
                    }
                    this.m.e(drawable);
                }
                this.x = false;
                final bhl d2 = this.d;
                if (d2 != null) {
                    d2.d(this);
                }
                monitorexit(b);
            }
            finally {
                this.x = false;
            }
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    @Override
    public final Object a() {
        this.a.b();
        return this.b;
    }
    
    @Override
    public final void b() {
        synchronized (this.b) {
            this.p();
            this.a.b();
            this.r = bio.b();
            if (this.g == null) {
                if (biv.o(this.j, this.k)) {
                    this.v = this.j;
                    this.w = this.k;
                }
                this.s(new ayv("Received null model"));
                return;
            }
            final int z = this.z;
            if (z == 2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (z == 4) {
                this.e(this.p, 5);
                return;
            }
            this.z = 3;
            if (biv.o(this.j, this.k)) {
                this.g(this.j, this.k);
            }
            else {
                this.m.d(this);
            }
            final int z2 = this.z;
            if ((z2 == 2 || z2 == 3) && this.q()) {
                this.m.f(this.i());
            }
        }
    }
    
    @Override
    public final void c() {
        synchronized (this.b) {
            this.p();
            this.a.b();
            if (this.z != 6) {
                this.p();
                this.a.b();
                this.m.j(this);
                final aym q = this.q;
                ayt ayt = null;
                if (q != null) {
                    synchronized (q.c) {
                        q.a.f(q.b);
                        monitorexit(q.c);
                        this.q = null;
                    }
                }
                final aza p = this.p;
                if (p != null) {
                    this.p = null;
                    ayt = (ayt)p;
                }
                final bhl d = this.d;
                if (d == null || d.g(this)) {
                    this.m.a(this.i());
                }
                this.z = 6;
                monitorexit(this.b);
                if (ayt != null) {
                    ayt.f();
                }
            }
        }
    }
    
    @Override
    public final void d(final ayv ayv) {
        this.s(ayv);
    }
    
    @Override
    public final void e(final aza p2, int n) {
        this.a.b();
        Object o = null;
        StringBuilder sb3;
        try {
            final Object b = this.b;
            monitorenter(b);
            try {
                this.q = null;
                if (p2 == null) {
                    o = String.valueOf(this.h);
                    n = String.valueOf(o).length();
                    final StringBuilder sb = new StringBuilder(n + 82);
                    sb.append("Expected to receive a Resource<R> with an object of ");
                    sb.append((String)o);
                    sb.append(" inside, but instead got null.");
                    this.d(new ayv(sb.toString()));
                    monitorexit(b);
                    return;
                }
                o = p2.c();
                Label_0555: {
                    if (o == null) {
                        break Label_0555;
                    }
                    if (!this.h.isAssignableFrom(((String)o).getClass())) {
                        break Label_0555;
                    }
                    final bhl d = this.d;
                    Label_0184: {
                        if (d == null || d.i(this)) {
                            break Label_0184;
                        }
                        try {
                            this.p = null;
                            this.z = 4;
                            monitorexit(b);
                            ayt ayt = (ayt)p2;
                            List n2;
                            Iterator iterator;
                            int n3;
                            bhn bhn;
                            bhn c;
                            bhl d2;
                            String simpleName;
                            String a;
                            String value;
                            int v;
                            int w;
                            double a2;
                            StringBuilder sb2;
                            String s;
                            Serializable class1;
                            String value2;
                            String value3;
                            String value4;
                            final String value5;
                            int length;
                            Label_0412_Outer:Block_13_Outer:Label_0592_Outer:
                            while (true) {
                                ayt.f();
                                return;
                                Label_0628: {
                                    while (true) {
                                    Block_16_Outer:
                                        while (true) {
                                            while (true) {
                                                this.x = true;
                                                try {
                                                    n2 = this.n;
                                                    if (n2 != null) {
                                                        iterator = n2.iterator();
                                                        n = 0;
                                                        while (true) {
                                                            n3 = n;
                                                            if (!iterator.hasNext()) {
                                                                break;
                                                            }
                                                            bhn = (bhn)iterator.next();
                                                            bhn.m(o);
                                                            if (!(bhn instanceof bhh)) {
                                                                continue Label_0412_Outer;
                                                            }
                                                            n |= (((bhh)bhn).a() ? 1 : 0);
                                                        }
                                                    }
                                                    else {
                                                        n3 = 0;
                                                    }
                                                    c = this.c;
                                                    if (c != null) {
                                                        c.m(o);
                                                    }
                                                    if (n3 == 0) {
                                                        this.m.b(o);
                                                    }
                                                    this.x = false;
                                                    d2 = this.d;
                                                    if (d2 != null) {
                                                        d2.e(this);
                                                    }
                                                    monitorexit(b);
                                                    return;
                                                }
                                                finally {
                                                    this.x = false;
                                                }
                                                break Label_0555;
                                                simpleName = ((String)o).getClass().getSimpleName();
                                                a = avp.a(n);
                                                value = String.valueOf(this.g);
                                                v = this.v;
                                                w = this.w;
                                                a2 = bio.a(this.r);
                                                n = String.valueOf(simpleName).length();
                                                sb2 = new StringBuilder(n + 95 + a.length() + String.valueOf(value).length());
                                                sb2.append("Finished loading ");
                                                sb2.append(simpleName);
                                                sb2.append(" from ");
                                                sb2.append(a);
                                                sb2.append(" for ");
                                                sb2.append(value);
                                                sb2.append(" with size [");
                                                sb2.append(v);
                                                sb2.append("x");
                                                sb2.append(w);
                                                sb2.append("] in ");
                                                sb2.append(a2);
                                                sb2.append(" ms");
                                                sb2.toString();
                                                continue Block_13_Outer;
                                            }
                                            while (true) {
                                                s = "";
                                                break Label_0628;
                                                class1 = ((String)o).getClass();
                                                value2 = String.valueOf(class1);
                                                value3 = String.valueOf(o);
                                                value4 = String.valueOf(p2);
                                                iftrue(Label_0623:)(o == null);
                                                continue Label_0592_Outer;
                                            }
                                            this.r();
                                            this.z = 4;
                                            this.p = p2;
                                            iftrue(Label_0412:)(this.f.h > 3);
                                            continue Block_16_Outer;
                                        }
                                        Label_0587: {
                                            class1 = "";
                                        }
                                        continue;
                                    }
                                    Label_0623: {
                                        s = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                                    }
                                }
                                length = String.valueOf(value5).length();
                                n = String.valueOf(value2).length();
                                o = new StringBuilder(length + 71 + n + String.valueOf(value3).length() + String.valueOf(value4).length() + s.length());
                                ((StringBuilder)o).append("Expected to receive an object of ");
                                ((StringBuilder)o).append(value5);
                                ((StringBuilder)o).append(" but instead got ");
                                ((StringBuilder)o).append(value2);
                                ((StringBuilder)o).append("{");
                                ((StringBuilder)o).append(value3);
                                ((StringBuilder)o).append("} inside Resource{");
                                ((StringBuilder)o).append(value4);
                                ((StringBuilder)o).append("}.");
                                ((StringBuilder)o).append(s);
                                this.d(new ayv(((StringBuilder)o).toString()));
                                monitorexit(b);
                                ayt = (ayt)p2;
                                continue Label_0412_Outer;
                            }
                            this.p = null;
                            value5 = String.valueOf(this.h);
                            iftrue(Label_0587:)(o == null);
                        }
                        finally {}
                    }
                }
            }
            finally {}
            try {
                monitorexit(b);
                try {
                    throw;
                }
                finally {}
            }
            finally {}
        }
        finally {
            sb3 = (StringBuilder)o;
        }
        if (sb3 != null) {
            ((ayt)sb3).f();
        }
        throw;
    }
    
    @Override
    public final void f() {
        synchronized (this.b) {
            if (this.n()) {
                this.c();
            }
        }
    }
    
    @Override
    public final void g(int v, int w) {
        this.a.b();
        final Object b = this.b;
        monitorenter(b);
        try {
            if (this.z == 3) {
                this.z = 2;
                final float a = this.i.a;
                this.v = h(v, a);
                this.w = h(w, a);
                final ayn s = this.s;
                final auk f = this.f;
                final Object g = this.g;
                final bhf i = this.i;
                final awc j = i.j;
                v = this.v;
                w = this.w;
                final Class o = i.o;
                final Class h = this.h;
                final auo l = this.l;
                final ayg b2 = i.b;
                final Map n = i.n;
                final boolean k = i.k;
                final boolean r = i.r;
                final awg m = i.m;
                final boolean g2 = i.g;
                final boolean s2 = i.s;
                final boolean q = i.q;
                final Executor o2 = this.o;
                try {
                    final ays ays = new ays(g, j, v, w, n, o, h, m);
                    monitorenter(s);
                    Label_0338: {
                        if (!g2) {
                            final aza aza = null;
                            break Label_0338;
                        }
                        try {
                            final ayt a2 = s.e.a(ays);
                            if (a2 != null) {
                                a2.d();
                            }
                            aza aza;
                            if ((aza = a2) == null) {
                                final aza b3 = s.f.b((awc)ays);
                                ayt ayt;
                                if (b3 == null) {
                                    ayt = null;
                                }
                                else if (b3 instanceof ayt) {
                                    ayt = (ayt)b3;
                                }
                                else {
                                    ayt = new ayt(b3, true, ays, s);
                                }
                                if (ayt != null) {
                                    ayt.d();
                                    s.e.b(ays, ayt);
                                }
                                if ((aza = ayt) == null) {
                                    aza = null;
                                }
                            }
                            Label_0733: {
                                if (aza != null) {
                                    break Label_0733;
                                }
                                final ayr ayr = s.a.a(q).get(ays);
                                Label_0405: {
                                    if (ayr == null) {
                                        break Label_0405;
                                    }
                                    try {
                                        ayr.b(this, o2);
                                        aym q2 = new aym(s, this, ayr);
                                        while (true) {
                                            monitorexit(s);
                                            this.q = q2;
                                            if (this.z != 2) {
                                                this.q = null;
                                            }
                                            monitorexit(b);
                                            return;
                                            final ayr k2 = (ayr)s.b.d.a();
                                            bit.a(k2);
                                            k2.h(ays, g2, s2, q);
                                            final ayi d = s.d;
                                            final ayb ayb = (ayb)d.a.a();
                                            bit.a(ayb);
                                            final int l2 = d.b++;
                                            final axx a3 = ayb.a;
                                            final ayl r2 = ayb.r;
                                            a3.c = f;
                                            a3.d = g;
                                            a3.m = j;
                                            a3.e = v;
                                            a3.f = w;
                                            a3.o = b2;
                                            a3.g = o;
                                            a3.r = r2;
                                            a3.j = h;
                                            a3.n = l;
                                            a3.h = m;
                                            a3.i = n;
                                            a3.p = k;
                                            a3.q = r;
                                            ayb.d = f;
                                            ayb.e = j;
                                            ayb.f = l;
                                            ayb.g = v;
                                            ayb.h = w;
                                            ayb.i = b2;
                                            ayb.m = q;
                                            ayb.j = m;
                                            ayb.k = k2;
                                            ayb.l = l2;
                                            ayb.q = 1;
                                            s.a.a(k2.e).put(ays, k2);
                                            k2.b(this, o2);
                                            k2.g(ayb);
                                            q2 = new aym(s, this, k2);
                                            continue;
                                        }
                                        monitorexit(s);
                                        this.e(aza, 5);
                                        q2 = null;
                                    }
                                    finally {}
                                }
                            }
                        }
                        finally {}
                    }
                    monitorexit(s);
                }
                finally {}
            }
            monitorexit(b);
            return;
        }
        finally {}
        monitorexit(b);
    }
    
    @Override
    public final boolean j() {
        synchronized (this.b) {
            return this.z == 4;
        }
    }
    
    @Override
    public final boolean k() {
        synchronized (this.b) {
            return this.z == 6;
        }
    }
    
    @Override
    public final boolean l() {
        synchronized (this.b) {
            return this.z == 4;
        }
    }
    
    @Override
    public final boolean m(final bhj bhj) {
        if (!(bhj instanceof bhq)) {
            return false;
        }
        Object o = this.b;
        synchronized (o) {
            final int j = this.j;
            final int k = this.k;
            final Object g = this.g;
            final Class h = this.h;
            final bhf i = this.i;
            final auo l = this.l;
            final List n = this.n;
            int size;
            if (n != null) {
                size = n.size();
            }
            else {
                size = 0;
            }
            monitorexit(o);
            final bhq bhq = (bhq)bhj;
            synchronized (bhq.b) {
                final int m = bhq.j;
                final int k2 = bhq.k;
                o = bhq.g;
                final Class h2 = bhq.h;
                final bhf i2 = bhq.i;
                final auo l2 = bhq.l;
                final List n2 = bhq.n;
                int size2;
                if (n2 != null) {
                    size2 = n2.size();
                }
                else {
                    size2 = 0;
                }
                monitorexit(bhq.b);
                return j == m && k == k2 && biv.k(g, o) && h.equals(h2) && i.equals(i2) && l == l2 && size == size2;
            }
        }
    }
    
    @Override
    public final boolean n() {
        synchronized (this.b) {
            final int z = this.z;
            boolean b = true;
            if (z != 2) {
                if (z != 3) {
                    b = false;
                }
            }
            return b;
        }
    }
    
    @Override
    public final String toString() {
        Object o = this.b;
        synchronized (o) {
            final Object g = this.g;
            final Class h = this.h;
            monitorexit(o);
            o = super.toString();
            final String value = String.valueOf(g);
            final String value2 = String.valueOf(h);
            final StringBuilder sb = new StringBuilder(String.valueOf(o).length() + 25 + String.valueOf(value).length() + String.valueOf(value2).length());
            sb.append((String)o);
            sb.append("[model=");
            sb.append(value);
            sb.append(", transcodeClass=");
            sb.append(value2);
            sb.append("]");
            return sb.toString();
        }
    }
}
