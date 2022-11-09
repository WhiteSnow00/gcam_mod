// 
// Decompiled by Procyon v0.6.0
// 

final class eov extends fvs
{
    final /* synthetic */ epb a;
    
    public eov(final epb a) {
        this.a = a;
    }
    
    @Override
    public final void A() {
        this.a.d.execute(new eos(this, 1));
    }
    
    @Override
    public final void B() {
        this.a.d.execute(new eos(this));
    }
    
    @Override
    public final void D(final float n) {
        this.a.d.execute(new eot(this, n, 1));
    }
    
    @Override
    public final void E(final float n, final int n2) {
        this.a.d.execute(new eot(this, n));
    }
    
    @Override
    public final void F(final float n, final long n2) {
        this.a.d.execute(new eou(this, n, n2));
    }
}
