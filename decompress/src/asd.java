import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class asd implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ Handler b;
    final /* synthetic */ asi c;
    final /* synthetic */ atd d;
    
    public asd(final atd d, final int a, final Handler b, final asi c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        this.d.a().obtainMessage(1, this.a, 0, (Object)asn.e(this.b, this.c)).sendToTarget();
    }
}
