import java.util.Map;
import android.os.StrictMode$ThreadPolicy;
import android.os.PowerManager;
import java.io.IOException;
import java.nio.charset.Charset;
import java.io.File;
import android.os.StrictMode;
import android.app.ActivityManager$MemoryInfo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.reflect.Method;
import android.os.Debug$MemoryInfo;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mjo
{
    private static final nsd a;
    private static njp b;
    private final pii c;
    private final Context d;
    
    static {
        a = nsd.g("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture");
        mjo.b = nov.F(fdh.f);
    }
    
    public mjo(final pii c, final Context d) {
        this.c = c;
        this.d = d;
    }
    
    private static int c(final Debug$MemoryInfo error) {
        final Method method = (Method)((niz)mjo.b.a()).f();
        if (method != null) {
            try {
                return (int)method.invoke(error, 14);
            }
            catch (final Error error) {}
            catch (final Exception ex) {}
            mjo.b = fdh.g;
            a.m(mjo.a.b(), "MemoryInfo.getOtherPss(which) invocation failure", '\u0c2e', error);
        }
        return -1;
    }
    
    private static Integer d(final String s) {
        if (s == null) {
            return null;
        }
        return Integer.parseInt(s);
    }
    
    private static Long e(final Pattern pattern, final String s) {
        final Matcher matcher = pattern.matcher(s);
        Long value = null;
        try {
            if (matcher.find()) {
                final String group = matcher.group(1);
                nov.z(group);
                value = Long.parseLong(group);
            }
            return value;
        }
        catch (final NumberFormatException ex) {
            return null;
        }
    }
    
    final pro b(int a, int t, final String s, final String g) {
        final mja a2 = ((mel)this.c).a();
        mrm.b();
        final boolean d = a2.d;
        mjn mjn = null;
        Debug$MemoryInfo debug$MemoryInfo;
        if (d) {
            debug$MemoryInfo = mfs.a(this.d).getProcessMemoryInfo(new int[] { t })[0];
        }
        else {
            debug$MemoryInfo = null;
        }
        ActivityManager$MemoryInfo activityManager$MemoryInfo;
        if (a2.e) {
            activityManager$MemoryInfo = new ActivityManager$MemoryInfo();
            mfs.a(this.d).getMemoryInfo(activityManager$MemoryInfo);
        }
        else {
            activityManager$MemoryInfo = null;
        }
        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                final File file = new File("/proc/self/status");
                final Charset defaultCharset = Charset.defaultCharset();
                final ofi t2 = och.t(file);
                defaultCharset.getClass();
                final String s2 = new String(t2.a(), defaultCharset);
                if (s2.isEmpty()) {
                    a.l(mjo.a.b(), "Null or empty proc status", '\u0c30');
                }
                final mjn mjn2 = new mjn();
                mjn2.f = e(mjn.a, s2);
                mjn2.g = e(mjn.b, s2);
                mjn2.h = e(mjn.c, s2);
                mjn2.i = e(mjn.d, s2);
                mjn2.j = e(mjn.e, s2);
                mjn = mjn2;
            }
            finally {}
        }
        catch (final IOException ex) {
            mjo.a.b().h(ex).E(3119).o("Error reading proc status");
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        final okv okv = (okv)pro.h.m();
        final okt m = prn.c.m();
        final okt i = prl.z.m();
        if (debug$MemoryInfo != null) {
            t = debug$MemoryInfo.dalvikPss;
            if (i.c) {
                i.m();
                i.c = false;
            }
            final prl prl = (prl)i.b;
            prl.a |= 0x1;
            prl.b = t;
            t = debug$MemoryInfo.nativePss;
            if (i.c) {
                i.m();
                i.c = false;
            }
            final prl prl2 = (prl)i.b;
            prl2.a |= 0x2;
            prl2.c = t;
            t = debug$MemoryInfo.otherPss;
            if (i.c) {
                i.m();
                i.c = false;
            }
            final prl prl3 = (prl)i.b;
            prl3.a |= 0x4;
            prl3.d = t;
            t = debug$MemoryInfo.dalvikPrivateDirty;
            if (i.c) {
                i.m();
                i.c = false;
            }
            final prl prl4 = (prl)i.b;
            prl4.a |= 0x8;
            prl4.e = t;
            t = debug$MemoryInfo.nativePrivateDirty;
            if (i.c) {
                i.m();
                i.c = false;
            }
            final prl prl5 = (prl)i.b;
            prl5.a |= 0x10;
            prl5.f = t;
            t = debug$MemoryInfo.otherPrivateDirty;
            if (i.c) {
                i.m();
                i.c = false;
            }
            final prl prl6 = (prl)i.b;
            prl6.a |= 0x20;
            prl6.g = t;
            t = debug$MemoryInfo.getTotalPss();
            if (i.c) {
                i.m();
                i.c = false;
            }
            final prl prl7 = (prl)i.b;
            prl7.a |= 0x40;
            prl7.h = t;
            t = debug$MemoryInfo.getTotalPrivateClean();
            if (i.c) {
                i.m();
                i.c = false;
            }
            final prl prl8 = (prl)i.b;
            prl8.a |= 0x80;
            prl8.i = t;
            t = debug$MemoryInfo.getTotalSwappablePss();
            if (i.c) {
                i.m();
                i.c = false;
            }
            final prl prl9 = (prl)i.b;
            prl9.a |= 0x200;
            prl9.k = t;
            t = debug$MemoryInfo.getTotalSharedDirty();
            if (i.c) {
                i.m();
                i.c = false;
            }
            final prl prl10 = (prl)i.b;
            prl10.a |= 0x100;
            prl10.j = t;
            t = c(debug$MemoryInfo);
            if (t != -1) {
                if (i.c) {
                    i.m();
                    i.c = false;
                }
                final prl prl11 = (prl)i.b;
                prl11.a |= 0x400;
                prl11.l = t;
            }
            try {
                final Map memoryStats = debug$MemoryInfo.getMemoryStats();
                final Integer d2 = d(memoryStats.get("summary.code"));
                if (d2 != null) {
                    t = d2;
                    if (i.c) {
                        i.m();
                        i.c = false;
                    }
                    final prl prl12 = (prl)i.b;
                    prl12.a |= 0x1000;
                    prl12.n = t;
                }
                final Integer d3 = d(memoryStats.get("summary.stack"));
                if (d3 != null) {
                    t = d3;
                    if (i.c) {
                        i.m();
                        i.c = false;
                    }
                    final prl prl13 = (prl)i.b;
                    prl13.a |= 0x2000;
                    prl13.o = t;
                }
                final Integer d4 = d(memoryStats.get("summary.graphics"));
                if (d4 != null) {
                    t = d4;
                    if (i.c) {
                        i.m();
                        i.c = false;
                    }
                    final prl prl14 = (prl)i.b;
                    prl14.a |= 0x4000;
                    prl14.p = t;
                }
                final Integer d5 = d(memoryStats.get("summary.system"));
                if (d5 != null) {
                    t = d5;
                    if (i.c) {
                        i.m();
                        i.c = false;
                    }
                    final prl prl15 = (prl)i.b;
                    prl15.a |= 0x10000;
                    prl15.r = t;
                }
                final Integer d6 = d(memoryStats.get("summary.java-heap"));
                if (d6 != null) {
                    t = d6;
                    if (i.c) {
                        i.m();
                        i.c = false;
                    }
                    final prl prl16 = (prl)i.b;
                    prl16.a |= 0x800;
                    prl16.m = t;
                }
                final Integer d7 = d(memoryStats.get("summary.private-other"));
                if (d7 != null) {
                    t = d7;
                    if (i.c) {
                        i.m();
                        i.c = false;
                    }
                    final prl prl17 = (prl)i.b;
                    prl17.a |= 0x8000;
                    prl17.q = t;
                }
            }
            catch (final NumberFormatException ex2) {
                a.m(mjo.a.b(), "failed to collect memory summary stats", '\u0c33', ex2);
            }
        }
        if (activityManager$MemoryInfo != null) {
            t = (int)(activityManager$MemoryInfo.availMem >> 10);
            if (i.c) {
                i.m();
                i.c = false;
            }
            final prl prl18 = (prl)i.b;
            prl18.a |= 0x20000;
            prl18.s = t;
            t = (int)(activityManager$MemoryInfo.totalMem >> 20);
            if (i.c) {
                i.m();
                i.c = false;
            }
            final prl prl19 = (prl)i.b;
            prl19.a |= 0x40000;
            prl19.t = t;
        }
        if (mjn != null) {
            final Long f = mjn.f;
            if (f != null) {
                final long longValue = f;
                if (i.c) {
                    i.m();
                    i.c = false;
                }
                final prl prl20 = (prl)i.b;
                prl20.a |= 0x80000;
                prl20.u = longValue;
            }
            final Long g2 = mjn.g;
            if (g2 != null) {
                final long longValue2 = g2;
                if (i.c) {
                    i.m();
                    i.c = false;
                }
                final prl prl21 = (prl)i.b;
                prl21.a |= 0x100000;
                prl21.v = longValue2;
            }
            final Long h = mjn.h;
            if (h != null) {
                final long longValue3 = h;
                if (i.c) {
                    i.m();
                    i.c = false;
                }
                final prl prl22 = (prl)i.b;
                prl22.a |= 0x200000;
                prl22.w = longValue3;
            }
            final Long j = mjn.i;
            if (j != null) {
                final long longValue4 = j;
                if (i.c) {
                    i.m();
                    i.c = false;
                }
                final prl prl23 = (prl)i.b;
                prl23.a |= 0x400000;
                prl23.x = longValue4;
            }
            final Long k = mjn.j;
            if (k != null) {
                final long longValue5 = k;
                if (i.c) {
                    i.m();
                    i.c = false;
                }
                final prl prl24 = (prl)i.b;
                prl24.a |= 0x800000;
                prl24.y = longValue5;
            }
        }
        final prl b = (prl)i.h();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final prn prn = (prn)m.b;
        b.getClass();
        prn.b = b;
        prn.a |= 0x1;
        if (okv.c) {
            okv.m();
            okv.c = false;
        }
        final pro pro = (pro)okv.b;
        final prn b2 = (prn)m.h();
        b2.getClass();
        pro.b = b2;
        pro.a |= 0x1;
        final okt l = pry.c.m();
        final prx e = mga.e(s, this.d);
        if (l.c) {
            l.m();
            l.c = false;
        }
        final pry pry = (pry)l.b;
        e.getClass();
        pry.b = e;
        pry.a |= 0x1;
        if (okv.c) {
            okv.m();
            okv.c = false;
        }
        final pro pro2 = (pro)okv.b;
        final pry c = (pry)l.h();
        c.getClass();
        pro2.c = c;
        pro2.a |= 0x2;
        final okt m2 = prm.c.m();
        final Context d8 = this.d;
        t = mfs.b;
        final Object systemService = d8.getSystemService("power");
        systemService.getClass();
        final boolean interactive = ((PowerManager)systemService).isInteractive();
        if (m2.c) {
            m2.m();
            m2.c = false;
        }
        final prm prm = (prm)m2.b;
        prm.a |= 0x1;
        prm.b = interactive;
        if (okv.c) {
            okv.m();
            okv.c = false;
        }
        final pro pro3 = (pro)okv.b;
        final prm e2 = (prm)m2.h();
        e2.getClass();
        pro3.e = e2;
        pro3.a |= 0x8;
        if (okv.c) {
            okv.m();
            okv.c = false;
        }
        final pro pro4 = (pro)okv.b;
        pro4.d = a - 1;
        a = (pro4.a | 0x4);
        pro4.a = a;
        if (g != null) {
            pro4.a = (a | 0x10);
            pro4.g = g;
        }
        return (pro)okv.h();
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }
}
