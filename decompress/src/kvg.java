import java.util.Map;
import android.util.Log;
import java.io.IOException;
import com.google.common.io.ByteStreams;
import java.nio.ByteOrder;
import java.io.InputStream;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.TreeMap;
import java.nio.charset.Charset;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kvg
{
    private static final Charset h;
    private static final short i;
    private static final short j;
    private static final short k;
    private static final short l;
    private static final short m;
    private static final short n;
    private static final short o;
    public final kuy a;
    public int b;
    public kvh c;
    public kvf d;
    public kvh e;
    public kvh f;
    public final TreeMap g;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private int t;
    private byte[] u;
    private int v;
    private final ExifInterface w;
    
    static {
        h = Charset.forName("US-ASCII");
        i = ExifInterface.n(ExifInterface.B);
        j = ExifInterface.n(ExifInterface.C);
        k = ExifInterface.n(ExifInterface.al);
        l = ExifInterface.n(ExifInterface.D);
        m = ExifInterface.n(ExifInterface.E);
        n = ExifInterface.n(ExifInterface.i);
        o = ExifInterface.n(ExifInterface.m);
    }
    
    public kvg(final InputStream inputStream, final ExifInterface w) {
        this.p = 0;
        this.q = 0;
        this.s = false;
        this.g = new TreeMap();
        this.w = w;
        final kuy kuy = new kuy(inputStream);
        short n = kuy.d();
        while (true) {
            while (n != -39 && !kwp.m(n)) {
                if (n != -40) {
                    int b;
                    int t = b = kuy.b();
                    if (n == -31 && (b = t) >= 8) {
                        final int a = kuy.a();
                        final short d = kuy.d();
                        t -= 6;
                        b = t;
                        if (a == 1165519206) {
                            if (d == 0) {
                                this.t = t;
                                final boolean s = true;
                                this.s = s;
                                final kuy a2 = new kuy(inputStream);
                                this.a = a2;
                                if (!this.s) {
                                    return;
                                }
                                final short d2 = a2.d();
                                if (d2 == 18761) {
                                    a2.e(ByteOrder.LITTLE_ENDIAN);
                                }
                                else {
                                    if (d2 != 19789) {
                                        throw new kvb("Invalid TIFF header");
                                    }
                                    a2.e(ByteOrder.BIG_ENDIAN);
                                }
                                if (a2.d() != 42) {
                                    throw new kvb("Invalid TIFF header");
                                }
                                final long c = a2.c();
                                if (c <= 2147483647L) {
                                    final int v = (int)c;
                                    this.v = v;
                                    this.g(this.b = 0, c);
                                    if (c != 8L) {
                                        this.b(this.u = new byte[v - 8]);
                                    }
                                    return;
                                }
                                final StringBuilder sb = new StringBuilder(35);
                                sb.append("Invalid offset ");
                                sb.append(c);
                                throw new kvb(sb.toString());
                            }
                            else {
                                b = t;
                            }
                        }
                    }
                    if (b >= 2) {
                        final long n2 = b - 2;
                        try {
                            ByteStreams.skipFully(kuy, n2);
                            n = kuy.d();
                            continue;
                        }
                        catch (final IOException ex) {}
                    }
                    Log.w("CAM_ExifParser", "Invalid JPEG format.");
                    break;
                }
                n = kuy.d();
            }
            final boolean s = false;
            continue;
        }
    }
    
    private final void f(final kvh kvh) {
        if (kvh == null) {
            return;
        }
        if (kvh.d == 0) {
            return;
        }
        final short a = kvh.a;
        final int e = kvh.e;
        final short i = kvg.i;
        int j = 0;
        if (a == i && this.i(e, ExifInterface.B)) {
            this.g(2, kvh.b(0));
            return;
        }
        if (a == kvg.j && this.i(e, ExifInterface.C)) {
            this.g(4, kvh.b(0));
            return;
        }
        if (a == kvg.k && this.i(e, ExifInterface.al)) {
            this.g(3, kvh.b(0));
            return;
        }
        if (a == kvg.l && this.i(e, ExifInterface.D)) {
            this.g.put((int)kvh.b(0), new kvf());
            return;
        }
        if (a == kvg.m && this.i(e, ExifInterface.E)) {
            this.f = kvh;
            return;
        }
        if (a == kvg.n && this.i(e, ExifInterface.i)) {
            if (!kvh.e()) {
                this.g.put(kvh.g, new kvd(kvh, false));
                return;
            }
            while (j < kvh.d) {
                if (kvh.b == 3) {
                    this.h(j, kvh.b(j));
                }
                else {
                    this.h(j, kvh.b(j));
                }
                ++j;
            }
        }
        else if (a == kvg.o && this.i(e, ExifInterface.m) && kvh.e()) {
            this.e = kvh;
        }
    }
    
    private final void g(final int n, final long n2) {
        this.g.put((int)n2, new kve(n));
    }
    
    private final void h(final int n, final long n2) {
        this.g.put((int)n2, new kvf(n));
    }
    
    private final boolean i(final int n, int value) {
        value = this.w.h().get(value);
        return value != 0 && ExifInterface.s(value, n);
    }
    
    public final int a() {
        if (!this.s) {
            return 5;
        }
        final kuy a = this.a;
        final int a2 = a.a;
        final int n = this.p + 2 + this.q * 12;
        boolean b = true;
        if (a2 >= n) {
            if (a2 == n) {
                if (this.b == 0) {
                    final long d = this.d();
                    if (d != 0L) {
                        this.g(1, d);
                    }
                }
                else {
                    int n2;
                    if (this.g.size() > 0) {
                        final Map.Entry<Integer, V> firstEntry = this.g.firstEntry();
                        firstEntry.getClass();
                        n2 = firstEntry.getKey() - this.a.a;
                    }
                    else {
                        n2 = 4;
                    }
                    if (n2 < 4) {
                        final StringBuilder sb = new StringBuilder(45);
                        sb.append("Invalid size of link to next IFD: ");
                        sb.append(n2);
                        Log.w("CAM_ExifParser", sb.toString());
                    }
                    else {
                        final long d2 = this.d();
                        if (d2 != 0L) {
                            final StringBuilder sb2 = new StringBuilder(46);
                            sb2.append("Invalid link to next IFD: ");
                            sb2.append(d2);
                            Log.w("CAM_ExifParser", sb2.toString());
                        }
                    }
                }
            }
            while (this.g.size() != 0) {
                Object pollFirstEntry = this.g.pollFirstEntry();
                ((Map.Entry)pollFirstEntry).getClass();
                Object o = ((Map.Entry)pollFirstEntry).getValue();
                try {
                    final int intValue = (int)((Map.Entry)pollFirstEntry).getKey();
                    final kuy a3 = this.a;
                    ByteStreams.skipFully(a3, intValue - (long)a3.a);
                    while (!this.g.isEmpty() && this.g.firstKey() < intValue) {
                        this.g.pollFirstEntry();
                    }
                    if (o instanceof kve) {
                        o = o;
                        this.b = ((kve)o).a;
                        this.q = this.a.b();
                        final int intValue2 = (int)((Map.Entry)pollFirstEntry).getKey();
                        this.p = intValue2;
                        if (this.q * 12 + intValue2 + 2 > this.t) {
                            final int b2 = this.b;
                            o = new StringBuilder(31);
                            ((StringBuilder)o).append("Invalid size of IFD ");
                            ((StringBuilder)o).append(b2);
                            Log.w("CAM_ExifParser", ((StringBuilder)o).toString());
                            return 5;
                        }
                        switch (this.b) {
                            default: {
                                b = false;
                            }
                            case 0:
                            case 1:
                            case 2: {
                                this.r = b;
                                b = ((kve)o).b;
                                return 0;
                            }
                        }
                    }
                    else {
                        if (o instanceof kvf) {
                            o = o;
                            this.d = (kvf)o;
                            return ((kvf)o).b;
                        }
                        pollFirstEntry = o;
                        o = ((kvd)pollFirstEntry).a;
                        this.c = (kvh)o;
                        if (o != null && ((kvh)o).b != 7) {
                            this.e((kvh)o);
                            this.f(this.c);
                        }
                        if (((kvd)pollFirstEntry).b) {
                            return 2;
                        }
                        continue;
                    }
                }
                catch (final IOException ex) {
                    final String value = String.valueOf(((Map.Entry)pollFirstEntry).getKey());
                    final String name = ((kvh)o).getClass().getName();
                    final StringBuilder sb3 = new StringBuilder(String.valueOf(value).length() + 57 + String.valueOf(name).length());
                    sb3.append("Failed to skip to data at: ");
                    sb3.append(value);
                    sb3.append(" for ");
                    sb3.append(name);
                    sb3.append(", the file may be broken.");
                    Log.w("CAM_ExifParser", sb3.toString());
                    continue;
                }
                break;
            }
            return 5;
        }
        final short d3 = a.d();
        final short d4 = this.a.d();
        final long c = this.a.c();
        if (c > 2147483647L) {
            throw new kvb("Number of component is larger then Integer.MAX_VALUE");
        }
        kvh c2;
        if (!kvh.g(d4)) {
            Log.w("CAM_ExifParser", String.format("Tag %04x: Invalid data type %d", d3, d4));
            ByteStreams.skipFully(this.a, 4L);
            c2 = null;
        }
        else {
            final int n3 = (int)c;
            c2 = new kvh(d3, d4, n3, this.b, n3 != 0);
            final int a4 = c2.a();
            if (a4 > 4) {
                final long c3 = this.a.c();
                if (c3 > 2147483647L) {
                    throw new kvb("offset is larger then Integer.MAX_VALUE");
                }
                if (c3 < this.v && d4 == 7) {
                    final byte[] array = new byte[n3];
                    System.arraycopy(this.u, (int)c3 - 8, array, 0, n3);
                    c2.j(array);
                }
                else {
                    c2.g = (int)c3;
                }
            }
            else {
                final boolean c4 = c2.c;
                c2.c = false;
                this.e(c2);
                c2.c = c4;
                ByteStreams.skipFully(this.a, 4 - a4);
                c2.g = this.a.a - 4;
            }
        }
        this.c = c2;
        if (c2 == null) {
            return this.a();
        }
        if (this.r) {
            this.f(c2);
        }
        return 1;
    }
    
    public final int b(final byte[] array) {
        return ByteStreams.read(this.a, array, 0, array.length);
    }
    
    protected final int c() {
        return this.a.a();
    }
    
    protected final long d() {
        return (long)this.c() & 0xFFFFFFFFL;
    }
    
    public final void e(final kvh kvh) {
        final short b = kvh.b;
        if (b == 2 || b == 7 || b == 1) {
            final int d = kvh.d;
            if (this.g.size() > 0) {
                final Map.Entry<Integer, V> firstEntry = this.g.firstEntry();
                firstEntry.getClass();
                if (firstEntry.getKey() < this.a.a + d) {
                    final Map.Entry<K, kve> firstEntry2 = this.g.firstEntry();
                    firstEntry2.getClass();
                    final kve value = firstEntry2.getValue();
                    if (value instanceof kvf) {
                        final String value2 = String.valueOf(kvh.toString());
                        String concat;
                        if (value2.length() != 0) {
                            concat = "Thumbnail overlaps value for tag: \n".concat(value2);
                        }
                        else {
                            concat = new String("Thumbnail overlaps value for tag: \n");
                        }
                        Log.w("CAM_ExifParser", concat);
                        final Map.Entry<Object, V> pollFirstEntry = this.g.pollFirstEntry();
                        pollFirstEntry.getClass();
                        final String value3 = String.valueOf(pollFirstEntry.getKey());
                        final StringBuilder sb = new StringBuilder(String.valueOf(value3).length() + 26);
                        sb.append("Invalid thumbnail offset: ");
                        sb.append(value3);
                        Log.w("CAM_ExifParser", sb.toString());
                    }
                    else {
                        if (value instanceof kve) {
                            final int a = value.a;
                            final String string = kvh.toString();
                            final StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 41);
                            sb2.append("Ifd ");
                            sb2.append(a);
                            sb2.append(" overlaps value for tag: \n");
                            sb2.append(string);
                            Log.w("CAM_ExifParser", sb2.toString());
                        }
                        else if (value instanceof kvd) {
                            final String string2 = ((kvd)value).a.toString();
                            final String string3 = kvh.toString();
                            final StringBuilder sb3 = new StringBuilder(String.valueOf(string2).length() + 46 + String.valueOf(string3).length());
                            sb3.append("Tag value for tag: \n");
                            sb3.append(string2);
                            sb3.append(" overlaps value for tag: \n");
                            sb3.append(string3);
                            Log.w("CAM_ExifParser", sb3.toString());
                        }
                        final Map.Entry<Integer, V> firstEntry3 = this.g.firstEntry();
                        firstEntry3.getClass();
                        final int d2 = firstEntry3.getKey() - this.a.a;
                        final String string4 = kvh.toString();
                        final StringBuilder sb4 = new StringBuilder(String.valueOf(string4).length() + 52);
                        sb4.append("Invalid size of tag: \n");
                        sb4.append(string4);
                        sb4.append(" setting count to: ");
                        sb4.append(d2);
                        Log.w("CAM_ExifParser", sb4.toString());
                        kvh.d = d2;
                    }
                }
            }
        }
        final short b2 = kvh.b;
        final int n = 0;
        final int n2 = 0;
        final int n3 = 0;
        final int n4 = 0;
        int i = 0;
        switch (b2) {
            default: {
                return;
            }
            case 10: {
                final int d3 = kvh.d;
                final krb[] array = new krb[d3];
                while (i < d3) {
                    array[i] = new krb(this.c(), this.c());
                    ++i;
                }
                kvh.m(array);
                return;
            }
            case 9: {
                final int d4 = kvh.d;
                final int[] array2 = new int[d4];
                for (int j = n; j < d4; ++j) {
                    array2[j] = this.c();
                }
                kvh.k(array2);
                return;
            }
            case 5: {
                final int d5 = kvh.d;
                final krb[] array3 = new krb[d5];
                for (int k = n2; k < d5; ++k) {
                    array3[k] = new krb(this.d(), this.d());
                }
                kvh.m(array3);
                return;
            }
            case 4: {
                final int d6 = kvh.d;
                final long[] array4 = new long[d6];
                for (int l = n3; l < d6; ++l) {
                    array4[l] = this.d();
                }
                kvh.l(array4);
                return;
            }
            case 3: {
                final int d7 = kvh.d;
                final int[] array5 = new int[d7];
                for (int n5 = n4; n5 < d7; ++n5) {
                    array5[n5] = (char)this.a.d();
                }
                kvh.k(array5);
                return;
            }
            case 2: {
                final int d8 = kvh.d;
                final Charset h = kvg.h;
                String s;
                if (d8 > 0) {
                    final kuy a2 = this.a;
                    final byte[] array6 = new byte[d8];
                    a2.f(array6, d8);
                    s = new String(array6, h);
                }
                else {
                    s = "";
                }
                kvh.i(s);
                return;
            }
            case 1:
            case 7: {
                final byte[] array7 = new byte[kvh.d];
                this.b(array7);
                kvh.j(array7);
            }
        }
    }
}
