import java.util.Iterator;
import java.nio.ByteOrder;
import android.util.Log;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.io.IOException;
import java.util.ArrayList;
import java.io.OutputStream;
import com.google.android.libraries.camera.exif.ExifInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kvi extends kvn
{
    private static final byte[] f;
    private static final byte[] g;
    private final kuz h;
    private final ExifInterface i;
    private short j;
    private short k;
    private int l;
    private boolean m;
    
    static {
        f = new byte[] { 69, 120, 105, 102, 0, 0 };
        g = new byte[] { 73, 67, 67, 95, 80, 82, 79, 70, 73, 76, 69, 0 };
    }
    
    public kvi(final OutputStream outputStream, final ExifInterface i, final kuz h) {
        super(outputStream, new kux());
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = true;
        this.i = i;
        this.h = h;
    }
    
    private static void k(final int n, final short n2) {
        if (n >= 0) {
            return;
        }
        throw new IllegalStateException(String.format("Negative section length: section length read was 0x%02X%02X", n2 >> 8 & 0xFF, n2 & 0xFF));
    }
    
    private static void l(final kvh kvh, final kvl kvl) {
        final short b = kvh.b;
        final int n = 0;
        final int n2 = 0;
        int i = 0;
        switch (b) {
            case 5:
            case 10: {
                while (i < kvh.d) {
                    final short b2 = kvh.b;
                    if (b2 != 10 && b2 != 5) {
                        final String c = kvh.c(b2);
                        String concat;
                        if (c.length() != 0) {
                            concat = "Cannot get RATIONAL value from ".concat(c);
                        }
                        else {
                            concat = new String("Cannot get RATIONAL value from ");
                        }
                        throw new IllegalArgumentException(concat);
                    }
                    final Object f = kvh.f;
                    f.getClass();
                    final krb krb = ((krb[])f)[i];
                    kvl.a((int)krb.a);
                    kvl.a((int)krb.b);
                    ++i;
                }
                break;
            }
            case 4:
            case 9: {
                for (int d = kvh.d, j = n; j < d; ++j) {
                    kvl.a((int)kvh.b(j));
                }
                break;
            }
            case 3: {
                for (int d2 = kvh.d, k = n2; k < d2; ++k) {
                    kvl.b((short)kvh.b(k));
                }
                break;
            }
            case 2: {
                final Object f2 = kvh.f;
                f2.getClass();
                final byte[] array = (byte[])f2;
                final int length = array.length;
                if (length == kvh.d && length > 0) {
                    array[length - 1] = 0;
                    kvl.write(array);
                    return;
                }
                kvl.write(array);
                kvl.write(0);
                return;
            }
            case 1:
            case 7: {
                final int d3 = kvh.d;
                final byte[] array2 = new byte[d3];
                if (b != 7 && b != 1) {
                    final String c2 = kvh.c(b);
                    String concat2;
                    if (c2.length() != 0) {
                        concat2 = "Cannot get BYTE value from ".concat(c2);
                    }
                    else {
                        concat2 = new String("Cannot get BYTE value from ");
                    }
                    throw new IllegalArgumentException(concat2);
                }
                final Object f3 = kvh.f;
                f3.getClass();
                System.arraycopy(f3, 0, array2, 0, d3);
                kvl.write(array2);
            }
        }
    }
    
    private static final int m(final kvk kvk, int n) {
        int g = n + (kvk.a() * 12 + 6);
        final kvh[] d = kvk.d();
        for (int length = d.length, i = 0; i < length; ++i, g = n) {
            final kvh kvh = d[i];
            if (kvh == null) {
                n = g;
            }
            else {
                n = g;
                if (kvh.a() > 4) {
                    kvh.g = g;
                    n = g + kvh.a();
                }
            }
        }
        return g;
    }
    
    private static final void n(final kvk kvk, final kvl kvl) {
        final kvh[] d = kvk.d();
        final int length = d.length;
        kvl.b((short)length);
        final int n = 0;
        for (final kvh kvh : d) {
            if (kvh != null) {
                kvl.b(kvh.a);
                kvl.b(kvh.b);
                kvl.a(kvh.d);
                if (kvh.a() > 4) {
                    kvl.a(kvh.g);
                }
                else {
                    l(kvh, kvl);
                    for (int a = kvh.a(), j = 0; j < 4 - a; ++j) {
                        kvl.write(0);
                    }
                }
            }
        }
        kvl.a(kvk.c);
        for (int length2 = d.length, k = n; k < length2; ++k) {
            final kvh kvh2 = d[k];
            if (kvh2 != null && kvh2.a() > 4) {
                l(kvh2, kvl);
            }
        }
    }
    
    @Override
    protected final int a(int i) {
        final int n = 0;
        switch (i) {
            default: {
                i = this.b(5);
                this.k = (short)i;
                i = (char)i - '\u0002';
                k(this.l = i, this.j);
                this.j(this.l);
                return 0;
            }
            case 4: {
                super.d();
                final kux b = super.b;
                b.c(super.c, b.a());
                super.e = -1;
                return 4;
            }
            case 2: {
                i = this.b(2);
                this.k = (short)i;
                i = (char)i - '\u0002';
                k(this.l = i, this.j);
                if (this.l < 5) {
                    this.h(this.j);
                    this.h(this.k);
                    this.i(this.l);
                    return 0;
                }
            }
            case 3: {
                super.c(4, 3);
                super.d();
                final kux b2 = super.b;
                i = b2.b;
                if (i + 4 <= b2.c) {
                    final byte[] array = new byte[4];
                    System.arraycopy(b2.a, i, array, 0, 4);
                    b2.b += 4;
                    this.l -= 4;
                    for (i = 0; i < 4; ++i) {
                        if (array[i] != kvi.f[i]) {
                            this.h(this.j);
                            this.h(this.k);
                            this.g(array);
                            this.i(this.l);
                            return 0;
                        }
                    }
                    this.j(this.l);
                    return 0;
                }
                throw new IllegalStateException("Byte queue is too short");
            }
            case 0: {
                final short b3 = this.b(0);
                this.j = b3;
                if ((b3 & 0xFFFFFF00) != 0xFFFFFF00) {
                    throw new IllegalStateException(String.format("Unexpected section marker: %02X%02X", b3 >> 8 & 0xFF, this.j & 0xFF));
                }
                if (b3 == -40 || b3 == -39) {
                    this.h(b3);
                    if (this.j == -40) {
                        final kuz h = this.h;
                        if (h != null) {
                            final ArrayList list = new ArrayList();
                            for (final kvh kvh : h.c()) {
                                if (kvh.f == null && !ExifInterface.t(kvh.a)) {
                                    h.h(kvh.a, kvh.e);
                                    list.add(kvh);
                                }
                            }
                            kvk b4;
                            if ((b4 = this.h.b(0)) == null) {
                                b4 = new kvk(0);
                                this.h.d(b4);
                            }
                            final kvh j = this.i.j(ExifInterface.B);
                            if (j == null) {
                                i = ExifInterface.B;
                                final StringBuilder sb = new StringBuilder(47);
                                sb.append("No definition for crucial exif tag: ");
                                sb.append(i);
                                throw new IOException(sb.toString());
                            }
                            b4.e(j);
                            kvk b5;
                            if ((b5 = this.h.b(2)) == null) {
                                b5 = new kvk(2);
                                this.h.d(b5);
                            }
                            if (this.h.b(4) != null) {
                                final kvh k = this.i.j(ExifInterface.C);
                                if (k == null) {
                                    i = ExifInterface.C;
                                    final StringBuilder sb2 = new StringBuilder(47);
                                    sb2.append("No definition for crucial exif tag: ");
                                    sb2.append(i);
                                    throw new IOException(sb2.toString());
                                }
                                b4.e(k);
                            }
                            if (this.h.b(3) != null) {
                                final kvh l = this.i.j(ExifInterface.al);
                                if (l == null) {
                                    i = ExifInterface.al;
                                    final StringBuilder sb3 = new StringBuilder(47);
                                    sb3.append("No definition for crucial exif tag: ");
                                    sb3.append(i);
                                    throw new IOException(sb3.toString());
                                }
                                b5.e(l);
                            }
                            final kvk b6 = this.h.b(1);
                            if (this.h.f()) {
                                kvk kvk;
                                if ((kvk = b6) == null) {
                                    kvk = new kvk(1);
                                    this.h.d(kvk);
                                }
                                final kvh m = this.i.j(ExifInterface.D);
                                if (m == null) {
                                    i = ExifInterface.D;
                                    final StringBuilder sb4 = new StringBuilder(47);
                                    sb4.append("No definition for crucial exif tag: ");
                                    sb4.append(i);
                                    throw new IOException(sb4.toString());
                                }
                                kvk.e(m);
                                final kvh j2 = this.i.j(ExifInterface.E);
                                if (j2 == null) {
                                    i = ExifInterface.E;
                                    final StringBuilder sb5 = new StringBuilder(47);
                                    sb5.append("No definition for crucial exif tag: ");
                                    sb5.append(i);
                                    throw new IOException(sb5.toString());
                                }
                                final byte[] b7 = this.h.b;
                                b7.getClass();
                                j2.h(b7.length);
                                kvk.e(j2);
                                kvk.c(ExifInterface.n(ExifInterface.i));
                                kvk.c(ExifInterface.n(ExifInterface.m));
                            }
                            else if (this.h.g()) {
                                kvk kvk2;
                                if ((kvk2 = b6) == null) {
                                    kvk2 = new kvk(1);
                                    this.h.d(kvk2);
                                }
                                i = this.h.a();
                                final kvh j3 = this.i.j(ExifInterface.i);
                                if (j3 == null) {
                                    i = ExifInterface.i;
                                    final StringBuilder sb6 = new StringBuilder(47);
                                    sb6.append("No definition for crucial exif tag: ");
                                    sb6.append(i);
                                    throw new IOException(sb6.toString());
                                }
                                final kvh j4 = this.i.j(ExifInterface.m);
                                if (j4 == null) {
                                    i = ExifInterface.m;
                                    final StringBuilder sb7 = new StringBuilder(47);
                                    sb7.append("No definition for crucial exif tag: ");
                                    sb7.append(i);
                                    throw new IOException(sb7.toString());
                                }
                                final long[] array2 = new long[i];
                                for (i = 0; i < this.h.a(); ++i) {
                                    array2[i] = this.h.i(i).length;
                                }
                                j4.l(array2);
                                kvk2.e(j3);
                                kvk2.e(j4);
                                kvk2.c(ExifInterface.n(ExifInterface.D));
                                kvk2.c(ExifInterface.n(ExifInterface.E));
                            }
                            else if (b6 != null) {
                                b6.c(ExifInterface.n(ExifInterface.i));
                                b6.c(ExifInterface.n(ExifInterface.m));
                                b6.c(ExifInterface.n(ExifInterface.D));
                                b6.c(ExifInterface.n(ExifInterface.E));
                            }
                            final ArrayList list2 = new ArrayList(this.h.c());
                            if (this.h.f()) {
                                final byte[] b8 = this.h.b;
                                b8.getClass();
                                list2.add(new kvh((short)0, (short)1, b8.length, 0, false));
                            }
                            Collections.sort((List<Object>)list2, bzj.n);
                            final kvk b9 = this.h.b(0);
                            if (b9 == null) {
                                i = 8;
                            }
                            else {
                                final int m2 = m(b9, 8);
                                final kvh b10 = b9.b(ExifInterface.n(ExifInterface.B));
                                b10.getClass();
                                b10.h(m2);
                                final kvk b11 = this.h.b(2);
                                i = m2;
                                if (b11 != null) {
                                    final int m3 = m(b11, m2);
                                    final kvk b12 = this.h.b(3);
                                    i = m3;
                                    if (b12 != null) {
                                        final kvh b13 = b11.b(ExifInterface.n(ExifInterface.al));
                                        b13.getClass();
                                        b13.h(m3);
                                        i = m(b12, m3);
                                    }
                                    final kvk b14 = this.h.b(4);
                                    int m4 = i;
                                    if (b14 != null) {
                                        final kvh b15 = b9.b(ExifInterface.n(ExifInterface.C));
                                        b15.getClass();
                                        b15.h(i);
                                        m4 = m(b14, i);
                                    }
                                    final kvk b16 = this.h.b(1);
                                    int m5 = m4;
                                    if (b16 != null) {
                                        b9.c = m4;
                                        m5 = m(b16, m4);
                                    }
                                    if (this.h.f()) {
                                        if (b16 != null) {
                                            final kvh b17 = b16.b(ExifInterface.n(ExifInterface.D));
                                            b17.getClass();
                                            b17.h(m5);
                                        }
                                        final byte[] b18 = this.h.b;
                                        b18.getClass();
                                        i = m5 + b18.length;
                                    }
                                    else {
                                        i = m5;
                                        if (this.h.g()) {
                                            final long[] array3 = new long[this.h.a()];
                                            for (i = 0; i < this.h.a(); ++i) {
                                                array3[i] = m5;
                                                m5 += this.h.i(i).length;
                                            }
                                            i = m5;
                                            if (b16 != null) {
                                                final kvh b19 = b16.b(ExifInterface.n(ExifInterface.i));
                                                b19.getClass();
                                                b19.l(array3);
                                                i = m5;
                                            }
                                        }
                                    }
                                }
                            }
                            int n2;
                            int n3;
                            for (n2 = 0, n3 = i; n2 < list2.size() && n3 > 65535; ++n2, n3 = i) {
                                final kvh kvh2 = (kvh)list2.get(n2);
                                final short a = kvh2.a;
                                if (a == 0) {
                                    final kuz h2 = this.h;
                                    h2.e();
                                    h2.a[1] = null;
                                    i = kvh2.a();
                                    final StringBuilder sb8 = new StringBuilder(76);
                                    sb8.append("Removed thumbnail with size ");
                                    sb8.append(i);
                                    sb8.append(" as Exif data exceeds max size 65535!");
                                    Log.w("CAM_ExifTransFSM", sb8.toString());
                                    i = n3 - kvh2.a();
                                }
                                else {
                                    i = n3;
                                    if (a != ExifInterface.n(ExifInterface.B)) {
                                        i = n3;
                                        if (a != ExifInterface.n(ExifInterface.al)) {
                                            i = n3;
                                            if (a != ExifInterface.n(ExifInterface.C)) {
                                                i = n3;
                                                if (a != ExifInterface.n(ExifInterface.D)) {
                                                    i = n3;
                                                    if (a != ExifInterface.n(ExifInterface.i)) {
                                                        i = n3;
                                                        if (this.h.h(kvh2.a, kvh2.e)) {
                                                            final short a2 = kvh2.a;
                                                            i = kvh2.a();
                                                            final StringBuilder sb9 = new StringBuilder(75);
                                                            sb9.append("Removed tag ");
                                                            sb9.append(a2);
                                                            sb9.append(" of size ");
                                                            sb9.append(i);
                                                            sb9.append(" as Exif data exceeds max size 65535!");
                                                            Log.w("CAM_ExifTransFSM", sb9.toString());
                                                            i = n3 - kvh2.a();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (n3 > 65535) {
                                throw new IOException("Exif header is too large (>65535), even after pruning non-essential tags!");
                            }
                            this.h((short)(-31));
                            this.h((short)(n3 + 8));
                            this.g(kvi.f);
                            if (h.d == ByteOrder.BIG_ENDIAN) {
                                this.h((short)19789);
                            }
                            else {
                                this.h((short)18761);
                            }
                            final kvl kvl = new kvl(super.c);
                            kvl.a.order(h.d);
                            kvl.b((short)42);
                            kvl.a(8);
                            final kvk b20 = this.h.b(0);
                            b20.getClass();
                            n(b20, kvl);
                            final kvk b21 = this.h.b(2);
                            b21.getClass();
                            n(b21, kvl);
                            final kvk b22 = this.h.b(3);
                            if (b22 != null) {
                                n(b22, kvl);
                            }
                            final kvk b23 = this.h.b(4);
                            if (b23 != null) {
                                n(b23, kvl);
                            }
                            final kvk b24 = this.h.b(1);
                            if (b24 != null) {
                                n(b24, kvl);
                            }
                            if (this.h.f()) {
                                final byte[] b25 = this.h.b;
                                b25.getClass();
                                kvl.write(b25);
                            }
                            else if (this.h.g()) {
                                for (i = 0; i < this.h.a(); ++i) {
                                    kvl.write(this.h.i(i));
                                }
                            }
                            int size;
                            for (size = list.size(), i = 0; i < size; ++i) {
                                h.j((kvh)list.get(i));
                            }
                        }
                    }
                    return 0;
                }
                final boolean m6 = kwp.m(b3);
                final short n4 = -30;
                if (m6) {
                    if (this.m) {
                        char[] array4;
                        if (this.i.bx == 2) {
                            array4 = owr.a;
                        }
                        else {
                            array4 = ows.a;
                        }
                        i = array4.length;
                        njo.e(true, "ICC profile does not fit in one marker segment!");
                        this.h((short)(-30));
                        this.h((short)(i + i + 16));
                        this.g(kvi.g);
                        this.h((short)257);
                        for (i = n; i < array4.length; ++i) {
                            this.h((short)array4[i]);
                        }
                    }
                    this.h(this.j);
                    return 4;
                }
                if (this.h != null && this.j == -31) {
                    return 2;
                }
                i = this.j;
                int n5;
                if (i == -30) {
                    if (this.i.bx != 0) {
                        return 5;
                    }
                    this.m = false;
                    n5 = n4;
                }
                else {
                    n5 = i;
                }
                this.h((short)n5);
            }
            case 1: {
                this.h(this.k = this.b(1));
                i = (char)this.k - '\u0002';
                k(this.l = i, this.j);
                this.i(this.l);
                return 0;
            }
        }
    }
}
