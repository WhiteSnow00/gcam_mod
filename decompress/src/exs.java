import java.util.Iterator;
import android.os.SystemClock;
import android.app.Application;

// 
// Decompiled by Procyon v0.6.0
// 

public class exs extends Application
{
    protected static final long j;
    public final ewn k;
    
    static {
        j = SystemClock.elapsedRealtimeNanos();
    }
    
    public exs() {
        this.k = new ewn();
    }
    
    public void onCreate() {
        final ewn k = this.k;
        final ewl c = ewl.c;
        k.f(c);
        k.d = c;
        super.onCreate();
    }
    
    public final void onTerminate() {
        final ewn k = this.k;
        k.a(k.d);
        for (final exn exn : k.a) {
            if (exn instanceof ewt) {
                ((ewt)exn).a();
            }
        }
        super.onTerminate();
    }
}
