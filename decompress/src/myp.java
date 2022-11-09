// 
// Decompiled by Procyon v0.6.0
// 

public final class myp implements kdy
{
    final /* synthetic */ myq a;
    final /* synthetic */ ozo b;
    
    public myp(final myq a, final ozo b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(keg keg) {
        if (keg.e()) {
            final ozo b = this.b;
            if (b.get() != oyj.a) {
                keg = (keg)b.getAndSet(oyj.a);
                if (keg != oyj.a) {
                    try {
                        b.a.e();
                        if (keg != null) {
                            ((oxp)keg).bX();
                        }
                    }
                    finally {
                        if (keg != null) {
                            ((oxp)keg).bX();
                        }
                    }
                }
            }
            return;
        }
        Exception b2;
        if ((b2 = keg.b()) == null) {
            b2 = new IllegalStateException("Unknown F250Authenticator error");
        }
        final myq a = this.a;
        a.a.b.a(myz.c(a.b, 16, b2));
        this.b.b(b2);
    }
}
