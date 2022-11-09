import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kou
{
    private final ofn a;
    
    public kou() {
        this.a = ofn.f();
    }
    
    private final void b() {
        try {
            this.a.get(700L, TimeUnit.MILLISECONDS);
            return;
        }
        catch (final TimeoutException ex) {}
        catch (final ExecutionException ex) {}
        catch (final InterruptedException ex2) {}
        final TimeoutException ex;
        Log.w("AuViEncoderStop", "Error getting last video frame timestamp.", (Throwable)ex);
    }
    
    private static boolean c(final long n, final AtomicLong atomicLong) {
        return atomicLong.get() <= 0L || n - atomicLong.get() <= 3000000L;
    }
    
    public final void a(final int n, final long n2, final AtomicLong atomicLong, final oey oey) {
        String.format("%s Waiting for EOS at: %d, frames at: %d", kpo.b(n), SystemClock.uptimeMillis() * 1000L, atomicLong.get());
        Label_0197: {
            try {
                final String b = kpo.b(n);
                atomicLong.get();
                b.length();
                if (atomicLong.get() > 0L && !c(n2, atomicLong)) {
                    throw new TimeoutException(String.format("%s not waiting for last frame to arrive. [stop us: %d, last frame us: %d]", kpo.b(n), n2, atomicLong.get()));
                }
                oey.get(700L, TimeUnit.MILLISECONDS);
                break Label_0197;
            }
            catch (final TimeoutException ex) {}
            catch (final ExecutionException ex2) {}
            catch (final InterruptedException ex3) {}
            Log.w("AuViEncoderStop", String.format("%s Failed waiting for eos, stream may have stopped early (last frame: %d)", kpo.b(n), atomicLong.get()));
            c(n2, atomicLong);
        }
        if (n == 2) {
            this.a.o(atomicLong.get());
        }
        else {
            this.b();
        }
        String.format("Last %s frame timestamp: %d", kpo.b(n), atomicLong.get());
    }
}
