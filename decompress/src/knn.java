// 
// Decompiled by Procyon v0.6.0
// 

public final class knn
{
    private Integer a;
    private Integer b;
    private Integer c;
    private Integer d;
    private Integer e;
    private Integer f;
    private Integer g;
    private Integer h;
    private Integer i;
    private Integer j;
    private Integer k;
    private Integer l;
    private Integer m;
    
    public final kno a() {
        final Integer a = this.a;
        if (a != null && this.b != null && this.c != null && this.d != null && this.e != null && this.f != null && this.g != null && this.h != null && this.i != null && this.j != null && this.k != null && this.l != null && this.m != null) {
            return new kno(a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" audioBitRate");
        }
        if (this.b == null) {
            sb.append(" audioChannels");
        }
        if (this.c == null) {
            sb.append(" audioCodec");
        }
        if (this.d == null) {
            sb.append(" audioSampleRate");
        }
        if (this.e == null) {
            sb.append(" fileFormat");
        }
        if (this.f == null) {
            sb.append(" quality");
        }
        if (this.g == null) {
            sb.append(" videoBitRate");
        }
        if (this.h == null) {
            sb.append(" videoCodec");
        }
        if (this.i == null) {
            sb.append(" videoCodecProfile");
        }
        if (this.j == null) {
            sb.append(" videoCodecLevel");
        }
        if (this.k == null) {
            sb.append(" videoFrameHeight");
        }
        if (this.l == null) {
            sb.append(" videoFrameRate");
        }
        if (this.m == null) {
            sb.append(" videoFrameWidth");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final int n) {
        this.a = n;
    }
    
    public final void c(final int n) {
        this.b = n;
    }
    
    public final void d(final int n) {
        this.c = n;
    }
    
    public final void e(final int n) {
        this.d = n;
    }
    
    public final void f(final int n) {
        this.e = n;
    }
    
    public final void g(final int n) {
        this.f = n;
    }
    
    public final void h(final int n) {
        this.g = n;
    }
    
    public final void i(final int n) {
        this.h = n;
    }
    
    public final void j(final int n) {
        this.j = n;
    }
    
    public final void k(final int n) {
        this.i = n;
    }
    
    public final void l(final int n) {
        this.k = n;
    }
    
    public final void m(int n) {
        int n2 = n;
        if (n == 120) {
            n2 = 120;
        }
        if ((n = n2) == 240) {
            n = 240;
        }
        int n3;
        if (30 == (n3 = n)) {
            n3 = 60;
        }
        this.l = n3;
    }
    
    public final void n(final int n) {
        this.m = n;
    }
}
