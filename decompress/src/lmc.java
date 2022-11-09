import java.util.concurrent.atomic.AtomicInteger;
import java.io.IOException;
import java.io.FileInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class lmc extends FileInputStream
{
    final /* synthetic */ lme a;
    private final int b;
    private final FileInputStream c;
    private boolean d;
    
    public lmc(final lme a, final FileInputStream c) {
        this.a = a;
        super(c.getFD());
        this.b = lme.b.incrementAndGet();
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
            IOException ex2;
            try {
                try {
                    super.close();
                }
                finally {}
            }
            catch (final IOException ex) {
                ex2 = new IOException(ex);
            }
            IOException ex3;
            try {
                this.c.close();
                ex3 = ex2;
            }
            catch (final IOException ex4) {
                ex3 = ex2;
                if (ex2 == null) {
                    ex3 = new IOException(ex4);
                }
            }
            if (ex3 == null) {
                final lme a = this.a;
                final AtomicInteger a2 = lme.a;
                a.c.readLock().unlock();
                final krr d = this.a.d;
                final String value = String.valueOf(this);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 7);
                sb.append("Closed ");
                sb.append(value);
                d.f(sb.toString());
                return;
            }
            throw ex3;
            final lme a3 = this.a;
            final AtomicInteger a4 = lme.a;
            a3.c.readLock().unlock();
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
        final StringBuilder sb = new StringBuilder(28);
        sb.append("MediaInputStream-");
        sb.append(b);
        return sb.toString();
    }
}
