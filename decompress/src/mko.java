import android.os.StrictMode$ThreadPolicy;
import java.util.concurrent.Executor;
import android.os.Process;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.File;
import android.os.StrictMode;
import android.system.Os;
import android.system.OsConstants;
import android.app.Activity;
import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mko extends mpp implements mgx, mfl
{
    private final mfp a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final AtomicBoolean e;
    
    public mko(final mfp a, final pii b, final pii c, final pii d) {
        this.e = new AtomicBoolean();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    private static long b(final Long n, final long n2) {
        if (n == null) {
            return n2;
        }
        return Math.min(n, n2);
    }
    
    private static pru d(final mkd mkd) {
        final okt m = pru.f.m();
        if (mkd.a != null) {
            final String a = mkd.a;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final pru pru = (pru)m.b;
            a.getClass();
            pru.a |= 0x1;
            pru.b = a;
        }
        if (mkd.b != null) {
            final long longValue = mkd.b;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final pru pru2 = (pru)m.b;
            pru2.a |= 0x2;
            pru2.c = longValue;
        }
        if (mkd.c != null) {
            final long longValue2 = mkd.c;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final pru pru3 = (pru)m.b;
            pru3.a |= 0x4;
            pru3.d = longValue2;
        }
        if (mkd.d != null) {
            final long longValue3 = mkd.d;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final pru pru4 = (pru)m.b;
            pru4.a |= 0x8;
            pru4.e = longValue3;
        }
        return (pru)m.h();
    }
    
    @Override
    public final void c(Activity activity) {
        this.a.b(this);
        final mkk a = mkk.a;
        if (a.g <= 0L && a.h <= 0L) {
            return;
        }
        long n;
        if (a.b) {
            n = a.c;
        }
        else {
            n = a.f;
        }
        if (n <= 0L) {
            return;
        }
        if (a.g < n && a.h < n) {
            return;
        }
        final okt m = prw.s.m();
        final boolean b = a.b;
        if (m.c) {
            m.m();
            m.c = false;
        }
        final prw prw = (prw)m.b;
        prw.a |= 0x4000;
        prw.o = b;
        final mkj l = a.l;
        Long value;
        if (l.a) {
            final long c = a.c;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prw prw2 = (prw)m.b;
            prw2.a |= 0x10;
            prw2.e = c;
            value = c;
        }
        else {
            value = null;
        }
        Long value2 = value;
        if (l.b) {
            final long d = a.d;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prw prw3 = (prw)m.b;
            prw3.a |= 0x80;
            prw3.h = d;
            value2 = b(value, d);
        }
        Long value3 = value2;
        if (l.c) {
            final long e = a.e;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prw prw4 = (prw)m.b;
            prw4.a |= 0x100;
            prw4.i = e;
            value3 = b(value2, e);
        }
        final boolean d2 = l.d;
        final boolean e2 = l.e;
        Long value4 = value3;
        if (l.f) {
            final long f = a.f;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prw prw5 = (prw)m.b;
            prw5.a |= 0x200;
            prw5.j = f;
            value4 = b(value3, f);
        }
        Long n2;
        if (this.d.get()) {
            Long value5 = value4;
            if (l.g) {
                final long g = a.g;
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prw prw6 = (prw)m.b;
                prw6.a |= 0x400;
                prw6.k = g;
                value5 = b(value4, g);
            }
            n2 = value5;
            if (l.h) {
                final long h = a.h;
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prw prw7 = (prw)m.b;
                prw7.a |= 0x800;
                prw7.l = h;
                n2 = b(value5, h);
            }
        }
        else {
            n2 = value4;
            if (l.h) {
                final long h2 = a.h;
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prw prw8 = (prw)m.b;
                prw8.a |= 0x400;
                prw8.k = h2;
                n2 = b(value4, h2);
            }
        }
        Long value6 = n2;
        if (l.i) {
            final long i = a.i;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prw prw9 = (prw)m.b;
            prw9.a |= 0x1000;
            prw9.m = i;
            value6 = b(n2, i);
        }
        Long value7 = value6;
        if (l.j) {
            final long j = a.j;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prw prw10 = (prw)m.b;
            prw10.a |= 0x2000;
            prw10.n = j;
            value7 = b(value6, j);
        }
        Long value8 = value7;
        if (a.m.b != null) {
            final pru d3 = d(a.m);
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prw prw11 = (prw)m.b;
            d3.getClass();
            prw11.p = d3;
            prw11.a |= 0x8000;
            Long value9 = value7;
            if ((d3.a & 0x2) != 0x0) {
                value9 = b(value7, d3.c);
            }
            Long value10 = value9;
            if ((d3.a & 0x4) != 0x0) {
                value10 = b(value9, d3.d);
            }
            value8 = value10;
            if ((d3.a & 0x8) != 0x0) {
                value8 = b(value10, d3.e);
            }
        }
        Long value11 = value8;
        if (a.n.b != null) {
            final pru d4 = d(a.n);
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prw prw12 = (prw)m.b;
            d4.getClass();
            prw12.q = d4;
            prw12.a |= 0x10000;
            Long value12 = value8;
            if ((d4.a & 0x2) != 0x0) {
                value12 = b(value8, d4.c);
            }
            Long value13 = value12;
            if ((d4.a & 0x4) != 0x0) {
                value13 = b(value12, d4.d);
            }
            value11 = value13;
            if ((d4.a & 0x8) != 0x0) {
                value11 = b(value13, d4.e);
            }
        }
        niz a2 = mkp.a;
        if (a2 == null) {
            final long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
            niz niz;
            if (sysconf > 0L) {
                niz = niz.i(sysconf);
            }
            else {
                niz = nii.a;
            }
            niz a3 = null;
            Label_1594: {
                if (!niz.g()) {
                    a3 = nii.a;
                }
                else {
                    final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    final byte[] array = new byte[440];
                    Label_1604: {
                        nii a4 = null;
                        Label_1545: {
                            try {
                                activity = (Activity)new FileInputStream(new File("/proc/self/stat"));
                                try {
                                    final int read = ((FileInputStream)activity).read(array);
                                    ((FileInputStream)activity).close();
                                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                                    int k = 0;
                                    while (k < read) {
                                        int n3 = k;
                                        if (array[k] != 40) {
                                            ++k;
                                        }
                                        else {
                                            int n4;
                                            if (n3 != 0 && (n4 = n3 + 16) < read) {
                                                while (true) {
                                                    while (n4 > n3) {
                                                        if (array[n4] == 41) {
                                                            n3 = n4;
                                                            final boolean b2 = true;
                                                            if (!b2) {
                                                                activity = (Activity)nii.a;
                                                                break Label_1545;
                                                            }
                                                            long n5 = 0L;
                                                            int n6 = 1;
                                                            while (n3 < read) {
                                                                final byte b3 = array[n3];
                                                                int n7;
                                                                long n8;
                                                                if (b3 == 32) {
                                                                    if (n6 == 21) {
                                                                        if (n5 <= 0L) {
                                                                            break;
                                                                        }
                                                                        activity = (Activity)niz.i(n5);
                                                                        break Label_1545;
                                                                    }
                                                                    else {
                                                                        n7 = n6 + 1;
                                                                        n8 = n5;
                                                                    }
                                                                }
                                                                else {
                                                                    n7 = n6;
                                                                    n8 = n5;
                                                                    if (n6 == 21) {
                                                                        if (n5 > 922337203685477580L || b3 < 48 || b3 > 57) {
                                                                            break;
                                                                        }
                                                                        n8 = n5 * 10L + (b3 - 48);
                                                                        n7 = n6;
                                                                    }
                                                                }
                                                                ++n3;
                                                                n6 = n7;
                                                                n5 = n8;
                                                            }
                                                            activity = (Activity)nii.a;
                                                            break Label_1545;
                                                        }
                                                        else {
                                                            --n4;
                                                        }
                                                    }
                                                    final boolean b2 = false;
                                                    continue;
                                                }
                                            }
                                            activity = (Activity)nii.a;
                                            break Label_1545;
                                        }
                                    }
                                    int n3 = 0;
                                }
                                finally {
                                    try {
                                        ((FileInputStream)activity).close();
                                    }
                                    finally {
                                        final Throwable t;
                                        final Throwable t2;
                                        t.addSuppressed(t2);
                                    }
                                }
                            }
                            catch (final IOException ex) {
                                a4 = nii.a;
                                StrictMode.setThreadPolicy(allowThreadDiskReads);
                            }
                            finally {
                                break Label_1604;
                            }
                        }
                        if (!a4.g()) {
                            a3 = nii.a;
                            break Label_1594;
                        }
                        a3 = niz.i(TimeUnit.SECONDS.toMillis((long)a4.c()) / (long)niz.c());
                        break Label_1594;
                    }
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                }
            }
            mkp.a = a3;
            a2 = a3;
        }
        Long value14 = value11;
        if (a2.g()) {
            final Long n9 = (Long)a2.c();
            final long longValue = n9;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final prw prw13 = (prw)m.b;
            prw13.a |= 0x2;
            prw13.c = longValue;
            value14 = b(value11, n9);
        }
        final long startElapsedRealtime = Process.getStartElapsedRealtime();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final prw prw14 = (prw)m.b;
        prw14.a |= 0x4;
        prw14.d = startElapsedRealtime;
        final long longValue2 = b(value14, startElapsedRealtime);
        final boolean booleanValue = (boolean)this.c.get();
        if (longValue2 != 0L) {
            if (!booleanValue) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prw prw15 = (prw)m.b;
                prw15.a |= 0x1;
                prw15.b = longValue2;
            }
            final prw prw16 = (prw)m.b;
            if ((prw16.a & 0x10) != 0x0) {
                final long e3 = prw16.e;
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prw prw17 = (prw)m.b;
                prw17.a |= 0x10;
                prw17.e = e3 - longValue2;
            }
            final prw prw18 = (prw)m.b;
            if ((prw18.a & 0x80) != 0x0) {
                final long h3 = prw18.h;
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prw prw19 = (prw)m.b;
                prw19.a |= 0x80;
                prw19.h = h3 - longValue2;
            }
            final prw prw20 = (prw)m.b;
            if ((prw20.a & 0x100) != 0x0) {
                final long i2 = prw20.i;
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prw prw21 = (prw)m.b;
                prw21.a |= 0x100;
                prw21.i = i2 - longValue2;
            }
            final prw prw22 = (prw)m.b;
            if ((prw22.a & 0x20) != 0x0) {
                final long f2 = prw22.f;
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prw prw23 = (prw)m.b;
                prw23.a |= 0x20;
                prw23.f = f2 - longValue2;
            }
            final prw prw24 = (prw)m.b;
            if ((prw24.a & 0x40) != 0x0) {
                final long g2 = prw24.g;
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prw prw25 = (prw)m.b;
                prw25.a |= 0x40;
                prw25.g = g2 - longValue2;
            }
            final prw prw26 = (prw)m.b;
            if ((prw26.a & 0x200) != 0x0) {
                final long j2 = prw26.j;
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prw prw27 = (prw)m.b;
                prw27.a |= 0x200;
                prw27.j = j2 - longValue2;
            }
            final prw prw28 = (prw)m.b;
            if ((prw28.a & 0x400) != 0x0) {
                final long k2 = prw28.k;
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prw prw29 = (prw)m.b;
                prw29.a |= 0x400;
                prw29.k = k2 - longValue2;
            }
            final prw prw30 = (prw)m.b;
            if ((prw30.a & 0x800) != 0x0) {
                final long l2 = prw30.l;
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prw prw31 = (prw)m.b;
                prw31.a |= 0x800;
                prw31.l = l2 - longValue2;
            }
            final prw prw32 = (prw)m.b;
            if ((prw32.a & 0x1000) != 0x0) {
                final long m2 = prw32.m;
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prw prw33 = (prw)m.b;
                prw33.a |= 0x1000;
                prw33.m = m2 - longValue2;
            }
            final prw prw34 = (prw)m.b;
            if ((prw34.a & 0x2000) != 0x0) {
                final long n10 = prw34.n;
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prw prw35 = (prw)m.b;
                prw35.a |= 0x2000;
                prw35.n = n10 - longValue2;
            }
            final prw prw36 = (prw)m.b;
            if ((prw36.a & 0x8000) != 0x0) {
                pru pru;
                if ((pru = prw36.p) == null) {
                    pru = pru.f;
                }
                final okt okt = (okt)pru.H(5);
                okt.o(pru);
                final pru pru2 = (pru)okt.b;
                if ((pru2.a & 0x2) != 0x0) {
                    final long c2 = pru2.c;
                    if (okt.c) {
                        okt.m();
                        okt.c = false;
                    }
                    final pru pru3 = (pru)okt.b;
                    pru3.a |= 0x2;
                    pru3.c = c2 - longValue2;
                }
                final pru pru4 = (pru)okt.b;
                if ((pru4.a & 0x4) != 0x0) {
                    final long d5 = pru4.d;
                    if (okt.c) {
                        okt.m();
                        okt.c = false;
                    }
                    final pru pru5 = (pru)okt.b;
                    pru5.a |= 0x4;
                    pru5.d = d5 - longValue2;
                }
                final pru pru6 = (pru)okt.b;
                if ((pru6.a & 0x8) != 0x0) {
                    final long e4 = pru6.e;
                    if (okt.c) {
                        okt.m();
                        okt.c = false;
                    }
                    final pru pru7 = (pru)okt.b;
                    pru7.a |= 0x8;
                    pru7.e = e4 - longValue2;
                }
                final pru p = (pru)okt.h();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prw prw37 = (prw)m.b;
                p.getClass();
                prw37.p = p;
                prw37.a |= 0x8000;
            }
            final prw prw38 = (prw)m.b;
            if ((prw38.a & 0x10000) != 0x0) {
                pru pru8;
                if ((pru8 = prw38.q) == null) {
                    pru8 = pru.f;
                }
                final okt okt2 = (okt)pru8.H(5);
                okt2.o(pru8);
                final pru pru9 = (pru)okt2.b;
                if ((pru9.a & 0x2) != 0x0) {
                    final long c3 = pru9.c;
                    if (okt2.c) {
                        okt2.m();
                        okt2.c = false;
                    }
                    final pru pru10 = (pru)okt2.b;
                    pru10.a |= 0x2;
                    pru10.c = c3 - longValue2;
                }
                final pru pru11 = (pru)okt2.b;
                if ((pru11.a & 0x4) != 0x0) {
                    final long d6 = pru11.d;
                    if (okt2.c) {
                        okt2.m();
                        okt2.c = false;
                    }
                    final pru pru12 = (pru)okt2.b;
                    pru12.a |= 0x4;
                    pru12.d = d6 - longValue2;
                }
                final pru pru13 = (pru)okt2.b;
                if ((pru13.a & 0x8) != 0x0) {
                    final long e5 = pru13.e;
                    if (okt2.c) {
                        okt2.m();
                        okt2.c = false;
                    }
                    final pru pru14 = (pru)okt2.b;
                    pru14.a |= 0x8;
                    pru14.e = e5 - longValue2;
                }
                final pru q = (pru)okt2.h();
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prw prw39 = (prw)m.b;
                q.getClass();
                prw39.q = q;
                prw39.a |= 0x10000;
            }
            final prw prw40 = (prw)m.b;
            if ((prw40.a & 0x4) != 0x0) {
                final long d7 = prw40.d;
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prw prw41 = (prw)m.b;
                prw41.a |= 0x4;
                prw41.d = d7 - longValue2;
            }
            final prw prw42 = (prw)m.b;
            if ((prw42.a & 0x2) != 0x0) {
                final long c4 = prw42.c;
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final prw prw43 = (prw)m.b;
                prw43.a |= 0x2;
                prw43.c = c4 - longValue2;
            }
        }
        final mdx k3 = a.k;
        if (!this.e.getAndSet(true)) {
            final mkn mkn = (mkn)this.b.get();
            ofi.r(new mkm(mkn, m), mkn.d);
            return;
        }
        final oey a5 = oev.a;
    }
    
    @Override
    public final void k() {
        this.a.a(this);
    }
}
