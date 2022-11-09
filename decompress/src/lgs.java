// 
// Decompiled by Procyon v0.6.0
// 

public final class lgs
{
    public int a;
    public int b;
    public int c;
    public long d;
    public long e;
    public float f;
    public float g;
    public float h;
    
    public lgs() {
        this(0, 0, 0, 0L, 0L, 0.0f, 0.0f, 0.0f);
    }
    
    public lgs(final int a, final int b, final int c, final long d, final long e, final float f, final float g, final float h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void a(final lgs lgs) {
        this.a = lgs.a;
        this.b = lgs.b;
        this.c = lgs.c;
        this.d = lgs.d;
        this.e = lgs.e;
        this.f = lgs.f;
        this.g = lgs.g;
        this.h = lgs.h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof lgs)) {
            return false;
        }
        final lgs lgs = (lgs)o;
        return this.a == lgs.a && this.b == lgs.b && this.c == lgs.c && this.d == lgs.d && this.e == lgs.e && this.f == lgs.f && this.g == lgs.g && this.h == lgs.h;
    }
}
