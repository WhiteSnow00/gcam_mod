import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dni implements dlc
{
    public final Object a;
    public final dlb b;
    public int c;
    private final float[] d;
    private final long[] e;
    private final int f;
    private final int g;
    private final int h;
    private final dnh i;
    private final dng j;
    private boolean k;
    private final int l;
    private final dnj m;
    
    public dni(final dlb b, final int g, int h, final int f, final int l, final dnh i, final dnj m, final dng j) {
        this.a = new Object();
        this.c = 0;
        this.k = false;
        this.b = b;
        this.m = m;
        this.j = j;
        this.f = f;
        h *= g;
        this.d = new float[h];
        this.e = new long[g];
        this.g = g;
        this.h = h;
        this.l = l;
        this.i = i;
    }
    
    private final boolean i() {
        if (this.k) {
            this.k = false;
            return this.i.a(this);
        }
        return false;
    }
    
    private static final int j(final int n) {
        if (n >= 0) {
            return n;
        }
        return -(n + 1);
    }
    
    private static final int k(final int n) {
        if (n >= 0) {
            return n;
        }
        return -(n + 2);
    }
    
    @Override
    public final float a(long n) {
        final int f = this.f;
        boolean b = true;
        if (f != 1) {
            b = false;
        }
        njo.p(b, "valueAt() only applicable to 1D features!");
        synchronized (this.a) {
            final int c = this.c;
            float n2 = Float.NaN;
            if (c == 0) {
                return Float.NaN;
            }
            final int binarySearch = Arrays.binarySearch(this.e, 0, c, n);
            final int l = this.l;
            if (l == 0) {
                throw null;
            }
            switch (l - 1) {
                default: {
                    monitorexit(this.a);
                    return Float.NaN;
                }
                case 4: {
                    final int max = Math.max(0, k(binarySearch));
                    final int min = Math.min(this.c - 1, j(binarySearch));
                    if (max == min) {
                        return this.d[max];
                    }
                    final long[] e = this.e;
                    final long n3 = e[max];
                    final double n4 = (double)(n - n3);
                    n = e[min];
                    final double n5 = (double)(n - n3);
                    Double.isNaN(n4);
                    Double.isNaN(n5);
                    final double n6 = n4 / n5;
                    final float[] d = this.d;
                    final double n7 = d[max];
                    Double.isNaN(n7);
                    final double n8 = d[min];
                    Double.isNaN(n8);
                    return (float)((1.0 - n6) * n7 + n6 * n8);
                }
                case 3: {
                    if (binarySearch != -1) {
                        n2 = this.d[k(binarySearch)];
                    }
                    return n2;
                }
                case 2: {
                    if (binarySearch >= 0) {
                        n2 = this.d[binarySearch];
                    }
                    return n2;
                }
                case 0:
                case 1: {
                    int max2 = Math.max(0, k(binarySearch));
                    final int min2 = Math.min(this.c - 1, j(binarySearch));
                    final long[] e2 = this.e;
                    final long n9 = e2[max2];
                    final long n10 = e2[min2];
                    final float[] d2 = this.d;
                    if (n - n9 >= n10 - n) {
                        max2 = min2;
                    }
                    return d2[max2];
                }
            }
        }
    }
    
    @Override
    public final long b() {
        synchronized (this.a) {
            final int c = this.c;
            long n;
            if (c > 0) {
                n = this.e[c - 1];
            }
            else {
                n = 0L;
            }
            return n;
        }
    }
    
    @Override
    public final dkz c(final long n) {
        final int l = this.l;
        final Object a = this.a;
        monitorenter(a);
        try {
            final int c = this.c;
            dkz dkz = null;
            if (c == 0) {
                dkz = dkz.c(this.b, n);
                monitorexit(a);
            }
            else {
                final long[] e = this.e;
                int i = 0;
                final int binarySearch = Arrays.binarySearch(e, 0, c, n);
                if (l == 0) {
                    throw null;
                }
                switch (l - 1) {
                    default: {
                        dkz = dkz.c(this.b, n);
                        monitorexit(a);
                        break;
                    }
                    case 4: {
                        try {
                            njo.o(true);
                            final int max = Math.max(0, k(binarySearch));
                            final int min = Math.min(this.c - 1, j(binarySearch));
                            if (max == min) {
                                dkz.d(this.b, n, this.d, this.j.a(max), this.m.a);
                                monitorexit(a);
                                break;
                            }
                            final long[] e2 = this.e;
                            final long n2 = e2[max];
                            final double n3 = (double)(n - n2);
                            final double n4 = (double)(e2[min] - n2);
                            Double.isNaN(n3);
                            Double.isNaN(n4);
                            final double n5 = n3 / n4;
                            final dlb b = this.b;
                            final float[] d = this.d;
                            final int a2 = this.j.a(max);
                            final int a3 = this.j.a(min);
                            final int a4 = this.m.a;
                            final float[] array = new float[a4];
                            while (i < a4) {
                                final double n6 = d[a2 + i];
                                Double.isNaN(n6);
                                final double n7 = d[a3 + i];
                                Double.isNaN(n7);
                                array[i] = (float)((1.0 - n5) * n6 + n7 * n5);
                                ++i;
                            }
                            final dkz dkz2 = new dkz(b, n, array);
                            monitorexit(a);
                            break;
                        }
                        finally {}
                    }
                    case 3: {
                        if (binarySearch == -1) {
                            dkz = dkz.c(this.b, n);
                            monitorexit(a);
                            break;
                        }
                        dkz = dkz.d(this.b, n, this.d, this.j.a(k(binarySearch)), this.m.a);
                        monitorexit(a);
                        break;
                    }
                    case 2: {
                        if (binarySearch >= 0) {
                            dkz = dkz.d(this.b, n, this.d, this.j.a(binarySearch), this.m.a);
                        }
                        else {
                            dkz = dkz.c(this.b, n);
                        }
                        monitorexit(a);
                        break;
                    }
                    case 1: {
                        final int max2 = Math.max(0, k(binarySearch));
                        final int min2 = Math.min(this.c - 1, j(binarySearch));
                        final long[] e3 = this.e;
                        final long n8 = e3[max2];
                        final long n9 = e3[min2];
                        if (n - n8 < n9 - n) {
                            dkz = dkz.d(this.b, n8, this.d, this.j.a(max2), this.m.a);
                        }
                        else {
                            dkz = dkz.d(this.b, n9, this.d, this.j.a(min2), this.m.a);
                        }
                        monitorexit(a);
                        break;
                    }
                    case 0: {
                        final int max3 = Math.max(0, k(binarySearch));
                        final int min3 = Math.min(this.c - 1, j(binarySearch));
                        final long[] e4 = this.e;
                        if (n - e4[max3] < e4[min3] - n) {
                            dkz = dkz.d(this.b, n, this.d, this.j.a(max3), this.m.a);
                        }
                        else {
                            dkz = dkz.d(this.b, n, this.d, this.j.a(min3), this.m.a);
                        }
                        monitorexit(a);
                        break;
                    }
                }
            }
            return dkz;
        }
        finally {}
        monitorexit(a);
        throw;
    }
    
    @Override
    public final dkz d() {
        synchronized (this.a) {
            int c = this.c;
            dkz dkz;
            if (c > 0) {
                final dlb b = this.b;
                final long[] e = this.e;
                --c;
                dkz = dkz.d(b, e[c], this.d, this.j.a(c), this.m.a);
            }
            else {
                dkz = dkz.c(this.b, 0L);
            }
            return dkz;
        }
    }
    
    @Override
    public final boolean e() {
        synchronized (this.a) {
            return this.c == 0;
        }
    }
    
    @Override
    public final List f(long n, final int n2) {
        final ArrayList list = new ArrayList();
        final Object a = this.a;
        monitorenter(a);
        Label_0125: {
            if (n > 0L) {
                break Label_0125;
            }
            try {
                int j;
                for (int n3 = j = j(Arrays.binarySearch(this.e, 0, this.c, n)); j < this.c && j < n3 + n2; ++j) {
                    n = this.e[j];
                    if (n > 0L) {
                        break;
                    }
                    list.add(dkz.d(this.b, n, this.d, this.j.a(j), this.m.a));
                }
                Label_0230: {
                    monitorexit(a);
                }
                return list;
                int n4 = 0;
                int k;
                Label_0158:Block_8_Outer:Block_6_Outer:
                while (true) {
                    while (true) {
                        while (true) {
                            list.add(dkz.d(this.b, n, this.d, this.j.a(n4), this.m.a));
                            --n4;
                            break Label_0158;
                            n = this.e[n4];
                            iftrue(Label_0230:)(n < 0L);
                            continue Block_8_Outer;
                        }
                        iftrue(Label_0230:)(n4 < 0 || n4 <= k - n2);
                        continue Block_6_Outer;
                    }
                    while (true) {
                        monitorexit(a);
                        return list;
                        k = k(Arrays.binarySearch(this.e, 0, this.c, n));
                        iftrue(Label_0154:)(k >= 0);
                        continue;
                    }
                    Label_0154:
                    n4 = k;
                    continue Label_0158;
                }
            }
            finally {
                monitorexit(a);
                while (true) {}
            }
        }
    }
    
    public final void g(final long n, final float n2) {
        synchronized (this.a) {
            final int c = this.c;
            if (c < this.g) {
                final int b = this.j.b(c);
                if (b < this.h) {
                    this.d[b] = n2;
                    this.e[this.c] = n;
                    this.m.a(1);
                    ++this.c;
                    this.k = true;
                    return;
                }
            }
            if (this.i()) {
                this.g(n, n2);
            }
        }
    }
    
    public final void h(final long n, final float... array) {
        synchronized (this.a) {
            final int c = this.c;
            if (c < this.g) {
                final dng j = this.j;
                final int length = array.length;
                final int b = j.b(c);
                if (b + length <= this.h) {
                    System.arraycopy(array, 0, this.d, b, this.m.a(length));
                    final long[] e = this.e;
                    final int c2 = this.c;
                    e[c2] = n;
                    this.c = c2 + 1;
                    this.k = true;
                }
                return;
            }
            if (this.i()) {
                this.h(n, array);
            }
        }
    }
}
