import java.io.IOException;
import java.util.concurrent.TimeoutException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cqs
{
    public final eyt a;
    public final ckn b;
    public final cek c;
    public final hzg d;
    public final hwl e;
    private final cfm f;
    
    public cqs(final eyt a, final ckn b, final cek c, final hzg d, final cfm f, final hwl e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = f;
        this.e = e;
    }
    
    public static int c(final jbm jbm, final boolean b) {
        final clp a = clp.a;
        final kov a2 = kov.a;
        final jbm a3 = jbm.a;
        switch (jbm.ordinal()) {
            default: {
                final String value = String.valueOf(jbm);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 24);
                sb.append("Not a valid video mode: ");
                sb.append(value);
                throw new IllegalArgumentException(sb.toString());
            }
            case 13: {
                if (b) {
                    return 34;
                }
                return 11;
            }
            case 8: {
                return 21;
            }
            case 5: {
                if (b) {
                    return 33;
                }
                return 24;
            }
            case 2: {
                if (b) {
                    return 10;
                }
                return 9;
            }
        }
    }
    
    public final void a(final Throwable t, final lfu lfu) {
        int n;
        if (t instanceof TimeoutException) {
            n = 3;
        }
        else if (t instanceof IllegalStateException) {
            n = 4;
        }
        else if (t instanceof IOException) {
            n = 5;
        }
        else {
            n = 1;
        }
        final cfg a = this.f.a();
        final okt m = obt.g.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final obt obt = (obt)m.b;
        obt.e = n - 1;
        obt.a |= 0x8;
        this.a.am(c(this.c.a(), true), lfu, null, (float)a.b.aQ(), (boolean)((kkz)a.e).d, -1.0f, (obt)m.h(), this.d.c().j, false);
    }
    
    public final void b(final cgh cgh, final lfu lfu) {
        final cfg a = this.f.a();
        final okt m = obt.g.m();
        final int b = cgh.e.b;
        if (m.c) {
            m.m();
            m.c = false;
        }
        final obt obt = (obt)m.b;
        final int a2 = obt.a | 0x1;
        obt.a = a2;
        obt.b = b;
        final int a3 = cgh.e.a;
        final int a4 = a2 | 0x2;
        obt.a = a4;
        obt.c = a3;
        final int g = cgh.g;
        final int a5 = a4 | 0x4;
        obt.a = a5;
        obt.d = g;
        obt.e = 1;
        final int a6 = a5 | 0x8;
        obt.a = a6;
        final long f = cgh.f;
        obt.a = (a6 | 0x10);
        obt.f = (int)f;
        final obt obt2 = (obt)m.h();
        final eyt a7 = this.a;
        final int c = c(this.c.a(), true);
        cgh.b.getName();
        a7.am(c, lfu, cgh.a, (float)a.b.aQ(), (boolean)((kkz)a.e).d, (float)(cgh.f / 1000L), obt2, this.d.c().j, cgh.d.d == hip.b);
    }
}
