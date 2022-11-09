// 
// Decompiled by Procyon v0.6.0
// 

public final class lhc implements krc
{
    public final long a;
    final /* synthetic */ lhf b;
    private volatile boolean c;
    
    public lhc(final lhf b, final long a) {
        this.b = b;
        this.a = a;
        this.c = false;
    }
    
    @Override
    public final void close() {
        if (this.c) {
            return;
        }
        synchronized (this) {
            if (this.c) {
                return;
            }
            this.c = true;
            monitorexit(this);
            final lhf b = this.b;
            final long a = this.a;
            synchronized (b.a) {
                b.d -= a;
                b.d();
                monitorexit(b.a);
                b.e();
            }
        }
    }
}
