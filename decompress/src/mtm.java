import java.io.OutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import android.net.Uri;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mtm implements mtw
{
    public final String a;
    public final oey b;
    public final Executor c;
    public final mrs d;
    public final msu e;
    public final Object f;
    public oey g;
    private final nhl h;
    private final oeg i;
    private final mud j;
    
    public mtm(final String a, final oey oey, final mud j, final Executor executor, final mrs d, final msu e, final nhl h) {
        this.f = new Object();
        this.i = oeg.a();
        this.g = null;
        this.a = a;
        this.b = ofi.o(oey);
        this.j = j;
        this.c = ofi.e(executor);
        this.d = d;
        this.e = e;
        this.h = h;
    }
    
    public final oey a() {
        synchronized (this.f) {
            final oey g = this.g;
            if (g != null && g.isDone()) {
                try {
                    ofi.u(this.g);
                }
                catch (final ExecutionException ex) {
                    this.g = null;
                }
            }
            if (this.g == null) {
                this.g = ofi.o(this.i.b(nhu.a(new mtf(this)), this.c));
            }
            return this.g;
        }
    }
    
    public final Object b(final Uri uri) {
        try {
            final nhl h = this.h;
            final String value = String.valueOf(this.a);
            String concat;
            if (value.length() != 0) {
                concat = "Read ".concat(value);
            }
            else {
                concat = new String("Read ");
            }
            final nho b = h.b(concat);
            try {
                final InputStream inputStream = (InputStream)this.d.b(uri, new msm());
                try {
                    final mud j = this.j;
                    final Object a = j.a.D().a(inputStream, j.b);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    b.close();
                    return a;
                }
                finally {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        }
                        finally {
                            final Throwable t;
                            final Throwable t2;
                            t.addSuppressed(t2);
                        }
                    }
                }
            }
            finally {
                try {
                    b.close();
                }
                finally {
                    final Throwable t3;
                    final Throwable t4;
                    t3.addSuppressed(t4);
                }
            }
        }
        catch (final IOException ex) {}
        catch (final FileNotFoundException ex2) {
            if (!this.d.d(uri)) {
                return this.j.a;
            }
            throw ex2;
        }
        final IOException ex;
        throw mty.b(this.d, uri, ex);
    }
    
    public final void c(final Uri ex, Object o) {
        final Uri a = mty.a((Uri)ex, ".tmp");
        try {
            final nhl h = this.h;
            final String value = String.valueOf(this.a);
            String concat;
            if (value.length() != 0) {
                concat = "Write ".concat(value);
            }
            else {
                concat = new String("Write ");
            }
            final nho b = h.b(concat);
            try {
                final msa msa = new msa();
                try {
                    final mrs d = this.d;
                    final msn msn = new msn();
                    msn.a = new msa[] { msa };
                    final OutputStream outputStream = (OutputStream)d.b(a, msn);
                    try {
                        ((omj)o).f(outputStream);
                        if (msa.b != null) {
                            msa.a.flush();
                            msa.b.a.getFD().sync();
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            b.close();
                            this.d.c(a, (Uri)ex);
                            return;
                        }
                        o = new msf("Cannot sync underlying stream");
                        throw o;
                    }
                    finally {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            }
                            finally {
                                final Throwable t;
                                ((Throwable)o).addSuppressed(t);
                            }
                        }
                    }
                }
                catch (final IOException ex2) {
                    throw mty.b(this.d, (Uri)ex, ex2);
                }
            }
            finally {
                try {
                    b.close();
                }
                finally {
                    final Throwable t2;
                    ex.addSuppressed(t2);
                }
            }
        }
        catch (final IOException ex) {
            if (this.d.d(a)) {
                try {
                    final mrq a2 = this.d.a(a);
                    a2.a.k(a2.d);
                }
                catch (final IOException ex3) {
                    ex.addSuppressed(ex3);
                }
            }
            throw ex;
        }
    }
    
    @Override
    public final oey d(final odp odp, final Executor executor) {
        return this.i.b(nhu.a(new mtg(this, this.a(), odp, executor)), odx.a);
    }
}
