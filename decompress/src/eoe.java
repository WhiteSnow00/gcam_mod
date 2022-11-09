// 
// Decompiled by Procyon v0.6.0
// 

final class eoe implements duo
{
    final /* synthetic */ eok a;
    
    public eoe(final eok a) {
        this.a = a;
    }
    
    @Override
    public final void a(final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        final flv t = this.a.T;
        if (t == null) {
            return;
        }
        boolean b5 = false;
        if (b4 && (boolean)t.b().aQ() && !this.a.K) {
            b5 = true;
        }
        if (b3 && b5) {
            this.a.f.execute(new eoc(this, 1));
            return;
        }
        if (b && !b4) {
            this.a.f.execute(new eoc(this));
            return;
        }
        if (b && b5) {
            this.a.f.execute(new eoc(this, 4));
            return;
        }
        if (!b && b5) {
            this.a.f.execute(new eod(this, b2));
        }
    }
    
    @Override
    public final void c() {
        if (this.a.z.n()) {
            this.a.f.execute(new eoc(this, 2));
        }
    }
    
    @Override
    public final void d() {
        this.a.f.execute(new eoc(this, 3));
    }
}
