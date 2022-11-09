import j$.util.function.Function;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivx
{
    private static final nnx F;
    private static final nnx G;
    private static final nnx H;
    public static boolean a;
    public static boolean b;
    public static boolean c;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final niz l;
    public final int m;
    public final String n;
    public final int o;
    public final boolean p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final iuk w;
    public final hjg x;
    public final int y;
    public final int z;
    
    static {
        ivx.a = false;
        ivx.b = false;
        ivx.c = false;
        final nnt l = nnx.l();
        l.d(hjg.b, 2131231649);
        l.d(hjg.c, 2131231647);
        final nnx nnx = F = l.b();
        final nnt i = nnx.l();
        i.d(hjg.b, 2131231650);
        i.d(hjg.c, 2131231648);
        final nnx nnx2 = G = i.b();
        final nnt j = nnx.l();
        j.d(iuk.a, nnx);
        j.d(iuk.c, nnx);
        j.d(iuk.n, nnx);
        j.d(iuk.q, nnx);
        j.d(iuk.t, nnx2);
        j.d(iuk.y, nnx2);
        H = j.b();
    }
    
    public ivx() {
    }
    
    public ivx(final int d, final int e, final int f, final int g, final int h, final int i, final int j, final int k, final niz l, final int m, final String n, final int o, final boolean p28, final int q, final int r, final int s, final int t, final int u, final int v, final iuk w, final hjg x, final int y, final int z, final int a, final int b, final int c, final int d2, final int e2) {
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p28;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d2;
        this.E = e2;
    }
    
    public static ivw a() {
        final ivw ivw = new ivw((byte[])null);
        ivw.b(false);
        ivw.s(0);
        ivw.h(0);
        ivw.d(0);
        ivw.c("none");
        ivw.j(0);
        ivw.k(-1);
        ivw.r(0);
        ivw.q(0);
        ivw.x(0);
        ivw.y(0);
        ivw.z(0);
        ivw.w(0);
        ivw.g(255);
        ivw.e(0);
        ivw.f(-1);
        return ivw;
    }
    
    public static ivx b(final iuk iuk, final hjg b, final Resources resources, final boolean a, final boolean b2, final boolean c) {
        ivx.a = a;
        ivx.b = b2;
        ivx.c = c;
        final iuk a2 = iuk.a;
        Object o = null;
        switch (iuk.ordinal()) {
            default: {
                final String value = String.valueOf(iuk);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 42);
                sb.append("Should never get here! ");
                sb.append(value);
                sb.append(" missing in switch.");
                throw new IllegalArgumentException(sb.toString());
            }
            case 36: {
                o = ivv.t;
                break;
            }
            case 35: {
                o = hsc.r;
                break;
            }
            case 34: {
                o = ivv.p;
                break;
            }
            case 33: {
                o = ivv.e;
                break;
            }
            case 32: {
                o = hsc.k;
                break;
            }
            case 31: {
                o = ivv.c;
                break;
            }
            case 30: {
                o = ivv.q;
                break;
            }
            case 29: {
                o = ivv.m;
                break;
            }
            case 28: {
                o = hsc.l;
                break;
            }
            case 27: {
                o = hsc.u;
                break;
            }
            case 26: {
                o = ivv.u;
                break;
            }
            case 25: {
                o = ivv.j;
                break;
            }
            case 24: {
                o = ivv.a;
                break;
            }
            case 23: {
                o = hsc.s;
                break;
            }
            case 22: {
                o = ivv.h;
                break;
            }
            case 21: {
                o = ivv.g;
                break;
            }
            case 20: {
                o = ivv.d;
                break;
            }
            case 19: {
                o = hsc.p;
                break;
            }
            case 18: {
                o = hsc.t;
                break;
            }
            case 17: {
                o = ivv.r;
                break;
            }
            case 16: {
                o = hsc.n;
                break;
            }
            case 15: {
                o = ivv.f;
                break;
            }
            case 14: {
                o = hsc.o;
                break;
            }
            case 13: {
                o = hsc.i;
                break;
            }
            case 12: {
                o = ivv.o;
                break;
            }
            case 11: {
                o = ivv.t;
                break;
            }
            case 10: {
                o = hsc.q;
                break;
            }
            case 9: {
                o = hsc.h;
                break;
            }
            case 8: {
                o = hsc.m;
                break;
            }
            case 7: {
                o = ivv.s;
                break;
            }
            case 6: {
                o = ivv.k;
                break;
            }
            case 5: {
                o = ivv.l;
                break;
            }
            case 4: {
                o = hsc.j;
                break;
            }
            case 3: {
                o = ivv.n;
                break;
            }
            case 2: {
                o = ivv.b;
                break;
            }
            case 1: {
                o = ivv.i;
                break;
            }
            case 0: {
                o = ivv.t;
                break;
            }
        }
        final ivw ivw = (ivw)((Function)o).apply((Object)resources);
        ivw.l(iuk);
        if (b == null) {
            throw new NullPointerException("Null timerOption");
        }
        ivw.b = b;
        final int intValue = (int)((nnx)ivx.H.getOrDefault(iuk, nqq.a)).getOrDefault(b, 0);
        if (intValue != 0) {
            ivw.d(intValue);
        }
        final Integer a3 = ivw.a;
        if (a3 != null) {
            final int intValue2 = a3;
            if (intValue2 != 0) {
                final Drawable drawable = resources.getDrawable(intValue2, (Resources$Theme)null);
                final Drawable$ConstantState constantState = drawable.getConstantState();
                constantState.getClass();
                ivw.i(niz.i(constantState));
                ivw.c(resources.getResourceEntryName(intValue2));
                ivw.j(drawable.getIntrinsicWidth() / 2);
            }
            return ivw.a();
        }
        throw new IllegalStateException("Property \"buttonImageResourceId\" has not been set");
    }
    
    public final ivw c() {
        return new ivw(this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ivx) {
            final ivx ivx = (ivx)o;
            if (this.d == ivx.d && this.e == ivx.e && this.f == ivx.f && this.g == ivx.g && this.h == ivx.h && this.i == ivx.i && this.j == ivx.j && this.k == ivx.k && this.l.equals(ivx.l) && this.m == ivx.m && this.n.equals(ivx.n) && this.o == ivx.o && this.p == ivx.p && this.q == ivx.q && this.r == ivx.r && this.s == ivx.s && this.t == ivx.t && this.u == ivx.u && this.v == ivx.v && this.w.equals(ivx.w) && this.x.equals(ivx.x) && this.y == ivx.y && this.z == ivx.z && this.A == ivx.A && this.B == ivx.B && this.C == ivx.C && this.D == ivx.D && this.E == ivx.E) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int d = this.d;
        final int e = this.e;
        final int f = this.f;
        final int g = this.g;
        final int h = this.h;
        final int i = this.i;
        final int j = this.j;
        final int k = this.k;
        final int hashCode = this.l.hashCode();
        final int m = this.m;
        final int hashCode2 = this.n.hashCode();
        final int o = this.o;
        int n;
        if (!this.p) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return (((((((((((((((((((((((((((d ^ 0xF4243) * 1000003 ^ e) * 1000003 ^ f) * 1000003 ^ g) * 1000003 ^ h) * 1000003 ^ i) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ hashCode) * 1000003 ^ m) * 1000003 ^ hashCode2) * 1000003 ^ o) * 1000003 ^ n) * 1000003 ^ this.q) * 1000003 ^ this.r) * 1000003 ^ this.s) * 1000003 ^ this.t) * 1000003 ^ this.u) * 1000003 ^ this.v) * 1000003 ^ this.w.hashCode()) * 1000003 ^ this.x.hashCode()) * 1000003 ^ this.y) * 1000003 ^ this.z) * 1000003 ^ this.A) * 1000003 ^ this.B) * 1000003 ^ this.C) * 1000003 ^ this.D) * 1000003 ^ this.E;
    }
    
    @Override
    public final String toString() {
        final int d = this.d;
        final int e = this.e;
        final int f = this.f;
        final int g = this.g;
        final int h = this.h;
        final int i = this.i;
        final int j = this.j;
        final int k = this.k;
        final String value = String.valueOf(this.l);
        final int m = this.m;
        final String n = this.n;
        final int o = this.o;
        final boolean p = this.p;
        final int q = this.q;
        final int r = this.r;
        final int s = this.s;
        final int t = this.t;
        final int u = this.u;
        final int v = this.v;
        final String value2 = String.valueOf(this.w);
        final String value3 = String.valueOf(this.x);
        final int y = this.y;
        final int z = this.z;
        final int a = this.A;
        final int b = this.B;
        final int c = this.C;
        final int d2 = this.D;
        final int e2 = this.E;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 846 + String.valueOf(n).length() + String.valueOf(value2).length() + String.valueOf(value3).length());
        sb.append("ShutterButtonSpec{photoCircleRadius=");
        sb.append(d);
        sb.append(", photoCircleAlpha=");
        sb.append(e);
        sb.append(", photoCircleColor=");
        sb.append(f);
        sb.append(", videoDotRadius=");
        sb.append(g);
        sb.append(", videoCircleColor=");
        sb.append(h);
        sb.append(", stopSquareHalfSize=");
        sb.append(i);
        sb.append(", portraitInnerCircleRadius=");
        sb.append(j);
        sb.append(", portraitOuterCircleRadius=");
        sb.append(k);
        sb.append(", buttonImage=");
        sb.append(value);
        sb.append(", buttonImageResourceId=");
        sb.append(m);
        sb.append(", buttonImageResourceEntryName=");
        sb.append(n);
        sb.append(", buttonImageRectHalfSize=");
        sb.append(o);
        sb.append(", animateRippleEffect=");
        sb.append(p);
        sb.append(", ripplePaintAlpha=");
        sb.append(q);
        sb.append(", ripplePaintColor=");
        sb.append(r);
        sb.append(", rippleRadius=");
        sb.append(s);
        sb.append(", mainButtonColor=");
        sb.append(t);
        sb.append(", roundButtonRadius=");
        sb.append(u);
        sb.append(", outerButtonRadius=");
        sb.append(v);
        sb.append(", mode=");
        sb.append(value2);
        sb.append(", timerOption=");
        sb.append(value3);
        sb.append(", tickMarkLength=");
        sb.append(y);
        sb.append(", tickMarkPaddingToCircleEdge=");
        sb.append(z);
        sb.append(", tickMarkRectRoundRadius=");
        sb.append(a);
        sb.append(", tickMarkAlpha=");
        sb.append(b);
        sb.append(", mainOuterButtonAlpha=");
        sb.append(c);
        sb.append(", innerDotCenterOffset=");
        sb.append(d2);
        sb.append(", innerDotColor=");
        sb.append(e2);
        sb.append("}");
        return sb.toString();
    }
}
