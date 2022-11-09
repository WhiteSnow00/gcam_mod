import java.util.concurrent.atomic.AtomicInteger;
import android.system.ErrnoException;
import java.io.IOException;
import android.system.Os;
import java.io.FileOutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class lmd extends FileOutputStream
{
    final /* synthetic */ lme a;
    private final int b;
    private final FileOutputStream c;
    private boolean d;
    
    public lmd(final lme a, final FileOutputStream c) {
        this.a = a;
        super(c.getFD());
        this.b = lme.a.incrementAndGet();
        this.d = false;
        this.c = c;
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            if (this.d) {
                return;
            }
            this.d = true;
            Object a;
            try {
                try {
                    a = this.a;
                    final AtomicInteger a2 = lme.a;
                    final lou e = ((lme)a).e;
                    Os.fdatasync(this.getFD());
                    a = null;
                }
                finally {}
            }
            catch (final ErrnoException ex) {
                a = new IOException((Throwable)ex);
            }
            Object o;
            try {
                super.close();
                o = a;
            }
            catch (final IOException ex2) {
                o = a;
                if (a == null) {
                    o = new IOException(ex2);
                }
            }
            Object o2;
            try {
                this.c.close();
                o2 = o;
            }
            catch (final IOException ex3) {
                o2 = o;
                if (o == null) {
                    o2 = new IOException(ex3);
                }
            }
            if (o2 == null) {
                final lme a3 = this.a;
                final AtomicInteger a4 = lme.a;
                a3.c.writeLock().unlock();
                final krr d = this.a.d;
                final String value = String.valueOf(this);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 7);
                sb.append("Closed ");
                sb.append(value);
                d.f(sb.toString());
                return;
            }
            throw o2;
            final lme a5 = this.a;
            final AtomicInteger a6 = lme.a;
            a5.c.writeLock().unlock();
            final krr d2 = this.a.d;
            final String value2 = String.valueOf(this);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 7);
            sb2.append("Closed ");
            sb2.append(value2);
            d2.f(sb2.toString());
        }
    }
    
    @Override
    public final String toString() {
        final int b = this.b;
        final StringBuilder sb = new StringBuilder(29);
        sb.append("MediaOutputStream-");
        sb.append(b);
        return sb.toString();
    }
}
