import android.widget.Button;
import android.os.Message;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class jv implements View$OnClickListener
{
    final /* synthetic */ ka a;
    
    public jv(final ka a) {
        this.a = a;
    }
    
    public final void onClick(final View view) {
        final ka a = this.a;
        final Button i = a.i;
        final Message message = null;
        Message message2 = null;
        Label_0068: {
            if (view == i) {
                final Message k = a.k;
                if (k != null) {
                    message2 = Message.obtain(k);
                    break Label_0068;
                }
            }
            if (view == a.l) {
                final Message n = a.n;
                if (n != null) {
                    message2 = Message.obtain(n);
                    break Label_0068;
                }
            }
            final Button o = a.o;
            message2 = message;
        }
        if (message2 != null) {
            message2.sendToTarget();
        }
        final ka a2 = this.a;
        a2.F.obtainMessage(1, (Object)a2.b).sendToTarget();
    }
}
