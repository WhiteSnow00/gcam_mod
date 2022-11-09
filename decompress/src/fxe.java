// 
// Decompiled by Procyon v0.6.0
// 

final class fxe implements Runnable
{
    final /* synthetic */ fxf a;
    
    public fxe(final fxf a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final oey c = this.a.c;
        if (c != null && !c.isDone()) {
            this.a.c.cancel(false);
            fxf.b(this.a);
        }
        this.a.e.d();
        this.a.b.close();
    }
}
