import android.util.Log;
import android.graphics.Path;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gy
{
    public char a;
    public final float[] b;
    
    public gy(final char c, final float[] b) {
        this.a = c;
        this.b = b;
    }
    
    public gy(final gy gy) {
        this.a = gy.a;
        final float[] b = gy.b;
        this.b = gz.c(b, b.length);
    }
    
    public static void a(final Path path, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final boolean b, final boolean b2) {
        final double radians = Math.toRadians(n7);
        final double cos = Math.cos(radians);
        final double sin = Math.sin(radians);
        double n8 = n;
        final double n9 = n2;
        final double n10 = n5;
        Double.isNaN(n8);
        Double.isNaN(n9);
        Double.isNaN(n10);
        final double n11 = (n8 * cos + n9 * sin) / n10;
        final double n12 = n6;
        final double n13 = -n;
        Double.isNaN(n13);
        Double.isNaN(n9);
        Double.isNaN(n12);
        final double n14 = (n13 * sin + n9 * cos) / n12;
        final double n15 = n4;
        final double n16 = n3;
        Double.isNaN(n16);
        Double.isNaN(n15);
        Double.isNaN(n10);
        final double n17 = (n16 * cos + n15 * sin) / n10;
        final double n18 = -n3;
        Double.isNaN(n18);
        Double.isNaN(n15);
        Double.isNaN(n12);
        final double n19 = (n18 * sin + n15 * cos) / n12;
        final double n20 = n11 - n17;
        final double n21 = n14 - n19;
        final double n22 = (n11 + n17) / 2.0;
        final double n23 = (n14 + n19) / 2.0;
        final double n24 = n20 * n20 + n21 * n21;
        if (n24 == 0.0) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        final double n25 = 1.0 / n24 - 0.25;
        if (n25 < 0.0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Points are too far apart ");
            sb.append(n24);
            Log.w("PathParser", sb.toString());
            final float n26 = (float)(Math.sqrt(n24) / 1.99999);
            a(path, n, n2, n3, n4, n5 * n26, n6 * n26, n7, b, b2);
            return;
        }
        final double sqrt = Math.sqrt(n25);
        final double n27 = n20 * sqrt;
        final double n28 = sqrt * n21;
        double n29;
        double n30;
        if (b == b2) {
            n29 = n22 - n28;
            n30 = n23 + n27;
        }
        else {
            n29 = n22 + n28;
            n30 = n23 - n27;
        }
        double atan2 = Math.atan2(n14 - n30, n11 - n29);
        final double n31 = Math.atan2(n19 - n30, n17 - n29) - atan2;
        int i = 0;
        final boolean b3 = n31 >= 0.0;
        double n32 = n31;
        if (b2 != b3) {
            if (n31 > 0.0) {
                n32 = n31 - 6.283185307179586;
            }
            else {
                n32 = n31 + 6.283185307179586;
            }
        }
        Double.isNaN(n10);
        final double n33 = n29 * n10;
        Double.isNaN(n12);
        final double n34 = n30 * n12;
        final double n35 = n33 * cos - n34 * sin;
        final int n36 = (int)Math.ceil(Math.abs(n32 * 4.0 / 3.141592653589793));
        final double cos2 = Math.cos(radians);
        final double sin2 = Math.sin(radians);
        final double cos3 = Math.cos(atan2);
        final double sin3 = Math.sin(atan2);
        Double.isNaN(n10);
        final double n37 = -n10;
        final double n38 = n37 * cos2;
        Double.isNaN(n12);
        final double n39 = n12 * sin2;
        double n40 = n38 * sin3 - n39 * cos3;
        final double n41 = n37 * sin2;
        Double.isNaN(n12);
        final double n42 = n12 * cos2;
        double n43 = sin3 * n41 + cos3 * n42;
        final double n44 = n36;
        Double.isNaN(n44);
        final double n45 = n32 / n44;
        double n46 = n9;
        final double n47 = n41;
        final double n48 = n35;
        final double n49 = n10;
        final double n50 = n45;
        while (i < n36) {
            final double n51 = atan2 + n50;
            final double sin4 = Math.sin(n51);
            final double cos4 = Math.cos(n51);
            Double.isNaN(n49);
            final double n52 = n48 + n49 * cos2 * cos4 - n39 * sin4;
            Double.isNaN(n49);
            final double n53 = n33 * sin + n34 * cos + n49 * sin2 * cos4 + n42 * sin4;
            final double n54 = n38 * sin4 - n39 * cos4;
            final double n55 = sin4 * n47 + cos4 * n42;
            final double n56 = n51 - atan2;
            final double tan = Math.tan(n56 / 2.0);
            final double n57 = Math.sin(n56) * (Math.sqrt(tan * 3.0 * tan + 4.0) - 1.0) / 3.0;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float)(n8 + n40 * n57), (float)(n46 + n43 * n57), (float)(n52 - n57 * n54), (float)(n53 - n57 * n55), (float)n52, (float)n53);
            ++i;
            n8 = n52;
            n46 = n53;
            atan2 = n51;
            n43 = n55;
            n40 = n54;
        }
    }
}
