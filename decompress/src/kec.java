// 
// Decompiled by Procyon v0.6.0
// 

final class kec implements Runnable
{
    final /* synthetic */ keg a;
    final /* synthetic */ ked b;
    
    public kec(final ked b, final keg a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        synchronized (this.b.a) {
            final kee b = this.b.b;
            if (b != null) {
                b.b(this.a.c());
            }
        }
    }
}
