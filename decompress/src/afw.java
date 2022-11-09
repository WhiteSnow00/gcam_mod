import android.graphics.Paint$Cap;
import android.graphics.Paint$Join;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.Paint$Style;
import android.graphics.Path$FillType;
import android.graphics.Canvas;
import android.graphics.PathMeasure;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

final class afw
{
    public static final Matrix a;
    Paint b;
    Paint c;
    final afu d;
    float e;
    float f;
    float g;
    float h;
    int i;
    String j;
    Boolean k;
    final yu l;
    private final Path m;
    private final Path n;
    private final Matrix o;
    private PathMeasure p;
    private int q;
    
    static {
        a = new Matrix();
    }
    
    public afw() {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 255;
        this.j = null;
        this.k = null;
        this.l = new yu();
        this.d = new afu();
        this.m = new Path();
        this.n = new Path();
    }
    
    public afw(final afw afw) {
        this.o = new Matrix();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 255;
        this.j = null;
        this.k = null;
        final yu l = new yu();
        this.l = l;
        this.d = new afu(afw.d, l);
        this.m = new Path(afw.m);
        this.n = new Path(afw.n);
        this.e = afw.e;
        this.f = afw.f;
        this.g = afw.g;
        this.h = afw.h;
        final int q = afw.q;
        this.q = 0;
        this.i = afw.i;
        this.j = afw.j;
        final String j = afw.j;
        if (j != null) {
            l.put(j, this);
        }
        this.k = afw.k;
    }
    
