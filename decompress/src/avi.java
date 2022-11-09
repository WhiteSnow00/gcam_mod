import java.io.IOException;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

final class avi implements Closeable
{
    public final Charset a;
    public int b;
    private final InputStream c;
    private byte[] d;
    private int e;
    
    public avi(final InputStream c, final Charset a) {
        if (a == null) {
            throw null;
        }
        if (a.equals(avj.a)) {
            this.c = c;
            this.a = a;
            this.d = new byte[8192];
            return;
        }
        throw new IllegalArgumentException("Unsupported encoding");
    }
    
    private final void b() {
        final InputStream c = this.c;
        final byte[] d = this.d;
        final int length = d.length;
        final int read = c.read(d, 0, 8192);
        if (read != -1) {
            this.e = 0;
            this.b = read;
            return;
        }
        throw new EOFException();
    }
    
    public final String a() {
        final InputStream c = this.c;
        monitorenter(c);
        try {
            if (this.d == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.e >= this.b) {
                this.b();
            }
            int e = this.e;
            while (true) {
                final int b = this.b;
                if (e == b) {
                    final avh avh = new avh(this, b - this.e + 80);
                    int i = 0;
                    byte[] d2 = null;
                Block_9:
                    while (true) {
                        final byte[] d = this.d;
                        final int e2 = this.e;
                        avh.write(d, e2, this.b - e2);
                        this.b = -1;
                        this.b();
                        for (i = this.e; i != this.b; ++i) {
                            d2 = this.d;
                            if (d2[i] == 10) {
                                break Block_9;
                            }
                        }
                    }
                    final int e3 = this.e;
                    if (i != e3) {
                        avh.write(d2, e3, i - e3);
                    }
                    this.e = i + 1;
                    final String string = avh.toString();
                    monitorexit(c);
                    return string;
                }
                final byte[] d3 = this.d;
                if (d3[e] == 10) {
                    final int e4 = this.e;
                    int n;
                    if (e == e4 || d3[n = e - 1] != 13) {
                        n = e;
                    }
                    final String s = new String(d3, e4, n - e4, this.a.name());
                    this.e = e + 1;
                    monitorexit(c);
                    return s;
                }
                ++e;
            }
        }
        finally {
            monitorexit(c);
            while (true) {}
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.c) {
            if (this.d != null) {
                this.d = null;
                this.c.close();
            }
        }
    }
}
