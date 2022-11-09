import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

final class adv implements Callable
{
    final /* synthetic */ ady a;
    
    public adv(final ady a) {
        this.a = a;
    }
    
    @Override
    public final Object call() {
        this.a.e.set(true);
        Object o;
        try {
            Process.setThreadPriority(10);
            final Object a = this.a.a();
            try {
                Binder.flushPendingCommands();
                this.a.d(a);
                return a;
            }
            finally {}
        }
        finally {
            o = null;
        }
        try {
            this.a.d.set(true);
            throw;
        }
        finally {
            this.a.d(o);
        }
    }
}
