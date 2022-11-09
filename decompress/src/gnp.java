// 
// Decompiled by Procyon v0.6.0
// 

final class gnp implements gmz
{
    private final /* synthetic */ int a;
    
    public gnp() {
    }
    
    public gnp(final int a) {
        this.a = a;
    }
    
    @Override
    public final kwx a() {
        switch (this.a) {
            default: {
                final kww a = kwx.a();
                a.c(4);
                a.b(4);
                a.e(1);
                a.d(true);
                return a.a();
            }
            case 0: {
                final kww a2 = kwx.a();
                a2.c(3);
                a2.b(4);
                a2.e(3);
                a2.d(false);
                return a2.a();
            }
        }
    }
    
    @Override
    public final void close() {
        final int a = this.a;
    }
}
