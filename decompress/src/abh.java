import android.os.Handler;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abh implements Runnable
{
    private final Callable a;
    private final ho b;
    private final Handler c;
    
    public abh(final Handler c, final Callable a, final ho b) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        aba a;
        try {
            a = ((aay)this.a).a();
        }
        catch (final Exception ex) {
            a = null;
        }
        this.c.post((Runnable)new abg(this.b, a));
    }
}
