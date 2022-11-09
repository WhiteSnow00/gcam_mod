// 
// Decompiled by Procyon v0.6.0
// 

final class gxk implements Runnable
{
    final /* synthetic */ gxv a;
    final /* synthetic */ gxp b;
    
    public gxk(final gxp b, final gxv a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final gxw k = this.b.k;
        final gxv a = this.a;
        synchronized (k.a) {
            if (k.a.contains(a)) {
                k.a.remove(a);
                k.b.remove(a);
                k.a.size();
            }
            else {
                k.a.size();
            }
        }
    }
}
