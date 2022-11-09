// 
// Decompiled by Procyon v0.6.0
// 

final class aqt implements Runnable
{
    final /* synthetic */ arc a;
    final /* synthetic */ aqu b;
    
    public aqt(final aqu b, final arc a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.b.c.c.e(-16);
        this.b.c.b.obtainMessage(601, (Object)this.a).sendToTarget();
    }
}
