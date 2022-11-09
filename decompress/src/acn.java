// 
// Decompiled by Procyon v0.6.0
// 

public final class acn extends aci
{
    public aco q;
    private float r;
    
    public acn(final Object o, final acl acl) {
        super(o, acl);
        this.q = null;
        this.r = Float.MAX_VALUE;
    }
    
    @Override
    public final void e() {
        final aco q = this.q;
        if (q == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        final double n = q.a();
        if (n > this.n) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (n >= this.o) {
            final aco q2 = this.q;
            final double abs = Math.abs((double)this.b());
            q2.d = abs;
            q2.e = abs * 62.5;
            super.e();
            return;
        }
        throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
    }
    
    @Override
    public final boolean f(long n) {
        float n2;
        if (this.r != Float.MAX_VALUE) {
            n /= 2L;
            final acf b = this.q.b(this.i, this.h, n);
            this.q.c(this.r);
            this.r = Float.MAX_VALUE;
            final acf b2 = this.q.b(b.a, b.b, n);
            n2 = b2.a;
            this.i = n2;
            this.h = b2.b;
        }
        else {
            final acf b3 = this.q.b(this.i, this.h, n);
            n2 = b3.a;
            this.i = n2;
            this.h = b3.b;
        }
        final float max = Math.max(n2, this.o);
        this.i = max;
        final float min = Math.min(max, this.n);
        this.i = min;
        final float h = this.h;
        final aco q = this.q;
        if (Math.abs(h) < q.e && Math.abs(min - q.a()) < q.d) {
            this.i = this.q.a();
            this.h = 0.0f;
            return true;
        }
        return false;
    }
}
