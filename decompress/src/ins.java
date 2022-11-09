import android.graphics.Rect;
import android.util.Size;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ins
{
    public static final ins a;
    public final Size b;
    public final Rect c;
    public final Rect d;
    public final Rect e;
    public final Rect f;
    public final Rect g;
    public final Rect h;
    public final Rect i;
    public final Rect j;
    public final Rect k;
    public final Rect l;
    public final Rect m;
    public final Rect n;
    public final boolean o;
    public final boolean p;
    
    static {
        final inr b = b();
        b.n(new Size(0, 0));
        b.j(new Rect());
        b.l(new Rect());
        b.k(new Rect());
        b.m(new Rect());
        b.p(new Rect());
        b.b(new Rect());
        b.g(new Rect());
        b.d(new Rect());
        b.e(new Rect());
        b.i(new Rect());
        b.c(new Rect());
        b.f(new Rect());
        b.h(true);
        b.o(true);
        a = b.a();
    }
    
    public ins() {
    }
    
    public ins(final Size b, final Rect c, final Rect d, final Rect e, final Rect f, final Rect g, final Rect h, final Rect i, final Rect j, final Rect k, final Rect l, final Rect m, final Rect n, final boolean o, final boolean p15) {
        this.b = b;
        this.c = c;
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
        this.p = p15;
    }
    
    static Rect a(final Rect rect, final Size size, final jcb jcb) {
        final jcb a = jcb.a;
        switch (jcb.ordinal()) {
            default: {
                final String value = String.valueOf(jcb);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 27);
                sb.append("Unexpected UI Orientation: ");
                sb.append(value);
                throw new IllegalArgumentException(sb.toString());
            }
            case 3: {
                return new Rect(size.getWidth() - rect.right, size.getHeight() - rect.bottom, size.getWidth() - rect.left, size.getHeight() - rect.top);
            }
            case 2: {
                return new Rect(size.getWidth() - rect.bottom, rect.left, size.getWidth() - rect.top, rect.right);
            }
            case 1: {
                return new Rect(rect.top, size.getHeight() - rect.right, rect.bottom, size.getHeight() - rect.left);
            }
            case 0: {
                return rect;
            }
        }
    }
    
    static inr b() {
        final inr inr = new inr();
        inr.h(false);
        inr.o(true);
        return inr;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof ins) {
            final ins ins = (ins)o;
            if (this.b.equals((Object)ins.b) && this.c.equals((Object)ins.c) && this.d.equals((Object)ins.d) && this.e.equals((Object)ins.e) && this.f.equals((Object)ins.f) && this.g.equals((Object)ins.g) && this.h.equals((Object)ins.h) && this.i.equals((Object)ins.i) && this.j.equals((Object)ins.j) && this.k.equals((Object)ins.k) && this.l.equals((Object)ins.l) && this.m.equals((Object)ins.m) && this.n.equals((Object)ins.n) && this.o == ins.o && this.p == ins.p) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.b.hashCode();
        final int hashCode2 = this.c.hashCode();
        final int hashCode3 = this.d.hashCode();
        final int hashCode4 = this.e.hashCode();
        final int hashCode5 = this.f.hashCode();
        final int hashCode6 = this.g.hashCode();
        final int hashCode7 = this.h.hashCode();
        final int hashCode8 = this.i.hashCode();
        final int hashCode9 = this.j.hashCode();
        final int hashCode10 = this.k.hashCode();
        final int hashCode11 = this.l.hashCode();
        final int hashCode12 = this.m.hashCode();
        final int hashCode13 = this.n.hashCode();
        final boolean o = this.o;
        int n = 1237;
        int n2;
        if (!o) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        if (this.p) {
            n = 1231;
        }
        return ((((((((((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode9) * 1000003 ^ hashCode10) * 1000003 ^ hashCode11) * 1000003 ^ hashCode12) * 1000003 ^ hashCode13) * 1000003 ^ n2) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final String value2 = String.valueOf(this.c);
        final String value3 = String.valueOf(this.d);
        final String value4 = String.valueOf(this.e);
        final String value5 = String.valueOf(this.f);
        final String value6 = String.valueOf(this.g);
        final String value7 = String.valueOf(this.h);
        final String value8 = String.valueOf(this.i);
        final String value9 = String.valueOf(this.j);
        final String value10 = String.valueOf(this.k);
        final String value11 = String.valueOf(this.l);
        final String value12 = String.valueOf(this.m);
        final String value13 = String.valueOf(this.n);
        final boolean o = this.o;
        final boolean p = this.p;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 252 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length() + String.valueOf(value5).length() + String.valueOf(value6).length() + String.valueOf(value7).length() + String.valueOf(value8).length() + String.valueOf(value9).length() + String.valueOf(value10).length() + String.valueOf(value11).length() + String.valueOf(value12).length() + String.valueOf(value13).length());
        sb.append("CameraLayoutBoxes{window=");
        sb.append(value);
        sb.append(", previewOverlay=");
        sb.append(value2);
        sb.append(", optionsMenuContainer=");
        sb.append(value3);
        sb.append(", preview=");
        sb.append(value4);
        sb.append(", uncoveredPreview=");
        sb.append(value5);
        sb.append(", viewfinderCoverIconArea=");
        sb.append(value6);
        sb.append(", zoomUi=");
        sb.append(value7);
        sb.append(", bottomBar=");
        sb.append(value8);
        sb.append(", gradientBar=");
        sb.append(value9);
        sb.append(", fullScreen=");
        sb.append(value10);
        sb.append(", modeSwitchUi=");
        sb.append(value11);
        sb.append(", cutoutArea=");
        sb.append(value12);
        sb.append(", modeSlider=");
        sb.append(value13);
        sb.append(", needsRetry=");
        sb.append(o);
        sb.append(", zoomInViewfinder=");
        sb.append(p);
        sb.append("}");
        return sb.toString();
    }
}
