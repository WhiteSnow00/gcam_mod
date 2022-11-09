import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class asv implements Runnable
{
    final /* synthetic */ Handler a;
    final /* synthetic */ asy b;
    final /* synthetic */ asx c;
    
    public asv(final asx c, final Handler a, final asy b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final Handler c = this.c.c();
        final Handler a = this.a;
        final asy b = this.b;
        Object o = null;
        if (a != null) {
            if (b != null) {
                o = new ata(a, b);
            }
        }
        c.obtainMessage(102, o).sendToTarget();
    }
}
