import java.nio.ByteBuffer;
import java.util.List;
import android.graphics.Rect;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public class gyl extends gyp
{
    protected final kre a;
    protected final int b;
    private final kse i;
    
    public gyl(final gyb gyb, final Executor executor, final gxz gxz, final int n, final hhy hhy, final kre a, final int b, final kse i) {
        super(gyb, executor, gxz, n, hhy);
        this.a = a;
        this.b = b;
        this.i = i;
    }
    
    protected static int a(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        return n8 * (n5 / n3) + n7 * (n6 / n3) + n2 / n4 * n5 + n / n4 * n6;
    }
    
    protected static final int d(final int n, final int n2) {
        return Math.min(n2, n) / 2 + 1;
    }
    
    protected static final void f(final gyb gyb) {
        new gym(gyb.b, gyb.a.c(), gyb.a.b());
    }
    
    protected static final int[] g(final lju lju, final Rect rect, int size, final boolean b) {
        final Rect i = gyp.i(lju, rect);
        final List h = lju.h();
        if (h.size() == 3) {
            final int width = i.width();
            final int height = i.height();
            int k = width / size;
            int j = height / size;
            final ByteBuffer buffer = h.get(0).getBuffer();
            final ByteBuffer buffer2 = h.get(1).getBuffer();
            final ByteBuffer buffer3 = h.get(2).getBuffer();
            final int n = h.get(0).getRowStride() * size;
            final int rowStride = h.get(1).getRowStride();
            final int rowStride2 = h.get(2).getRowStride();
            final int n2 = h.get(0).getPixelStride() * size;
            final int n3 = h.get(1).getPixelStride() * size;
            final int n4 = h.get(2).getPixelStride() * size;
            final int l = k(i.top);
            final int m = k(i.left);
            int n5;
            int n9;
            int k4;
            int k5;
            int n11;
            int n12;
            if (b) {
                final int d = d(k, j);
                n5 = d * d * 4;
                int k2;
                int k3;
                if (k > j) {
                    final int n6 = k / 2;
                    k2 = k(n6 - d);
                    k = k(n6 + d);
                    k3 = 0;
                }
                else {
                    final int n7 = j / 2;
                    k3 = k(n7 - d);
                    j = k(n7 + d);
                    k2 = 0;
                }
                final int n8 = k3;
                n9 = d + d;
                final int n10 = k2;
                k4 = j;
                k5 = k;
                n11 = n8;
                n12 = n10;
            }
            else {
                n5 = k * j;
                k5 = k(k);
                k4 = k(j);
                final int n13 = 0;
                n12 = 0;
                n9 = k;
                n11 = n13;
            }
            final int[] array = new int[n5];
            ((ljt)h.get(1)).getRowStride();
            ((ljt)h.get(1)).getPixelStride();
            ((ljt)h.get(2)).getRowStride();
            ((ljt)h.get(2)).getPixelStride();
            int n16;
            for (int n14 = n11; n14 < k4; n14 += 2, k5 = n16) {
                int n15 = (n14 - n11) * n9;
                n16 = k5;
                int a = a(n12, n14, size, 1, n, n2, m, l);
                final int n17 = m / 2;
                final int n18 = l / 2;
                for (int a2 = a(n12, n14, size, 2, rowStride * size, n3, n17, n18), a3 = a(n12, n14, size, 2, rowStride2 * size, n4, n17, n18), n19 = n12; n19 < n16; n19 += 2, a += n2 + n2, n15 += 2, a2 += n3, a3 += n4) {
                    final int n20 = (buffer2.get(a2) & 0xFF) - 128;
                    final int n21 = (buffer3.get(a3) & 0xFF) - 128;
                    final int n22 = n21 * 358 >> 8;
                    final int n23 = n20 * -88 + n21 * -182 >> 8;
                    final int n24 = n20 * 453 >> 8;
                    final int n25 = buffer.get(a) & 0xFF;
                    int n26 = n25 + n23;
                    int n27 = n25 + n24;
                    int n28 = n25 + n22;
                    if (n26 < 0) {
                        n26 = 0;
                    }
                    if (n28 < 0) {
                        n28 = 0;
                    }
                    if (n27 < 0) {
                        n27 = 0;
                    }
                    int n29;
                    if ((n29 = n26) > 255) {
                        n29 = 255;
                    }
                    int n30;
                    if ((n30 = n28) > 255) {
                        n30 = 255;
                    }
                    int n31;
                    if ((n31 = n27) > 255) {
                        n31 = 255;
                    }
                    array[n15] = (n29 << 8 | n30 << 16 | n31 | 0xFF000000);
                    final int n32 = buffer.get(a + n2) & 0xFF;
                    int n33 = n32 + n23;
                    final int n34 = n32 + n24;
                    int n35 = n32 + n22;
                    if (n33 < 0) {
                        n33 = 0;
                    }
                    if (n35 < 0) {
                        n35 = 0;
                    }
                    int n36;
                    if ((n36 = n34) < 0) {
                        n36 = 0;
                    }
                    int n37;
                    if ((n37 = n33) > 255) {
                        n37 = 255;
                    }
                    int n38;
                    if ((n38 = n35) > 255) {
                        n38 = 255;
                    }
                    int n39;
                    if ((n39 = n36) > 255) {
                        n39 = 255;
                    }
                    array[n15 + 1] = (n38 << 16 | n37 << 8 | n39 | 0xFF000000);
                    final int n40 = a + n;
                    final int n41 = buffer.get(n40) & 0xFF;
                    int n42 = n41 + n23;
                    final int n43 = n41 + n24;
                    int n44 = n41 + n22;
                    if (n42 < 0) {
                        n42 = 0;
                    }
                    if (n44 < 0) {
                        n44 = 0;
                    }
                    int n45;
                    if ((n45 = n43) < 0) {
                        n45 = 0;
                    }
                    int n46;
                    if ((n46 = n42) > 255) {
                        n46 = 255;
                    }
                    int n47;
                    if ((n47 = n44) > 255) {
                        n47 = 255;
                    }
                    int n48;
                    if ((n48 = n45) > 255) {
                        n48 = 255;
                    }
                    final int n49 = n15 + n9;
                    array[n49] = (n47 << 16 | n46 << 8 | n48 | 0xFF000000);
                    final int n50 = buffer.get(n40 + n2) & 0xFF;
                    int n51 = n23 + n50;
                    final int n52 = n24 + n50;
                    int n53 = n50 + n22;
                    if (n51 < 0) {
                        n51 = 0;
                    }
                    if (n53 < 0) {
                        n53 = 0;
                    }
                    int n54;
                    if ((n54 = n52) < 0) {
                        n54 = 0;
                    }
                    int n55;
                    if ((n55 = n51) > 255) {
                        n55 = 255;
                    }
                    int n56;
                    if ((n56 = n53) > 255) {
                        n56 = 255;
                    }
                    int n57;
                    if ((n57 = n54) > 255) {
                        n57 = 255;
                    }
                    array[n49 + 1] = (n57 | (n56 << 16 | n55 << 8) | 0xFF000000);
                }
            }
            return array;
        }
        size = h.size();
        final StringBuilder sb = new StringBuilder(57);
        sb.append("Incorrect number planes (");
        sb.append(size);
        sb.append(") in YUV Image Object");
        throw new IllegalArgumentException(sb.toString());
    }
    
    private static int k(int n) {
        n /= 2;
        return n + n;
    }
    
    protected final gym b(final gyb gyb, int d) {
        final Rect i = gyp.i(gyb.a, gyb.e);
        int n;
        if (this.b == 5) {
            n = i.width() / d;
            d = i.height() / d;
        }
        else {
            d = d(i.width() / d, i.height() / d);
            n = (d += d);
        }
        return new gym(gyb.b, n, d);
    }
    
    protected final int[] c(final lju lju, Rect i, int size) {
        switch (this.b - 1) {
            default: {
                return g(lju, i, size, false);
            }
            case 3: {
                return g(lju, i, size, true);
            }
            case 2: {
                i = gyp.i(lju, i);
                final List h = lju.h();
                if (h.size() == 3) {
                    final int width = i.width();
                    final int height = i.height();
                    final int n = width / size;
                    final int n2 = height / size;
                    final int d = d(n, n2);
                    final int k = k(i.top);
                    final int j = k(i.left);
                    int l;
                    int m;
                    int k2;
                    int k3;
                    if (n > n2) {
                        final int n3 = n / 2;
                        l = k(n3 - d);
                        m = k(n3 + d);
                        k2 = n2;
                        k3 = 0;
                    }
                    else {
                        final int n4 = n2 / 2;
                        k3 = k(n4 - d);
                        k2 = k(n4 + d);
                        m = n;
                        l = 0;
                    }
                    final ByteBuffer buffer = h.get(0).getBuffer();
                    final ByteBuffer buffer2 = h.get(1).getBuffer();
                    final ByteBuffer buffer3 = h.get(2).getBuffer();
                    final int n5 = h.get(0).getRowStride() * size;
                    final int rowStride = h.get(1).getRowStride();
                    final int rowStride2 = h.get(2).getRowStride();
                    final int n6 = h.get(0).getPixelStride() * size;
                    final int n7 = h.get(1).getPixelStride() * size;
                    final int n8 = h.get(2).getPixelStride() * size;
                    final int n9 = d + d;
                    final int n10 = n2 / 2;
                    final int n11 = n / 2;
                    final int n12 = d * d;
                    final int[] array = new int[n12 * 4];
                    ((ljt)h.get(1)).getRowStride();
                    ((ljt)h.get(1)).getPixelStride();
                    ((ljt)h.get(2)).getRowStride();
                    ((ljt)h.get(2)).getPixelStride();
                    int n13 = k3;
                    final int n14 = k2;
                    final int n15 = j;
                    while (n13 < n14) {
                        int n16 = (n13 - k3) * n9;
                        int a = a(l, n13, size, 1, n5, n6, n15, k);
                        final int n17 = n15 / 2;
                        final int n18 = k / 2;
                        int a2 = a(l, n13, size, 2, rowStride * size, n7, n17, n18);
                        int a3 = a(l, n13, size, 2, rowStride2 * size, n8, n17, n18);
                        final int n19 = n13 - n10;
                        final int n20 = (int)(Math.sqrt((float)(n12 - n19 * n19)) + 0.5);
                        final int n21 = n11 - n20;
                        final int n22 = n11 + n20;
                        final int n23 = n13 + 1 - n10;
                        final int n24 = (int)(Math.sqrt((float)(n12 - n23 * n23)) + 0.5);
                        final int n25 = n11 - n24;
                        final int n26 = n11 + n24;
                        int n27 = l;
                        final int n28 = n13;
                        while (n27 < m) {
                            Label_1643: {
                                if (n27 <= n22 || n27 <= n26) {
                                    final int n29 = n27 + 1;
                                    if (n29 >= n21 || n27 >= n25) {
                                        final int n30 = (buffer2.get(a2) & 0xFF) - 128;
                                        final int n31 = (buffer3.get(a3) & 0xFF) - 128;
                                        final int n32 = n31 * 358 >> 8;
                                        final int n33 = n30 * -88 + n31 * -182 >> 8;
                                        final int n34 = n30 * 453 >> 8;
                                        final int n35 = -16777216;
                                        if (n27 <= n22 && n27 >= n21) {
                                            int n36;
                                            if (n27 != n22) {
                                                if (n27 == n21) {
                                                    n36 = Integer.MIN_VALUE;
                                                }
                                                else {
                                                    n36 = -16777216;
                                                }
                                            }
                                            else {
                                                n36 = Integer.MIN_VALUE;
                                            }
                                            final int n37 = buffer.get(a) & 0xFF;
                                            int n38 = n37 + n33;
                                            int n39 = n37 + n34;
                                            int n40 = n37 + n32;
                                            if (n38 < 0) {
                                                n38 = 0;
                                            }
                                            if (n40 < 0) {
                                                n40 = 0;
                                            }
                                            if (n39 < 0) {
                                                n39 = 0;
                                            }
                                            int n41;
                                            if ((n41 = n38) > 255) {
                                                n41 = 255;
                                            }
                                            int n42;
                                            if ((n42 = n40) > 255) {
                                                n42 = 255;
                                            }
                                            int n43;
                                            if ((n43 = n39) > 255) {
                                                n43 = 255;
                                            }
                                            array[n16] = (n43 | (n42 << 16 | n41 << 8) | n36);
                                        }
                                        else {
                                            array[n16] = 0;
                                        }
                                        final ByteBuffer byteBuffer = buffer;
                                        if (n29 <= n22 && n29 >= n21) {
                                            int n44;
                                            if (n29 != n22) {
                                                if (n29 == n21) {
                                                    n44 = Integer.MIN_VALUE;
                                                }
                                                else {
                                                    n44 = -16777216;
                                                }
                                            }
                                            else {
                                                n44 = Integer.MIN_VALUE;
                                            }
                                            final int n45 = byteBuffer.get(a + n6) & 0xFF;
                                            int n46 = n45 + n33;
                                            final int n47 = n45 + n34;
                                            int n48 = n45 + n32;
                                            if (n46 < 0) {
                                                n46 = 0;
                                            }
                                            if (n48 < 0) {
                                                n48 = 0;
                                            }
                                            int n49;
                                            if ((n49 = n47) < 0) {
                                                n49 = 0;
                                            }
                                            int n50;
                                            if ((n50 = n46) > 255) {
                                                n50 = 255;
                                            }
                                            int n51;
                                            if ((n51 = n48) > 255) {
                                                n51 = 255;
                                            }
                                            int n52;
                                            if ((n52 = n49) > 255) {
                                                n52 = 255;
                                            }
                                            array[n16 + 1] = (n44 | (n51 << 16 | n50 << 8 | n52));
                                        }
                                        else {
                                            array[n16 + 1] = 0;
                                        }
                                        if (n27 <= n26 && n27 >= n25) {
                                            int n53;
                                            if (n27 != n26) {
                                                if (n27 == n25) {
                                                    n53 = Integer.MIN_VALUE;
                                                }
                                                else {
                                                    n53 = -16777216;
                                                }
                                            }
                                            else {
                                                n53 = Integer.MIN_VALUE;
                                            }
                                            final int n54 = byteBuffer.get(a + n5) & 0xFF;
                                            int n55 = n54 + n33;
                                            final int n56 = n54 + n34;
                                            int n57 = n54 + n32;
                                            if (n55 < 0) {
                                                n55 = 0;
                                            }
                                            if (n57 < 0) {
                                                n57 = 0;
                                            }
                                            int n58;
                                            if ((n58 = n56) < 0) {
                                                n58 = 0;
                                            }
                                            int n59;
                                            if ((n59 = n55) > 255) {
                                                n59 = 255;
                                            }
                                            int n60;
                                            if ((n60 = n57) > 255) {
                                                n60 = 255;
                                            }
                                            int n61;
                                            if ((n61 = n58) > 255) {
                                                n61 = 255;
                                            }
                                            array[n16 + n9] = (n53 | (n60 << 16 | n59 << 8 | n61));
                                        }
                                        else {
                                            array[n16 + n9] = 0;
                                        }
                                        if (n29 <= n26 && n29 >= n25) {
                                            int n62;
                                            if (n29 != n26) {
                                                if (n29 == n25) {
                                                    n62 = Integer.MIN_VALUE;
                                                }
                                                else {
                                                    n62 = n35;
                                                }
                                            }
                                            else {
                                                n62 = Integer.MIN_VALUE;
                                            }
                                            final int n63 = byteBuffer.get(a + n5 + n6) & 0xFF;
                                            int n64 = n63 + n33;
                                            final int n65 = n34 + n63;
                                            int n66 = n63 + n32;
                                            if (n64 < 0) {
                                                n64 = 0;
                                            }
                                            if (n66 < 0) {
                                                n66 = 0;
                                            }
                                            int n67;
                                            if ((n67 = n65) < 0) {
                                                n67 = 0;
                                            }
                                            int n68;
                                            if ((n68 = n64) > 255) {
                                                n68 = 255;
                                            }
                                            int n69;
                                            if ((n69 = n66) > 255) {
                                                n69 = 255;
                                            }
                                            if (n67 > 255) {
                                                n67 = 255;
                                            }
                                            array[n16 + n9 + 1] = (n69 << 16 | n68 << 8 | n67 | n62);
                                            break Label_1643;
                                        }
                                        array[n16 + n9 + 1] = 0;
                                        break Label_1643;
                                    }
                                }
                                array[n16 + 1] = (array[n16] = 0);
                                final int n70 = n16 + n9;
                                array[n70 + 1] = (array[n70] = 0);
                            }
                            n27 += 2;
                            a += n6 + n6;
                            n16 += 2;
                            a2 += n7;
                            a3 += n8;
                        }
                        n13 = n28 + 2;
                    }
                    return array;
                }
                size = h.size();
                final StringBuilder sb = new StringBuilder(57);
                sb.append("Incorrect number planes (");
                sb.append(size);
                sb.append(") in YUV Image Object");
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }
    
    public final void e(final gym gym, final int[] array, final int n) {
        ((gxp)this.c).k.a(new gyn(this.e, gym, n), new gyo(array));
    }
    
    @Override
    public void run() {
        this.i.f("CAM_TaskRGBPreview");
        final gyb f = this.f;
        final Rect i = gyp.i(f.a, f.e);
        f(f);
        final kre kre = new kre(i.width(), i.height());
        final int b = this.b;
        final int n = 2;
        int j = 0;
        Label_0169: {
            if (b != 3 && b != 4) {
                j = gyi.a(kre, this.a);
            }
            else {
                final kre a = this.a;
                j = Math.min(kre.a / a.a, kre.b / a.b);
                if (j <= 0) {
                    j = 1;
                }
                else {
                    final int min = Math.min(kre.a, kre.b);
                    while (j >= 2) {
                        if (gyi.b(min, j)) {
                            break Label_0169;
                        }
                        --j;
                    }
                    j = n;
                }
            }
        }
        final gym b2 = this.b(f, j);
        try {
            this.j(this.e, b2, 1);
            f.a.c();
            f.a.b();
            final int[] c = this.c(f.a, i, j);
            this.c.b(f.a, this.d);
            this.e(b2, c, 1);
            this.i.g();
        }
        finally {
            this.c.b(f.a, this.d);
            while (true) {}
        }
    }
}
