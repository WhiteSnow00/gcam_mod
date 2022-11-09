// 
// Decompiled by Procyon v0.6.0
// 

final class gxl implements Runnable
{
    final /* synthetic */ lju a;
    final /* synthetic */ gxp b;
    
    public gxl(final gxp b, final lju a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.a.close();
        final gxp b = this.b;
        ++b.j;
    }
}
