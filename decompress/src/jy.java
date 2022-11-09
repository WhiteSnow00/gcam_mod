import android.content.DialogInterface$OnClickListener;
import android.os.Message;
import android.content.DialogInterface;
import java.lang.ref.WeakReference;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class jy extends Handler
{
    private final WeakReference a;
    
    public jy(final DialogInterface dialogInterface) {
        this.a = new WeakReference((T)dialogInterface);
    }
    
    public final void handleMessage(final Message message) {
        switch (message.what) {
            default: {
                return;
            }
            case 1: {
                ((DialogInterface)message.obj).dismiss();
                return;
            }
            case -3:
            case -2:
            case -1: {
                ((DialogInterface$OnClickListener)message.obj).onClick((DialogInterface)this.a.get(), message.what);
            }
        }
    }
}
