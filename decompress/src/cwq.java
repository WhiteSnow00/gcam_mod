// 
// Decompiled by Procyon v0.6.0
// 

public final class cwq
{
    public final long a;
    private long b;
    private int c;
    private final int d;
    
    public cwq(final int d, final long a) {
        this.b = 0L;
        this.c = 0;
        this.d = d;
        this.a = a;
    }
    
    final nzg a(long b) {
        synchronized (this) {
            final long a = this.a;
            final okt m = nzg.f.m();
            final int d = this.d;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nzg nzg = (nzg)m.b;
            nzg.b = d - 1;
            final int a2 = nzg.a | 0x1;
            nzg.a = a2;
            final int a3 = a2 | 0x2;
            nzg.a = a3;
            nzg.c = b - a;
            b = this.b;
            final int a4 = a3 | 0x4;
            nzg.a = a4;
            nzg.d = b;
            final int c = this.c;
            nzg.a = (a4 | 0x8);
            nzg.e = c;
            return (nzg)m.h();
        }
    }
    
    final void b() {
        synchronized (this) {
            ++this.c;
        }
    }
    
    final void c() {
        synchronized (this) {
            ++this.b;
        }
    }
}
