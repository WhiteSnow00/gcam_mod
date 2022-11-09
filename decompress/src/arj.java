import android.hardware.Camera$Parameters;

// 
// Decompiled by Procyon v0.6.0
// 

final class arj implements Runnable
{
    final /* synthetic */ Camera$Parameters[] a;
    final /* synthetic */ atc b;
    final /* synthetic */ arr c;
    
    public arj(final arr c, final Camera$Parameters[] a, final atc b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        this.c.a.d.obtainMessage(202, (Object)this.a).sendToTarget();
        this.c.a.d.post(this.b.a);
    }
}
