import android.util.Log;
import android.os.Message;
import android.os.Looper;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class jpv extends kax
{
    final /* synthetic */ jpw a;
    private final Context b;
    
    public jpv(final jpw a, final Context context) {
        this.a = a;
        Looper looper;
        if (Looper.myLooper() == null) {
            looper = Looper.getMainLooper();
        }
        else {
            looper = Looper.myLooper();
        }
        super(looper);
        this.b = context.getApplicationContext();
    }
    
    public final void handleMessage(final Message message) {
        switch (message.what) {
            default: {
                final int what = message.what;
                final StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(what);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            case 1: {
                final int e = this.a.e(this.b);
                if (jqg.e(e)) {
                    final jpw a = this.a;
                    final Context b = this.b;
                    a.c(b, e, a.h(b, e, "n"));
                }
            }
        }
    }
}
