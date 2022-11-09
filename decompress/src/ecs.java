import android.graphics.Bitmap;
import com.google.android.libraries.vision.opengl.Texture;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import android.opengl.Matrix;
import android.opengl.GLES20;
import java.util.EnumMap;
import android.content.Context;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ecs implements eca
{
    private final ecn[] a;
    private final ecp b;
    private final ecq c;
    private final float[] d;
    private ecr e;
    private ecr f;
    private boolean g;
    private float h;
    private float i;
    private final float[] j;
    private final float[] k;
    private boolean l;
    private final eas m;
    private final eew n;
    private final eew o;
    private final Map p;
    private final float[] q;
    private efa r;
    private eey s;
    private final ecb t;
    private final eba u;
    private final ebo v;
    private final Context w;
    
    public ecs(final ecb t, final eba u, final ebo v, final Context w) {
        this.a = new ecn[4];
        this.b = new ecp();
        this.c = new ecq();
        this.d = new float[] { 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.3f };
        this.e = ecr.a;
        this.f = ecr.a;
        this.g = false;
        this.h = 1.0f;
        this.i = 1.0f;
        this.j = new float[] { 1.0f, 0.0f, 0.0f, 1.0f };
        this.k = new float[] { 1.0f, 1.0f, 1.0f, 1.0f };
        this.l = false;
        final EnumMap p4 = new EnumMap((Class<K>)ebn.class);
        this.p = p4;
        this.q = new float[16];
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        p4.put((Object)ebn.a, 25.0f);
        p4.put((Object)ebn.b, 35.0f);
        this.m = new eas();
        this.n = new eew(ecr.a);
        this.o = new eew(eco.a);
        this.r = new efa();
        this.s = new eey();
    }
    
    private final void d(final ecr ecr, float h, float a, float n) {
        if (ecr == ecr.k) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
            final float[] d = this.d;
            final float[] i = this.t.i;
            final float[] a2 = eci.a;
            for (int j = 0; j < 4; ++j) {
                final int n2 = j * 4;
                d[n2] = i[0];
                d[n2 + 1] = i[1];
                d[n2 + 2] = i[2];
            }
            final Float n3 = this.p.get(ebn.a);
            float floatValue;
            if (n3 != null) {
                floatValue = n3;
            }
            else {
                floatValue = 25.0f;
            }
            final float min = Math.min(Math.abs(this.v.f()), 140.0f);
            final float h2 = this.h;
            final float l = this.t.l;
            final float n4 = (min - floatValue) / (140.0f - floatValue) * 0.74f * h2 / l + 0.06f / l;
            Matrix.setIdentityM(this.q, 0);
            Matrix.translateM(this.q, 0, h, a, 0.0f);
            final float[] q = this.q;
            Matrix.multiplyMM(q, 0, q, 0, this.t.f, 0);
            final ecb t = this.t;
            if (t.h) {
                h = -(t.e / 2.0f) - n4 / 2.0f;
                final float[] q2 = this.q;
                if (!t.m) {
                    h = -h;
                }
                Matrix.translateM(q2, 0, 0.0f, h, 0.0f);
                if (this.t.m) {
                    eci.a(this.d, 0.6f, 0.6f, 0.0f, 0.0f);
                }
                else {
                    eci.a(this.d, 0.0f, 0.0f, 0.6f, 0.6f);
                }
            }
            else {
                h = -(t.d / 2.0f) - n4 / 2.0f;
                final float[] q3 = this.q;
                if (!t.m) {
                    h = -h;
                }
                Matrix.translateM(q3, 0, h, 0.0f, 0.0f);
                if (this.t.m) {
                    eci.a(this.d, 0.0f, 0.6f, 0.0f, 0.6f);
                }
                else {
                    eci.a(this.d, 0.6f, 0.0f, 0.6f, 0.0f);
                }
            }
            final eey s = this.s;
            s.getClass();
            System.arraycopy(this.q, 0, s.a, 0, 16);
            final eey s2 = this.s;
            s2.getClass();
            s2.e(this.d);
            if (this.t.h) {
                final eey s3 = this.s;
                s3.getClass();
                s3.d(-n, n4 / 2.0f, n, -n4 / 2.0f);
            }
            else {
                final eey s4 = this.s;
                s4.getClass();
                s4.d(-n4 / 2.0f, n, n4 / 2.0f, -n);
            }
            final eey s5 = this.s;
            s5.getClass();
            s5.b();
            return;
        }
        n = this.n.a;
        this.t.i[3] = n;
        Matrix.setIdentityM(this.q, 0);
        final ecp b = this.b;
        final int ordinal = ecr.ordinal();
        n = 180.0f;
        switch (ordinal) {
            default: {
                final String value = String.valueOf(ecr);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 30);
                sb.append("Unhandled WarningRenderState: ");
                sb.append(value);
                throw new RuntimeException(sb.toString());
            }
            case 10: {
                final String value2 = String.valueOf(ecr);
                final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 62);
                sb2.append("Invalid WarningRenderState for getWarningInfoForWarningState: ");
                sb2.append(value2);
                throw new RuntimeException(sb2.toString());
            }
            case 9: {
                final float[] b2 = b.b;
                if (!this.t.h) {
                    n = 0.0f;
                }
                else {
                    n = -90.0f;
                }
                Matrix.setRotateEulerM(b2, 0, 0.0f, 0.0f, n);
                b.a = this.a[2];
                b.c = 6;
                break;
            }
            case 8: {
                final float[] b3 = b.b;
                if (this.t.h) {
                    n = 90.0f;
                }
                Matrix.setRotateEulerM(b3, 0, 0.0f, 0.0f, n);
                b.a = this.a[2];
                b.c = 5;
                break;
            }
            case 7: {
                b.a = this.a[2];
                final ecb t2 = this.t;
                if (t2.m) {
                    final float[] b4 = b.b;
                    if (!t2.h) {
                        n = 0.0f;
                    }
                    else {
                        n = -90.0f;
                    }
                    Matrix.setRotateEulerM(b4, 0, 0.0f, 0.0f, n);
                    b.c = 4;
                    break;
                }
                final float[] b5 = b.b;
                if (t2.h) {
                    n = 90.0f;
                }
                Matrix.setRotateEulerM(b5, 0, 0.0f, 0.0f, n);
                b.c = 3;
                break;
            }
            case 6: {
                final float[] b6 = b.b;
                if (!this.t.h) {
                    n = 90.0f;
                }
                else {
                    n = 0.0f;
                }
                Matrix.setRotateEulerM(b6, 0, 0.0f, 0.0f, n);
                b.a = this.a[2];
                b.c = 7;
                break;
            }
            case 5: {
                final float[] b7 = b.b;
                if (!this.t.h) {
                    n = -90.0f;
                }
                Matrix.setRotateEulerM(b7, 0, 0.0f, 0.0f, n);
                b.a = this.a[2];
                b.c = 8;
                break;
            }
            case 4: {
                Matrix.setRotateEulerM(b.b, 0, 0.0f, 0.0f, 180.0f);
                b.a = this.a[2];
                b.c = 3;
                break;
            }
            case 3: {
                Matrix.setIdentityM(b.b, 0);
                b.a = this.a[2];
                b.c = 4;
                break;
            }
            case 2: {
                final ecb t3 = this.t;
                if (!t3.m && !t3.h) {
                    Matrix.setIdentityM(b.b, 0);
                    Matrix.scaleM(b.b, 0, -1.0f, 1.0f, 1.0f);
                    b.a = this.a[0];
                    b.c = 2;
                    break;
                }
                Matrix.setIdentityM(b.b, 0);
                b.a = this.a[1];
                b.c = 1;
                break;
            }
            case 1: {
                Matrix.setIdentityM(b.b, 0);
                final ecb t4 = this.t;
                if (t4.m && !t4.h) {
                    Matrix.setIdentityM(b.b, 0);
                    b.a = this.a[0];
                    b.c = 1;
                    break;
                }
                Matrix.setIdentityM(b.b, 0);
                Matrix.scaleM(b.b, 0, -1.0f, 1.0f, 1.0f);
                b.a = this.a[1];
                b.c = 2;
                break;
            }
            case 0: {
                Matrix.setIdentityM(b.b, 0);
                b.a = null;
                b.c = 8;
                break;
            }
        }
        final int c = this.b.c;
        final ecq c2 = this.c;
        final float k = this.i;
        final ecb t5 = this.t;
        n = t5.a;
        final float n5 = k * n;
        final float a3 = this.m.a;
        c2.a = true;
        if (c != 0) {
            switch (c - 1) {
                default: {
                    String s6 = null;
                    switch (c) {
                        default: {
                            s6 = "CENTER_UP_ANIM";
                            break;
                        }
                        case 7: {
                            s6 = "CENTER_DOWN_ANIM";
                            break;
                        }
                        case 6: {
                            s6 = "START_INNER_RIGHT";
                            break;
                        }
                        case 5: {
                            s6 = "START_INNER_LEFT";
                            break;
                        }
                        case 4: {
                            s6 = "INNER_RIGHT";
                            break;
                        }
                        case 3: {
                            s6 = "INNER_LEFT";
                            break;
                        }
                        case 2: {
                            s6 = "OUTER_MIDDLE_RIGHT";
                            break;
                        }
                        case 1: {
                            s6 = "OUTER_MIDDLE_LEFT";
                            break;
                        }
                    }
                    final StringBuilder sb3 = new StringBuilder(s6.length() + 31);
                    sb3.append("Unhandled WarningPositionEnum: ");
                    sb3.append(s6);
                    throw new RuntimeException(sb3.toString());
                }
                case 7: {
                    if (t5.h) {
                        h = a3 * n5;
                    }
                    else {
                        a = -(a3 * n5);
                    }
                    c2.a = false;
                    break;
                }
                case 6: {
                    if (t5.h) {
                        h = -(a3 * n5);
                    }
                    else {
                        a = a3 * n5;
                    }
                    c2.a = false;
                    break;
                }
                case 5: {
                    final boolean h3 = t5.h;
                    h = (a3 + 0.3f) * n5;
                    if (h3) {
                        a = 1.0f - h;
                        h = 0.0f;
                    }
                    else {
                        h = n - h;
                        a = 0.0f;
                    }
                    c2.a = false;
                    break;
                }
                case 4: {
                    if (t5.h) {
                        a = (a3 + 0.3f) * n5 - 1.0f;
                        h = 0.0f;
                    }
                    else {
                        h = -n + (a3 + 0.3f) * n5;
                        a = 0.0f;
                    }
                    c2.a = false;
                    break;
                }
                case 3: {
                    if (t5.h) {
                        a = a - (a3 + 0.2f) * n5 + t5.e / 2.0f;
                        break;
                    }
                    h = h - (a3 + 0.2f) * n5 + t5.d / 2.0f;
                    break;
                }
                case 2: {
                    if (t5.h) {
                        a = a + (a3 + 0.2f) * n5 - t5.e / 2.0f;
                        break;
                    }
                    h = h + (a3 + 0.2f) * n5 - t5.d / 2.0f;
                    break;
                }
                case 1: {
                    h = h + n5 * 0.12f + t5.d / 2.0f;
                    break;
                }
                case 0: {
                    h = h - n5 * 0.12f - t5.d / 2.0f;
                    c2.a = false;
                    break;
                }
            }
            Matrix.translateM(this.q, 0, h, a, 0.0f);
            if (this.c.a) {
                final float[] q4 = this.q;
                Matrix.multiplyMM(q4, 0, q4, 0, this.t.f, 0);
            }
            final float[] q5 = this.q;
            h = this.h;
            Matrix.scaleM(q5, 0, h, h, 1.0f);
            final ecp b8 = this.b;
            if (b8.a != null) {
                final float[] q6 = this.q;
                Matrix.multiplyMM(q6, 0, q6, 0, b8.b, 0);
                final efa r = this.r;
                r.getClass();
                final ecn a4 = this.b.a;
                a4.getClass();
                r.b = a4.a;
                r.getClass();
                a4.getClass();
                n = a4.b;
                a = this.t.a;
                h = n * a;
                a4.getClass();
                a4.getClass();
                a *= n * a4.c;
                r.d(h + h, a + a);
                final efa r2 = this.r;
                r2.getClass();
                System.arraycopy(this.t.i, 0, r2.e, 0, 4);
                r2.d = true;
                final efa r3 = this.r;
                r3.getClass();
                r3.f(this.q);
                final efa r4 = this.r;
                r4.getClass();
                r4.b();
            }
            return;
        }
        throw null;
    }
    
    @Override
    public final void a() {
        final efa r = this.r;
        if (r != null) {
            r.a();
            this.r = null;
        }
        final eey s = this.s;
        if (s != null) {
            s.a();
            this.s = null;
        }
    }
    
    @Override
    public final void b() {
        final boolean l = this.l;
        final boolean i = this.t.g < 0.007f;
        this.l = i;
        if (i && !l) {
            this.m.a();
            this.n.a();
            this.o.a();
        }
        if (!this.l && l) {
            this.n.a();
            this.n.c = ecr.a;
            this.o.a();
        }
        final ecb t = this.t;
        final float n = 1.0f - t.g;
        final float h = n * 0.5f + 0.5f;
        this.h = h;
        final float j = t.l;
        this.h = h * j;
        this.i = (n * 0.7f + 0.3f) * j;
        this.g = false;
        this.v.h(this.p);
        final Float n2 = this.p.get(ebn.a);
        float floatValue;
        if (n2 != null) {
            floatValue = n2;
        }
        else {
            floatValue = 25.0f;
        }
        boolean b;
        if (this.t.m) {
            b = (this.v.f() >= floatValue);
        }
        else {
            b = (this.v.f() <= -floatValue);
        }
        final Float n3 = this.p.get(ebn.b);
        float floatValue2;
        if (n3 != null) {
            floatValue2 = n3;
        }
        else {
            floatValue2 = 35.0f;
        }
        if (b && Math.abs(this.v.f()) >= floatValue2) {
            this.e = ecr.k;
            this.g = true;
        }
        else {
            final ebo v = this.v;
            final double o = v.o;
            if (o <= -10.0) {
                this.e = ecr.c;
                this.g = true;
            }
            else if (o >= 10.0) {
                this.e = ecr.b;
                this.g = true;
            }
            else {
                final float n4 = (float)v.f;
                if (n4 >= 10.0f) {
                    this.e = ecr.f;
                    this.g = true;
                }
                else if (n4 <= -10.0f) {
                    this.e = ecr.g;
                    this.g = true;
                }
                else {
                    final float n5 = (float)v.g;
                    if (n5 >= 10.0f) {
                        this.e = ecr.h;
                        this.g = true;
                    }
                    else if (b) {
                        this.e = ecr.k;
                    }
                    else if (o <= -3.5) {
                        this.e = ecr.c;
                    }
                    else if (o >= 3.5) {
                        this.e = ecr.b;
                    }
                    else if (n4 >= 2.5f) {
                        this.e = ecr.f;
                    }
                    else if (n4 <= -2.5f) {
                        this.e = ecr.g;
                    }
                    else if (n5 >= 2.0f) {
                        this.e = ecr.h;
                    }
                    else {
                        this.e = ecr.a;
                    }
                }
            }
        }
        if (this.l) {
            this.g = false;
        }
        if (!this.v.j() || this.t.n) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
            final ecb t2 = this.t;
            final float b2 = t2.b;
            final float c = t2.c;
            float n6;
            if (t2.h) {
                n6 = t2.d / 2.0f;
            }
            else {
                n6 = t2.e / 2.0f;
            }
            if (this.r != null) {
                if (this.u.b()) {
                    final eew o2 = this.o;
                    eco c2;
                    if (this.g) {
                        c2 = eco.b;
                    }
                    else {
                        c2 = eco.a;
                    }
                    o2.c = c2;
                    this.o.b();
                    final float[] k = this.t.i;
                    final float[] m = this.k;
                    final float[] j2 = this.j;
                    final float a = this.o.a;
                    final float[] a2 = eci.a;
                    final float n7 = j2[0];
                    final float n8 = m[0];
                    k[0] = (n7 - n8) * a + n8;
                    final float n9 = j2[1];
                    final float n10 = m[1];
                    k[1] = (n9 - n10) * a + n10;
                    final float n11 = j2[2];
                    final float n12 = m[2];
                    k[2] = (n11 - n12) * a + n12;
                    final eew n13 = this.n;
                    ecr c3;
                    if (this.l) {
                        c3 = ecr.i;
                    }
                    else {
                        c3 = this.e;
                    }
                    n13.c = c3;
                    this.n.b();
                    if (this.l) {
                        this.m.b();
                        this.d(ecr.i, b2, c, n6);
                        this.d(ecr.j, b2, c, n6);
                    }
                    else if (this.n.b != ecr.a) {
                        if (this.f != this.n.b) {
                            this.m.a();
                        }
                        this.m.b();
                        this.d((ecr)this.n.b, b2, c, n6);
                    }
                    this.f = (ecr)this.n.b;
                }
            }
        }
    }
    
    @Override
    public final void c(final int n, final int n2) {
        final efa r = this.r;
        if (r != null) {
            r.c((float)n, (float)n2);
        }
        final eey s = this.s;
        if (s != null) {
            s.c((float)n, (float)n2);
        }
        final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
        bitmapFactory$Options.inScaled = false;
        final Bitmap decodeResource = BitmapFactory.decodeResource(this.w.getResources(), 2131231189, bitmapFactory$Options);
        this.a[2] = new ecn();
        this.a[2].a = new Texture(decodeResource);
        this.a[2].c = (float)(decodeResource.getHeight() / decodeResource.getWidth());
        this.a[2].b = 0.12f;
        final Bitmap decodeResource2 = BitmapFactory.decodeResource(this.w.getResources(), 2131231334, bitmapFactory$Options);
        this.a[1] = new ecn();
        this.a[1].a = new Texture(decodeResource2);
        this.a[1].c = (float)(decodeResource2.getHeight() / decodeResource2.getWidth());
        this.a[1].b = 0.075f;
        final Bitmap decodeResource3 = BitmapFactory.decodeResource(this.w.getResources(), 2131231333, bitmapFactory$Options);
        this.a[0] = new ecn();
        this.a[0].a = new Texture(decodeResource3);
        this.a[0].c = (float)(decodeResource3.getHeight() / decodeResource3.getWidth());
        this.a[0].b = 0.075f;
    }
}
