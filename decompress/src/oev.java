import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oev implements oey
{
    public static final oey a;
    private static final Logger c;
    public final Object b;
    
    static {
        a = new oev(null);
        c = Logger.getLogger(oev.class.getName());
    }
    
    public oev(final Object b) {
        this.b = b;
    }
    
    @Override
    public final boolean cancel(final boolean b) {
        return false;
    }
    
    @Override
    public final void d(final Runnable runnable, final Executor executor) {
        runnable.getClass();
        executor.getClass();
        try {
            executor.execute(runnable);
        }
        catch (final RuntimeException ex) {
            final Logger c = oev.c;
            final Level severe = Level.SEVERE;
            final String value = String.valueOf(runnable);
            final String value2 = String.valueOf(executor);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 57 + String.valueOf(value2).length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(value);
            sb.append(" with executor ");
            sb.append(value2);
            c.logp(severe, "com.google.common.util.concurrent.ImmediateFuture", "addListener", sb.toString(), ex);
        }
    }
    
    @Override
    public final Object get() {
        return this.b;
    }
    
    @Override
    public final Object get(final long n, final TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.b;
    }
    
    @Override
    public final boolean isCancelled() {
        return false;
    }
    
    @Override
    public final boolean isDone() {
        return true;
    }
    
    @Override
    public final String toString() {
        final String string = super.toString();
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 27 + String.valueOf(value).length());
        sb.append(string);
        sb.append("[status=SUCCESS, result=[");
        sb.append(value);
        sb.append("]]");
        return sb.toString();
    }
}
