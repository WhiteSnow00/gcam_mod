// 
// Decompiled by Procyon v0.6.0
// 

final class esj implements asg
{
    final /* synthetic */ asx a;
    final /* synthetic */ esk b;
    
    public esj(final esk b, final asx a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final boolean j, final asx asx) {
        final ess a = this.b.a;
        final int k = a.k + 1;
        a.k = k;
        if (a.j) {
            a.l(ess.a.c(), "Past trial succeeded so nothing to do, shouldn't have gotten to this.", '\u0578');
        }
        else {
            if (j || k >= 3) {
                a.d(this.a);
            }
            final ess a2 = this.b.a;
            double i;
            if (j) {
                i = a2.i;
            }
            else {
                i = -9990.0;
            }
            a2.h = i;
            this.b.a.j = j;
        }
        this.b.a.l.release();
    }
}
