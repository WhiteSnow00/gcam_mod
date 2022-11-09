// 
// Decompiled by Procyon v0.6.0
// 

final class fnp extends ivr
{
    final /* synthetic */ ilx a;
    final /* synthetic */ fol b;
    
    public fnp(final fol b, final ilx a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void onShutterButtonClick() {
        final fol b = this.b;
        if (!b.k || !b.j) {
            return;
        }
        if (b.l) {
            b.z();
            return;
        }
        this.a.d();
        final ess s = this.b.s;
        final fno fno = new fno(this);
        if (s.b != null && !s.d && s.n == 0 && !s.v) {
            s.c.b.j(s.I, new esq(s, fno));
        }
    }
}
