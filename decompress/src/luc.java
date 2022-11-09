import java.io.FileInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class luc
{
    final FileInputStream a;
    public final long b;
    final long c;
    long d;
    long e;
    
    public luc(final FileInputStream a, final long b, final long c) {
        njo.k(b <= c, "start at %s later than end at %s", b, c);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = 0L;
        this.e = c - b;
    }
    
    public final long a() {
        return this.e - this.d;
    }
    
    public final luc b() {
        final luc luc = new luc(this.a, this.b, this.c);
        luc.e(this.d);
        luc.d(this.e);
        return luc;
    }
    
    public final luc c() {
        final FileInputStream a = this.a;
        final long b = this.b;
        return new luc(a, this.d + b, this.e + b);
    }
    
    public final void d(final long e) {
        final long d = this.d;
        njo.k(e >= d, "New limit %s smaller than position ", e, d);
        final long b = this.b;
        final long c = this.c;
        njo.k(b + e <= c, "New limit %s points farther than end position %s", e, c);
        this.e = e;
    }
    
    public final void e(final long d) {
        final long e = this.e;
        njo.k(d <= e, "New position %s larger than limit %s", d, e);
        this.d = d;
    }
}
