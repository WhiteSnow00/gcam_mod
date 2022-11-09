import java.util.Iterator;
import android.app.ApplicationExitInfo;
import android.app.ActivityManager;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class mhx implements mhw
{
    private final Context a;
    
    public mhx(final Context a) {
        this.a = a;
    }
    
    public nns b(int status, int n, final String s, final long n2) {
        final ActivityManager activityManager = (ActivityManager)this.a.getSystemService("activity");
        activityManager.getClass();
        final List historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(this.a.getPackageName(), 0, 0);
        final nnn e = nns.e();
        for (final ApplicationExitInfo applicationExitInfo : historicalProcessExitReasons) {
            if (applicationExitInfo.getProcessName().equals(s) && applicationExitInfo.getTimestamp() == n2) {
                break;
            }
            final okt m = pqw.j.m();
            final String processName = applicationExitInfo.getProcessName();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final pqw pqw = (pqw)m.b;
            processName.getClass();
            pqw.a |= 0x1;
            pqw.b = processName;
            status = applicationExitInfo.getStatus();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final pqw pqw2 = (pqw)m.b;
            final int a = pqw2.a;
            n = 4;
            pqw2.a = (a | 0x4);
            pqw2.d = status;
            final long timestamp = applicationExitInfo.getTimestamp();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final pqw pqw3 = (pqw)m.b;
            pqw3.a |= 0x10;
            pqw3.f = timestamp;
            final long pss = applicationExitInfo.getPss();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final pqw pqw4 = (pqw)m.b;
            pqw4.a |= 0x20;
            pqw4.g = pss;
            final long rss = applicationExitInfo.getRss();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final pqw pqw5 = (pqw)m.b;
            pqw5.a |= 0x40;
            pqw5.h = rss;
            final boolean lowMemoryKillReportSupported = ActivityManager.isLowMemoryKillReportSupported();
            if (m.c) {
                m.m();
                m.c = false;
            }
            final pqw pqw6 = (pqw)m.b;
            pqw6.a |= 0x80;
            pqw6.i = lowMemoryKillReportSupported;
            switch (applicationExitInfo.getReason()) {
                default: {
                    status = 0;
                    break;
                }
                case 13: {
                    status = 14;
                    break;
                }
                case 12: {
                    status = 13;
                    break;
                }
                case 11: {
                    status = 12;
                    break;
                }
                case 10: {
                    status = 11;
                    break;
                }
                case 9: {
                    status = 10;
                    break;
                }
                case 8: {
                    status = 9;
                    break;
                }
                case 7: {
                    status = 8;
                    break;
                }
                case 6: {
                    status = 7;
                    break;
                }
                case 5: {
                    status = 6;
                    break;
                }
                case 4: {
                    status = 5;
                    break;
                }
                case 3: {
                    status = 4;
                    break;
                }
                case 2: {
                    status = 3;
                    break;
                }
                case 1: {
                    status = 2;
                    break;
                }
                case 0: {
                    status = 15;
                    break;
                }
            }
            if (status != 0) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final pqw pqw7 = (pqw)m.b;
                pqw7.c = status - 1;
                pqw7.a |= 0x2;
            }
            switch (applicationExitInfo.getImportance()) {
                default: {
                    status = 0;
                    break;
                }
                case 1000: {
                    status = 10;
                    break;
                }
                case 400: {
                    status = 9;
                    break;
                }
                case 350: {
                    status = 7;
                    break;
                }
                case 325: {
                    status = n;
                    break;
                }
                case 300: {
                    status = 8;
                    break;
                }
                case 230: {
                    status = 6;
                    break;
                }
                case 200: {
                    status = 5;
                    break;
                }
                case 125: {
                    status = 3;
                    break;
                }
                case 100: {
                    status = 2;
                    break;
                }
            }
            if (status != 0) {
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final pqw pqw8 = (pqw)m.b;
                pqw8.e = status - 1;
                pqw8.a |= 0x8;
            }
            e.g(m.h());
        }
        return e.f();
    }
}
