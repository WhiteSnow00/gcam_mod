import android.graphics.PointF;
import android.graphics.Rect;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dkf
{
    public static final opd a(final gzn gzn, final float n, final float n2) {
        return b(gzn, null, n, n2);
    }
    
    public static final opd b(final gzn gzn, final dqn dqn, final float n, final float n2) {
        final Map c = gzn.C;
        final ArrayList list = new ArrayList();
        int n3 = 0;
        while (true) {
            final gzm[] p4 = gzn.p;
            if (n3 >= p4.length) {
                break;
            }
            final gzm gzm = p4[n3];
            final dqt dqt = c.get(gzm.i);
            final Rect a = gzm.a;
            final okt m = opa.f.m();
            final float n4 = (float)a.left;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final opa opa = (opa)m.b;
            opa.a |= 0x1;
            opa.b = n4 * n;
            final float n5 = (float)a.right;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final opa opa2 = (opa)m.b;
            opa2.a |= 0x4;
            opa2.d = n5 * n;
            final float n6 = (float)a.top;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final opa opa3 = (opa)m.b;
            opa3.a |= 0x2;
            opa3.c = n6 * n2;
            final float n7 = (float)a.bottom;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final opa opa4 = (opa)m.b;
            opa4.a |= 0x8;
            opa4.e = n7 * n2;
            final opa b = (opa)m.h();
            final ArrayList list2 = new ArrayList();
            c(1, gzm.c, list2, n, n2);
            c(2, gzm.d, list2, n, n2);
            c(46, gzm.e, list2, n, n2);
            c(10, gzm.f, list2, n, n2);
            c(241, gzm.g, list2, n, n2);
            c(242, gzm.h, list2, n, n2);
            final okv okv = (okv)opc.l.m();
            if (okv.c) {
                okv.m();
                okv.c = false;
            }
            final opc opc = (opc)okv.b;
            b.getClass();
            opc.b = b;
            final int a2 = opc.a | 0x1;
            opc.a = a2;
            final int b2 = gzm.b;
            final int a3 = a2 | 0x2;
            opc.a = a3;
            opc.d = b2 / 100.0f;
            final float j = gzm.j;
            final int a4 = a3 | 0x10;
            opc.a = a4;
            opc.h = j;
            final float k = gzm.k;
            final int a5 = a4 | 0x8;
            opc.a = a5;
            opc.g = k;
            final float l = gzm.l;
            opc.a = (a5 | 0x4);
            opc.e = l;
            final olj c2 = opc.c;
            if (!c2.c()) {
                opc.c = oky.C(c2);
            }
            ojf.e(list2, opc.c);
            final okt i = oqc.i.m();
            if (i.c) {
                i.m();
                i.c = false;
            }
            final oqc oqc = (oqc)i.b;
            oqc.a |= 0x4;
            oqc.d = 0.0f;
            final int i2 = gzm.i;
            if (i2 != -1) {
                final long j2 = i2;
                if (okv.c) {
                    okv.m();
                    okv.c = false;
                }
                final opc opc2 = (opc)okv.b;
                final int a6 = opc2.a | 0x40;
                opc2.a = a6;
                opc2.j = j2;
                final int i3 = gzm.i;
                opc2.a = (a6 | 0x80);
                opc2.k = i3;
                if (dqt != null) {
                    final okt m2 = oqd.d.m();
                    final nns b3 = dqt.b;
                    if (m2.c) {
                        m2.m();
                        m2.c = false;
                    }
                    final oqd oqd = (oqd)m2.b;
                    final ole b4 = oqd.b;
                    if (!b4.c()) {
                        oqd.b = oky.w(b4);
                    }
                    ojf.e(b3, oqd.b);
                    final float c3 = dqt.c;
                    if (m2.c) {
                        m2.m();
                        m2.c = false;
                    }
                    final oqd oqd2 = (oqd)m2.b;
                    oqd2.a |= 0x1;
                    oqd2.c = c3;
                    final oqd g = (oqd)m2.h();
                    if (i.c) {
                        i.m();
                        i.c = false;
                    }
                    final oqc oqc2 = (oqc)i.b;
                    g.getClass();
                    oqc2.g = g;
                    oqc2.a |= 0x20;
                }
            }
            okv.ap(oqc.j, i.h());
            list.add(okv.h());
            ++n3;
        }
        final okt m3 = opd.b.m();
        if (m3.c) {
            m3.m();
            m3.c = false;
        }
        final opd opd = (opd)m3.b;
        final olj a7 = opd.a;
        if (!a7.c()) {
            opd.a = oky.C(a7);
        }
        ojf.e(list, opd.a);
        return (opd)m3.h();
    }
    
    private static final void c(final int n, final PointF pointF, final ArrayList list, float y, final float n2) {
        if (pointF != null && pointF.x >= -1000.0f) {
            final okt m = opb.e.m();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final opb opb = (opb)m.b;
            opb.d = n - 1;
            opb.a |= 0x8;
            final float x = pointF.x;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final opb opb2 = (opb)m.b;
            opb2.a |= 0x1;
            opb2.b = y * x;
            y = pointF.y;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final opb opb3 = (opb)m.b;
            opb3.a |= 0x2;
            opb3.c = n2 * y;
            list.add(m.h());
        }
    }
}
