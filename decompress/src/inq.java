import android.view.WindowInsets$Type;
import android.util.Size;
import android.view.WindowInsets;
import android.graphics.Rect;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class inq
{
    public static int a;
    private static final nsd b;
    
    static {
        b = nsd.g("com/google/android/apps/camera/ui/layout/CameraBoxesHelper");
    }
    
    public static int a(final float n) {
        if (n >= 0.0f) {
            return (int)n;
        }
        return 0;
    }
    
    static int b() {
        return jvu.u(48.0f);
    }
    
    public static ins c(final inv inv, final boolean b, final Context context, final hyt hyt, final njp njp, final boolean b2) {
        njo.p(inv.a(), "Invalid Constraints!");
        final Size b3 = inv.b;
        nov.z(b3);
        final Size c = inv.c;
        nov.z(c);
        final boolean d = inv.d;
        final jcb f = inv.f;
        final jbm g = inv.g;
        final boolean e = inv.e;
        ins ins = null;
        if (b) {
            final int width = b3.getWidth();
            final int height = b3.getHeight();
            final int u = jvu.u(84.0f);
            final int u2 = jvu.u(56.0f);
            final int u3 = jvu.u(84.0f);
            int u4;
            if (e(g) && b2) {
                u4 = jvu.u(56.0f);
            }
            else {
                u4 = 0;
            }
            final int n = height - jvu.u(56.0f);
            final int n2 = n - u;
            final int n3 = n2 - u4;
            final inr b4 = ins.b();
            b4.n(b3);
            b4.j(new Rect(0, 0, width, height));
            b4.p(new Rect(0, n3 - u3, width, n3));
            b4.b(new Rect(0, n2, width, n));
            b4.l(new Rect(0, u2, width, n2));
            b4.m(new Rect(0, u2, width, n2));
            b4.g(new Rect(0, n, width, height));
            b4.d(new Rect(0, 0, width, height));
            b4.e(new Rect(0, n2, width, height));
            b4.k(new Rect(0, 0, 0, 0));
            b4.i(new Rect(0, 0, 0, 0));
            b4.c(new Rect(0, 0, 0, 0));
            b4.f(new Rect(0, n3, width, n2));
            ins = b4.a();
        }
        else {
            final Size d2 = d(b3, f);
            final Size d3 = d(c, f);
            final int width2 = d2.getWidth();
            final int height2 = d2.getHeight();
            inq.a = 7;
            final WindowInsets windowInsets = (WindowInsets)njp.a();
            final float n4 = (float)width2;
            final int round = Math.round(n4 * 16.0f / 9.0f);
            int u5;
            int n5;
            int u6;
            int u7;
            int n6;
            int n7;
            int n8;
            if (d) {
                u5 = 0;
                n5 = 0;
                u6 = 0;
                u7 = 0;
                n6 = 0;
                n7 = 0;
                n8 = 0;
            }
            else {
                final int u8 = jvu.u(56.0f);
                u5 = jvu.u(84.0f);
                u6 = jvu.u(42.0f);
                u7 = jvu.u(56.0f);
                int u9;
                if (e(g)) {
                    if (b2) {
                        u9 = jvu.u(56.0f);
                    }
                    else {
                        u9 = 0;
                    }
                }
                else {
                    u9 = 0;
                }
                if (e) {
                    n5 = jvu.u(48.0f);
                    final int n9 = 165;
                    n8 = u9;
                    n6 = n9;
                    n7 = u8;
                }
                else if (height2 <= round) {
                    n5 = jvu.u(48.0f);
                    n8 = u9;
                    n6 = 0;
                    n7 = u8;
                }
                else {
                    n5 = jvu.u(56.0f);
                    final int n10 = 0;
                    n8 = u9;
                    n7 = u8;
                    n6 = n10;
                }
            }
            Size size;
            if (d3.getWidth() == 0) {
                size = new Size(0, 0);
            }
            else {
                size = new Size(d2.getWidth(), Math.min(round, d3.getHeight() * d2.getWidth() / d3.getWidth()));
            }
            final jcb jcb = f;
            final int height3 = size.getHeight();
            final int round2 = Math.round(n4 * 4.0f / 3.0f);
            final int systemWindowInsetBottom = windowInsets.getSystemWindowInsetBottom();
            hyt.d(4100);
            int n11;
            boolean b5;
            int n12;
            if (d) {
                n11 = systemWindowInsetBottom;
                b5 = false;
                n12 = n6;
            }
            else if (height2 - b() - n5 - jvu.u(86.0f) - round2 < 0) {
                if (e) {
                    inq.b.b().E(2788).A("We shall not hide nav bar for Sunfish device: %d, %d, %d, %d, %d", height2, b(), n5, jvu.u(86.0f), round2);
                }
                hyt.d(4102);
                b5 = false;
                n11 = 0;
                n12 = n6;
            }
            else if (e) {
                int bottom = windowInsets.getInsets(WindowInsets$Type.navigationBars()).bottom;
                final int left = windowInsets.getInsets(WindowInsets$Type.navigationBars()).left;
                final int right = windowInsets.getInsets(WindowInsets$Type.navigationBars()).right;
                Label_0908: {
                    if (bottom == 0) {
                        if (left == 0 && right == 0) {
                            bottom = 0;
                            b5 = true;
                            break Label_0908;
                        }
                        bottom = 0;
                    }
                    b5 = false;
                }
                if (bottom <= jvu.u(16.0f) && bottom != 0) {
                    final int n13 = height2 - round - n5;
                    n11 = Math.min(Math.max(n13 - n6, 93), jvu.u(40.0f));
                    n12 = n13 - n11;
                }
                else {
                    n11 = b();
                    n12 = n6;
                }
            }
            else {
                n11 = b();
                b5 = false;
                n12 = n6;
            }
            final int n14 = height3;
            final int n15 = height2 - n11;
            int n16 = n15 - n5;
            int n17 = n5 + n11;
            int n19;
            int n18;
            int n21;
            int n20;
            int n22;
            int n23;
            boolean b6;
            int n25;
            int n24;
            if (d) {
                final int systemWindowInsetTop = windowInsets.getSystemWindowInsetTop();
                n18 = (n19 = systemWindowInsetTop);
                n20 = (n21 = n16);
                n22 = height2 - systemWindowInsetTop - systemWindowInsetBottom;
                n23 = 0;
                b6 = true;
                n17 = 0;
                n24 = (n25 = n21);
            }
            else if (e) {
                final int n26 = round + n11 + n5;
                if (height2 < n26) {
                    inq.b.b().E(2787).z("Window height is shorter than expected: %d, %d, %d, %d", height2, round, n11, n5);
                }
                int n29;
                int n30;
                int n31;
                int n34;
                if (height2 >= n26 + n12) {
                    final int n27 = n16 - round;
                    final int n28 = n16 - round2 - n27 - u7;
                    if (n28 >= jvu.u(112.0f)) {
                        n29 = n28;
                    }
                    else {
                        n29 = n28 + u7 - n5;
                    }
                    n30 = n16 - n29;
                    n31 = n30 - n8;
                    final int n32 = n31 - u5;
                    int n33;
                    if (n28 >= jvu.u(112.0f) && d3.getHeight() * 3 == d3.getWidth() * 4) {
                        n33 = n31 - u7;
                        b6 = false;
                    }
                    else {
                        n33 = n30;
                        b6 = true;
                    }
                    n19 = n27;
                    if (d3.getHeight() * 3 == d3.getWidth() * 4) {
                        n19 = n27;
                        if (n28 < jvu.u(112.0f)) {
                            n19 = n27 + n5;
                        }
                    }
                    n34 = n33;
                    n25 = n32;
                }
                else {
                    n19 = n15 - round;
                    n29 = n16 - round2 - n19;
                    n30 = n16 - n29;
                    n31 = n30 - n8;
                    n25 = n31 - u5;
                    n34 = n30;
                    b6 = true;
                }
                if (d3.getHeight() * 3 == d3.getWidth() * 4) {
                    n17 += n29;
                    inq.a = 6;
                }
                else {
                    inq.a = 5;
                }
                int max;
                if (n7 <= n19) {
                    max = Math.max(0, n19 - jvu.u(64.0f));
                }
                else {
                    max = n19;
                }
                final int n35 = n30;
                n20 = n31;
                n23 = n29;
                final int n36 = n14;
                n18 = max;
                n24 = n34;
                n22 = n36;
                n21 = n35;
            }
            else {
                final int n37 = n8;
                if (height2 <= round) {
                    n23 = n16 - round2;
                    final int n38 = n16 - n23;
                    n20 = n38 - n37;
                    final int n39 = n20 - u5;
                    int a;
                    if (d3.getHeight() * 3 == d3.getWidth() * 4) {
                        n17 += n23;
                        a = 2;
                    }
                    else {
                        a = 1;
                    }
                    inq.a = a;
                    n21 = n38;
                    n18 = 0;
                    n19 = 0;
                    b6 = true;
                    n22 = n14;
                    n24 = n38;
                    n25 = n39;
                }
                else {
                    final int n40 = n11 + round + n5;
                    if (height2 < n40) {
                        n19 = n15 - round;
                        n23 = n16 - round2 - n19;
                        final int n41 = n16 - n23;
                        n20 = n41 - n37;
                        final int n42 = n20 - u5;
                        if (d3.getHeight() * 3 == d3.getWidth() * 4) {
                            n17 += n23;
                            inq.a = 4;
                        }
                        else {
                            inq.a = 3;
                        }
                        n18 = n19;
                        n21 = n41;
                        b6 = true;
                        n22 = n14;
                        n24 = n41;
                        n25 = n42;
                    }
                    else {
                        njo.d(height2 >= n40);
                        final int n43 = n16 - round;
                        n23 = n15 - (n5 + n5) - round2 - n43;
                        final int n44 = n16 - n23;
                        n20 = n44 - n37;
                        final int n45 = n20 - u5;
                        int n46;
                        if (d3.getHeight() * 3 == d3.getWidth() * 4) {
                            n46 = n43 + n5;
                            n17 += n23;
                            inq.a = 6;
                        }
                        else {
                            inq.a = 5;
                            n46 = n43;
                        }
                        n21 = n44;
                        b6 = true;
                        final int n47 = n46;
                        final int n48 = n43;
                        n25 = n45;
                        n22 = n14;
                        n24 = n44;
                        n19 = n47;
                        n18 = n48;
                    }
                }
            }
            final int max2 = Math.max(n19, n7 + n18);
            final int n49 = n24 - max2;
            final int a2 = inq.a;
            if (a2 == 0) {
                throw null;
            }
            boolean b7 = false;
            Label_1908: {
                if (a2 != 6) {
                    if (a2 == 0) {
                        throw null;
                    }
                    if (a2 != 4) {
                        if (a2 != 0) {
                            b7 = (a2 == 2);
                            break Label_1908;
                        }
                        throw null;
                    }
                }
                b7 = true;
            }
            int n50 = n17;
            if (b7) {
                n50 = n17 + (n21 - n24);
            }
            int n51;
            int n52;
            if (g == jbm.n && !b2) {
                final int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166322);
                n51 = n25 - dimensionPixelSize;
                n52 = n49 - dimensionPixelSize;
            }
            else {
                n51 = n25;
                n52 = n49;
            }
            final inr b8 = ins.b();
            b8.n(d2);
            b8.p(f(n51, width2, u5));
            b8.g(f(n16, width2, n5));
            b8.b(f(n21, width2, n23));
            if (b7) {
                n16 = n24;
            }
            b8.e(f(n16, width2, n50));
            b8.m(f(max2, width2, n52));
            b8.j(f(n19, width2, n22));
            b8.k(f(n19, width2, n24 - n19));
            b8.i(f(n18, width2, n51 - n18 + u6));
            b8.l(f(max2, width2, n52));
            b8.d(f(0, width2, height2));
            b8.c(f(0, width2, n12));
            b8.f(f(n20, width2, n8));
            b8.h(b5);
            b8.o(b6);
            final ins a3 = b8.a();
            final Size b9 = a3.b;
            final jcb a4 = jcb.a;
            Size size2 = b9;
            switch (jcb.ordinal()) {
                default: {
                    final String value = String.valueOf(jcb);
                    final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 27);
                    sb.append("Unexpected UI Orientation: ");
                    sb.append(value);
                    throw new IllegalArgumentException(sb.toString());
                }
                case 1:
                case 2: {
                    size2 = new Size(b9.getHeight(), b9.getWidth());
                }
                case 0:
                case 3: {
                    final inr b10 = ins.b();
                    b10.n(size2);
                    b10.j(ins.a(a3.e, size2, jcb));
                    b10.k(ins.a(a3.c, size2, jcb));
                    b10.i(ins.a(a3.d, size2, jcb));
                    b10.l(ins.a(a3.f, size2, jcb));
                    b10.m(ins.a(a3.g, size2, jcb));
                    b10.p(ins.a(a3.h, size2, jcb));
                    b10.b(ins.a(a3.i, size2, jcb));
                    b10.f(ins.a(a3.n, size2, jcb));
                    b10.d(ins.a(a3.k, size2, jcb));
                    b10.e(ins.a(a3.j, size2, jcb));
                    b10.c(ins.a(a3.m, size2, jcb));
                    b10.g(ins.a(a3.l, size2, jcb));
                    b10.h(a3.o);
                    b10.o(a3.p);
                    ins = b10.a();
                    break;
                }
            }
        }
        return ins;
    }
    
    private static Size d(final Size size, final jcb jcb) {
        final jcb a = jcb.a;
        switch (jcb.ordinal()) {
            default: {
                final String value = String.valueOf(jcb);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 24);
                sb.append("Unknown UI orientation: ");
                sb.append(value);
                throw new RuntimeException(sb.toString());
            }
            case 1:
            case 2: {
                return new Size(size.getHeight(), size.getWidth());
            }
            case 0:
            case 3: {
                return size;
            }
        }
    }
    
    private static boolean e(final jbm jbm) {
        if (!jbm.equals(jbm.c) && !jbm.equals(jbm.f)) {
            if (!jbm.equals(jbm.n)) {
                if (!jbm.equals(jbm.l)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private static Rect f(final int n, final int n2, final int n3) {
        return new Rect(0, n, n2, n3 + n);
    }
}
