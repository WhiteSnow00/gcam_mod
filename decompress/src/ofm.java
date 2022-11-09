import java.util.concurrent.RejectedExecutionException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Logger;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class ofm implements Executor
{
    public static final Logger a;
    public final Deque b;
    public long c;
    public int d;
    private final Executor e;
    private final ofl f;
    
    static {
        a = Logger.getLogger(ofm.class.getName());
    }
    
    public ofm(final Executor e) {
        this.b = new ArrayDeque();
        this.d = 1;
        this.c = 0L;
        this.f = new ofl(this);
        e.getClass();
        this.e = e;
    }
    
    @Override
    public final void execute(final Runnable error) {
        error.getClass();
        final Deque b = this.b;
        monitorenter(b);
        try {
            final int d = this.d;
            if (d != 4) {
                if (d != 3) {
                    final long c = this.c;
                    final ofk ofk = new ofk((Runnable)error);
                    this.b.add(ofk);
                    this.d = 2;
                    monitorexit(b);
                    try {
                        this.e.execute(this.f);
                        if (this.d != 2) {
                            return;
                        }
                        synchronized (this.b) {
                            if (this.c == c && this.d == 2) {
                                this.d = 3;
                            }
                            return;
                        }
                    }
                    catch (final Error error) {}
                    catch (final RuntimeException ex) {}
                    synchronized (this.b) {
                        final int d2 = this.d;
                        boolean b2 = false;
                        if ((d2 == 1 || d2 == 2) && this.b.removeLastOccurrence(ofk)) {
                            b2 = true;
                        }
                        if (error instanceof RejectedExecutionException && !b2) {
                            return;
                        }
                        throw error;
                    }
                }
            }
            this.b.add(error);
            monitorexit(b);
        }
        finally {
            monitorexit(b);
            while (true) {}
        }
    }
    
    @Override
    public final String toString() {
        final int identityHashCode = System.identityHashCode(this);
        final String value = String.valueOf(this.e);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 32);
        sb.append("SequentialExecutor@");
        sb.append(identityHashCode);
        sb.append("{");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
