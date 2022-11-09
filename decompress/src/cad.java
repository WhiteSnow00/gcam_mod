import android.hardware.camera2.CaptureResult;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import android.graphics.Rect;
import android.hardware.camera2.params.Face;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.google.android.apps.camera.jni.federatedphoto.ModeSuggestionClient;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cad implements cvd, hpb
{
    public ModeSuggestionClient a;
    public bzm b;
    public bzl c;
    private final cxl d;
    private final niz e;
    private final bxv f;
    
    public cad(final cxl d, final niz e, final bxv f) {
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final void a() {
    }
    
    @Override
    public final void b(final hph hph) {
    }
    
    @Override
    public final void c(final lfg lfg) {
        final bzl c = this.c;
        c.c = niz.h(lfg.l());
        c.e = niz.h(lfg.h());
        c.a.clear();
    }
    
    @Override
    public final void g(final long n, Map oky) {
        this.b.c((Map)oky);
        final okt m = oga.i.m();
        final niz b = this.b.b();
        if (b.g()) {
            final Iterable iterable = (Iterable)b.c();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final oga oga = (oga)m.b;
            final ole b2 = oga.b;
            if (!b2.c()) {
                oga.b = oky.w(b2);
            }
            ojf.e(iterable, oga.b);
        }
        final niz a = this.b.a();
        if (a.g()) {
            final Iterable iterable2 = (Iterable)a.c();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final oga oga2 = (oga)m.b;
            final ole c = oga2.c;
            if (!c.c()) {
                oga2.c = oky.w(c);
            }
            ojf.e(iterable2, oga2.c);
        }
        final boolean g = this.c.c.g();
        final int n2 = 1;
        float floatValue;
        if (g) {
            Float n3;
            if (this.c.c.c() == lfu.a) {
                n3 = (Float)this.d.g(cxv.b).c();
            }
            else {
                n3 = (Float)this.d.g(cxv.c).c();
            }
            floatValue = n3;
            int f;
            if (this.c.c.c() == lfu.a) {
                f = 1;
            }
            else {
                f = 0;
            }
            if (m.c) {
                m.m();
                m.c = false;
            }
            final oga oga3 = (oga)m.b;
            oga3.a |= 0x4;
            oga3.f = f;
        }
        else {
            floatValue = 4.9411428E7f;
        }
        final okt i = ogb.d.m();
        final ArrayList list = new ArrayList(this.c.a);
        if (i.c) {
            i.m();
            i.c = false;
        }
        final ogb ogb = (ogb)i.b;
        final ole b3 = ogb.b;
        if (!b3.c()) {
            ogb.b = oky.w(b3);
        }
        ojf.e(list, ogb.b);
        if (i.c) {
            i.m();
            i.c = false;
        }
        final ogb ogb2 = (ogb)i.b;
        ogb2.a |= 0x1;
        ogb2.c = floatValue;
        if (m.c) {
            m.m();
            m.c = false;
        }
        final oga oga4 = (oga)m.b;
        final ogb e = (ogb)i.h();
        e.getClass();
        oga4.e = e;
        oga4.a |= 0x2;
        final bzl c2 = this.c;
        niz niz;
        if (c2.d.g() && c2.e.g()) {
            final Face[] array = (Face[])c2.d.c();
            final float n4 = (float)((Rect)c2.e.c()).width();
            final float n5 = (float)((Rect)c2.e.c()).height();
            Arrays.sort(array, bzj.a);
            final int min = Math.min(array.length, 10);
            final ArrayList list2 = new ArrayList();
            for (int j = 0; j < min; ++j) {
                final Rect bounds = array[j].getBounds();
                list2.add(new bzk(bounds.width() / n4, bounds.height() / n5, bounds.centerX() / n4, bounds.centerY() / n5));
            }
            niz = niz.i(list2);
        }
        else {
            niz = nii.a;
        }
        if (niz.g()) {
            for (final bzk bzk : (List)niz.c()) {
                final okt k = ogc.d.m();
                final float a2 = bzk.a;
                if (k.c) {
                    k.m();
                    k.c = false;
                }
                final ogc ogc = (ogc)k.b;
                final int a3 = ogc.a | 0x1;
                ogc.a = a3;
                ogc.b = a2;
                final float b4 = bzk.b;
                ogc.a = (a3 | 0x2);
                ogc.c = b4;
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final oga oga5 = (oga)m.b;
                final ogc ogc2 = (ogc)k.h();
                ogc2.getClass();
                final olj g2 = oga5.g;
                if (!g2.c()) {
                    oga5.g = oky.C(g2);
                }
                oga5.g.add(ogc2);
            }
        }
        if (!((dlc)((njd)this.e).a).e()) {
            final okt l = oge.b.m();
            final List b5 = dnw.b((dlc)((njd)this.e).a, 10);
            Collections.reverse(b5);
            final Iterator iterator2 = b5.iterator();
            while (iterator2.hasNext()) {
                final fja a4 = fja.a((dkz)iterator2.next());
                final okt m2 = ogd.e.m();
                final float c3 = a4.c;
                if (m2.c) {
                    m2.m();
                    m2.c = false;
                }
                final ogd ogd = (ogd)m2.b;
                final int a5 = ogd.a | 0x1;
                ogd.a = a5;
                ogd.b = c3;
                final float b6 = a4.b;
                final int a6 = a5 | 0x2;
                ogd.a = a6;
                ogd.c = b6;
                final int a7 = a4.a;
                ogd.a = (a6 | 0x4);
                ogd.d = (float)a7;
                if (l.c) {
                    l.m();
                    l.c = false;
                }
                final oge oge = (oge)l.b;
                final ogd ogd2 = (ogd)m2.h();
                ogd2.getClass();
                final olj a8 = oge.a;
                if (!a8.c()) {
                    oge.a = oky.C(a8);
                }
                oge.a.add(ogd2);
            }
            final oge d = (oge)l.h();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final oga oga6 = (oga)m.b;
            d.getClass();
            oga6.d = d;
            oga6.a |= 0x1;
        }
        oky = m.h();
        final ModeSuggestionClient a9 = this.a;
        njo.p(a9.c ^ true, "ModeSuggestionClient is closed");
        final byte[] nativeProcess = a9.nativeProcess(a9.b, oky.g());
        try {
            oky = oky.t(oga.i, nativeProcess, okm.b());
        }
        catch (final olm olm) {
            a.l(ModeSuggestionClient.a.b(), "Proto serialization error.", '\u049b');
        }
        ogg ogg;
        if ((ogg = ((oga)oky).h) == null) {
            ogg = ogg.b;
        }
        ogf ogf;
        if ((ogf = ogg.a) == null) {
            ogf = ogf.c;
        }
        final bxv f2 = this.f;
        int a10 = okn.A(ogf.b);
        if (a10 == 0) {
            a10 = n2;
        }
        jbm jbm = null;
        switch (a10 - 1) {
            default: {
                jbm = jbm.b;
                break;
            }
            case 3: {
                jbm = jbm.g;
                break;
            }
            case 2: {
                jbm = jbm.d;
                break;
            }
            case 1: {
                jbm = jbm.m;
                break;
            }
        }
        f2.bn(jbm, ogf.a);
    }
    
    @Override
    public final void h(final ljm ljm) {
        final bzl c = this.c;
        if (!c.e.g()) {
            return;
        }
        c.b = niz.i(new gzn(ljm, 0, (Rect)c.e.c()));
        c.a.add(((gzn)c.b.c()).c * 1.0E-6f * ((gzn)c.b.c()).f * ((gzn)c.b.c()).e);
        c.d = niz.h(ljm.d(CaptureResult.STATISTICS_FACES));
    }
    
    @Override
    public final void t() {
    }
    
    @Override
    public final void u() {
    }
}
