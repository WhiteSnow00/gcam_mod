// 
// Decompiled by Procyon v0.6.0
// 

final class ktt extends ljk
{
    private final kty a;
    private boolean b;
    
    public ktt(final ljg ljg, final kty a) {
        super(ljg);
        this.b = false;
        this.a = a;
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            if (this.b) {
                return;
            }
            this.b = true;
            monitorexit(this);
            this.a.a();
            super.close();
        }
    }
}
