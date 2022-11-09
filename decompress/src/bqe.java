import android.os.Handler;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bqe implements krc
{
    private atd a;
    
    public bqe(final Context context) {
        this.a = ate.a(context);
    }
    
    public final atn a() {
        synchronized (this) {
            final atd a = this.a;
            a.getClass();
            return a.b();
        }
    }
    
    public final void b(final Handler handler, final int n, final asi asi) {
        synchronized (this) {
            final atd a = this.a;
            a.getClass();
            try {
                a.e().a(new asd(a, n, handler, asi));
            }
            catch (final RuntimeException ex) {
                a.c().c(ex);
            }
        }
    }
    
    public final void c(final att att) {
        synchronized (this) {
            final atd a = this.a;
            a.getClass();
            a.f(att);
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            this.a = null;
            ate.b();
        }
    }
    
    public final void d(final boolean b) {
        synchronized (this) {
            final atd a = this.a;
            a.getClass();
            a.g(b);
        }
    }
}
