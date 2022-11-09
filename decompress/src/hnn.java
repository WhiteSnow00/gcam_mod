// 
// Decompiled by Procyon v0.6.0
// 

final class hnn extends ljr
{
    private final Runnable a;
    private boolean b;
    
    public hnn(final lju lju, final Runnable a) {
        super(lju);
        this.b = false;
        this.a = a;
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            final boolean b = this.b;
            boolean b2 = true;
            if (!b) {
                this.b = true;
            }
            else {
                b2 = false;
            }
            monitorexit(this);
            if (b2) {
                super.close();
                this.a.run();
            }
        }
    }
}
