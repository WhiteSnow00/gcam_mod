import java.util.concurrent.Callable;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fak implements krc
{
    public final ohh a;
    
    public fak(final lfg lfg, final lfh lfh) {
        this.a = new ohh(lfg, lfh);
    }
    
    public final void a() {
        final ohh a = this.a;
        synchronized (a.d) {
            if (a.f) {
                Log.e("SeeDarkSession", "Unable to finishCapture(): the session is closing or already closed.");
            }
            else {
                a.h = a.e.submit((Callable<Object>)new ohf(a));
            }
        }
    }
    
    @Override
    public final void close() {
        this.a.close();
    }
}
