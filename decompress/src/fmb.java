import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fmb
{
    private final fls a;
    private final krr b;
    
    public fmb(final fls a, final krq krq) {
        this.a = a;
        this.b = krq.a("CptModuleCfgBldr");
    }
    
    public final flq a(final lfj a, final jbm jbm) {
        final fls a2 = this.a;
        a2.a.f("OneConfig#create");
        a2.a.f("OneConfig#oneCharacteristics");
        final fxu f = a2.d.f(a);
        final lfu l = f.l();
        a2.a.h("OneConfig#pictureSize");
        final kre a3 = a2.b.a(a, l);
        a2.a.h("OneConfig#selectViewfinder");
        final List w = f.w();
        final kqp g = kqp.g(a3);
        final int c = g.c;
        final int d = g.d;
        final ixp c2 = a2.c;
        final double n = c;
        final double n2 = d;
        Double.isNaN(n);
        Double.isNaN(n2);
        final kre b = c2.b(w, n / n2, l, jbm, a);
        final ixs a4 = ixs.a(l, b, kqp.g(b));
        a2.a.g();
        final kqp g2 = kqp.g(a3);
        final flp flp = new flp();
        flp.a = a;
        if (l != null) {
            flp.b = l;
            flp.c = g2;
            flp.d = a3;
            flp.e = a4;
            final lfj a5 = flp.a;
            if (a5 != null) {
                final lfu b2 = flp.b;
                if (b2 != null) {
                    final kqp c3 = flp.c;
                    if (c3 != null) {
                        final kre d2 = flp.d;
                        if (d2 != null) {
                            final ixs e = flp.e;
                            if (e != null) {
                                final flq flq = new flq(a5, b2, c3, d2, e);
                                a2.a.g();
                                final krr b3 = this.b;
                                final String value = String.valueOf(a);
                                final String value2 = String.valueOf(flq);
                                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 38 + String.valueOf(value2).length());
                                sb.append("Selected configuration for camera (");
                                sb.append(value);
                                sb.append("): ");
                                sb.append(value2);
                                b3.f(sb.toString());
                                return flq;
                            }
                        }
                    }
                }
            }
            final StringBuilder sb2 = new StringBuilder();
            if (flp.a == null) {
                sb2.append(" cameraId");
            }
            if (flp.b == null) {
                sb2.append(" cameraFacing");
            }
            if (flp.c == null) {
                sb2.append(" aspectRatio");
            }
            if (flp.d == null) {
                sb2.append(" captureResolution");
            }
            if (flp.e == null) {
                sb2.append(" viewfinderConfig");
            }
            final String value3 = String.valueOf(sb2);
            final StringBuilder sb3 = new StringBuilder(String.valueOf(value3).length() + 28);
            sb3.append("Missing required properties:");
            sb3.append(value3);
            throw new IllegalStateException(sb3.toString());
        }
        throw new NullPointerException("Null cameraFacing");
    }
}
