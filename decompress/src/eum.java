import android.graphics.Point;
import java.util.concurrent.TimeUnit;
import com.google.android.libraries.lens.lenslite.api.LinkChipResult;

// 
// Decompiled by Procyon v0.6.0
// 

final class eum
{
    private final euk a;
    private final eyt b;
    private final lmo c;
    
    public eum(final euk a, final eyt b, final lmo c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    final void a(final LinkChipResult linkChipResult, final lqo lqo, int resultType, final String e) {
        int n = resultType;
        if (resultType == 3) {
            final euk a = this.a;
            if ((long)a.b.aQ() == 0L) {
                a.b.aR(System.currentTimeMillis());
                n = 3;
            }
            else {
                n = 3;
            }
        }
        final okt m = nzx.e.m();
        resultType = linkChipResult.getResultType();
        resultType = (new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 })[resultType];
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzx nzx = (nzx)m.b;
        if (resultType == 0) {
            throw null;
        }
        nzx.b = resultType - 1;
        final int a2 = nzx.a;
        resultType = 1;
        nzx.a = (a2 | 0x1);
        final int n2 = (new int[] { 1, 2, 3, 4 })[linkChipResult.getActionType()];
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nzx nzx2 = (nzx)m.b;
        if (n2 != 0) {
            nzx2.c = n2 - 1;
            nzx2.a |= 0x2;
            if (linkChipResult.getCenterpoint() != null) {
                final okt i = nzn.d.m();
                final Point centerpoint = linkChipResult.getCenterpoint();
                centerpoint.getClass();
                final float b = (float)centerpoint.x;
                if (i.c) {
                    i.m();
                    i.c = false;
                }
                final nzn nzn = (nzn)i.b;
                nzn.a |= 0x1;
                nzn.b = b;
                final Point centerpoint2 = linkChipResult.getCenterpoint();
                centerpoint2.getClass();
                final float c = (float)centerpoint2.y;
                if (i.c) {
                    i.m();
                    i.c = false;
                }
                final nzn nzn2 = (nzn)i.b;
                nzn2.a |= 0x2;
                nzn2.c = c;
                final nzn d = (nzn)i.h();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final nzx nzx3 = (nzx)m.b;
                d.getClass();
                nzx3.d = d;
                nzx3.a |= 0x4;
            }
            final nzx b2 = (nzx)m.h();
            final long longValue = (long)this.a.b.aQ();
            niz niz;
            if (longValue == 0L) {
                niz = nii.a;
            }
            else {
                niz = niz.i(longValue);
            }
            final okt j = nzw.h.m();
            if (j.c) {
                j.m();
                j.c = false;
            }
            final nzw nzw = (nzw)j.b;
            b2.getClass();
            nzw.b = b2;
            final int a3 = nzw.a | 0x1;
            nzw.a = a3;
            nzw.c = n - 1;
            nzw.a = (a3 | 0x2);
            final long currentTimeMillis = System.currentTimeMillis();
            if (j.c) {
                j.m();
                j.c = false;
            }
            final nzw nzw2 = (nzw)j.b;
            nzw2.a |= 0x10;
            nzw2.f = currentTimeMillis;
            final TimeUnit nanoseconds = TimeUnit.NANOSECONDS;
            lqn lqn;
            if ((lqn = lqo.b) == null) {
                lqn = lqn.b;
            }
            final long millis = nanoseconds.toMillis(lqn.a);
            if (j.c) {
                j.m();
                j.c = false;
            }
            final nzw nzw3 = (nzw)j.b;
            nzw3.a |= 0x20;
            nzw3.g = millis;
            if (niz.g()) {
                final long longValue2 = (long)niz.c();
                if (j.c) {
                    j.m();
                    j.c = false;
                }
                final nzw nzw4 = (nzw)j.b;
                nzw4.a |= 0x8;
                nzw4.e = longValue2;
            }
            lqm lqm;
            if ((lqm = lqo.c) == null) {
                lqm = lqm.d;
            }
            ncf ncf;
            if ((ncf = lqm.b) == null) {
                ncf = ncf.b;
            }
            if (ncf.a.size() > 0) {
                lqm lqm2;
                if ((lqm2 = lqo.c) == null) {
                    lqm2 = lqm.d;
                }
                ncf ncf2;
                if ((ncf2 = lqm2.b) == null) {
                    ncf2 = ncf.b;
                }
                final int a4 = nfw.a(ncf2.a.get(0).a);
                if (a4 != 0) {
                    resultType = a4;
                }
                ofi.E();
                resultType = ofi.E()[resultType - 1];
                if (j.c) {
                    j.m();
                    j.c = false;
                }
                final nzw nzw5 = (nzw)j.b;
                if (resultType == 0) {
                    throw null;
                }
                nzw5.d = resultType - 1;
                nzw5.a |= 0x4;
            }
            final eyt b3 = this.b;
            final okt k = nzy.f.m();
            if (k.c) {
                k.m();
                k.c = false;
            }
            final nzy nzy = (nzy)k.b;
            e.getClass();
            nzy.a |= 0x8;
            nzy.e = e;
            final nzw c2 = (nzw)j.h();
            if (k.c) {
                k.m();
                k.c = false;
            }
            final nzy nzy2 = (nzy)k.b;
            c2.getClass();
            nzy2.c = c2;
            nzy2.a |= 0x2;
            b3.q((nzy)k.h());
            return;
        }
        throw null;
    }
}
