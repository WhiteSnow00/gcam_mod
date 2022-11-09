import java.util.Locale;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ojw implements Iterable, Serializable
{
    public static final ojw b;
    public int c;
    
    static {
        b = new ojv(olk.b);
    }
    
    public ojw() {
        this.c = 0;
    }
    
    static void A(final int n, final int n2) {
        if ((n2 - (n + 1) | n) >= 0) {
            return;
        }
        if (n < 0) {
            final StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(n);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        final StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(n);
        sb2.append(", ");
        sb2.append(n2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }
    
    private static ojw c(final Iterator iterator, int d) {
        if (d > 0) {
            ojw g;
            if (d == 1) {
                g = iterator.next();
            }
            else {
                final int n = d >>> 1;
                final ojw c = c(iterator, n);
                final ojw c2 = c(iterator, d - n);
                if (Integer.MAX_VALUE - c.d() < c2.d()) {
                    final int d2 = c.d();
                    d = c2.d();
                    final StringBuilder sb = new StringBuilder(53);
                    sb.append("ByteString would be too long: ");
                    sb.append(d2);
                    sb.append("+");
                    sb.append(d);
                    throw new IllegalArgumentException(sb.toString());
                }
                final int[] a = omx.a;
                if (c2.d() == 0) {
                    g = c;
                }
                else {
                    g = c2;
                    if (c.d() != 0) {
                        d = c.d() + c2.d();
                        if (d < 128) {
                            g = omx.g(c, c2);
                        }
                        else {
                            if (c instanceof omx) {
                                final omx omx = (omx)c;
                                if (omx.f.d() + c2.d() < 128) {
                                    g = new omx(omx.e, omx.g(omx.f, c2));
                                    return g;
                                }
                                if (omx.e.f() > omx.f.f() && omx.g > c2.f()) {
                                    g = new omx(omx.e, new omx(omx.f, c2));
                                    return g;
                                }
                            }
                            if (d >= omx.c(Math.max(c.f(), c2.f()) + 1)) {
                                g = new omx(c, c2);
                            }
                            else {
                                final ArrayDeque arrayDeque = new ArrayDeque();
                                pip.q(c, arrayDeque);
                                pip.q(c2, arrayDeque);
                                ojw ojw = arrayDeque.pop();
                                while (true) {
                                    g = ojw;
                                    if (arrayDeque.isEmpty()) {
                                        break;
                                    }
                                    ojw = new omx(arrayDeque.pop(), ojw);
                                }
                            }
                        }
                    }
                }
            }
            return g;
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", d));
    }
    
    static int q(final int n, final int n2, final int n3) {
        final int n4 = n2 - n;
        if ((n | n2 | n4 | n3 - n2) >= 0) {
            return n4;
        }
        if (n < 0) {
            final StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(n);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (n2 < n) {
            final StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(n);
            sb2.append(", ");
            sb2.append(n2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        final StringBuilder sb3 = new StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(n2);
        sb3.append(" >= ");
        sb3.append(n3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }
    
    public static ojw s(final ByteBuffer byteBuffer) {
        final int remaining = byteBuffer.remaining();
        q(0, remaining, byteBuffer.remaining());
        final byte[] array = new byte[remaining];
        byteBuffer.get(array);
        return new ojv(array);
    }
    
    public static ojw t(final byte[] array) {
        return u(array, 0, array.length);
    }
    
    public static ojw u(final byte[] array, final int n, final int n2) {
        q(n, n + n2, array.length);
        final byte[] array2 = new byte[n2];
        System.arraycopy(array, n, array2, 0, n2);
        return new ojv(array2);
    }
    
    public static ojw v(final String s) {
        return new ojv(s.getBytes(olk.a));
    }
    
    public static ojw w(final InputStream inputStream) {
        final ArrayList list = new ArrayList();
        int min = 256;
        while (true) {
            final byte[] array = new byte[min];
            int i;
            int read;
            for (i = 0; i < min; i += read) {
                read = inputStream.read(array, i, min - i);
                if (read == -1) {
                    break;
                }
            }
            Object u;
            if (i == 0) {
                u = null;
            }
            else {
                u = u(array, 0, i);
            }
            if (u == null) {
                break;
            }
            list.add(u);
            min = Math.min(min + min, 8192);
        }
        final int size = list.size();
        ojw ojw;
        if (size == 0) {
            ojw = ojw.b;
        }
        else {
            ojw = c(list.iterator(), size);
        }
        return ojw;
    }
    
    static ojw x(final byte[] array) {
        return new ojv(array);
    }
    
    static ojw y(final byte[] array, final int n, final int n2) {
        return new ojs(array, n, n2);
    }
    
    public final byte[] B() {
        final int d = this.d();
        if (d == 0) {
            return olk.b;
        }
        final byte[] array = new byte[d];
        this.e(array, 0, 0, d);
        return array;
    }
    
    @Deprecated
    public final void C(final byte[] array, final int n, final int n2) {
        q(0, n2, this.d());
        q(n, n + n2, array.length);
        if (n2 > 0) {
            this.e(array, 0, n, n2);
        }
    }
    
    public abstract byte a(final int p0);
    
    public abstract byte b(final int p0);
    
    public abstract int d();
    
    protected abstract void e(final byte[] p0, final int p1, final int p2, final int p3);
    
    @Override
    public abstract boolean equals(final Object p0);
    
    protected abstract int f();
    
    public abstract boolean h();
    
    @Override
    public final int hashCode() {
        int c;
        if ((c = this.c) == 0) {
            final int d = this.d();
            if ((c = this.i(d, 0, d)) == 0) {
                c = 1;
            }
            this.c = c;
        }
        return c;
    }
    
    protected abstract int i(final int p0, final int p1, final int p2);
    
    protected abstract int j(final int p0, final int p1, final int p2);
    
    public abstract ojw k(final int p0, final int p1);
    
    public abstract okb l();
    
    protected abstract String m(final Charset p0);
    
    public abstract ByteBuffer n();
    
    public abstract void o(final ojp p0);
    
    public abstract boolean p();
    
    public ojt r() {
        return new ojq(this);
    }
    
    @Override
    public final String toString() {
        final Locale root = Locale.ROOT;
        final String hexString = Integer.toHexString(System.identityHashCode(this));
        final int d = this.d();
        String s;
        if (this.d() <= 50) {
            s = pjf.H(this);
        }
        else {
            s = String.valueOf(pjf.H(this.k(0, 47))).concat("...");
        }
        return String.format(root, "<ByteString@%s size=%d contents=\"%s\">", hexString, d, s);
    }
    
    public final String z() {
        final Charset a = olk.a;
        String m;
        if (this.d() == 0) {
            m = "";
        }
        else {
            m = this.m(a);
        }
        return m;
    }
}
