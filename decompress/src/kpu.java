import android.media.MediaCodec$BufferInfo;
import java.io.FileDescriptor;
import android.media.MediaFormat;
import java.util.concurrent.Future;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import android.view.Surface;
import android.media.MediaCodec;
import java.util.concurrent.Callable;
import android.os.SystemClock;
import java.util.Iterator;
import android.util.Log;
import android.media.AudioRecord;
import java.util.concurrent.Executor;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kpu implements kof
{
    public final Object a;
    public final koa b;
    public final koz c;
    public final koe d;
    public final koi e;
    public final Map f;
    public kob g;
    public final oey h;
    public final ExecutorService i;
    public koh j;
    public int k;
    public kpl l;
    private final ofa m;
    private final int n;
    private final boolean o;
    
    public kpu(final kpv kpv) {
        this.f = new HashMap();
        this.g = null;
        this.a = new Object();
        this.m = kpv.a;
        kpv.s();
        this.n = kpv.j;
        final oey p = kpv.p;
        this.h = p;
        this.i = ofi.c();
        kpv.d.c();
        if (kpv.s == null && !kpv.n) {
            this.o = false;
        }
        else {
            this.o = true;
        }
        final HashSet set = new HashSet();
        if (!this.o) {
            if (kpv.c != null) {
                set.add(kod.a);
            }
            if (kpv.d != null) {
                set.add(kod.b);
            }
            if (kpv.m) {
                set.add(kod.c);
            }
        }
        final koz c = new koz(set, kpv.f);
        this.c = c;
        final knc d = kpv.d;
        int e;
        if (d != null) {
            e = d.a.e;
        }
        else {
            e = 0;
        }
        final knv b = new knv(odg.h(ofi.k(p, kpv.s()), new kpq(this, kpv, e), odx.a));
        this.b = b;
        final kkz kkz = new kkz(0L);
        final kkz kkz2 = new kkz(Long.MAX_VALUE);
        final kou kou = new kou();
        final knc d2 = kpv.d;
        if (d2 != null) {
            this.d = new kpp(d2, kpv.e, b, niz.h(kpv.q), niz.h(kpv.s), kpv.n, c, kpv.b, kkz, kkz2, kpv.o, kou);
        }
        else {
            this.d = null;
        }
        final kmz c2 = kpv.c;
        Label_0684: {
            if (c2 != null) {
                final int u = kpv.u;
                String.valueOf(String.valueOf(c2)).length();
                knf.b(u).length();
                int n;
                if (c2.e == 2) {
                    n = 12;
                }
                else {
                    n = 16;
                }
                final int minBufferSize = AudioRecord.getMinBufferSize(c2.d, n, 2);
                knf.b(u).length();
                niz niz;
                try {
                    if (u == 0) {
                        throw null;
                    }
                    final AudioRecord audioRecord = new AudioRecord(u - 1, c2.d, n, 2, minBufferSize * 10);
                    njo.o(audioRecord.getState() == 1);
                    niz = niz.i(audioRecord);
                }
                catch (final RuntimeException ex) {
                    Log.e("AudioRecordFactory", "Could not create AudioRecord", (Throwable)ex);
                    niz = nii.a;
                }
                if (niz.g()) {
                    this.l = new kpl(new may((AudioRecord)niz.c(), 0));
                    final lhb t = kpv.t;
                    if (t != null) {
                        this.l = t.a();
                    }
                    final String value = String.valueOf(kpv.c);
                    final int u2 = kpv.u;
                    String.valueOf(value).length();
                    knf.b(u2).length();
                    this.e = new kot(c2, this.l, this.b, this.c, kpv.b, kkz, kkz2, kpv.o, kou);
                    break Label_0684;
                }
                this.c.a(kov.e);
                this.b.f();
            }
            this.e = null;
        }
        final koh r = kpv.r;
        if (r != null) {
            this.j = r;
        }
        if (kpv.m) {
            this.f.put("application/meta", new kpd(this.b, this.c, kkz2, kpv.d));
        }
        for (final cqw cqw : kpv.l) {
            final cjc cjc = new cjc();
            this.f.put(cjc.a, cjc);
        }
        this.k = 1;
    }
    
    private final oey q(final boolean b) {
        synchronized (this.a) {
            final long n = SystemClock.uptimeMillis() * 1000L;
            this.c.close();
            return ofi.o(ofi.h(this.m.b(new kpt(this, b, n, 1)), this.m.b(new kpt(this, b, n))).b(new kpr(this), this.m));
        }
    }
    
    @Override
    public final int a() {
        return this.n;
    }
    
    @Override
    public final MediaCodec b() {
        final koe d = this.d;
        if (d != null) {
            return ((kpp)d).c;
        }
        return null;
    }
    
    @Override
    public final niz c() {
        synchronized (this.a) {
            njo.o(this.k != 4);
            final koe d = this.d;
            Surface d2;
            if (d != null) {
                d2 = ((kpp)d).d;
            }
            else {
                d2 = null;
            }
            if (d2 == null) {
                return nii.a;
            }
            return niz.i(d2);
        }
    }
    
    @Override
    public final void close() {
        try {
            this.k().get();
            return;
        }
        catch (final InterruptedException ex) {}
        catch (final ExecutionException ex2) {}
        Log.e("VideoRecorderImpl", "Failed to stop the video recorder at close");
    }
    
    @Override
    public final niz d() {
        try {
            return this.h.get();
        }
        catch (final InterruptedException ex) {}
        catch (final ExecutionException ex2) {}
        Log.w("VideoRecorderImpl", "Failed to retrieve the location. Ignoring");
        return nii.a;
    }
    
    @Override
    public final niz e() {
        final koe d = this.d;
        if (d != null) {
            return niz.i(((kpp)d).o.get());
        }
        Log.w("VideoRecorderImpl", "Cannot get frame count.");
        return nii.a;
    }
    
    @Override
    public final niz f() {
        final koe d = this.d;
        if (d != null) {
            final kpp kpp = (kpp)d;
            niz niz;
            if (kpp.p.get() > kpp.q.get()) {
                niz = niz.i(TimeUnit.MICROSECONDS.toMillis(kpp.b(kpp.p.get() - kpp.q.get())));
            }
            else {
                Log.w("VideoEncoder", String.format("Invalid recording time, start: %d, end: %d", kpp.q.get(), kpp.p.get()));
                niz = nii.a;
            }
            return niz;
        }
        Log.w("VideoRecorderImpl", "Cannot get recording time.");
        return nii.a;
    }
    
    @Override
    public final oey g() {
        final Object a = this.a;
        monitorenter(a);
        try {
            final int k = this.k;
            if (k != 2) {
                final String d = ksc.d(k);
                final StringBuilder sb = new StringBuilder(d.length() + 31);
                sb.append("STARTED");
                sb.append(" is expected but we got ");
                sb.append(d);
                Log.e("VideoRecorderImpl", sb.toString());
                final oey n = ofi.n(null);
                monitorexit(a);
                return n;
            }
            final long n2 = SystemClock.uptimeMillis() * 1000L;
            final koz c = this.c;
            Label_0156: {
                if (c.e) {
                    break Label_0156;
                }
                c.g = n2;
                Object o = c.c;
                synchronized (o) {
                    final Future j = c.j;
                    if (j != null) {
                        j.cancel(true);
                        c.j = null;
                    }
                    monitorexit(o);
                    final koe d2 = this.d;
                    if (d2 != null) {
                        synchronized (((kpp)d2).a) {
                            if (((kpp)d2).x != 2) {
                                Log.e("VideoEncoder", "VideoEncoder is not recording now");
                            }
                            else {
                                if (((kpp)d2).d != null) {
                                    final Bundle parameters = new Bundle();
                                    parameters.putInt("drop-input-frames", 1);
                                    parameters.putLong("drop-start-time-us", n2);
                                    ((kpp)d2).c.setParameters(parameters);
                                }
                                ((kpp)d2).n = n2;
                                String.format("Paused recording at %d (or excluding pause time: %d)", n2, n2 - ((kpp)d2).m);
                                ((kpp)d2).x = 5;
                            }
                        }
                    }
                    final koi e = this.e;
                    if (e != null) {
                        synchronized (((kot)e).e) {
                            if (((kot)e).N != 2) {
                                Log.e("AudioEncoder", "It is not recording now");
                            }
                            else {
                                ((kot)e).N = 5;
                                ((kot)e).p.add(nqe.c(((kot)e).d(n2)));
                            }
                        }
                    }
                    o = this.f.values().iterator();
                    while (((Iterator)o).hasNext()) {
                        ((knz)((Iterator)o).next()).a(n2);
                    }
                    this.k = 3;
                    o = ofi.n(null);
                    return (oey)o;
                }
            }
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    @Override
    public final oey h() {
        final Object a = this.a;
        monitorenter(a);
        try {
            final int k = this.k;
            if (k != 3) {
                final String d = ksc.d(k);
                final StringBuilder sb = new StringBuilder(d.length() + 30);
                sb.append("PAUSED");
                sb.append(" is expected but we got ");
                sb.append(d);
                Log.e("VideoRecorderImpl", sb.toString());
                final oey n = ofi.n(null);
                monitorexit(a);
                return n;
            }
            final long n2 = SystemClock.uptimeMillis() * 1000L;
            final koe d2 = this.d;
            if (d2 != null) {
                synchronized (((kpp)d2).a) {
                    if (((kpp)d2).x != 5) {
                        Log.e("VideoEncoder", "It is not recording now");
                    }
                    else {
                        ((kpp)d2).e(n2);
                        if (((kpp)d2).d != null) {
                            final Bundle parameters = new Bundle();
                            parameters.putInt("drop-input-frames", 0);
                            parameters.putLong("drop-start-time-us", n2);
                            parameters.putLong("time-offset-us", -((kpp)d2).m);
                            ((kpp)d2).c.setParameters(parameters);
                        }
                        String.format("Resumed recording at %d (or excluding pause time: %d)", n2, n2 - ((kpp)d2).m);
                        ((kpp)d2).x = 2;
                    }
                }
            }
            final koi e = this.e;
            if (e != null) {
                synchronized (((kot)e).e) {
                    if (((kot)e).N != 5) {
                        Log.e("AudioEncoder", "It is not recording now");
                    }
                    else {
                        ((kot)e).N = 2;
                        ((kot)e).i(((kot)e).d(n2));
                    }
                }
            }
            Object o = this.f.values().iterator();
            while (((Iterator)o).hasNext()) {
                ((knz)((Iterator)o).next()).c(n2);
            }
            final koz c = this.c;
            Label_0553: {
                if (c.e) {
                    break Label_0553;
                }
                o = c.c;
                synchronized (o) {
                    if (c.g == 0L) {
                        Log.w("EncWatcher", "Resume without pause");
                        monitorexit(o);
                    }
                    else {
                        final long n3 = n2 - c.g;
                        if (n3 >= 0L) {
                            c.h += n3;
                        }
                        else {
                            final long h = c.h;
                            final StringBuilder sb2 = new StringBuilder(48);
                            sb2.append("Pause duration is negative: ");
                            sb2.append(h);
                            Log.e("EncWatcher", sb2.toString());
                        }
                        c.g = 0L;
                        c.c();
                        monitorexit(o);
                    }
                    this.k = 2;
                    o = ofi.n(null);
                    return (oey)o;
                }
            }
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    @Override
    public final oey i() {
        return this.q(true);
    }
    
    @Override
    public final oey j(final kob g) {
        synchronized (this.a) {
            final int k = this.k;
            if (k != 1) {
                final String d = ksc.d(k);
                final StringBuilder sb = new StringBuilder(d.length() + 28);
                sb.append("Trying to start with state: ");
                sb.append(d);
                return ofi.m(new IllegalStateException(sb.toString()));
            }
            this.g = g;
            this.b.c(g);
            this.c.d = niz.h(this.g);
            SystemClock.elapsedRealtime();
            return ofi.h(this.m.b(new kps(this, 1)), this.m.b(new kps(this)), this.m.b(new kps(this, 2))).b(new kpr(this, 1), this.m);
        }
    }
    
    @Override
    public final oey k() {
        return this.q(false);
    }
    
    @Override
    public final void l(final MediaFormat mediaFormat) {
        if (!this.o) {
            Log.w("VideoRecorderImpl", "Should handle encoder internally.");
            return;
        }
        final koe d = this.d;
        if (d == null) {
            Log.w("VideoRecorderImpl", "Failed to notify output media format changed event.");
            return;
        }
        final kpp kpp = (kpp)d;
        if (kpp.k) {
            kpp.c(mediaFormat);
            return;
        }
        throw new IllegalStateException("Should handle encoder internally.");
    }
    
    @Override
    public final void m(final FileDescriptor fileDescriptor) {
        synchronized (this.a) {
            final int k = this.k;
            if (k != 2) {
                final String d = ksc.d(k);
                final StringBuilder sb = new StringBuilder(d.length() + 31);
                sb.append("STARTED");
                sb.append(" is expected but we got ");
                sb.append(d);
                Log.w("VideoRecorderImpl", sb.toString());
                return;
            }
            this.b.h(fileDescriptor);
        }
    }
    
    @Override
    public final void n(final int n, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        if (!this.o) {
            Log.w("VideoRecorderImpl", "Should handle encoder internally.");
            return;
        }
        final koe d = this.d;
        if (d == null) {
            Log.w("VideoRecorderImpl", "Failed to write video date due to not video encoder.");
            return;
        }
        final kpp kpp = (kpp)d;
        if (kpp.k) {
            kpp.f(n, mediaCodec$BufferInfo);
            return;
        }
        throw new IllegalStateException("Should handle encoder internally.");
    }
    
    @Override
    public final niz o() {
        return niz.h(this.f.get("application/meta"));
    }
    
    @Override
    public final void p(final float n) {
        synchronized (this.a) {
            if (this.k == 4) {
                return;
            }
            final koe d = this.d;
            if (d != null) {
                synchronized (((kpp)d).a) {
                    final int x = ((kpp)d).x;
                    if (x != 2) {
                        final String a = kpo.a(x);
                        final StringBuilder sb = new StringBuilder(a.length() + 17);
                        sb.append("illegal state as ");
                        sb.append(a);
                        Log.e("VideoEncoder", sb.toString());
                        monitorexit(((kpp)d).a);
                    }
                    else {
                        final int intValue = (int)((kpp)d).g.clamp((Comparable)(int)(((kpp)d).f * n));
                        final float n2 = (float)((kpp)d).f;
                        final StringBuilder sb2 = new StringBuilder(52);
                        sb2.append("Request bit rate ");
                        sb2.append(n * n2);
                        sb2.append(" but get ");
                        sb2.append(intValue);
                        sb2.toString();
                        final Bundle parameters = new Bundle();
                        parameters.putInt("video-bitrate", intValue);
                        ((kpp)d).c.setParameters(parameters);
                    }
                    return;
                }
            }
            Log.w("VideoRecorderImpl", "video encoder is not enabled here, so ignored.");
        }
    }
}
