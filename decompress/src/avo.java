import java.util.Iterator;
import java.nio.ByteOrder;
import java.util.Arrays;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class avo implements avk
{
    public ByteBuffer a;
    public byte[] b;
    public byte[] c;
    public int[] d;
    public int e;
    public avm f;
    public Bitmap g;
    public Boolean h;
    public Bitmap$Config i;
    public final bfi j;
    private int[] k;
    private final int[] l;
    private short[] m;
    private byte[] n;
    private byte[] o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private int t;
    
    static {
        avo.class.getSimpleName();
    }
    
    public avo(final bfi j, final avm avm, final ByteBuffer byteBuffer, final int n) {
        this.l = new int[256];
        this.i = Bitmap$Config.ARGB_8888;
        this.j = j;
        this.f = new avm();
        this.c(avm, byteBuffer, n);
    }
    
    private final int d() {
        return this.a.get() & 0xFF;
    }
    
    private final Bitmap e() {
        final Boolean h = this.h;
        Bitmap$Config bitmap$Config;
        if (h != null && !h) {
            bitmap$Config = this.i;
        }
        else {
            bitmap$Config = Bitmap$Config.ARGB_8888;
        }
        final Bitmap b = this.j.a.b(this.t, this.s, bitmap$Config);
        b.setHasAlpha(true);
        return b;
    }
    
    @Override
    public final Bitmap a() {
        monitorenter(this);
        try {
            if (this.f.c <= 0 || this.e < 0) {
                this.q = 1;
            }
            final int q = this.q;
            if (q == 1 || q == 2) {
                monitorexit(this);
                return null;
            }
            this.q = 0;
            if (this.b == null) {
                this.b = this.j.c(255);
            }
            final avl avl = this.f.e.get(this.e);
            final int n = this.e - 1;
            avl avl2;
            if (n >= 0) {
                avl2 = this.f.e.get(n);
            }
            else {
                avl2 = null;
            }
            int[] k;
            if ((k = avl.k) == null) {
                k = this.f.a;
            }
            if ((this.k = k) == null) {
                this.q = 1;
                monitorexit(this);
                return null;
            }
            if (avl.f) {
                System.arraycopy(k, 0, this.l, 0, 256);
                (this.k = this.l)[avl.h] = 0;
                if (avl.g == 2 && this.e == 0) {
                    this.h = true;
                }
            }
            final int[] d = this.d;
            if (avl2 == null) {
                final Bitmap g = this.g;
                if (g != null) {
                    this.j.a(g);
                }
                this.g = null;
                Arrays.fill(d, 0);
            }
            if (avl2 != null && avl2.g == 3 && this.g == null) {
                Arrays.fill(d, 0);
            }
            if (avl2 != null) {
                final int g2 = avl2.g;
                if (g2 > 0) {
                    if (g2 == 2) {
                        int l;
                        if (!avl.f) {
                            final avm f = this.f;
                            l = f.l;
                            if (avl.k != null && f.j == avl.h) {
                                l = 0;
                            }
                        }
                        else {
                            l = 0;
                        }
                        final int d2 = avl2.d;
                        final int r = this.r;
                        final int n2 = d2 / r;
                        final int n3 = avl2.b / r;
                        final int n4 = avl2.c / r;
                        int i = 0;
                        for (int n5 = avl2.a / r, t = this.t; i < n2 * t + (i = n3 * t + n5); i += this.t) {
                            for (int j = i; j < i + n4; ++j) {
                                d[j] = l;
                            }
                        }
                    }
                    else if (g2 == 3) {
                        final Bitmap g3 = this.g;
                        if (g3 != null) {
                            final int t2 = this.t;
                            g3.getPixels(d, 0, t2, 0, 0, t2, this.s);
                        }
                    }
                }
            }
            if (avl != null) {
                this.a.position(avl.j);
            }
            int n6;
            if (avl == null) {
                final avm f2 = this.f;
                n6 = f2.f * f2.g;
            }
            else {
                n6 = avl.d * avl.c;
            }
            final byte[] c = this.c;
            if (c == null || c.length < n6) {
                this.c = this.j.c(n6);
            }
            final byte[] c2 = this.c;
            if (this.m == null) {
                this.m = new short[4096];
            }
            final short[] m = this.m;
            if (this.n == null) {
                this.n = new byte[4096];
            }
            final byte[] n7 = this.n;
            if (this.o == null) {
                this.o = new byte[4097];
            }
            final byte[] o = this.o;
            final int d3 = this.d();
            final int n8 = 1 << d3;
            final int n9 = n8 + 2;
            final int n10 = d3 + 1;
            final int n11 = (1 << n10) - 1;
            for (int n12 = 0; n12 < n8; ++n12) {
                m[n12] = 0;
                n7[n12] = (byte)n12;
            }
            final byte[] b = this.b;
            int n13 = n10;
            int n14 = n9;
            int n15 = n11;
            int n16 = 0;
            int n17 = -1;
            int n18 = 0;
            int n19 = 0;
            int n20 = 0;
            int n21 = 0;
            int n22 = 0;
            int n23 = 0;
            int n24 = 0;
            final int[] array = d;
            final byte[] array2 = b;
        Label_0772:
            while (n16 < n6) {
                int d4;
                if (n18 == 0) {
                    d4 = this.d();
                    if (d4 <= 0) {
                        d4 = 0;
                    }
                    else {
                        final ByteBuffer a = this.a;
                        a.get(this.b, 0, Math.min(d4, a.remaining()));
                    }
                    if (d4 <= 0) {
                        this.q = 3;
                        break;
                    }
                    n19 = 0;
                }
                else {
                    d4 = n18;
                }
                n21 += (array2[n19] & 0xFF) << n20;
                final int n25 = n19 + 1;
                final int n26 = d4 - 1;
                final int n27 = n20 + 8;
                final int n28 = n17;
                int n29 = n22;
                int n30 = n15;
                int n31 = n28;
                n20 = n27;
                while (n20 >= n13) {
                    final int n32 = n21 & n30;
                    n21 >>= n13;
                    n20 -= n13;
                    if (n32 == n8) {
                        n14 = n9;
                        n30 = n11;
                        n13 = n10;
                        n31 = -1;
                    }
                    else {
                        if (n32 == n8 + 1) {
                            final int n33 = n29;
                            n17 = n31;
                            n18 = n26;
                            n19 = n25;
                            n15 = n30;
                            n22 = n33;
                            continue Label_0772;
                        }
                        if (n31 == -1) {
                            c2[n24] = n7[n32];
                            ++n24;
                            ++n16;
                            n29 = (n31 = n32);
                        }
                        else {
                            int n34;
                            int n35;
                            if (n32 >= n14) {
                                o[n23] = (byte)n29;
                                n34 = n23 + 1;
                                n35 = n31;
                            }
                            else {
                                final int n36 = n32;
                                n34 = n23;
                                n35 = n36;
                            }
                            while (n35 >= n8) {
                                o[n34] = n7[n35];
                                ++n34;
                                n35 = m[n35];
                            }
                            final int n37 = n7[n35] & 0xFF;
                            final byte b2 = (byte)n37;
                            c2[n24] = b2;
                            ++n24;
                            ++n16;
                            for (n23 = n34; n23 > 0; --n23, c2[n24] = o[n23], ++n24, ++n16) {}
                            Label_1236: {
                                int n38;
                                if ((n38 = n14) < 4096) {
                                    m[n14] = (short)n31;
                                    n7[n14] = b2;
                                    if ((++n14 & n30) == 0x0) {
                                        if ((n38 = n14) < 4096) {
                                            ++n13;
                                            n30 += n14;
                                            break Label_1236;
                                        }
                                    }
                                    else {
                                        n38 = n14;
                                    }
                                }
                                n14 = n38;
                            }
                            n31 = n32;
                            n29 = n37;
                        }
                    }
                }
                final int n39 = n29;
                n17 = n31;
                n18 = n26;
                n19 = n25;
                n15 = n30;
                n22 = n39;
            }
            final int[] array3 = array;
            Arrays.fill(c2, n24, n6, (byte)0);
            if (!avl.e && this.r == 1) {
                final int[] d5 = this.d;
                int d6 = avl.d;
                final int b3 = avl.b;
                final int c3 = avl.c;
                final int a2 = avl.a;
                final int e = this.e;
                final int t3 = this.t;
                final byte[] c4 = this.c;
                final int[] k2 = this.k;
                int n40 = 0;
                int n41 = -1;
                while (n40 < d6) {
                    final int n42 = (n40 + b3) * t3;
                    int n43 = n42 + a2;
                    int n44 = n43 + c3;
                    final int n45 = n42 + t3;
                    if (n45 < n44) {
                        n44 = n45;
                    }
                    int n46 = avl.c * n40;
                    final int n47 = n44;
                    final int n48 = d6;
                    while (n43 < n47) {
                        final byte b4 = c4[n46];
                        final int n49 = b4 & 0xFF;
                        int n50;
                        if (n49 != (n50 = n41)) {
                            final int n51 = k2[n49];
                            if (n51 != 0) {
                                d5[n43] = n51;
                                n50 = n41;
                            }
                            else {
                                n50 = b4;
                            }
                        }
                        ++n46;
                        ++n43;
                        n41 = n50;
                    }
                    ++n40;
                    d6 = n48;
                }
                final Boolean h = this.h;
                this.h = ((h != null && h) || (this.h == null && e == 0 && n41 != -1));
            }
            else {
                final int[] d7 = this.d;
                final int d8 = avl.d;
                final int r2 = this.r;
                final int n52 = d8 / r2;
                final int n53 = avl.b / r2;
                int n54 = avl.c / r2;
                int n55 = avl.a / r2;
                final int e2 = this.e;
                int t4 = this.t;
                int s = this.s;
                final byte[] c5 = this.c;
                final int[] k3 = this.k;
                Boolean h2 = this.h;
                int n56 = 0;
                int n57 = 0;
                int n58 = 1;
                int n59 = 8;
                while (n56 < n52) {
                    int n61;
                    int n62;
                    int n63;
                    if (avl.e) {
                        int n60;
                        if (n57 >= n52) {
                            n60 = n58 + 1;
                            switch (n60) {
                                case 4: {
                                    n57 = 1;
                                    n59 = 2;
                                    break;
                                }
                                case 3: {
                                    n57 = 2;
                                    n59 = 4;
                                    break;
                                }
                                case 2: {
                                    n57 = 4;
                                    break;
                                }
                            }
                        }
                        else {
                            n60 = n58;
                        }
                        n61 = n57 + n59;
                        n62 = n60;
                        n63 = n59;
                    }
                    else {
                        final int n64 = n57;
                        n57 = n56;
                        n63 = n59;
                        n62 = n58;
                        n61 = n64;
                    }
                    final int n65 = n57 + n53;
                    int n73;
                    int n74;
                    int n75;
                    if (n65 < s) {
                        final int n66 = n65 * t4;
                        int n67 = n66 + n55;
                        int n68 = n67 + n54;
                        final int n69 = n66 + t4;
                        if (n69 < n68) {
                            n68 = n69;
                        }
                        int n70 = n56 * r2 * avl.c;
                        if (r2 == 1) {
                            while (n67 < n68) {
                                final int n71 = k3[c5[n70] & 0xFF];
                                Boolean value;
                                if (n71 != 0) {
                                    d7[n67] = n71;
                                    value = h2;
                                }
                                else {
                                    value = h2;
                                    if (e2 == 0 && (value = h2) == null) {
                                        value = true;
                                    }
                                }
                                ++n70;
                                ++n67;
                                h2 = value;
                            }
                            final int n72 = s;
                            n73 = n55;
                            n74 = t4;
                            n75 = n72;
                        }
                        else {
                            final int n76 = n54;
                            final int n77 = n55;
                            final int n78 = (n68 - n67) * r2 + n70;
                            int n79 = n70;
                            Boolean value2;
                            for (int n80 = n67; n80 < n68; ++n80, h2 = value2) {
                                final int c6 = avl.c;
                                int n81 = n79;
                                int n82 = 0;
                                int n83 = 0;
                                int n84 = 0;
                                int n85 = 0;
                                int n86 = 0;
                                while (n81 < this.r + n79) {
                                    final byte[] c7 = this.c;
                                    if (n81 >= c7.length || n81 >= n78) {
                                        break;
                                    }
                                    final int n87 = this.k[c7[n81] & 0xFF];
                                    int n88 = n82;
                                    int n89 = n83;
                                    int n90 = n84;
                                    int n91 = n85;
                                    int n92 = n86;
                                    if (n87 != 0) {
                                        n92 = n86 + (n87 >> 24 & 0xFF);
                                        n88 = n82 + (n87 >> 16 & 0xFF);
                                        n89 = n83 + (n87 >> 8 & 0xFF);
                                        n90 = n84 + (n87 & 0xFF);
                                        n91 = n85 + 1;
                                    }
                                    ++n81;
                                    n82 = n88;
                                    n83 = n89;
                                    n84 = n90;
                                    n85 = n91;
                                    n86 = n92;
                                }
                                final int n93 = c6 + n79;
                                int n94 = n83;
                                int n95 = n82;
                                int n98;
                                int n99;
                                int n100;
                                int n101;
                                int n102;
                                for (int n96 = n93; n96 < this.r + n93; ++n96, n95 = n98, n94 = n99, n84 = n100, n85 = n101, n86 = n102) {
                                    final byte[] c8 = this.c;
                                    if (n96 >= c8.length || n96 >= n78) {
                                        break;
                                    }
                                    final int n97 = this.k[c8[n96] & 0xFF];
                                    n98 = n95;
                                    n99 = n94;
                                    n100 = n84;
                                    n101 = n85;
                                    n102 = n86;
                                    if (n97 != 0) {
                                        n102 = n86 + (n97 >> 24 & 0xFF);
                                        n98 = n95 + (n97 >> 16 & 0xFF);
                                        n99 = n94 + (n97 >> 8 & 0xFF);
                                        n100 = n84 + (n97 & 0xFF);
                                        n101 = n85 + 1;
                                    }
                                }
                                int n103;
                                if (n85 == 0) {
                                    n103 = 0;
                                }
                                else {
                                    n103 = (n86 / n85 << 24 | n95 / n85 << 16 | n94 / n85 << 8 | n84 / n85);
                                }
                                if (n103 != 0) {
                                    d7[n80] = n103;
                                    value2 = h2;
                                }
                                else {
                                    value2 = h2;
                                    if (e2 == 0 && (value2 = h2) == null) {
                                        value2 = true;
                                    }
                                }
                                n79 += r2;
                            }
                            final int n104 = s;
                            n54 = n76;
                            n73 = n77;
                            n74 = t4;
                            n75 = n104;
                        }
                    }
                    else {
                        final int n105 = n55;
                        n74 = t4;
                        n75 = s;
                        n73 = n105;
                    }
                    final int n106 = n56 + 1;
                    n57 = n61;
                    final int n107 = n74;
                    final int n108 = n75;
                    n55 = n73;
                    t4 = n107;
                    s = n108;
                    n56 = n106;
                    n58 = n62;
                    n59 = n63;
                }
                if (this.h == null) {
                    this.h = (h2 != null && h2);
                }
            }
            if (this.p) {
                final int g4 = avl.g;
                if (g4 == 0 || g4 == 1) {
                    if (this.g == null) {
                        this.g = this.e();
                    }
                    final Bitmap g5 = this.g;
                    final int t5 = this.t;
                    g5.setPixels(array3, 0, t5, 0, 0, t5, this.s);
                }
            }
            final Bitmap e3 = this.e();
            final int t6 = this.t;
            e3.setPixels(array3, 0, t6, 0, 0, t6, this.s);
            monitorexit(this);
            return e3;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void b() {
        this.e = (this.e + 1) % this.f.c;
    }
    
    public final void c(final avm f, ByteBuffer readOnlyBuffer, int g) {
        monitorenter(this);
        Label_0205: {
            if (g <= 0) {
                break Label_0205;
            }
            try {
                final int highestOneBit = Integer.highestOneBit(g);
                this.q = 0;
                this.f = f;
                this.e = -1;
                readOnlyBuffer = readOnlyBuffer.asReadOnlyBuffer();
                (this.a = readOnlyBuffer).position(0);
                this.a.order(ByteOrder.LITTLE_ENDIAN);
                this.p = false;
                final Iterator iterator = f.e.iterator();
                while (iterator.hasNext()) {
                    if (((avl)iterator.next()).g == 3) {
                        this.p = true;
                        break;
                    }
                }
                this.r = highestOneBit;
                final int f2 = f.f;
                this.t = f2 / highestOneBit;
                g = f.g;
                this.s = g / highestOneBit;
                this.c = this.j.c(f2 * g);
                final bfi j = this.j;
                g = this.t * this.s;
                final azi b = j.b;
                int[] d;
                if (b == null) {
                    d = new int[g];
                }
                else {
                    d = (int[])b.a(g, int[].class);
                }
                this.d = d;
                monitorexit(this);
            }
            finally {
                monitorexit(this);
                while (true) {}
                final StringBuilder sb = new StringBuilder(41);
                sb.append("Sample size must be >=0, not: ");
                sb.append(g);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }
}
