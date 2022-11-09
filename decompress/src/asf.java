// 
// Decompiled by Procyon v0.6.0
// 

final class asf implements Runnable
{
    final /* synthetic */ atd a;
    
    public asf(final atd a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.a.a().removeCallbacksAndMessages((Object)null);
        this.a.a().obtainMessage(2).sendToTarget();
    }
}
