// 
// Decompiled by Procyon v0.6.0
// 

public final class ghk implements krc
{
    public final ljm a;
    final /* synthetic */ ghl b;
    private boolean c;
    
    public ghk(final ghl b, final ljm a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void close() {
        synchronized (this.b.b) {
            if (!this.c) {
                boolean b = true;
                this.c = true;
                final ghl b2 = this.b;
                final int h = b2.h - 1;
                b2.h = h;
                if (h != 0 || !b2.i) {
                    b = false;
                }
                monitorexit(this.b.b);
                if (b) {
                    this.b.b();
                }
            }
        }
    }
}
