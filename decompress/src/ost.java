import android.util.Log;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ost
{
    static final nxg a;
    static nxg b;
    public static final nxg c;
    
    static {
        final okt m = nxg.u.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxg nxg = (nxg)m.b;
        final int a2 = nxg.a | 0x2;
        nxg.a = a2;
        nxg.b = true;
        final int a3 = a2 | 0x4;
        nxg.a = a3;
        nxg.c = true;
        final int a4 = a3 | 0x200;
        nxg.a = a4;
        nxg.j = true;
        final int a5 = a4 | 0x8;
        nxg.a = a5;
        nxg.d = true;
        final int a6 = a5 | 0x10;
        nxg.a = a6;
        nxg.e = true;
        nxg.f = 1;
        nxg.a = (a6 | 0x20);
        final nxe a7 = nxe.a;
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxg nxg2 = (nxg)m.b;
        a7.getClass();
        nxg2.g = a7;
        final int a8 = nxg2.a | 0x40;
        nxg2.a = a8;
        final int a9 = a8 | 0x80;
        nxg2.a = a9;
        nxg2.h = true;
        final int a10 = a9 | 0x100;
        nxg2.a = a10;
        nxg2.i = true;
        final int a11 = a10 | 0x400;
        nxg2.a = a11;
        nxg2.k = true;
        final int a12 = a11 | 0x800;
        nxg2.a = a12;
        nxg2.l = true;
        final int a13 = a12 | 0x8000;
        nxg2.a = a13;
        nxg2.o = true;
        final int a14 = a13 | 0x1000;
        nxg2.a = a14;
        nxg2.m = true;
        nxg2.a = (a14 | 0x2000);
        nxg2.n = true;
        final nxf a15 = nxf.a;
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxg nxg3 = (nxg)m.b;
        a15.getClass();
        nxg3.p = a15;
        final int a16 = nxg3.a | 0x10000;
        nxg3.a = a16;
        final int a17 = a16 | 0x40000;
        nxg3.a = a17;
        nxg3.r = true;
        final int a18 = a17 | 0x20000;
        nxg3.a = a18;
        nxg3.q = true;
        final int a19 = a18 | 0x80000;
        nxg3.a = a19;
        nxg3.s = true;
        nxg3.a = (a19 | 0x100000);
        nxg3.t = true;
        nxg.b(nxg3);
        a = (nxg)m.h();
        final okt i = nxg.u.m();
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nxg nxg4 = (nxg)i.b;
        final int a20 = nxg4.a | 0x2;
        nxg4.a = a20;
        nxg4.b = false;
        final int a21 = a20 | 0x4;
        nxg4.a = a21;
        nxg4.c = false;
        final int a22 = a21 | 0x200;
        nxg4.a = a22;
        nxg4.j = false;
        final int a23 = a22 | 0x8;
        nxg4.a = a23;
        nxg4.d = false;
        final int a24 = a23 | 0x10;
        nxg4.a = a24;
        nxg4.e = false;
        nxg4.f = 3;
        final int a25 = a24 | 0x20;
        nxg4.a = a25;
        final int a26 = a25 | 0x80;
        nxg4.a = a26;
        nxg4.h = false;
        final int a27 = a26 | 0x100;
        nxg4.a = a27;
        nxg4.i = false;
        final int a28 = a27 | 0x400;
        nxg4.a = a28;
        nxg4.k = false;
        final int a29 = a28 | 0x800;
        nxg4.a = a29;
        nxg4.l = false;
        final int a30 = a29 | 0x8000;
        nxg4.a = a30;
        nxg4.o = false;
        final int a31 = a30 | 0x1000;
        nxg4.a = a31;
        nxg4.m = false;
        final int a32 = a31 | 0x2000;
        nxg4.a = a32;
        nxg4.n = false;
        final int a33 = a32 | 0x40000;
        nxg4.a = a33;
        nxg4.r = false;
        final int a34 = a33 | 0x20000;
        nxg4.a = a34;
        nxg4.q = false;
        final int a35 = a34 | 0x80000;
        nxg4.a = a35;
        nxg4.s = false;
        nxg4.a = (a35 | 0x100000);
        nxg4.t = false;
        nxg.b(nxg4);
        c = (nxg)i.h();
    }
    
    public static nxg a(final Context context) {
        synchronized (ost.class) {
            final nxg b = ost.b;
            if (b != null) {
                return b;
            }
            monitorexit(ost.class);
            final osi g = psn.g(context);
            final okt m = ota.d.m();
            final nxg a = ost.a;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final ota ota = (ota)m.b;
            a.getClass();
            ota.c = a;
            final int a2 = ota.a | 0x2;
            ota.a = a2;
            ota.a = (a2 | 0x1);
            ota.b = "1.218.0";
            nxg b2 = g.a((ota)m.h());
            if (b2 == null) {
                Log.w("SdkConfigurationReader", "VrParamsProvider returned null params, using defaults.");
                b2 = ost.c;
            }
            else {
                String.valueOf(String.valueOf(b2)).length();
            }
            synchronized (ost.class) {
                ost.b = b2;
                monitorexit(ost.class);
                g.e();
                return ost.b;
            }
        }
    }
}
