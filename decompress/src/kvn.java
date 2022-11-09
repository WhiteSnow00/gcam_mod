import java.io.OutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class kvn
{
    private int a;
    public final kux b;
    public final OutputStream c;
    public int d;
    public int e;
    private int f;
    
    public kvn(final OutputStream c, final kux b) {
        this.f = 0;
        this.d = 0;
        this.e = 0;
        this.c = c;
        this.b = b;
        this.a = 0;
    }
    
    protected abstract int a(final int p0);
    
    protected final short b(int b) {
        this.d();
        this.c(2, b);
        this.d();
        final kux b2 = this.b;
        final int b3 = b2.b;
        if (b3 + 2 <= b2.c) {
            final byte[] a = b2.a;
            b = b3 + 1;
            b2.b = b;
            final byte b4 = a[b3];
            b2.b = b + 1;
            return (short)(((b4 & 0xFF) << 8) + (a[b] & 0xFF));
        }
        throw new IllegalStateException("Byte queue is too short");
    }
    
    public final void c(final int n, final int n2) {
        if (this.b.a() >= n && this.e == 0 && this.d == 0) {
            return;
        }
        throw new kvm(n, n2);
    }
    
    public final void d() {
        if (this.e == 0 && this.d == 0) {
            return;
        }
        throw new IllegalStateException("Can not read or write bytes while forwarding or skipping");
    }
    
    public final void e(final byte[] array, int e, int n) {
        final int d = this.d;
        if (d < n && d >= 0) {
            final int e2 = this.e;
            if (e2 < n && e2 >= 0) {
                if (d > 0) {
                    e += d;
                    n -= d;
                    this.d = 0;
                }
                else if (e2 > 0) {
                    this.c.write(array, e, e2);
                    final int e3 = this.e;
                    e += e3;
                    n -= e3;
                    this.e = 0;
                }
                final kux b = this.b;
                b.b(n);
                System.arraycopy(array, e, b.a, b.c, n);
                b.c += n;
                this.f();
                return;
            }
            this.c.write(array, e, n);
            e = this.e;
            if (e > 0) {
                this.e = e - n;
            }
        }
        else if (d > 0) {
            this.d = d - n;
        }
    }
    
    public final void f() {
        while (this.b.a() >= this.f && this.e == 0 && this.d == 0) {
            try {
                this.f = 0;
                this.a = this.a(this.a);
                continue;
            }
            catch (final kvm kvm) {
                this.f = kvm.a;
                this.a = kvm.b;
            }
            break;
        }
    }
    
    protected final void g(final byte[] array) {
        this.d();
        this.c.write(array);
    }
    
    protected final void h(final short n) {
        this.d();
        this.c.write(n >> 8 & 0xFF);
        this.c.write(n & 0xFF);
    }
    
    protected final void i(final int n) {
        this.d();
        if (this.b.a() >= n) {
            this.b.c(this.c, n);
            return;
        }
        this.e = n - this.b.a();
        final kux b = this.b;
        b.c(this.c, b.a());
    }
    
    protected final void j(final int n) {
        this.d();
        if (this.b.a() >= n) {
            this.b.d(n);
            return;
        }
        this.d = n - this.b.a();
        final kux b = this.b;
        b.d(b.a());
    }
}
