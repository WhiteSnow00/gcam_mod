import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class aqq implements Runnable
{
    final /* synthetic */ asg a;
    final /* synthetic */ Handler b;
    final /* synthetic */ aqu c;
    
    public aqq(final aqu c, final asg a, final Handler b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        aqp aqp;
        if (this.a != null) {
            aqp = new aqp(this);
        }
        else {
            aqp = null;
        }
        this.c.c.c.e(48);
        this.c.c.b.obtainMessage(301, (Object)aqp).sendToTarget();
    }
}
