// 
// Decompiled by Procyon v0.6.0
// 

public final class asq implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ asx b;
    
    public asq(final asx b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.b.c().obtainMessage(502, this.a, 0).sendToTarget();
    }
}
