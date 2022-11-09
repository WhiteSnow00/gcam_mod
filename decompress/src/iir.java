// 
// Decompiled by Procyon v0.6.0
// 

class iir extends iio
{
    final /* synthetic */ iit a;
    
    public iir(final iit a) {
        this.a = a;
    }
    
    @Override
    public void b(final fxu e, final kjk kjk) {
        this.a.e = e;
        kjk.c(new iiq(this));
    }
}
