// 
// Decompiled by Procyon v0.6.0
// 

final class gnj implements gmz
{
    private boolean a;
    private final kwh b;
    
    public gnj(final kwh b) {
        this.b = b;
    }
    
    @Override
    public final kwx a() {
        final kww a = kwx.a();
        a.c(3);
        a.b(4);
        a.e(3);
        a.d(false);
        return a.a();
    }
    
    @Override
    public final void close() {
        if (this.a) {
            return;
        }
        this.a = true;
        gnk.c(this.b, false);
    }
}
