import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gdb implements gcy
{
    public final Object a;
    public final Map b;
    public final gdd c;
    
    public gdb(final gdd c) {
        this.c = c;
        this.a = new Object();
        this.b = new HashMap();
    }
    
    private final gda f(final long n) {
        synchronized (this.a) {
            final Map b = this.b;
            final Long value = n;
            if (!b.containsKey(value)) {
                return new gda();
            }
            final gda gda = this.b.get(value);
            gda.getClass();
            return gda;
        }
    }
    
    @Override
    public final void a(final lju lju) {
        synchronized (this.a) {
            final long d = lju.d();
            final gda f = this.f(d);
            final Map b = f.b;
            final Long value = d;
            njo.p(b.containsKey(value) ^ true, "Image already added");
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gru.b(lju);
                f.b.put(value, byteArrayOutputStream.toByteArray());
            }
            catch (final IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    
    @Override
    public final void b(final long n) {
        synchronized (this.a) {
            final gda f = this.f(n);
            njo.p(f.f.g() ^ true, "Base frame already selected!");
            f.f = niz.i(n);
        }
    }
    
    @Override
    public final void c(final long n, final oey oey) {
        synchronized (this.a) {
            this.f(n).c.put(n, oey);
        }
    }
    
    @Override
    public final void d(final lju lju) {
        synchronized (this.a) {
            final long d = lju.d();
            final gda f = this.f(d);
            final Map a = f.a;
            final Long value = d;
            njo.p(a.containsKey(value) ^ true, "Image already added");
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                gru.b(lju);
                f.a.put(value, byteArrayOutputStream.toByteArray());
            }
            catch (final IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    
    @Override
    public final gcz e(final String s) {
        njo.d(s.isEmpty() ^ true);
        return new gcz(this, new gda());
    }
}
