// 
// Decompiled by Procyon v0.6.0
// 

public final class ivw
{
    private Integer A;
    private Integer B;
    public Integer a;
    public hjg b;
    private Integer c;
    private Integer d;
    private Integer e;
    private Integer f;
    private Integer g;
    private Integer h;
    private Integer i;
    private Integer j;
    private niz k;
    private String l;
    private Integer m;
    private Boolean n;
    private Integer o;
    private Integer p;
    private Integer q;
    private Integer r;
    private Integer s;
    private Integer t;
    private iuk u;
    private Integer v;
    private Integer w;
    private Integer x;
    private Integer y;
    private Integer z;
    
    public ivw() {
    }
    
    public ivw(final ivx ivx) {
        this.k = nii.a;
        this.c = ivx.d;
        this.d = ivx.e;
        this.e = ivx.f;
        this.f = ivx.g;
        this.g = ivx.h;
        this.h = ivx.i;
        this.i = ivx.j;
        this.j = ivx.k;
        this.k = ivx.l;
        this.a = ivx.m;
        this.l = ivx.n;
        this.m = ivx.o;
        this.n = ivx.p;
        this.o = ivx.q;
        this.p = ivx.r;
        this.q = ivx.s;
        this.r = ivx.t;
        this.s = ivx.u;
        this.t = ivx.v;
        this.u = ivx.w;
        this.b = ivx.x;
        this.v = ivx.y;
        this.w = ivx.z;
        this.x = ivx.A;
        this.y = ivx.B;
        this.z = ivx.C;
        this.A = ivx.D;
        this.B = ivx.E;
    }
    
    public ivw(final byte[] array) {
        this.k = nii.a;
    }
    
    public final void A(final int n) {
        this.g = n;
    }
    
    public final void B(final int n) {
        this.f = n;
    }
    
    public final ivx a() {
        final Integer c = this.c;
        if (c != null && this.d != null && this.e != null && this.f != null && this.g != null && this.h != null && this.i != null && this.j != null && this.a != null && this.l != null && this.m != null && this.n != null && this.o != null && this.p != null && this.q != null && this.r != null && this.s != null && this.t != null && this.u != null && this.b != null && this.v != null && this.w != null && this.x != null && this.y != null && this.z != null && this.A != null && this.B != null) {
            return new ivx(c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.a, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.b, this.v, this.w, this.x, this.y, this.z, this.A, this.B);
        }
        final StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" photoCircleRadius");
        }
        if (this.d == null) {
            sb.append(" photoCircleAlpha");
        }
        if (this.e == null) {
            sb.append(" photoCircleColor");
        }
        if (this.f == null) {
            sb.append(" videoDotRadius");
        }
        if (this.g == null) {
            sb.append(" videoCircleColor");
        }
        if (this.h == null) {
            sb.append(" stopSquareHalfSize");
        }
        if (this.i == null) {
            sb.append(" portraitInnerCircleRadius");
        }
        if (this.j == null) {
            sb.append(" portraitOuterCircleRadius");
        }
        if (this.a == null) {
            sb.append(" buttonImageResourceId");
        }
        if (this.l == null) {
            sb.append(" buttonImageResourceEntryName");
        }
        if (this.m == null) {
            sb.append(" buttonImageRectHalfSize");
        }
        if (this.n == null) {
            sb.append(" animateRippleEffect");
        }
        if (this.o == null) {
            sb.append(" ripplePaintAlpha");
        }
        if (this.p == null) {
            sb.append(" ripplePaintColor");
        }
        if (this.q == null) {
            sb.append(" rippleRadius");
        }
        if (this.r == null) {
            sb.append(" mainButtonColor");
        }
        if (this.s == null) {
            sb.append(" roundButtonRadius");
        }
        if (this.t == null) {
            sb.append(" outerButtonRadius");
        }
        if (this.u == null) {
            sb.append(" mode");
        }
        if (this.b == null) {
            sb.append(" timerOption");
        }
        if (this.v == null) {
            sb.append(" tickMarkLength");
        }
        if (this.w == null) {
            sb.append(" tickMarkPaddingToCircleEdge");
        }
        if (this.x == null) {
            sb.append(" tickMarkRectRoundRadius");
        }
        if (this.y == null) {
            sb.append(" tickMarkAlpha");
        }
        if (this.z == null) {
            sb.append(" mainOuterButtonAlpha");
        }
        if (this.A == null) {
            sb.append(" innerDotCenterOffset");
        }
        if (this.B == null) {
            sb.append(" innerDotColor");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final boolean b) {
        this.n = b;
    }
    
    public final void c(final String l) {
        if (l != null) {
            this.l = l;
            return;
        }
        throw new NullPointerException("Null buttonImageResourceEntryName");
    }
    
    public final void d(final int n) {
        this.a = n;
    }
    
    public final void e(final int n) {
        this.A = n;
    }
    
    public final void f(final int n) {
        this.B = n;
    }
    
    public final void g(final int n) {
        this.z = n;
    }
    
    public final void h(final int n) {
        this.p = n;
    }
    
    public final void i(final niz k) {
        if (k != null) {
            this.k = k;
            return;
        }
        throw new NullPointerException("Null buttonImage");
    }
    
    public final void j(final int n) {
        this.m = n;
    }
    
    public final void k(final int n) {
        this.r = n;
    }
    
    public final void l(final iuk u) {
        if (u != null) {
            this.u = u;
            return;
        }
        throw new NullPointerException("Null mode");
    }
    
    public final void m(final int n) {
        this.t = n;
    }
    
    public final void n(final int n) {
        this.d = n;
    }
    
    public final void o(final int n) {
        this.e = n;
    }
    
    public final void p(final int n) {
        this.c = n;
    }
    
    public final void q(final int n) {
        this.i = n;
    }
    
    public final void r(final int n) {
        this.j = n;
    }
    
    public final void s(final int n) {
        this.o = n;
    }
    
    public final void t(final int n) {
        this.q = n;
    }
    
    public final void u(final int n) {
        this.s = n;
    }
    
    public final void v(final int n) {
        this.h = n;
    }
    
    public final void w(final int n) {
        this.y = n;
    }
    
    public final void x(final int n) {
        this.v = n;
    }
    
    public final void y(final int n) {
        this.w = n;
    }
    
    public final void z(final int n) {
        this.x = n;
    }
}
