import com.google.android.gms.common.api.Status;
import android.util.Log;
import android.os.Message;
import android.util.Pair;
import com.google.android.gms.common.api.internal.BasePendingResult;
import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jry extends kax
{
    public jry() {
        super(Looper.getMainLooper());
    }
    
    public jry(final Looper looper) {
        super(looper);
    }
    
    public final void a(final jrg jrg, final jrf jrf) {
        final ThreadLocal c = BasePendingResult.c;
        this.sendMessage(this.obtainMessage(1, (Object)new Pair((Object)jrg, (Object)jrf)));
    }
    
    public final void handleMessage(final Message message) {
        switch (message.what) {
            default: {
                final int what = message.what;
                final StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(what);
                Log.wtf("BasePendingResult", sb.toString(), (Throwable)new Exception());
                return;
            }
            case 2: {
                ((BasePendingResult)message.obj).h(Status.d);
                return;
            }
            case 1: {
                final Pair pair = (Pair)message.obj;
                final jrg jrg = (jrg)pair.first;
                final jrf jrf = (jrf)pair.second;
                try {
                    jrg.a(jrf);
                    return;
                }
                catch (final RuntimeException ex) {
                    BasePendingResult.i(jrf);
                    throw ex;
                }
                break;
            }
        }
    }
}
