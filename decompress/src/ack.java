// 
// Decompiled by Procyon v0.6.0
// 

public final class ack extends aci
{
    public final acj q;
    
    public ack(final acm acm) {
        super(acm);
        final acj q = new acj();
        this.q = q;
        q.b = this.b() * 62.5f;
    }
    
    @Override
    public final boolean f(final long n) {
        final acj q = this.q;
        final float i = this.i;
        final float h = this.h;
        final acf c = q.c;
        final double n2 = h;
        final double exp = Math.exp(n / 1000.0f * q.a);
        Double.isNaN(n2);
        c.b = (float)(n2 * exp);
        final acf c2 = q.c;
        final float b = c2.b;
        c2.a = i + (b - h) / q.a;
        if (q.a(b)) {
            q.c.b = 0.0f;
        }
        final acf c3 = q.c;
        final float a = c3.a;
        this.i = a;
        final float b2 = c3.b;
        this.h = b2;
        final float o = this.o;
        if (a < o) {
            this.i = o;
            return true;
        }
        final float n3 = this.n;
        if (a > n3) {
            this.i = n3;
            return true;
        }
        return a >= n3 || a <= o || this.q.a(b2);
    }
}
