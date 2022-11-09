// 
// Decompiled by Procyon v0.6.0
// 

final class asp implements Runnable
{
    final /* synthetic */ byte[] a;
    final /* synthetic */ asx b;
    
    public asp(final asx b, final byte[] a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.b.c().obtainMessage(105, (Object)this.a).sendToTarget();
    }
}
