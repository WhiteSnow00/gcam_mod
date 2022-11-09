import java.util.Iterator;
import android.hardware.camera2.CameraCharacteristics;
import android.util.SizeF;
import java.util.Collection;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import android.graphics.Rect;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gir extends kmg
{
    private static final nsd a;
    private final List b;
    private final float c;
    private final double d;
    private final int e;
    private final int f;
    private final int g;
    private final lfu h;
    private final Rect i;
    private boolean j;
    private giq k;
    
    static {
        a = nsd.g("com/google/android/apps/camera/one/zoom/api/MultiCropRegion");
    }
    
    public gir(final klj klj, final klj klj2, final lfg lfg, final cxl cxl, final lfh lfh) {
        this(klj, klj2, lfg, kqp.a, cxl, lfh);
    }
    
    public gir(final klj klj, final klj klj2, final lfg lfg, final kqp kqp, final cxl cxl, final lfh lfh) {
        super(klj2);
        lfg.j();
        List t;
        if (g(lfg, cxl)) {
            t = new ArrayList();
            final Iterator iterator = lfg.z().iterator();
            while (iterator.hasNext()) {
                final lfg a = lfh.a((lfj)iterator.next());
                a.t().get(0);
                t.add(a.t().get(0));
            }
            Collections.sort((List<Object>)t, bzj.i);
        }
        else {
            lfg.j();
            t = lfg.t();
        }
        this.b = t;
        final boolean empty = t.isEmpty();
        final boolean b = true;
        njo.e(empty ^ true, "Must have at least one focal length.");
        float c;
        if (g(lfg, cxl)) {
            c = t.get(t.size() / 2);
        }
        else {
            c = Collections.min((Collection<? extends Float>)t);
        }
        this.c = c;
        njo.i(c > 0.0f, "Reference focal length cannot be zero (%s)", c);
        final SizeF sizeF = (SizeF)lfg.o(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        float n;
        if (kqp.j(kqp.b)) {
            n = kqp.a(sizeF.getWidth());
        }
        else {
            n = sizeF.getHeight();
        }
        final double hypot = Math.hypot(sizeF.getWidth(), n);
        this.d = hypot;
        njo.i(hypot > 0.0 && b, "Invalid sensor size: %s", hypot);
        final Rect h = lfg.h();
        final int n2 = (int)kqp.a((float)h.width());
        this.e = h.width() / 2;
        this.f = n2 / 2;
        final int g = (h.height() - n2) / 2;
        this.g = g;
        this.i = new Rect(0, g, h.width(), n2 + g);
        this.h = lfg.l();
        this.k = this.e((Float)klj.aQ());
    }
    
    public static boolean g(final lfg lfg, final cxl cxl) {
        return lfg.I() && cxl.k(cxr.R);
    }
    
    public final giq d() {
        synchronized (this) {
            return this.e(1.0f);
        }
    }
    
    protected final giq e(final Float n) {
        monitorenter(this);
        try {
            if (!Float.isNaN(n) && n > 0.0f) {
                if (!this.j) {
                    final float floatValue = n;
                    final double d = this.d;
                    final boolean b = true;
                    njo.i(d > 0.0, "Invalid sensor size: %s", d);
                    final double d2 = this.d;
                    final float c = this.c;
                    final double n2 = floatValue;
                    Double.isNaN(n2);
                    final double a = lfe.a(c, d2 / n2);
                    final double d3 = this.d;
                    njo.i(d3 > 0.0, "Diagonal size cannot be zero (%s)", d3);
                    njo.i(a > 0.0 && a < 6.283185307179586 && b, "Invalid AoV: %s", a);
                    final double tan = Math.tan(a / 2.0);
                    final float n3 = (float)(d3 / (tan + tan));
                    float n5 = 0.0f;
                    Label_0388: {
                        try {
                            final List b2 = this.b;
                            final double n4 = n3;
                            for (int i = b2.size() - 1; i >= 0; --i) {
                                n5 = b2.get(i);
                                final double n6 = n5;
                                if (n6 < n4) {
                                    break Label_0388;
                                }
                                Double.isNaN(n4);
                                Double.isNaN(n6);
                                if (Math.abs(n4 - n6) < 9.999999747378752E-6) {
                                    break Label_0388;
                                }
                            }
                            final StringBuilder sb = new StringBuilder(46);
                            sb.append("focal length needed = ");
                            sb.append(n4);
                            throw new IllegalStateException(sb.toString());
                        }
                        catch (final IllegalStateException ex) {
                            gir.a.b().h(ex).E(1828).D(n3, this.b);
                            n5 = this.b.get(0);
                        }
                    }
                    final double n7 = lfe.b(a, n5) / this.d;
                    final int e = this.e;
                    final double n8 = e;
                    Double.isNaN(n8);
                    final int n9 = (int)(n8 * n7 + 0.5);
                    final int f = this.f;
                    final double n10 = f;
                    Double.isNaN(n10);
                    final int n11 = (int)(n7 * n10 + 0.5);
                    final int n12 = this.g + f;
                    this.k = new giq(new Rect(e - n9, n12 - n11, e + n9, n12 + n11), this.i, n5);
                }
                final giq k = this.k;
                monitorexit(this);
                return k;
            }
            a.k(gir.a.c(), "Invalid zoom factor: %g", n, '\u0725');
            final giq j = this.k;
            monitorexit(this);
            return j;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void f(final lfu lfu) {
        synchronized (this) {
            if (lfu == this.h) {
                this.j = false;
                return;
            }
            this.j = true;
        }
    }
}
