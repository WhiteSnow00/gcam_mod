import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.io.InputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class ojz extends okb
{
    private final InputStream e;
    private final byte[] f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    
    public ojz(final InputStream e) {
        this.l = Integer.MAX_VALUE;
        olk.i(e, "input");
        this.e = e;
        this.f = new byte[4096];
        this.g = 0;
        this.i = 0;
        this.k = 0;
    }
    
    private static int L(final InputStream inputStream, final byte[] array, int read, final int n) {
        try {
            read = inputStream.read(array, read, n);
            return read;
        }
        catch (final olm olm) {
            olm.j();
            throw olm;
        }
    }
    
    private final List M(int i) {
        final ArrayList list = new ArrayList();
        while (i > 0) {
            final int min = Math.min(i, 4096);
            final byte[] array = new byte[min];
            int read;
            for (int j = 0; j < min; j += read) {
                read = this.e.read(array, j, min - j);
                if (read == -1) {
                    throw olm.i();
                }
                this.k += read;
            }
            i -= min;
            list.add(array);
        }
        return list;
    }
    
    private final void N() {
        final int g = this.g + this.h;
        this.g = g;
        final int n = this.k + g;
        final int l = this.l;
        if (n > l) {
            final int h = n - l;
            this.h = h;
            this.g = g - h;
            return;
        }
        this.h = 0;
    }
    
    private final void O(final int n) {
        if (this.P(n)) {
            return;
        }
        if (n > Integer.MAX_VALUE - this.k - this.i) {
            throw olm.h();
        }
        throw olm.i();
    }
    
    private final boolean P(final int n) {
        final int i = this.i;
        int g = this.g;
        if (i + n <= g) {
            final StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(n);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        int k = this.k;
        if (n > Integer.MAX_VALUE - k - i) {
            return false;
        }
        if (k + i + n > this.l) {
            return false;
        }
        if (i > 0) {
            if (g > i) {
                final byte[] f = this.f;
                System.arraycopy(f, i, f, 0, g - i);
            }
            k = this.k + i;
            this.k = k;
            g = this.g - i;
            this.g = g;
            this.i = 0;
        }
        final int l = L(this.e, this.f, g, Math.min(4096 - g, Integer.MAX_VALUE - k - g));
        if (l == 0 || l < -1 || l > 4096) {
            final String value = String.valueOf(this.e.getClass());
            final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 91);
            sb2.append(value);
            sb2.append("#read(byte[]) returned invalid result: ");
            sb2.append(l);
            sb2.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb2.toString());
        }
        if (l > 0) {
            this.g += l;
            this.N();
            return this.g >= n || this.P(n);
        }
        return false;
    }
    
    private final byte[] Q(final int n) {
        if (n == 0) {
            return olk.b;
        }
        if (n < 0) {
            throw olm.f();
        }
        final int k = this.k;
        final int i = this.i;
        final int n2 = k + i + n;
        if (-2147483647 + n2 > 0) {
            throw olm.h();
        }
        final int l = this.l;
        if (n2 <= l) {
            int j = this.g - i;
            final int n3 = n - j;
            if (n3 >= 4096) {
                final InputStream e = this.e;
                try {
                    if (n3 > e.available()) {
                        return null;
                    }
                }
                catch (final olm olm) {
                    olm.j();
                    throw olm;
                }
            }
            final byte[] array = new byte[n];
            System.arraycopy(this.f, this.i, array, 0, j);
            this.k += this.g;
            this.i = 0;
            this.g = 0;
            while (j < n) {
                final int m = L(this.e, array, j, n - j);
                if (m == -1) {
                    throw olm.i();
                }
                this.k += m;
                j += m;
            }
            return array;
        }
        this.B(l - k - i);
        throw olm.i();
    }
    
    private final byte[] R(int n) {
        final byte[] q = this.Q(n);
        if (q != null) {
            return q;
        }
        final int i = this.i;
        final int g = this.g;
        final int n2 = g - i;
        this.k += g;
        this.i = 0;
        this.g = 0;
        final List m = this.M(n - n2);
        final byte[] array = new byte[n];
        System.arraycopy(this.f, i, array, 0, n2);
        final Iterator iterator = m.iterator();
        n = n2;
        while (iterator.hasNext()) {
            final byte[] array2 = (byte[])iterator.next();
            final int length = array2.length;
            System.arraycopy(array2, 0, array, n, length);
            n += length;
        }
        return array;
    }
    
    @Override
    public final void A(final int l) {
        this.l = l;
        this.N();
    }
    
    public final void B(int length) {
        final int g = this.g;
        final int i = this.i;
        int j = g - i;
        if (length <= j && length >= 0) {
            this.i = i + length;
            return;
        }
        if (length < 0) {
            throw olm.f();
        }
        final int k = this.k;
        final int l = k + i;
        final int m = this.l;
        if (l + length <= m) {
            this.k = l;
            this.g = 0;
            this.i = 0;
            while (j < length) {
                try {
                    final InputStream e = this.e;
                    final long n = length - j;
                    try {
                        final long skip = e.skip(n);
                        if (skip < 0L || skip > n) {
                            final String value = String.valueOf(this.e.getClass());
                            length = String.valueOf(value).length();
                            final StringBuilder sb = new StringBuilder(length + 92);
                            sb.append(value);
                            sb.append("#skip returned invalid result: ");
                            sb.append(skip);
                            sb.append("\nThe InputStream implementation is buggy.");
                            throw new IllegalStateException(sb.toString());
                        }
                        if (skip == 0L) {
                            break;
                        }
                        j += (int)skip;
                        continue;
                    }
                    catch (final olm olm) {
                        olm.j();
                        throw olm;
                    }
                }
                finally {
                    this.k += j;
                    this.N();
                }
                break;
            }
            this.k += j;
            this.N();
            if (j < length) {
                final int g2 = this.g;
                int n2 = g2 - this.i;
                this.i = g2;
                this.O(1);
                int i2;
                while (true) {
                    i2 = length - n2;
                    final int g3 = this.g;
                    if (i2 <= g3) {
                        break;
                    }
                    n2 += g3;
                    this.i = g3;
                    this.O(1);
                }
                this.i = i2;
            }
            return;
        }
        this.B(m - k - i);
        throw olm.i();
    }
    
    @Override
    public final boolean C() {
        return this.i == this.g && !this.P(1);
    }
    
    @Override
    public final boolean D() {
        return this.r() != 0L;
    }
    
    @Override
    public final boolean E(int i) {
        final int b = onx.b(i);
        final int n = 0;
        final int n2 = 0;
        switch (b) {
            default: {
                throw olm.a();
            }
            case 5: {
                this.B(4);
                return true;
            }
            case 4: {
                return false;
            }
            case 3: {
                int m;
                do {
                    m = this.m();
                } while (m != 0 && this.E(m));
                this.z(onx.c(onx.a(i), 4));
                return true;
            }
            case 2: {
                this.B(this.j());
                return true;
            }
            case 1: {
                this.B(8);
                return true;
            }
            case 0: {
                if (this.g - this.i >= 10) {
                    for (i = n2; i < 10; ++i) {
                        if (this.f[this.i++] >= 0) {
                            return true;
                        }
                    }
                    throw olm.e();
                }
                for (i = n; i < 10; ++i) {
                    if (this.a() >= 0) {
                        return true;
                    }
                }
                throw olm.e();
            }
        }
    }
    
    public final byte a() {
        if (this.i == this.g) {
            this.O(1);
        }
        return this.f[this.i++];
    }
    
    @Override
    public final double b() {
        return Double.longBitsToDouble(this.q());
    }
    
    @Override
    public final float c() {
        return Float.intBitsToFloat(this.i());
    }
    
    @Override
    public final int d() {
        return this.k + this.i;
    }
    
    @Override
    public final int e(int l) {
        if (l < 0) {
            throw olm.f();
        }
        final int i = l + (this.k + this.i);
        l = this.l;
        if (i <= l) {
            this.l = i;
            this.N();
            return l;
        }
        throw olm.i();
    }
    
    @Override
    public final int f() {
        return this.j();
    }
    
    @Override
    public final int g() {
        return this.i();
    }
    
    @Override
    public final int h() {
        return this.j();
    }
    
    public final int i() {
        int n;
        if (this.g - (n = this.i) < 4) {
            this.O(4);
            n = this.i;
        }
        final byte[] f = this.f;
        this.i = n + 4;
        return (f[n + 3] & 0xFF) << 24 | ((f[n] & 0xFF) | (f[n + 1] & 0xFF) << 8 | (f[n + 2] & 0xFF) << 16);
    }
    
    @Override
    public final int j() {
        final int i = this.i;
        final int g = this.g;
        if (g != i) {
            final byte[] f = this.f;
            final int j = i + 1;
            final byte b = f[i];
            if (b >= 0) {
                this.i = j;
                return b;
            }
            if (g - j >= 9) {
                int k = j + 1;
                final int n = b ^ f[j] << 7;
                int n2 = 0;
                Label_0262: {
                    if (n < 0) {
                        n2 = (n ^ 0xFFFFFF80);
                    }
                    else {
                        final int n3 = k + 1;
                        final int n4 = n ^ f[k] << 14;
                        if (n4 >= 0) {
                            final int n5 = n4 ^ 0x3F80;
                            k = n3;
                            n2 = n5;
                        }
                        else {
                            k = n3 + 1;
                            final int n6 = n4 ^ f[n3] << 21;
                            if (n6 < 0) {
                                n2 = (n6 ^ 0xFFE03F80);
                            }
                            else {
                                final int n7 = k + 1;
                                final byte b2 = f[k];
                                final int n8 = n6 ^ b2 << 28 ^ 0xFE03F80;
                                k = n7;
                                if (b2 < 0) {
                                    final int n9 = n7 + 1;
                                    n2 = n8;
                                    k = n9;
                                    if (f[n7] >= 0) {
                                        break Label_0262;
                                    }
                                    final int n10 = k = n9 + 1;
                                    if (f[n9] < 0) {
                                        final int n11 = n10 + 1;
                                        n2 = n8;
                                        k = n11;
                                        if (f[n10] >= 0) {
                                            break Label_0262;
                                        }
                                        final int n12 = k = n11 + 1;
                                        if (f[n11] < 0) {
                                            k = n12 + 1;
                                            if (f[n12] >= 0) {
                                                n2 = n8;
                                                break Label_0262;
                                            }
                                            return (int)this.s();
                                        }
                                    }
                                }
                                n2 = n8;
                            }
                        }
                    }
                }
                this.i = k;
                return n2;
            }
        }
        return (int)this.s();
    }
    
    @Override
    public final int k() {
        return this.i();
    }
    
    @Override
    public final int l() {
        return okb.F(this.j());
    }
    
    @Override
    public final int m() {
        if (this.C()) {
            return this.j = 0;
        }
        final int j = this.j();
        this.j = j;
        if (onx.a(j) != 0) {
            return this.j;
        }
        throw olm.c();
    }
    
    @Override
    public final int n() {
        return this.j();
    }
    
    @Override
    public final long o() {
        return this.q();
    }
    
    @Override
    public final long p() {
        return this.r();
    }
    
    public final long q() {
        int n;
        if (this.g - (n = this.i) < 8) {
            this.O(8);
            n = this.i;
        }
        final byte[] f = this.f;
        this.i = n + 8;
        return ((long)f[n + 7] & 0xFFL) << 56 | (((long)f[n] & 0xFFL) | ((long)f[n + 1] & 0xFFL) << 8 | ((long)f[n + 2] & 0xFFL) << 16 | ((long)f[n + 3] & 0xFFL) << 24 | ((long)f[n + 4] & 0xFFL) << 32 | ((long)f[n + 5] & 0xFFL) << 40 | ((long)f[n + 6] & 0xFFL) << 48);
    }
    
    public final long r() {
        final int i = this.i;
        final int g = this.g;
        if (g != i) {
            final byte[] f = this.f;
            final int j = i + 1;
            final byte b = f[i];
            if (b >= 0) {
                this.i = j;
                return b;
            }
            if (g - j >= 9) {
                int k = j + 1;
                final int n = b ^ f[j] << 7;
                long n2;
                if (n < 0) {
                    n2 = (n ^ 0xFFFFFF80);
                }
                else {
                    final int n3 = k + 1;
                    final int n4 = n ^ f[k] << 14;
                    if (n4 >= 0) {
                        n2 = (n4 ^ 0x3F80);
                        k = n3;
                    }
                    else {
                        k = n3 + 1;
                        final int n5 = n4 ^ f[n3] << 21;
                        if (n5 < 0) {
                            n2 = (n5 ^ 0xFFE03F80);
                        }
                        else {
                            final int n6 = k + 1;
                            final long n7 = (long)f[k] << 28 ^ (long)n5;
                            if (n7 >= 0L) {
                                k = n6;
                                n2 = (n7 ^ 0xFE03F80L);
                            }
                            else {
                                k = n6 + 1;
                                final long n8 = n7 ^ (long)f[n6] << 35;
                                if (n8 < 0L) {
                                    n2 = (0xFFFFFFF80FE03F80L ^ n8);
                                }
                                else {
                                    final int n9 = k + 1;
                                    final long n10 = n8 ^ (long)f[k] << 42;
                                    if (n10 >= 0L) {
                                        k = n9;
                                        n2 = (n10 ^ 0x3F80FE03F80L);
                                    }
                                    else {
                                        k = n9 + 1;
                                        final long n11 = n10 ^ (long)f[n9] << 49;
                                        if (n11 < 0L) {
                                            n2 = (0xFFFE03F80FE03F80L ^ n11);
                                        }
                                        else {
                                            final int n12 = k + 1;
                                            n2 = (n11 ^ (long)f[k] << 56 ^ 0xFE03F80FE03F80L);
                                            if (n2 < 0L) {
                                                if (f[n12] < 0L) {
                                                    return this.s();
                                                }
                                                k = n12 + 1;
                                            }
                                            else {
                                                k = n12;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                this.i = k;
                return n2;
            }
        }
        return this.s();
    }
    
    final long s() {
        long n = 0L;
        for (int i = 0; i < 64; i += 7) {
            final byte a = this.a();
            n |= (long)(a & 0x7F) << i;
            if ((a & 0x80) == 0x0) {
                return n;
            }
        }
        throw olm.e();
    }
    
    @Override
    public final long t() {
        return this.q();
    }
    
    @Override
    public final long u() {
        return okb.G(this.r());
    }
    
    @Override
    public final long v() {
        return this.r();
    }
    
    @Override
    public final ojw w() {
        final int j = this.j();
        final int g = this.g;
        final int i = this.i;
        if (j <= g - i && j > 0) {
            final ojw u = ojw.u(this.f, i, j);
            this.i += j;
            return u;
        }
        if (j != 0) {
            final byte[] q = this.Q(j);
            ojw ojw;
            if (q != null) {
                ojw = ojw.t(q);
            }
            else {
                final int k = this.i;
                final int g2 = this.g;
                int n = g2 - k;
                this.k += g2;
                this.i = 0;
                this.g = 0;
                final List m = this.M(j - n);
                final byte[] array = new byte[j];
                System.arraycopy(this.f, k, array, 0, n);
                for (final byte[] array2 : m) {
                    final int length = array2.length;
                    System.arraycopy(array2, 0, array, n, length);
                    n += length;
                }
                ojw = ojw.x(array);
            }
            return ojw;
        }
        return ojw.b;
    }
    
    @Override
    public final String x() {
        final int j = this.j();
        if (j > 0) {
            final int g = this.g;
            final int i = this.i;
            if (j <= g - i) {
                final String s = new String(this.f, i, j, olk.a);
                this.i += j;
                return s;
            }
        }
        if (j == 0) {
            return "";
        }
        if (j <= this.g) {
            this.O(j);
            final String s2 = new String(this.f, this.i, j, olk.a);
            this.i += j;
            return s2;
        }
        return new String(this.R(j), olk.a);
    }
    
    @Override
    public final String y() {
        final int j = this.j();
        int i = this.i;
        final int g = this.g;
        byte[] array;
        if (j <= g - i && j > 0) {
            array = this.f;
            this.i = i + j;
        }
        else {
            if (j == 0) {
                return "";
            }
            if (j <= g) {
                this.O(j);
                array = this.f;
                this.i = j;
                i = 0;
            }
            else {
                array = this.R(j);
                i = 0;
            }
        }
        return onu.g(array, i, j);
    }
    
    @Override
    public final void z(final int n) {
        if (this.j == n) {
            return;
        }
        throw olm.b();
    }
}
