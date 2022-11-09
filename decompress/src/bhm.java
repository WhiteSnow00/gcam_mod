import java.util.concurrent.TimeUnit;
import android.graphics.drawable.Drawable;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bhm implements bhi, bhn
{
    private Object a;
    private bhj b;
    private boolean c;
    private boolean d;
    private boolean e;
    private ayv f;
    
    private final Object n(final Long n) {
        monitorenter(this);
        try {
            if (!this.isDone() && !biv.m()) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
            if (this.c) {
                throw new CancellationException();
            }
            if (this.e) {
                throw new ExecutionException(this.f);
            }
            if (this.d) {
                final Object a = this.a;
                monitorexit(this);
                return a;
            }
            if (n == null) {
                this.wait(0L);
            }
            else if (n > 0L) {
                for (long n2 = System.currentTimeMillis(), n3 = n + n2; !this.isDone() && n2 < n3; n2 = System.currentTimeMillis()) {
                    this.wait(n3 - n2);
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.e) {
                throw new ExecutionException(this.f);
            }
            if (this.c) {
                throw new CancellationException();
            }
            if (this.d) {
                final Object a2 = this.a;
                monitorexit(this);
                return a2;
            }
            throw new TimeoutException();
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void a(final Drawable drawable) {
    }
    
    @Override
    public final void b(final Object o) {
        monitorenter(this);
        monitorexit(this);
    }
    
    @Override
    public final bhj c() {
        synchronized (this) {
            return this.b;
        }
    }
    
    @Override
    public final boolean cancel(final boolean b) {
        synchronized (this) {
            if (this.isDone()) {
                return false;
            }
            this.c = true;
            this.notifyAll();
            bhj b2 = null;
            if (b) {
                b2 = this.b;
                this.b = null;
            }
            monitorexit(this);
            if (b2 != null) {
                b2.c();
            }
            return true;
        }
    }
    
    @Override
    public final void d(final bhx bhx) {
        bhx.g(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
    
    @Override
    public final void e(final Drawable drawable) {
        monitorenter(this);
        monitorexit(this);
    }
    
    @Override
    public final void f(final Drawable drawable) {
    }
    
    @Override
    public final void g() {
    }
    
    @Override
    public final Object get() {
        try {
            return this.n(null);
        }
        catch (final TimeoutException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    @Override
    public final Object get(final long n, final TimeUnit timeUnit) {
        return this.n(timeUnit.toMillis(n));
    }
    
    @Override
    public final void h() {
    }
    
    @Override
    public final void i() {
    }
    
    @Override
    public final boolean isCancelled() {
        synchronized (this) {
            return this.c;
        }
    }
    
    @Override
    public final boolean isDone() {
        monitorenter(this);
        try {
            final boolean b = this.c || this.d || this.e;
            monitorexit(this);
            return b;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void j(final bhx bhx) {
    }
    
    @Override
    public final void k(final bhj b) {
        synchronized (this) {
            this.b = b;
        }
    }
    
    @Override
    public final void l(final ayv f) {
        synchronized (this) {
            this.e = true;
            this.f = f;
            this.notifyAll();
        }
    }
    
    @Override
    public final void m(final Object a) {
        synchronized (this) {
            this.d = true;
            this.a = a;
            this.notifyAll();
        }
    }
    
    @Override
    public final String toString() {
        final String concat = String.valueOf(super.toString()).concat("[status=");
        synchronized (this) {
            final boolean c = this.c;
            Object b = null;
            String s;
            if (c) {
                s = "CANCELLED";
            }
            else if (this.e) {
                s = "FAILURE";
            }
            else if (this.d) {
                s = "SUCCESS";
            }
            else {
                s = "PENDING";
                b = this.b;
            }
            monitorexit(this);
            if (b != null) {
                final String value = String.valueOf(b);
                final StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 13 + s.length() + String.valueOf(value).length());
                sb.append(concat);
                sb.append(s);
                sb.append(", request=[");
                sb.append(value);
                sb.append("]]");
                return sb.toString();
            }
            final StringBuilder sb2 = new StringBuilder(String.valueOf(concat).length() + 1 + s.length());
            sb2.append(concat);
            sb2.append(s);
            sb2.append("]");
            return sb2.toString();
        }
    }
}
