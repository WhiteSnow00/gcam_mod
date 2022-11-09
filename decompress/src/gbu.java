// 
// Decompiled by Procyon v0.6.0
// 

final class gbu implements gxv
{
    final /* synthetic */ gbv a;
    
    public gbu(final gbv a) {
        this.a = a;
    }
    
    @Override
    public final void a(final gyn gyn, final gyo gyo) {
        final gxv c = this.a.c;
        if (c != null) {
            c.a(gyn, gyo);
        }
        final int c2 = gyn.c;
        if (c2 == 1) {
            this.a.a = true;
        }
        else if (c2 == 2) {
            this.a.b = true;
        }
        final gbv a = this.a;
        if (a.a && a.b) {
            a.c = null;
        }
    }
    
    @Override
    public final void b(final gyn gyn, final him him) {
        final gxv c = this.a.c;
        if (c != null) {
            c.b(gyn, him);
        }
    }
    
    @Override
    public final void c(final gyn gyn) {
    }
    
    @Override
    public final void d(final gyn gyn, final gzz gzz) {
        final gxv c = this.a.c;
        if (c != null) {
            c.d(gyn, gzz);
        }
    }
}
