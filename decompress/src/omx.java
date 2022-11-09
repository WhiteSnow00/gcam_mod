import java.nio.charset.Charset;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class omx extends ojw
{
    public static final int[] a;
    private static final long serialVersionUID = 1L;
    public final int d;
    public final ojw e;
    public final ojw f;
    public final int g;
    private final int h;
    
    static {
        a = new int[] { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE };
    }
    
    public omx(final ojw e, final ojw f) {
        this.e = e;
        this.f = f;
        final int d = e.d();
        this.h = d;
        this.d = d + f.d();
        this.g = Math.max(e.f(), f.f()) + 1;
    }
    
    public static int c(final int n) {
        final int[] a = omx.a;
        final int length = a.length;
        if (n >= 47) {
            return Integer.MAX_VALUE;
        }
        return a[n];
    }
    
    public static ojw g(final ojw ojw, final ojw ojw2) {
        final int d = ojw.d();
        final int d2 = ojw2.d();
        final byte[] array = new byte[d + d2];
        ojw.C(array, 0, d);
        ojw2.C(array, d, d2);
        return ojw.x(array);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }
    
    @Override
    public final byte a(final int n) {
        ojw.A(n, this.d);
        return this.b(n);
    }
    
    @Override
    public final byte b(final int n) {
        final int h = this.h;
        if (n < h) {
            return this.e.b(n);
        }
        return this.f.b(n - h);
    }
    
    @Override
    public final int d() {
        return this.d;
    }
    
    @Override
    protected final void e(final byte[] array, final int n, final int n2, final int n3) {
        final int h = this.h;
        if (n + n3 <= h) {
            this.e.e(array, n, n2, n3);
            return;
        }
        if (n >= h) {
            this.f.e(array, n - h, n2, n3);
            return;
        }
        final int n4 = h - n;
        this.e.e(array, n, n2, n4);
        this.f.e(array, 0, n2 + n4, n3 - n4);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof ojw)) {
            return false;
        }
        final ojw ojw = (ojw)o;
        if (this.d != ojw.d()) {
            return false;
        }
        if (this.d == 0) {
            return true;
        }
        final int c = super.c;
        final int c2 = ojw.c;
        if (c != 0 && c2 != 0 && c != c2) {
            return false;
        }
        final omw omw = new omw(this);
        oju oju = omw.a();
        final omw omw2 = new omw(ojw);
        oju oju2 = omw2.a();
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        boolean b3;
        while (true) {
            final int n4 = oju.d() - n;
            final int n5 = oju2.d() - n2;
            final int min = Math.min(n4, n5);
            boolean b2;
            if (n == 0) {
                b2 = oju.g(oju2, n2, min);
            }
            else {
                b2 = oju2.g(oju, n, min);
            }
            if (!b2) {
                b3 = false;
                break;
            }
            n3 += min;
            final int d = this.d;
            if (n3 >= d) {
                if (n3 == d) {
                    b3 = b;
                    break;
                }
                throw new IllegalStateException();
            }
            else {
                if (min == n4) {
                    oju = omw.a();
                    n = 0;
                }
                else {
                    n += min;
                }
                if (min == n5) {
                    oju2 = omw2.a();
                    n2 = 0;
                }
                else {
                    n2 += min;
                }
            }
        }
        return b3;
    }
    
    @Override
    protected final int f() {
        return this.g;
    }
    
    @Override
    public final boolean h() {
        return this.d >= c(this.g);
    }
    
    @Override
    protected final int i(int i, final int n, final int n2) {
        final int h = this.h;
        if (n + n2 <= h) {
            return this.e.i(i, n, n2);
        }
        if (n >= h) {
            return this.f.i(i, n - h, n2);
        }
        final int n3 = h - n;
        i = this.e.i(i, n, n3);
        return this.f.i(i, 0, n2 - n3);
    }
    
    @Override
    protected final int j(int j, final int n, final int n2) {
        final int h = this.h;
        if (n + n2 <= h) {
            return this.e.j(j, n, n2);
        }
        if (n >= h) {
            return this.f.j(j, n - h, n2);
        }
        final int n3 = h - n;
        j = this.e.j(j, n, n3);
        return this.f.j(j, 0, n2 - n3);
    }
    
    @Override
    public final ojw k(final int n, final int n2) {
        final int q = ojw.q(n, n2, this.d);
        if (q == 0) {
            return ojw.b;
        }
        if (q == this.d) {
            return this;
        }
        final int h = this.h;
        if (n2 <= h) {
            return this.e.k(n, n2);
        }
        if (n >= h) {
            return this.f.k(n - h, n2 - h);
        }
        final ojw e = this.e;
        return new omx(e.k(n, e.d()), this.f.k(0, n2 - this.h));
    }
    
    @Override
    public final okb l() {
        final ArrayList list = new ArrayList();
        final omw omw = new omw(this);
        while (omw.hasNext()) {
            list.add(omw.a().n());
        }
        final int d = okb.d;
        final Iterator iterator = list.iterator();
        int n = 0;
        int n2 = 0;
        while (iterator.hasNext()) {
            final ByteBuffer byteBuffer = (ByteBuffer)iterator.next();
            n2 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                n |= 0x1;
            }
            else if (byteBuffer.isDirect()) {
                n |= 0x2;
            }
            else {
                n |= 0x4;
            }
        }
        okb h;
        if (n == 2) {
            h = new ojy(list, n2);
        }
        else {
            h = okb.H(new oln(list));
        }
        return h;
    }
    
    @Override
    protected final String m(final Charset charset) {
        return new String(this.B(), charset);
    }
    
    @Override
    public final ByteBuffer n() {
        throw null;
    }
    
    @Override
    public final void o(final ojp ojp) {
        this.e.o(ojp);
        this.f.o(ojp);
    }
    
    @Override
    public final boolean p() {
        final int j = this.e.j(0, 0, this.h);
        final ojw f = this.f;
        return f.j(j, 0, f.d()) == 0;
    }
    
    @Override
    public final ojt r() {
        return new omv(this);
    }
    
    Object writeReplace() {
        return ojw.x(this.B());
    }
}
