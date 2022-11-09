import android.graphics.Path$Direction;
import android.graphics.Path$Op;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Matrix;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nfk
{
    private final nfq[] a;
    private final Matrix[] b;
    private final Matrix[] c;
    private final PointF d;
    private final Path e;
    private final Path f;
    private final nfq g;
    private final float[] h;
    private final float[] i;
    private final Path j;
    private final Path k;
    private boolean l;
    
    public nfk() {
        this.a = new nfq[4];
        this.b = new Matrix[4];
        this.c = new Matrix[4];
        this.d = new PointF();
        this.e = new Path();
        this.f = new Path();
        this.g = new nfq();
        this.h = new float[2];
        this.i = new float[2];
        this.j = new Path();
        this.k = new Path();
        this.l = true;
        for (int i = 0; i < 4; ++i) {
            this.a[i] = new nfq();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }
    
    private final boolean b(final Path path, final int n) {
        this.k.reset();
        this.a[n].c(this.b[n], this.k);
        final RectF rectF = new RectF();
        final boolean b = true;
        path.computeBounds(rectF, true);
        this.k.computeBounds(rectF, true);
        path.op(this.k, Path$Op.INTERSECT);
        path.computeBounds(rectF, true);
        boolean b2 = b;
        if (rectF.isEmpty()) {
            if (rectF.width() > 1.0f) {
                if (rectF.height() <= 1.0f) {
                    return false;
                }
                b2 = b;
            }
            else {
                b2 = false;
            }
        }
        return b2;
    }
    
    private static final float c(final int n) {
        return (float)((n + 1) * 90);
    }
    
    public final void a(final nfi nfi, float max, final RectF rectF, final nfb nfb, final Path path) {
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path$Direction.CW);
        for (int i = 0; i < 4; ++i) {
            ney ney = null;
            switch (i) {
                default: {
                    ney = nfi.b;
                    break;
                }
                case 3: {
                    ney = nfi.a;
                    break;
                }
                case 2: {
                    ney = nfi.d;
                    break;
                }
                case 1: {
                    ney = nfi.c;
                    break;
                }
            }
            njo njo = null;
            switch (i) {
                default: {
                    njo = nfi.j;
                    break;
                }
                case 3: {
                    njo = nfi.i;
                    break;
                }
                case 2: {
                    njo = nfi.l;
                    break;
                }
                case 1: {
                    njo = nfi.k;
                    break;
                }
            }
            njo.a(this.a[i], max, ney.a(rectF));
            final float c = c(i);
            this.b[i].reset();
            final PointF d = this.d;
            switch (i) {
                default: {
                    d.set(rectF.right, rectF.top);
                    break;
                }
                case 3: {
                    d.set(rectF.left, rectF.top);
                    break;
                }
                case 2: {
                    d.set(rectF.left, rectF.bottom);
                    break;
                }
                case 1: {
                    d.set(rectF.right, rectF.bottom);
                    break;
                }
            }
            this.b[i].setTranslate(this.d.x, this.d.y);
            this.b[i].preRotate(c);
            final float[] h = this.h;
            final nfq nfq = this.a[i];
            h[0] = nfq.b;
            h[1] = nfq.c;
            this.b[i].mapPoints(h);
            this.c[i].reset();
            final Matrix matrix = this.c[i];
            final float[] h2 = this.h;
            matrix.setTranslate(h2[0], h2[1]);
            this.c[i].preRotate(c(i));
        }
        int n;
        for (int j = 0; j < 4; j = n) {
            final float[] h3 = this.h;
            final nfq nfq2 = this.a[j];
            h3[0] = 0.0f;
            h3[1] = nfq2.a;
            this.b[j].mapPoints(h3);
            if (j == 0) {
                final float[] h4 = this.h;
                path.moveTo(h4[0], h4[1]);
            }
            else {
                final float[] h5 = this.h;
                path.lineTo(h5[0], h5[1]);
            }
            this.a[j].c(this.b[j], path);
            if (nfb != null) {
                final nfq nfq3 = this.a[j];
                final Matrix matrix2 = this.b[j];
                nfb.a.d.set(j, false);
                nfb.a.b[j] = nfq3.a(matrix2);
            }
            n = j + 1;
            final int n2 = n % 4;
            final float[] h6 = this.h;
            final nfq nfq4 = this.a[j];
            h6[0] = nfq4.b;
            h6[1] = nfq4.c;
            this.b[j].mapPoints(h6);
            final float[] k = this.i;
            final nfq nfq5 = this.a[n2];
            k[0] = 0.0f;
            k[1] = nfq5.a;
            this.b[n2].mapPoints(k);
            final float[] h7 = this.h;
            max = h7[0];
            final float[] l = this.i;
            max = Math.max((float)Math.hypot(max - l[0], h7[1] - l[1]) - 0.001f, 0.0f);
            final float[] h8 = this.h;
            final nfq nfq6 = this.a[j];
            h8[0] = nfq6.b;
            h8[1] = nfq6.c;
            this.b[j].mapPoints(h8);
            switch (j) {
                default: {
                    Math.abs(rectF.centerY() - this.h[1]);
                    break;
                }
                case 1:
                case 3: {
                    Math.abs(rectF.centerX() - this.h[0]);
                    break;
                }
            }
            this.g.e();
            switch (j) {
                default: {
                    final nfa f = nfi.f;
                    break;
                }
                case 3: {
                    final nfa e = nfi.e;
                    break;
                }
                case 2: {
                    final nfa h9 = nfi.h;
                    break;
                }
                case 1: {
                    final nfa g = nfi.g;
                    break;
                }
            }
            this.g.d(max, 0.0f);
            this.j.reset();
            this.g.c(this.c[j], this.j);
            Label_1117: {
                if (this.l) {
                    final Path m = this.j;
                    final int n3 = j;
                    if (this.b(m, n3) || this.b(this.j, n2)) {
                        final Path j2 = this.j;
                        j2.op(j2, this.f, Path$Op.DIFFERENCE);
                        final float[] h10 = this.h;
                        h10[0] = 0.0f;
                        h10[1] = this.g.a;
                        this.c[n3].mapPoints(h10);
                        final Path e2 = this.e;
                        final float[] h11 = this.h;
                        e2.moveTo(h11[0], h11[1]);
                        this.g.c(this.c[n3], this.e);
                        break Label_1117;
                    }
                }
                this.g.c(this.c[j], path);
            }
            if (nfb != null) {
                final nfq g2 = this.g;
                final Matrix matrix3 = this.c[j];
                nfb.a.d.set(j + 4, false);
                nfb.a.c[j] = g2.a(matrix3);
            }
        }
        path.close();
        this.e.close();
        if (!this.e.isEmpty()) {
            path.op(this.e, Path$Op.UNION);
        }
    }
}
