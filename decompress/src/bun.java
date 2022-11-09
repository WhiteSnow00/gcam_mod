import android.os.Message;
import android.os.Looper;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class bun extends Handler
{
    final /* synthetic */ buo a;
    
    public bun(final buo a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public final void handleMessage(final Message message) {
        final buo a = this.a;
        a.f(a.d());
    }
}
