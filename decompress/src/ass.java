// 
// Decompiled by Procyon v0.6.0
// 

final class ass implements Runnable
{
    final /* synthetic */ boolean a;
    final /* synthetic */ asx b;
    
    public ass(final asx b, final boolean a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.b.c().obtainMessage(501, (int)(this.a ? 1 : 0), 0).sendToTarget();
    }
}
