import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.content.res.Resources$Theme;
import java.util.Map;
import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public class bhf implements Cloneable
{
    public float a;
    public ayg b;
    public auo c;
    public int d;
    public Drawable e;
    public int f;
    public boolean g;
    public int h;
    public int i;
    public awc j;
    public boolean k;
    public boolean l;
    public awg m;
    public Map n;
    public Class o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    private int t;
    private Drawable u;
    private Drawable v;
    private int w;
    private boolean x;
    private Resources$Theme y;
    private boolean z;
    
    public bhf() {
        this.a = 1.0f;
        this.b = ayg.c;
        this.c = auo.c;
        this.g = true;
        this.h = -1;
        this.i = -1;
        this.j = bid.b;
        this.l = true;
        this.m = new awg();
        this.n = new bij();
        this.o = Object.class;
        this.r = true;
    }
    
    private final bhf a(final bdt bdt, final awk awk, final boolean b) {
        bhf bhf;
        if (b) {
            bhf = this.A(bdt, awk);
        }
        else {
            bhf = this.s(bdt, awk);
        }
        bhf.r = true;
        return bhf;
    }
    
    private static boolean b(final int n, final int n2) {
        return (n & n2) != 0x0;
    }
    
    final bhf A(final bdt bdt, final awk awk) {
        if (this.p) {
            return this.h().A(bdt, awk);
        }
        this.E(bdt);
        return this.y(awk);
    }
    
    final bhf B(final Class clazz, final awk awk, final boolean b) {
        if (this.p) {
            return this.h().B(clazz, awk, b);
        }
        bit.a(clazz);
        bit.a(awk);
        this.n.put(clazz, awk);
        final int t = this.t;
        this.l = true;
        final int t2 = t | 0x10800;
        this.t = t2;
        this.r = false;
        if (b) {
            this.t = (t2 | 0x20000);
            this.k = true;
        }
        this.L();
        return this;
    }
    
    public final boolean C(final int n) {
        return b(this.t, n);
    }
    
    public final boolean D() {
        return biv.o(this.i, this.h);
    }
    
    public final void E(final bdt bdt) {
        final awf f = bdt.f;
        bit.a(bdt);
        this.w(f, bdt);
    }
    
    public final bhf F() {
        if (this.p) {
            return this.h().F();
        }
        this.q = true;
        this.t |= 0x80000;
        this.L();
        return this;
    }
    
    public final bhf G() {
        if (this.p) {
            return this.h().G();
        }
        this.f = 2131101048;
        final int t = this.t;
        this.e = null;
        this.t = ((t | 0x80) & 0xFFFFFFBF);
        this.L();
        return this;
    }
    
    public final bhf H() {
        if (this.p) {
            return this.h().H();
        }
        this.g = false;
        this.t |= 0x100;
        this.L();
        return this;
    }
    
    public final bhf I() {
        if (this.p) {
            return this.h().I();
        }
        this.s = true;
        this.t |= 0x100000;
        this.L();
        return this;
    }
    
    public final bhf J() {
        if (this.p) {
            return this.h().J();
        }
        this.d = 2131231475;
        final int t = this.t;
        this.u = null;
        this.t = ((t | 0x20) & 0xFFFFFFEF);
        this.L();
        return this;
    }
    
    public final void K() {
        this.x = true;
    }
    
    protected final void L() {
        if (!this.x) {
            return;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }
    
    public final void M() {
        if (this.x && !this.p) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.p = true;
        this.K();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof bhf) {
            final bhf bhf = (bhf)o;
            if (Float.compare(bhf.a, this.a) == 0 && this.d == bhf.d) {
                final Drawable u = bhf.u;
                if (biv.l(null, null) && this.f == bhf.f && biv.l(this.e, bhf.e)) {
                    final int w = bhf.w;
                    final Drawable v = bhf.v;
                    if (biv.l(null, null) && this.g == bhf.g && this.h == bhf.h && this.i == bhf.i && this.k == bhf.k && this.l == bhf.l) {
                        final boolean z = bhf.z;
                        if (this.q == bhf.q && this.b.equals(bhf.b) && this.c == bhf.c && this.m.equals(bhf.m) && this.n.equals(bhf.n) && this.o.equals(bhf.o) && biv.l(this.j, bhf.j)) {
                            final Resources$Theme y = bhf.y;
                            if (biv.l(null, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public bhf g(final bhf bhf) {
        if (this.p) {
            return this.h().g(bhf);
        }
        if (b(bhf.t, 2)) {
            this.a = bhf.a;
        }
        if (b(bhf.t, 262144)) {
            final boolean z = bhf.z;
            this.z = false;
        }
        if (b(bhf.t, 1048576)) {
            this.s = bhf.s;
        }
        if (b(bhf.t, 4)) {
            this.b = bhf.b;
        }
        if (b(bhf.t, 8)) {
            this.c = bhf.c;
        }
        if (b(bhf.t, 16)) {
            final Drawable u = bhf.u;
            this.u = null;
            this.d = 0;
            this.t &= 0xFFFFFFDF;
        }
        if (b(bhf.t, 32)) {
            this.d = bhf.d;
            this.u = null;
            this.t &= 0xFFFFFFEF;
        }
        if (b(bhf.t, 64)) {
            this.e = bhf.e;
            this.f = 0;
            this.t &= 0xFFFFFF7F;
        }
        if (b(bhf.t, 128)) {
            this.f = bhf.f;
            this.e = null;
            this.t &= 0xFFFFFFBF;
        }
        if (b(bhf.t, 256)) {
            this.g = bhf.g;
        }
        if (b(bhf.t, 512)) {
            this.i = bhf.i;
            this.h = bhf.h;
        }
        if (b(bhf.t, 1024)) {
            this.j = bhf.j;
        }
        if (b(bhf.t, 4096)) {
            this.o = bhf.o;
        }
        if (b(bhf.t, 8192)) {
            final Drawable v = bhf.v;
            this.v = null;
            this.w = 0;
            this.t &= 0xFFFFBFFF;
        }
        if (b(bhf.t, 16384)) {
            final int w = bhf.w;
            this.w = 0;
            this.v = null;
            this.t &= 0xFFFFDFFF;
        }
        if (b(bhf.t, 32768)) {
            final Resources$Theme y = bhf.y;
            this.y = null;
        }
        if (b(bhf.t, 65536)) {
            this.l = bhf.l;
        }
        if (b(bhf.t, 131072)) {
            this.k = bhf.k;
        }
        if (b(bhf.t, 2048)) {
            this.n.putAll(bhf.n);
            this.r = bhf.r;
        }
        if (b(bhf.t, 524288)) {
            this.q = bhf.q;
        }
        if (!this.l) {
            this.n.clear();
            final int t = this.t;
            this.k = false;
            this.t = (t & 0xFFFDF7FF);
            this.r = true;
        }
        this.t |= bhf.t;
        this.m.c(bhf.m);
        this.L();
        return this;
    }
    
    public bhf h() {
        try {
            final bhf bhf = (bhf)super.clone();
            (bhf.m = new awg()).c(this.m);
            (bhf.n = new bij()).putAll(this.n);
            bhf.x = false;
            bhf.p = false;
            return bhf;
        }
        catch (final CloneNotSupportedException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    @Override
    public final int hashCode() {
        return biv.e(null, biv.e(this.j, biv.e(this.o, biv.e(this.n, biv.e(this.m, biv.e(this.c, biv.e(this.b, biv.d((int)(this.q ? 1 : 0), biv.d(0, biv.d((int)(this.l ? 1 : 0), biv.d(this.k ? 1 : 0, biv.d(this.i, biv.d(this.h, biv.d((int)(this.g ? 1 : 0), biv.e(null, biv.d(0, biv.e(this.e, biv.d(this.f, biv.e(null, biv.d(this.d, biv.c(this.a)))))))))))))))))))));
    }
    
    public final bhf l() {
        return this.A(bdt.c, new bdh());
    }
    
    public final bhf m(final Class o) {
        if (this.p) {
            return this.h().m(o);
        }
        bit.a(o);
        this.o = o;
        this.t |= 0x1000;
        this.L();
        return this;
    }
    
    public final bhf n(final ayg b) {
        if (this.p) {
            return this.h().n(b);
        }
        bit.a(b);
        this.b = b;
        this.t |= 0x4;
        this.L();
        return this;
    }
    
    public final bhf o() {
        if (this.p) {
            return this.h().o();
        }
        this.n.clear();
        final int t = this.t;
        this.k = false;
        this.l = false;
        this.t = ((t & 0xFFFDF7FF) | 0x10000);
        this.r = true;
        this.L();
        return this;
    }
    
    public final bhf p() {
        return this.a(bdt.a, new beb(), true);
    }
    
    public final bhf q() {
        return this.r(bdt.b, new bdi());
    }
    
    public final bhf r(final bdt bdt, final awk awk) {
        return this.a(bdt, awk, false);
    }
    
    public final bhf s(final bdt bdt, final awk awk) {
        if (this.p) {
            return this.h().s(bdt, awk);
        }
        this.E(bdt);
        return this.z(awk, false);
    }
    
    public final bhf t(final int i, final int h) {
        if (this.p) {
            return this.h().t(i, h);
        }
        this.i = i;
        this.h = h;
        this.t |= 0x200;
        this.L();
        return this;
    }
    
    public final bhf u(final Drawable e) {
        if (this.p) {
            return this.h().u(e);
        }
        this.e = e;
        final int t = this.t;
        this.f = 0;
        this.t = ((t | 0x40) & 0xFFFFFF7F);
        this.L();
        return this;
    }
    
    public final bhf v(final auo c) {
        if (this.p) {
            return this.h().v(c);
        }
        bit.a(c);
        this.c = c;
        this.t |= 0x8;
        this.L();
        return this;
    }
    
    public final bhf w(final awf awf, final Object o) {
        if (this.p) {
            return this.h().w(awf, o);
        }
        bit.a(awf);
        bit.a(o);
        this.m.d(awf, o);
        this.L();
        return this;
    }
    
    public final bhf x(final awc j) {
        if (this.p) {
            return this.h().x(j);
        }
        bit.a(j);
        this.j = j;
        this.t |= 0x400;
        this.L();
        return this;
    }
    
    public final bhf y(final awk awk) {
        return this.z(awk, true);
    }
    
    final bhf z(final awk awk, final boolean b) {
        if (this.p) {
            return this.h().z(awk, b);
        }
        final bdz bdz = new bdz(awk, b);
        this.B(Bitmap.class, awk, b);
        this.B(Drawable.class, bdz, b);
        this.B(BitmapDrawable.class, bdz, b);
        this.B(bfk.class, new bfn(awk), b);
        this.L();
        return this;
    }
}
