// 
// Decompiled by Procyon v0.6.0
// 

final class asr implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ atu b;
    final /* synthetic */ asx c;
    
    public asr(final asx c, final int a, final atu b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final atv g = this.c.g();
        if (g.d()) {
            return;
        }
        g.e(this.a);
        this.c.c().obtainMessage(204, (Object)this.b).sendToTarget();
    }
}
