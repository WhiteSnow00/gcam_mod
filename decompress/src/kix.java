// 
// Decompiled by Procyon v0.6.0
// 

final class kix implements Runnable
{
    final /* synthetic */ kiz a;
    
    public kix(final kiz a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        synchronized (this.a.d) {
            final kiz a = this.a;
            final boolean f = a.f;
            boolean b = true;
            if (!f && a.b == 0) {
                a.f = true;
            }
            else {
                b = false;
            }
            monitorexit(this.a.d);
            if (b) {
                this.a.a.close();
            }
        }
    }
}
