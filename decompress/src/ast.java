import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ast implements Runnable
{
    final /* synthetic */ Handler a;
    final /* synthetic */ asi b;
    final /* synthetic */ asx c;
    
    public ast(final asx c, final Handler a, final asi b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        this.c.c().obtainMessage(3, this.c.a(), 0, (Object)asn.e(this.a, this.b)).sendToTarget();
    }
}
