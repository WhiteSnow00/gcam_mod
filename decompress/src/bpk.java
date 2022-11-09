import com.google.googlex.gcam.FloatDeque;
import com.google.googlex.gcam.DirtyLensHistory;
import java.util.List;
import com.google.googlex.gcam.dirtylens.DirtyLens;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.GcamModuleJNI;
import java.nio.Buffer;
import com.google.googlex.gcam.BufferUtils;
import com.google.android.libraries.camera.jni.yuv.YuvUtilNative;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import android.os.Looper;
import android.os.Handler;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bpk implements bou
{
    public final bpm a;
    public boolean b;
    public box c;
    private final bpn d;
    private final Resources e;
    private final klj f;
    private final Handler g;
    private final Runnable h;
    private final eyt i;
    private final cxl j;
    private final klv k;
    private int l;
    private final long m;
    private int n;
    private bpa o;
    private final bqz p;
    private final bsp q;
    
    public bpk(final byz byz, final bpm a, final bpn d, final btg btg, final Resources e, final eyt i, final cxl j, final bqz p11, final lfh lfh, final hkc hkc, final byte[] array) {
        this.q = new bpi(this);
        byz.getClass();
        this.d = d;
        a.getClass();
        this.a = a;
        btg.getClass();
        this.e = e;
        final klj a2 = hkc.a(hjq.b);
        this.f = a2;
        this.i = i;
        this.j = j;
        this.p = p11;
        this.m = 5000L;
        this.g = kpo.d(Looper.getMainLooper());
        this.h = new bph(this, a);
        this.n = 2;
        this.k = a.a;
        this.l = 0;
        p11.b.c(a2.a(new bpj(lfh, a, d), odx.a));
    }
    
    private final boolean i() {
        final box c = this.c;
        boolean b = false;
        if (c != null) {
            if (c.c() != 1) {
                if (this.c.c() == 2) {
                    return true;
                }
            }
            else {
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public final void a(gyb a) {
        if (!(boolean)((kkz)this.f).d) {
            a.a.close();
            return;
        }
        final lju a2 = a.a;
        try {
            final int l = this.l;
            final int n = 1;
            this.l = l + 1;
            if (a2.a() != 35) {
                if (a2 == null) {
                    return;
                }
            }
            else {
                final int c = a2.c();
                final int b = a2.b();
                int min = Math.min(c / 640, b / 480);
                int n2;
                if (min > 0) {
                    while ((n2 = min) > 1) {
                        n2 = min;
                        if (btg.b(c, b, min)) {
                            break;
                        }
                        --min;
                    }
                }
                else {
                    n2 = -1;
                }
                int n3;
                if ((n3 = n2) <= 0) {
                    n3 = n2;
                    if (c * b >= 307200) {
                        n3 = 1;
                    }
                }
                if (n3 <= 0) {
                    if (a2 == null) {
                        return;
                    }
                }
                else {
                    a2.getClass();
                    final int a3 = a2.a();
                    ByteBuffer[] array = null;
                    if (a3 == 35) {
                        final int c2 = a2.c();
                        final int b2 = a2.b();
                        if (btg.b(c2, b2, n3) && c2 / n3 >= 640 && b2 / n3 >= 480) {
                            final List h = a2.h();
                            final ljt ljt = h.get(0);
                            final ljt ljt2 = h.get(1);
                            final ljt ljt3 = h.get(2);
                            final int n4 = c2 * b2 / (n3 * n3);
                            final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(n4);
                            final ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(n4 / 2);
                            if (YuvUtilNative.downsampleYUV_420_888toNV21Native(c2, b2, ljt.getBuffer(), ljt.getPixelStride(), ljt.getRowStride(), ljt2.getBuffer(), ljt2.getPixelStride(), ljt2.getRowStride(), ljt3.getBuffer(), ljt3.getPixelStride(), ljt3.getRowStride(), allocateDirect, allocateDirect2, n3)) {
                                array = new ByteBuffer[] { allocateDirect, allocateDirect2 };
                            }
                        }
                    }
                    if (array != null) {
                        final int n5 = c / n3;
                        final int n6 = b / n3;
                        final ByteBuffer byteBuffer = array[0];
                        byteBuffer.getClass();
                        final ByteBuffer byteBuffer2 = array[1];
                        byteBuffer2.getClass();
                        byteBuffer.getClass();
                        byteBuffer2.getClass();
                        final YuvReadView yuvReadView = new YuvReadView(GcamModuleJNI.new_YuvReadView__SWIG_2(n5, n6, n5, ogn.a(new ogn(BufferUtils.a(byteBuffer))), n5 / 2, n6 / 2, n5, ogn.a(new ogn(BufferUtils.a(byteBuffer2))), 2));
                        new DirtyLens();
                        final long a4 = yuvReadView.a;
                        niz niz;
                        if (a4 == 0L) {
                            niz = nii.a;
                        }
                        else {
                            final float[] array2 = { 0.0f };
                            if (DirtyLens.getDirtyLensRawScore(a4, array2)) {
                                niz = niz.i(array2[0]);
                            }
                            else {
                                niz = nii.a;
                            }
                        }
                        final bpn d = this.d;
                        int n7 = 0;
                        Label_0708: {
                            if (niz.g()) {
                                final float floatValue = (float)niz.c();
                                final bpl c3 = d.c;
                                if (c3 == null) {
                                    n7 = 2;
                                    break Label_0708;
                                }
                                final DirtyLensHistory a5 = d.a.a;
                                final boolean dirtyLensHistory_AddRawScore = GcamModuleJNI.DirtyLensHistory_AddRawScore(a5.a, a5, floatValue);
                                c3.aR(d.a.a());
                                final cxl b3 = d.b;
                                final cxo a6 = cwt.a;
                                b3.c();
                                if (dirtyLensHistory_AddRawScore) {
                                    n7 = n;
                                    break Label_0708;
                                }
                            }
                            n7 = 2;
                        }
                        if (this.b && n7 != this.n) {
                            switch (n7 - 1) {
                                case 0: {
                                    if (((kkz)this.f).d) {
                                        if (!this.i()) {
                                            final bpa o = this.o;
                                            if (o != null) {
                                                final bod a7 = boe.a();
                                                a7.a = this.e.getString(2131951718);
                                                a7.b = this.e.getString(2131951719);
                                                a7.d = 7000;
                                                a7.e = 3;
                                                a7.f = this.q;
                                                this.c = o.a(a7.a());
                                                this.i.k();
                                                final bqz p = this.p;
                                                a = (gyb)p.a;
                                                synchronized (a) {
                                                    final kjk c4 = p.c;
                                                    monitorexit(a);
                                                    a = (gyb)new bpg(this);
                                                    c4.c((krc)a);
                                                }
                                            }
                                        }
                                    }
                                    this.g();
                                    break;
                                }
                            }
                            this.n = n7;
                        }
                        final cxl j = this.j;
                        final cxo a8 = cwt.a;
                        j.c();
                        if (this.l > 0) {
                            this.g();
                        }
                        if (a2 == null) {
                            return;
                        }
                    }
                    else if (a2 == null) {
                        return;
                    }
                }
            }
            a2.close();
        }
        finally {
            Label_0986: {
                if (a2 != null) {
                    try {
                        a2.close();
                        break Label_0986;
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)a).addSuppressed(t);
                    }
                    break Label_0986;
                }
                break Label_0986;
            }
            while (true) {}
        }
    }
    
    @Override
    public final bor b() {
        return this.a;
    }
    
    @Override
    public final void c() {
        if (this.i()) {
            this.g();
            final box c = this.c;
            if (c != null) {
                c.a();
            }
        }
    }
    
    @Override
    public final void d(final lfj lfj) {
        final bpn d = this.d;
        d.c = this.a.d(lfj);
        final bpq a = d.a;
        final bpr bpr = (bpr)d.c.aQ();
        bpr bpr2;
        if (bpr instanceof bpr) {
            bpr2 = bpr;
        }
        else {
            bpr2 = new bpr();
            for (int n = 0; n < bpr.b(); ++n) {
                bpr2.c(bpr.a(n));
            }
        }
        final DirtyLensHistory a2 = a.a;
        final FloatDeque a3 = bpr2.a;
        final long a4 = a2.a;
        long a5;
        if (a3 == null) {
            a5 = 0L;
        }
        else {
            a5 = a3.a;
        }
        GcamModuleJNI.DirtyLensHistory_raw_score_history__set(a4, a2, a5, a3);
        final cxl b = d.b;
        final cxo a6 = cwt.a;
        b.c();
        this.n = 2;
        this.l = 0;
        this.k.aR(15);
        this.h();
    }
    
    @Override
    public final void e(final lfg lfg) {
    }
    
    @Override
    public final void f(final bpa o) {
        this.o = o;
    }
    
    public final void g() {
        this.b = false;
        this.g.removeCallbacks(this.h);
        final bpm a = this.a;
        a.b.aR(false);
        a.a.aR(0);
    }
    
    public final void h() {
        this.g.removeCallbacks(this.h);
        this.g.postDelayed(this.h, this.m);
    }
}
