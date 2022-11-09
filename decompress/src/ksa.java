import java.util.concurrent.Callable;
import android.os.Trace;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ksa implements kse
{
    private static final AtomicInteger a;
    private final String b;
    
    static {
        a = new AtomicInteger();
    }
    
    public ksa() {
        this.b = "";
    }
    
    private static boolean j() {
        return Trace.isEnabled();
    }
    
    @Override
    public final ksh a(final String s) {
        return new kry(ksa.a.incrementAndGet(), s);
    }
    
    @Override
    public final ksj b(final String s) {
        return new krz(s);
    }
    
    @Override
    public final Runnable c(final String s, final Runnable runnable) {
        if (!j()) {
            return runnable;
        }
        return new krw(this, s, runnable);
    }
    
    @Override
    public final Callable d(final String s, final Callable callable) {
        if (!j()) {
            return callable;
        }
        return new krx(this, s, callable);
    }
    
    @Override
    public final void f(String s) {
        njo.p(s.isEmpty() ^ true, "Empty sectionName.");
        final String b = this.b;
        s = String.valueOf(s);
        if (s.length() != 0) {
            s = b.concat(s);
        }
        else {
            s = new String(b);
        }
        Trace.beginSection(s);
    }
    
    @Override
    public final void g() {
        Trace.endSection();
    }
    
    @Override
    public final void h(final String s) {
        Trace.endSection();
        this.f(s);
    }
    
    @Override
    public final void i() {
    }
}
