import java.util.List;
import java.util.Iterator;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.Locale;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fth implements fuu
{
    private final hae a;
    private final ddm b;
    private final krr c;
    private final int d;
    private final Map e;
    
    public fth(final hae a, final ddm b, final krr krr) {
        this.e = new HashMap();
        this.a = a;
        this.b = b;
        this.c = krr.a("MomentsMetadata");
        int d;
        if (!b.a.k(cxx.N)) {
            d = 2;
        }
        else {
            d = 3;
        }
        this.d = d;
    }
    
    private final ftg g(final him him) {
        synchronized (this) {
            if (!this.e.containsKey(him)) {
                this.e.put(him, new ftg());
            }
            final ftg ftg = this.e.get(him);
            ftg.getClass();
            return ftg;
        }
    }
    
    private final void h() {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList();
            final Iterator iterator = this.e.entrySet().iterator();
            int i;
            while (true) {
                final boolean hasNext = iterator.hasNext();
                i = 0;
                if (!hasNext) {
                    break;
                }
                final Map.Entry<K, ftg> entry = (Map.Entry<K, ftg>)iterator.next();
                final ftg ftg = entry.getValue();
                if (!ftg.c) {
                    continue;
                }
                final List f = ftg.f;
                if (f != null && f.isEmpty() && !ftg.a.isDone()) {
                    ftg.a.o(nii.a);
                }
                else {
                    if (ftg.f == null || (ftg.e == -1L && !ftg.d) || ftg.a.isDone()) {
                        continue;
                    }
                    final ofn a = ftg.a;
                    final him him = (him)entry.getKey();
                    final List f2 = ftg.f;
                    f2.getClass();
                    niz niz;
                    if (f2.isEmpty()) {
                        final krr c = this.c;
                        final String value = String.valueOf(him);
                        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 43);
                        sb.append("for ");
                        sb.append(value);
                        sb.append(": no alternatives, not adding metadata.");
                        c.b(sb.toString());
                        niz = nii.a;
                    }
                    else {
                        final krr c2 = this.c;
                        final String value2 = String.valueOf(him);
                        final int size = f2.size();
                        final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 37);
                        sb2.append("for ");
                        sb2.append(value2);
                        sb2.append(": ");
                        sb2.append(size);
                        sb2.append(" incoming timestamps");
                        c2.b(sb2.toString());
                        final okt m = ooq.f.m();
                        final int d = this.d;
                        if (m.c) {
                            m.m();
                            m.c = false;
                        }
                        final ooq ooq = (ooq)m.b;
                        ooq.a |= 0x2;
                        ooq.d = d;
                        float b;
                        if (!ftg.d) {
                            njo.o(ftg.e >= 0L);
                            final long e = ftg.e;
                            final had d2 = this.a.d(e);
                            if (d2 == null) {
                                final krr c3 = this.c;
                                final StringBuilder sb3 = new StringBuilder(108);
                                sb3.append("Score not found for frame ");
                                sb3.append(e);
                                sb3.append(" ... is the ringbuffer too small or we didn't even compute it?");
                                c3.h(sb3.toString());
                                b = -1.0f;
                            }
                            else {
                                b = d2.b;
                            }
                        }
                        else {
                            b = 0.0f;
                        }
                        for (final fvh fvh : f2) {
                            final long a2 = fvh.a;
                            final float b2 = fvh.b;
                            float a3;
                            if (ftg.d) {
                                if (this.d != 3) {
                                    final krr c4 = this.c;
                                    final StringBuilder sb4 = new StringBuilder(91);
                                    sb4.append("   for Long Shot frame ");
                                    sb4.append(a2);
                                    sb4.append(" the score ");
                                    sb4.append(b2);
                                    sb4.append(" is scaled by ");
                                    sb4.append(1.118259f);
                                    c4.b(sb4.toString());
                                    a3 = b2 * 1.118259f;
                                }
                                else {
                                    final float a4 = fjj.a.a(b2);
                                    this.c.b(String.format(Locale.US, "   Long Shot frame %d score is %f. Converted to confidence %f", a2, b2, a4));
                                    a3 = a4;
                                }
                            }
                            else if (this.d == 2) {
                                float n = b2;
                                if (b2 < 0.2f) {
                                    final krr c5 = this.c;
                                    final StringBuilder sb5 = new StringBuilder(122);
                                    sb5.append("   for frame ");
                                    sb5.append(a2);
                                    sb5.append(" set the score to 0 because the score ");
                                    sb5.append(b2);
                                    sb5.append(" is below the absolute threshold ");
                                    sb5.append(0.2f);
                                    c5.b(sb5.toString());
                                    n = 0.0f;
                                }
                                this.c.b(String.format(Locale.US, "   for Top Shot frame %d, the score %f is scaled by %f", a2, n, 0.7891367f));
                                a3 = n * 0.7891367f;
                            }
                            else {
                                float n2 = b2;
                                if (b2 < 0.2f) {
                                    final krr c6 = this.c;
                                    final StringBuilder sb6 = new StringBuilder(122);
                                    sb6.append("   for frame ");
                                    sb6.append(a2);
                                    sb6.append(" set the score to 0 because the score ");
                                    sb6.append(b2);
                                    sb6.append(" is below the absolute threshold ");
                                    sb6.append(0.2f);
                                    c6.b(sb6.toString());
                                    n2 = 0.0f;
                                }
                                final float n3 = n2 - b;
                                a3 = fjk.a(n3);
                                this.c.b(String.format(Locale.US, "   Top Shot frame %d score is %f. Shutter frame score is %f. The diff %f is converted to confidence %f", a2, n2, b, n3, a3));
                            }
                            i(a3);
                            final okt j = oop.d.m();
                            final long convert = TimeUnit.MICROSECONDS.convert(a2, TimeUnit.NANOSECONDS);
                            if (j.c) {
                                j.m();
                                j.c = false;
                            }
                            final oop oop = (oop)j.b;
                            final int a5 = oop.a | 0x1;
                            oop.a = a5;
                            oop.b = convert;
                            oop.a = (a5 | 0x2);
                            oop.c = a3;
                            final oop oop2 = (oop)j.h();
                            final krr c7 = this.c;
                            final long b3 = oop2.b;
                            final float c8 = oop2.c;
                            final StringBuilder sb7 = new StringBuilder(62);
                            sb7.append("   for frame ");
                            sb7.append(b3);
                            sb7.append(" adding score ");
                            sb7.append(c8);
                            c7.b(sb7.toString());
                            if (m.c) {
                                m.m();
                                m.c = false;
                            }
                            final ooq ooq2 = (ooq)m.b;
                            oop2.getClass();
                            final olj b4 = ooq2.b;
                            if (!b4.c()) {
                                ooq2.b = oky.C(b4);
                            }
                            ooq2.b.add(oop2);
                        }
                        if (!ftg.d) {
                            float c9;
                            if (this.d == 2) {
                                this.c.b(String.format(Locale.US, "   for Top Shot base frame %d, the score %f is scaled by %f", ftg.e, b, 0.7891367f));
                                c9 = b * 0.7891367f;
                            }
                            else {
                                c9 = 0.0f;
                            }
                            i(c9);
                            if (m.c) {
                                m.m();
                                m.c = false;
                            }
                            final ooq ooq3 = (ooq)m.b;
                            ooq3.a |= 0x1;
                            ooq3.c = c9;
                            final krr c10 = this.c;
                            final long e2 = ftg.e;
                            final StringBuilder sb8 = new StringBuilder(77);
                            sb8.append("   for the base frame at ");
                            sb8.append(e2);
                            sb8.append(" : fetched score ");
                            sb8.append(c9);
                            c10.b(sb8.toString());
                        }
                        this.b.e();
                        niz = niz.i(m.h());
                    }
                    a.o(niz);
                }
            }
            for (final Map.Entry<K, ftg> entry2 : this.e.entrySet()) {
                if (entry2.getValue().b < SystemClock.elapsedRealtimeNanos() - 600000000000L) {
                    final krr c11 = this.c;
                    final String value3 = String.valueOf(entry2.getKey());
                    final StringBuilder sb9 = new StringBuilder(String.valueOf(value3).length() + 22);
                    sb9.append("cleaning up entry for ");
                    sb9.append(value3);
                    c11.b(sb9.toString());
                    list.add(entry2.getKey());
                }
            }
            while (i < list.size()) {
                this.e.remove(list.get(i));
                ++i;
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private static void i(final float n) {
        Math.min(Math.max(n, 0.0f), 1.0f);
    }
    
    @Override
    public final oey a(final him him) {
        synchronized (this) {
            final ftg g = this.g(him);
            final krr c = this.c;
            final String value = String.valueOf(him);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 35);
            sb.append("uri ");
            sb.append(value);
            sb.append(" is collecting Moments metadata");
            c.b(sb.toString());
            return g.a;
        }
    }
    
    @Override
    public final void b(final him him, final long e) {
        synchronized (this) {
            final krr c = this.c;
            final String value = String.valueOf(him);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 55);
            sb.append("uri ");
            sb.append(value);
            sb.append(" : main session has base frame ");
            sb.append(e);
            c.b(sb.toString());
            if (this.e.containsKey(him)) {
                this.e.get(him).e = e;
            }
            this.h();
        }
    }
    
    @Override
    public final void c(final him him) {
        synchronized (this) {
            final ftg g = this.g(him);
            if (!g.c) {
                g.a.o(nii.a);
            }
        }
    }
    
    @Override
    public final void d(final him him, final List f) {
        synchronized (this) {
            final ftg g = this.g(him);
            final krr c = this.c;
            final String value = String.valueOf(him);
            final int size = f.size();
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 37);
            sb.append("uri ");
            sb.append(value);
            sb.append(" : Moments has ");
            sb.append(size);
            sb.append(" frames");
            c.b(sb.toString());
            g.f = f;
            this.h();
        }
    }
    
    @Override
    public final void e(final him him) {
        synchronized (this) {
            final krr c = this.c;
            final String value = String.valueOf(him);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 21);
            sb.append("uri ");
            sb.append(value);
            sb.append(" has LongS active");
            c.b(sb.toString());
            final ftg g = this.g(him);
            ftg.a(g);
            g.d = true;
        }
    }
    
    @Override
    public final void f(final him him) {
        synchronized (this) {
            final krr c = this.c;
            final String value = String.valueOf(him);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 23);
            sb.append("uri ");
            sb.append(value);
            sb.append(" has Moments active");
            c.b(sb.toString());
            final ftg g = this.g(him);
            ftg.a(g);
            g.d = false;
        }
    }
}
