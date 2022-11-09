// 
// Decompiled by Procyon v0.6.0
// 

final class dno implements dll
{
    long a;
    final /* synthetic */ long b;
    final /* synthetic */ dnp c;
    
    public dno(final dnp c, final long n) {
        this.c = c;
        this.b = n;
        this.a = n;
    }
    
    @Override
    public final long a() {
        return this.a;
    }
    
    @Override
    public final boolean b() {
        synchronized (this.c.a) {
            final dnp c = this.c;
            long a = this.a;
            if (a != Long.MAX_VALUE) {
                ++a;
            }
            final int d = c.d(a);
            if (d >= 0) {
                this.a = this.c.h(d);
                return true;
            }
            return false;
        }
    }
    
    @Override
    public final boolean c() {
        synchronized (this.c.a) {
            final dnp c = this.c;
            long a = this.a;
            if (a != Long.MIN_VALUE) {
                --a;
            }
            final int c2 = c.c(a);
            if (c2 >= 0) {
                this.a = this.c.h(c2);
                return true;
            }
            return false;
        }
    }
}
