import java.io.IOException;
import java.io.InputStream;
import java.io.FilterInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bel extends FilterInputStream
{
    private volatile byte[] a;
    private int b;
    private int c;
    private int d;
    private int e;
    private final azi f;
    
    public bel(final InputStream inputStream, final azi f) {
        super(inputStream);
        this.d = -1;
        this.f = f;
        this.a = (byte[])f.a(65536, byte[].class);
    }
    
    private final int c(final InputStream inputStream, final byte[] array) {
        final int d = this.d;
        if (d != -1) {
            final int e = this.e;
            final int c = this.c;
            if (e - d < c) {
                byte[] a = null;
                Label_0156: {
                    int n;
                    if ((n = d) == 0) {
                        final int length = array.length;
                        if (c > length) {
                            if (this.b == length) {
                                int n2 = length + length;
                                if (n2 > c) {
                                    n2 = c;
                                }
                                a = (byte[])this.f.a(n2, byte[].class);
                                System.arraycopy(array, 0, a, 0, length);
                                this.a = a;
                                this.f.c(array);
                                break Label_0156;
                            }
                            n = 0;
                        }
                        else {
                            n = 0;
                        }
                    }
                    a = array;
                    if (n > 0) {
                        System.arraycopy(array, n, array, 0, array.length - n);
                        a = array;
                    }
                }
                final int e2 = this.e - this.d;
                this.e = e2;
                this.d = 0;
                this.b = 0;
                final int read = inputStream.read(a, e2, a.length - e2);
                int e3 = this.e;
                if (read > 0) {
                    e3 += read;
                }
                this.b = e3;
                return read;
            }
        }
        final int read2 = inputStream.read(array);
        if (read2 > 0) {
            this.d = -1;
            this.e = 0;
            this.b = read2;
        }
        return read2;
    }
    
    private static IOException d() {
        throw new IOException("BufferedInputStream is closed");
    }
    
    public final void a() {
        synchronized (this) {
            this.c = this.a.length;
        }
    }
    
    @Override
    public final int available() {
        synchronized (this) {
            final InputStream in = this.in;
            if (this.a != null && in != null) {
                final int b = this.b;
                final int e = this.e;
                final int available = in.available();
                monitorexit(this);
                return b - e + available;
            }
            throw d();
        }
    }
    
    public final void b() {
        synchronized (this) {
            if (this.a != null) {
                this.f.c(this.a);
                this.a = null;
            }
        }
    }
    
    @Override
    public final void close() {
        if (this.a != null) {
            this.f.c(this.a);
            this.a = null;
        }
        final InputStream in = this.in;
        this.in = null;
        if (in != null) {
            in.close();
        }
    }
    
    @Override
    public final void mark(final int n) {
        synchronized (this) {
            this.c = Math.max(this.c, n);
            this.d = this.e;
        }
    }
    
    @Override
    public final boolean markSupported() {
        return true;
    }
    
    @Override
    public final int read() {
        synchronized (this) {
            final byte[] a = this.a;
            final InputStream in = this.in;
            if (a == null || in == null) {
                throw d();
            }
            if (this.e >= this.b && this.c(in, a) == -1) {
                return -1;
            }
            byte[] a2;
            if ((a2 = a) != this.a) {
                a2 = this.a;
                if (a2 == null) {
                    throw d();
                }
            }
            final int b = this.b;
            final int e = this.e;
            if (b - e > 0) {
                this.e = e + 1;
                final byte b2 = a2[e];
                monitorexit(this);
                return b2 & 0xFF;
            }
            return -1;
        }
    }
    
    @Override
    public final int read(final byte[] array, int n, int n2) {
        monitorenter(this);
        try {
            byte[] a = this.a;
            if (a == null) {
                throw d();
            }
            if (n2 == 0) {
                monitorexit(this);
                return 0;
            }
            final InputStream in = this.in;
            if (in != null) {
                final int e = this.e;
                final int b = this.b;
                int n5;
                if (e < b) {
                    int n3;
                    if ((n3 = b - e) >= n2) {
                        n3 = n2;
                    }
                    System.arraycopy(a, e, array, n, n3);
                    this.e += n3;
                    if (n3 == n2 || in.available() == 0) {
                        monitorexit(this);
                        return n3;
                    }
                    final int n4 = n + n3;
                    n = n2 - n3;
                    n5 = n4;
                }
                else {
                    final int n6 = n2;
                    n5 = n;
                    n = n6;
                }
                while (true) {
                    byte[] a2;
                    int n7;
                    if (this.d == -1 && n >= a.length) {
                        final int read = in.read(array, n5, n);
                        a2 = a;
                        if ((n7 = read) == -1) {
                            if (n == n2) {
                                monitorexit(this);
                                return -1;
                            }
                            n2 -= n;
                            break;
                        }
                    }
                    else if (this.c(in, a) == -1) {
                        if (n == n2) {
                            monitorexit(this);
                            return -1;
                        }
                        monitorexit(this);
                        return n2 - n;
                    }
                    else {
                        if ((a2 = a) != this.a) {
                            a2 = this.a;
                            if (a2 == null) {
                                throw d();
                            }
                        }
                        final int b2 = this.b;
                        final int e2 = this.e;
                        if ((n7 = b2 - e2) >= n) {
                            n7 = n;
                        }
                        System.arraycopy(a2, e2, array, n5, n7);
                        this.e += n7;
                    }
                    n -= n7;
                    if (n == 0) {
                        break;
                    }
                    if (in.available() == 0) {
                        monitorexit(this);
                        return n2 - n;
                    }
                    n5 += n7;
                    a = a2;
                }
                monitorexit(this);
                return n2;
            }
            throw d();
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void reset() {
        synchronized (this) {
            if (this.a == null) {
                throw new IOException("Stream is closed");
            }
            final int d = this.d;
            if (d != -1) {
                this.e = d;
                return;
            }
            final int e = this.e;
            final int c = this.c;
            final StringBuilder sb = new StringBuilder(66);
            sb.append("Mark has been invalidated, pos: ");
            sb.append(e);
            sb.append(" markLimit: ");
            sb.append(c);
            throw new bek(sb.toString());
        }
    }
    
    @Override
    public final long skip(long skip) {
        monitorenter(this);
        if (skip < 1L) {
            monitorexit(this);
            return 0L;
        }
        try {
            final byte[] a = this.a;
            if (a == null) {
                throw d();
            }
            final InputStream in = this.in;
            if (in == null) {
                throw d();
            }
            final int b = this.b;
            final int e = this.e;
            if (b - e >= skip) {
                this.e = (int)(e + skip);
                monitorexit(this);
                return skip;
            }
            final long n = b - (long)e;
            this.e = b;
            if (this.d != -1 && skip <= this.c) {
                if (this.c(in, a) == -1) {
                    skip = n;
                }
                else {
                    final int b2 = this.b;
                    final int e2 = this.e;
                    if (b2 - e2 >= skip - n) {
                        this.e = (int)(e2 + skip - n);
                        monitorexit(this);
                        return skip;
                    }
                    this.e = b2;
                    skip = n + b2 - e2;
                }
                monitorexit(this);
                return skip;
            }
            skip = in.skip(skip - n);
            if (skip > 0L) {
                this.d = -1;
            }
            monitorexit(this);
            return n + skip;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