    public final void a(final afu afu, final Matrix matrix, final Canvas canvas, final int n, final int n2) {
        afw afw = this;
        afu.a.set(matrix);
        afu.a.preConcat(afu.j);
        canvas.save();
        for (int i = 0; i < afu.b.size(); ++i) {
            final acv acv = afu.b.get(i);
            if (acv instanceof afu) {
                this.a((afu)acv, afu.a, canvas, n, n2);
            }
            else if (acv instanceof afv) {
                final afv afv = (afv)acv;
                final float n3 = n / afw.g;
                final float n4 = n2 / afw.h;
                float min = Math.min(n3, n4);
                final Matrix a = afu.a;
                afw.o.set(a);
                afw.o.postScale(n3, n4);
                final float[] array2;
                final float[] array = array2 = new float[4];
                array2[0] = 0.0f;
                array2[2] = (array2[1] = 1.0f);
                array2[3] = 0.0f;
                a.mapVectors(array);
                final double hypot = Math.hypot(array[0], array[1]);
                final double hypot2 = Math.hypot(array[2], array[3]);
                final float n5 = array[0];
                final float n6 = array[1];
                final float n7 = array[2];
                final float n8 = array[3];
                final float max = Math.max((float)hypot, (float)hypot2);
                float n9;
                if (max > 0.0f) {
                    n9 = Math.abs(n5 * n8 - n6 * n7) / max;
                }
                else {
                    n9 = 0.0f;
                }
                if (n9 != 0.0f) {
                    final Path m = afw.m;
                    m.reset();
                    final gy[] j = afv.m;
                    aft aft = (aft)afv;
                    float n10 = n9;
                    float n11 = min;
                    int n12 = i;
                    if (j != null) {
                        final float[] array3 = new float[6];
                        int a2 = 109;
                        int n13 = 0;
                        final int n14 = i;
                        final float n15 = n9;
                        final aft aft2 = (aft)afv;
                        while (true) {
                            aft = aft2;
                            n10 = n15;
                            n11 = min;
                            n12 = n14;
                            if (n13 >= j.length) {
                                break;
                            }
                            final gy gy = j[n13];
                            final char a3 = gy.a;
                            final float[] b = gy.b;
                            float n16 = array3[0];
                            float n17 = array3[1];
                            float n18 = array3[2];
                            float n19 = array3[3];
                            float n20 = array3[4];
                            float n21 = array3[5];
                            int n22 = 0;
                            switch (a3) {
                                default: {
                                    n22 = 2;
                                    break;
                                }
                                case 81:
                                case 83:
                                case 113:
                                case 115: {
                                    n22 = 4;
                                    break;
                                }
                                case 90:
                                case 122: {
                                    m.close();
                                    m.moveTo(n20, n21);
                                    n17 = (n19 = n21);
                                    n16 = (n18 = n20);
                                }
                                case 76:
                                case 77:
                                case 84:
                                case 108:
                                case 109:
                                case 116: {
                                    n22 = 2;
                                    break;
                                }
                                case 72:
                                case 86:
                                case 104:
                                case 118: {
                                    n22 = 1;
                                    break;
                                }
                                case 67:
                                case 99: {
                                    n22 = 6;
                                    break;
                                }
                                case 65:
                                case 97: {
                                    n22 = 7;
                                    break;
                                }
                            }
                            final float n23 = n16;
                            int k = 0;
                            float n24 = n19;
                            float n25 = n18;
                            int n26 = a2;
                            float n27 = n17;
                            float n28 = n23;
                            final float n29 = min;
                            float n30 = 0.0f;
                            for (char c = a3; k < b.length; k += n22, n26 = c, n25 = n30) {
                                switch (c) {
                                    default: {
                                        n30 = n25;
                                        break;
                                    }
                                    case 118: {
                                        m.rLineTo(0.0f, b[k]);
                                        n27 += b[k];
                                        n30 = n25;
                                        break;
                                    }
                                    case 116: {
                                        float n31;
                                        float n32;
                                        if (n26 != 113 && n26 != 116 && n26 != 81 && n26 != 84) {
                                            n31 = 0.0f;
                                            n32 = 0.0f;
                                        }
                                        else {
                                            final float n33 = n28 - n25;
                                            n32 = n27 - n24;
                                            n31 = n33;
                                        }
                                        final int n34 = k + 1;
                                        m.rQuadTo(n31, n32, b[k], b[n34]);
                                        final float n35 = n28 + b[k];
                                        final float n36 = n27 + b[n34];
                                        final float n37 = n31 + n28;
                                        final float n38 = n32 + n27;
                                        n28 = n35;
                                        n27 = n36;
                                        n30 = n37;
                                        n24 = n38;
                                        break;
                                    }
                                    case 115: {
                                        float n39;
                                        float n40;
                                        if (n26 != 99 && n26 != 115 && n26 != 67 && n26 != 83) {
                                            n39 = 0.0f;
                                            n40 = 0.0f;
                                        }
                                        else {
                                            final float n41 = n28 - n25;
                                            n40 = n27 - n24;
                                            n39 = n41;
                                        }
                                        final int n42 = k + 1;
                                        final int n43 = k + 2;
                                        final int n44 = k + 3;
                                        m.rCubicTo(n39, n40, b[k], b[n42], b[n43], b[n44]);
                                        final float n45 = b[k];
                                        final float n46 = b[n42];
                                        final float n47 = n28 + b[n43];
                                        final float n48 = n27 + b[n44];
                                        n24 = n46 + n27;
                                        final float n49 = n45 + n28;
                                        n28 = n47;
                                        n27 = n48;
                                        n30 = n49;
                                        break;
                                    }
                                    case 113: {
                                        final int n50 = k + 1;
                                        final int n51 = k + 2;
                                        final int n52 = k + 3;
                                        m.rQuadTo(b[k], b[n50], b[n51], b[n52]);
                                        final float n53 = b[k];
                                        final float n54 = b[n50];
                                        final float n55 = n28 + b[n51];
                                        final float n56 = n27 + b[n52];
                                        final float n57 = n53 + n28;
                                        final float n58 = n54 + n27;
                                        n28 = n55;
                                        n27 = n56;
                                        n30 = n57;
                                        n24 = n58;
                                        break;
                                    }
                                    case 109: {
                                        final float n59 = b[k];
                                        n28 += n59;
                                        final float n60 = b[k + 1];
                                        n27 += n60;
                                        if (k > 0) {
                                            m.rLineTo(n59, n60);
                                            n30 = n25;
                                            break;
                                        }
                                        m.rMoveTo(n59, n60);
                                        n20 = n28;
                                        n21 = n27;
                                        n30 = n25;
                                        break;
                                    }
                                    case 108: {
                                        final int n61 = k + 1;
                                        m.rLineTo(b[k], b[n61]);
                                        n28 += b[k];
                                        n27 += b[n61];
                                        n30 = n25;
                                        break;
                                    }
                                    case 104: {
                                        m.rLineTo(b[k], 0.0f);
                                        n28 += b[k];
                                        n30 = n25;
                                        break;
                                    }
                                    case 99: {
                                        final int n62 = k + 2;
                                        final int n63 = k + 3;
                                        final int n64 = k + 4;
                                        final int n65 = k + 5;
                                        m.rCubicTo(b[k], b[k + 1], b[n62], b[n63], b[n64], b[n65]);
                                        final float n66 = b[n62];
                                        final float n67 = b[n63];
                                        final float n68 = n28 + b[n64];
                                        final float n69 = n27 + b[n65];
                                        final float n70 = n66 + n28;
                                        final float n71 = n67 + n27;
                                        n28 = n68;
                                        n27 = n69;
                                        n30 = n70;
                                        n24 = n71;
                                        break;
                                    }
                                    case 97: {
                                        final int n72 = k + 5;
                                        final float n73 = b[n72];
                                        final int n74 = k + 6;
                                        gy.a(m, n28, n27, n73 + n28, b[n74] + n27, b[k], b[k + 1], b[k + 2], b[k + 3] != 0.0f, b[k + 4] != 0.0f);
                                        n28 += b[n72];
                                        n27 += b[n74];
                                        n30 = n28;
                                        n24 = n27;
                                        break;
                                    }
                                    case 86: {
                                        m.lineTo(n28, b[k]);
                                        n27 = b[k];
                                        n30 = n25;
                                        break;
                                    }
                                    case 84: {
                                        if (n26 == 113 || n26 == 116 || n26 == 81 || n26 == 84) {
                                            n28 = n28 + n28 - n25;
                                            n27 = n27 + n27 - n24;
                                        }
                                        final int n75 = k + 1;
                                        m.quadTo(n28, n27, b[k], b[n75]);
                                        final float n76 = b[k];
                                        final float n77 = b[n75];
                                        n30 = n28;
                                        n24 = n27;
                                        n27 = n77;
                                        n28 = n76;
                                        break;
                                    }
                                    case 83: {
                                        if (n26 == 99 || n26 == 115 || n26 == 67 || n26 == 83) {
                                            n28 = n28 + n28 - n25;
                                            n27 = n27 + n27 - n24;
                                        }
                                        final int n78 = k + 1;
                                        final int n79 = k + 2;
                                        final int n80 = k + 3;
                                        m.cubicTo(n28, n27, b[k], b[n78], b[n79], b[n80]);
                                        n30 = b[k];
                                        n24 = b[n78];
                                        n28 = b[n79];
                                        n27 = b[n80];
                                        break;
                                    }
                                    case 81: {
                                        final int n81 = k + 1;
                                        final int n82 = k + 2;
                                        final int n83 = k + 3;
                                        m.quadTo(b[k], b[n81], b[n82], b[n83]);
                                        n30 = b[k];
                                        n24 = b[n81];
                                        n28 = b[n82];
                                        n27 = b[n83];
                                        break;
                                    }
                                    case 77: {
                                        n28 = b[k];
                                        n27 = b[k + 1];
                                        if (k > 0) {
                                            m.lineTo(n28, n27);
                                            n30 = n25;
                                            break;
                                        }
                                        m.moveTo(n28, n27);
                                        n20 = n28;
                                        n21 = n27;
                                        n30 = n25;
                                        break;
                                    }
                                    case 76: {
                                        final int n84 = k + 1;
                                        m.lineTo(b[k], b[n84]);
                                        n28 = b[k];
                                        n27 = b[n84];
                                        n30 = n25;
                                        break;
                                    }
                                    case 72: {
                                        m.lineTo(b[k], n27);
                                        n28 = b[k];
                                        n30 = n25;
                                        break;
                                    }
                                    case 67: {
                                        final int n85 = k + 2;
                                        final int n86 = k + 3;
                                        final int n87 = k + 4;
                                        final int n88 = k + 5;
                                        m.cubicTo(b[k], b[k + 1], b[n85], b[n86], b[n87], b[n88]);
                                        n28 = b[n87];
                                        n27 = b[n88];
                                        n30 = b[n85];
                                        n24 = b[n86];
                                        break;
                                    }
                                    case 65: {
                                        final int n89 = k + 5;
                                        final float n90 = b[n89];
                                        final int n91 = k + 6;
                                        gy.a(m, n28, n27, n90, b[n91], b[k], b[k + 1], b[k + 2], b[k + 3] != 0.0f, b[k + 4] != 0.0f);
                                        n28 = b[n89];
                                        n27 = b[n91];
                                        n30 = n28;
                                        n24 = n27;
                                        break;
                                    }
                                }
                            }
                            array3[0] = n28;
                            array3[1] = n27;
                            array3[2] = n25;
                            array3[3] = n24;
                            array3[4] = n20;
                            array3[5] = n21;
                            a2 = j[n13].a;
                            ++n13;
                            min = n29;
                        }
                    }
                    final Path l = this.m;
                    this.n.reset();
                    if (aft.o()) {
                        final Path n92 = this.n;
                        Path$FillType fillType;
                        if (aft.o == 0) {
                            fillType = Path$FillType.WINDING;
                        }
                        else {
                            fillType = Path$FillType.EVEN_ODD;
                        }
                        n92.setFillType(fillType);
                        this.n.addPath(l, this.o);
                        canvas.clipPath(this.n);
                        afw = this;
                        i = n12;
                    }
                    else {
                        final aft aft3 = aft;
                        final float g = aft3.g;
                        if (g != 0.0f || aft3.h != 1.0f) {
                            final float i2 = aft3.i;
                            final float h = aft3.h;
                            if (this.p == null) {
                                this.p = new PathMeasure();
                            }
                            this.p.setPath(this.m, false);
                            final float length = this.p.getLength();
                            final float n93 = (g + i2) % 1.0f * length;
                            final float n94 = (h + i2) % 1.0f * length;
                            l.reset();
                            if (n93 > n94) {
                                this.p.getSegment(n93, length, l, true);
                                this.p.getSegment(0.0f, n94, l, true);
                            }
                            else {
                                this.p.getSegment(n93, n94, l, true);
                            }
                            l.rLineTo(0.0f, 0.0f);
                        }
                        this.n.addPath(l, this.o);
                        if (aft3.d.e()) {
                            final gl d = aft3.d;
                            if (this.c == null) {
                                (this.c = new Paint(1)).setStyle(Paint$Style.FILL);
                            }
                            final Paint c2 = this.c;
                            if (d.b()) {
                                final Shader a4 = d.a;
                                a4.setLocalMatrix(this.o);
                                c2.setShader(a4);
                                c2.setAlpha(Math.round(aft3.f * 255.0f));
                            }
                            else {
                                c2.setShader((Shader)null);
                                c2.setAlpha(255);
                                c2.setColor(afz.a(d.b, aft3.f));
                            }
                            c2.setColorFilter((ColorFilter)null);
                            final Path n95 = this.n;
                            Path$FillType fillType2;
                            if (aft3.o == 0) {
                                fillType2 = Path$FillType.WINDING;
                            }
                            else {
                                fillType2 = Path$FillType.EVEN_ODD;
                            }
                            n95.setFillType(fillType2);
                            canvas.drawPath(this.n, c2);
                        }
                        afw = this;
                        i = n12;
                        if (aft3.b.e()) {
                            final gl b2 = aft3.b;
                            if (this.b == null) {
                                (this.b = new Paint(1)).setStyle(Paint$Style.STROKE);
                            }
                            final Paint b3 = this.b;
                            final Paint$Join k2 = aft3.k;
                            if (k2 != null) {
                                b3.setStrokeJoin(k2);
                            }
                            final Paint$Cap j2 = aft3.j;
                            if (j2 != null) {
                                b3.setStrokeCap(j2);
                            }
                            b3.setStrokeMiter(aft3.l);
                            if (b2.b()) {
                                final Shader a5 = b2.a;
                                a5.setLocalMatrix(this.o);
                                b3.setShader(a5);
                                b3.setAlpha(Math.round(aft3.e * 255.0f));
                            }
                            else {
                                b3.setShader((Shader)null);
                                b3.setAlpha(255);
                                b3.setColor(afz.a(b2.b, aft3.e));
                            }
                            b3.setColorFilter((ColorFilter)null);
                            b3.setStrokeWidth(aft3.c * (n11 * n10));
                            canvas.drawPath(this.n, b3);
                            afw = this;
                            i = n12;
                        }
                    }
                }
            }
        }
        canvas.restore();
    }
    
    public float getAlpha() {
        return this.getRootAlpha() / 255.0f;
    }
    
    public int getRootAlpha() {
        return this.i;
    }
    
    public void setAlpha(final float n) {
        this.setRootAlpha((int)(n * 255.0f));
    }
    
    public void setRootAlpha(final int i) {
        this.i = i;
    }
}
