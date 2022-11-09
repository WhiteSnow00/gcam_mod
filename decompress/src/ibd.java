import com.google.android.apps.camera.jni.eisutil.FrameUtilNative;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.SizeF;
import android.hardware.camera2.CaptureResult;

// 
// Decompiled by Procyon v0.6.0
// 

final class ibd extends kwp
{
    final /* synthetic */ kvs a;
    final /* synthetic */ ibf b;
    
    public ibd(final ibf b, final kvs a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void b() {
        if (this.b.e.d) {
            if (this.a.c() != null) {
                Object a = this.b.o;
                synchronized (a) {
                    if (!this.a.i().c.contains(this.b.Q)) {
                        ibf.a.c().E(2630).o("The source of the frame is incorrect");
                        this.a.close();
                        return;
                    }
                    monitorexit(a);
                    final boolean k = this.b.d.k(cyl.d);
                    Object o = null;
                    Label_0858: {
                        if (!k && this.b.x.c()) {
                            Object c = this.a.c();
                            ((ljm)c).getClass();
                            final ibf b = this.b;
                            a = b.G;
                            if (b.j.e() && ((lfg)a).I()) {
                                final String s = (String)((lji)c).d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
                                s.getClass();
                                a = ((ljm)c).h().get(s);
                                if (a != null) {
                                    c = a;
                                }
                                a = this.b.H.a(s);
                                final kkz kkz = new kkz(this.b.r.aQ());
                                if (this.b.H.g(s)) {
                                    kkz.aR(Math.max(1.0f, (float)kkz.d / 1.615f));
                                }
                                final ibf b2 = this.b;
                                final klj q = b2.q;
                                final kqp g = kqp.g(b2.J.c());
                                final ibf b3 = this.b;
                                b2.M = new gir(q, kkz, (lfg)a, g, b3.d, b3.i);
                            }
                            final idl idl = new idl();
                            idl.a = (lji)a;
                            idl.e = (int)this.b.d.a(cxr.m).c();
                            idl.d = this.b.d.k(cxr.ao);
                            final Rect h = ((lfg)a).h();
                            if (h == null) {
                                throw new NullPointerException("Null sensorInfoActiveArraySize");
                            }
                            idl.b = h;
                            final SizeF c2 = (SizeF)((lfg)a).o(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
                            if (c2 == null) {
                                throw new NullPointerException("Null sensorInfoPhysicalSize");
                            }
                            idl.c = c2;
                            idl.f = (float)this.b.r.aQ();
                            final Rect a2 = ((giq)this.b.M.aQ()).a;
                            if (a2 != null) {
                                idl.g = a2;
                                final lji a3 = idl.a;
                                if (a3 != null) {
                                    a = idl.b;
                                    if (a != null) {
                                        final SizeF c3 = idl.c;
                                        if (c3 != null) {
                                            final Boolean d = idl.d;
                                            if (d != null && idl.e != null && idl.f != null) {
                                                if (idl.g != null) {
                                                    o = new idm(a3, (Rect)a, c3, d, idl.e, idl.f, idl.g);
                                                    break Label_0858;
                                                }
                                            }
                                        }
                                    }
                                }
                                final StringBuilder sb = new StringBuilder();
                                if (idl.a == null) {
                                    sb.append(" metadata");
                                }
                                if (idl.b == null) {
                                    sb.append(" sensorInfoActiveArraySize");
                                }
                                if (idl.c == null) {
                                    sb.append(" sensorInfoPhysicalSize");
                                }
                                if (idl.d == null) {
                                    sb.append(" supportOis");
                                }
                                if (idl.e == null) {
                                    sb.append(" oisApiVersion");
                                }
                                if (idl.f == null) {
                                    sb.append(" digitalZoomRatio");
                                }
                                if (idl.g == null) {
                                    sb.append(" cropRegion");
                                }
                                final String value = String.valueOf(sb);
                                a = new StringBuilder(String.valueOf(value).length() + 28);
                                ((StringBuilder)a).append("Missing required properties:");
                                ((StringBuilder)a).append(value);
                                throw new IllegalStateException(((StringBuilder)a).toString());
                            }
                            throw new NullPointerException("Null cropRegion");
                        }
                    }
                    a = this.b.u;
                    this.a.c().getClass();
                    ((iam)a).i.b();
                    synchronized (this.b.o) {
                        if (this.b.d.k(cyl.d)) {
                            final ibf b4 = this.b;
                            final ias v = b4.v;
                            final kvs a4 = this.a;
                            final kwz q2 = b4.Q;
                            q2.getClass();
                            synchronized (v.s) {
                                if (v.A == null) {
                                    ias.a.b().E(2623).o("onImageAvailable() No ImageWriter available");
                                    a4.close();
                                    return;
                                }
                                if (v.B == null) {
                                    ias.a.b().E(2622).o("onImageAvailable() No Camcorder available");
                                    a4.close();
                                    return;
                                }
                                monitorexit(v.s);
                                final lju d2 = a4.d(q2);
                                if (d2 == null) {
                                    a.l(ias.a.b(), "onImageAvailable() ImageProxy is null", '\u0a3d');
                                    a4.close();
                                    return;
                                }
                                v.q.b();
                                final long value2 = v.k.get();
                                final Object s2 = v.s;
                                synchronized (v.s) {
                                    final ida u = v.u;
                                    u.getClass();
                                    final idb c4 = v.y.c(v.d.a());
                                    if (v.w.g()) {
                                        if (v.w.c() != c4) {
                                            u.d(c4);
                                        }
                                    }
                                    else {
                                        u.f(c4);
                                        u.d(c4);
                                    }
                                    v.w = niz.i(c4);
                                    final int e = v.y.e;
                                    final double a5 = v.d.a();
                                    final double n = e;
                                    Double.isNaN(n);
                                    if ((value2 % (int)(n / a5) == 0L && !v.c.get()) || v.b.get()) {
                                        final long value3 = v.l.get();
                                        final int f = v.y.f;
                                        long value4;
                                        if (v.i.get() == 0L) {
                                            v.i.set(TimeUnit.MILLISECONDS.toNanos(SystemClock.uptimeMillis()));
                                            value4 = v.i.get();
                                        }
                                        else {
                                            value4 = v.o.get() + (v.i.get() + TimeUnit.SECONDS.toNanos(value3) / f);
                                        }
                                        v.q.b();
                                        try {
                                            v.A.a(d2, value4);
                                            v.l.incrementAndGet();
                                            u.c(c4);
                                            final ibh z = v.z;
                                            if (z != null) {
                                                z.a(v.l.get(), (float)v.y.f);
                                            }
                                        }
                                        catch (final kuw kuw) {
                                            kuw.printStackTrace();
                                        }
                                    }
                                    u.b(c4);
                                    monitorexit(v.s);
                                    v.k.incrementAndGet();
                                    v.g.incrementAndGet();
                                    d2.close();
                                    a4.close();
                                }
                            }
                        }
                        final ibf b5 = this.b;
                        final iaa l = b5.l;
                        final kvs a6 = this.a;
                        final kwz q3 = b5.Q;
                        q3.getClass();
                        final niz h2 = niz.h(o);
                        l.w.b();
                        final lju d3 = a6.d(q3);
                        if (d3 == null) {
                            a.l(iaa.a.c(), "onImageAvailable() imageProxy is null", '\u0a24');
                            a6.close();
                        }
                        else {
                            int value5 = l.c.get() ? 1 : 0;
                            if (h2.g()) {
                                final idf f2 = l.F;
                                f2.getClass();
                                int n2;
                                if (((idh)f2).a.b.get() <= 0) {
                                    n2 = 1;
                                }
                                else {
                                    n2 = 0;
                                }
                                final int n3 = n2 & value5;
                                f2.a(l.r.get(), a6, d3, (idm)h2.c(), l.g(l.r.get(), l.K.e, l.f.a(), false, nii.a) && n3 != 0, niz.i((boolean)(n3 != 0)));
                                value5 = n3;
                            }
                            else {
                                final int c5 = d3.c();
                                final int b6 = d3.b();
                                final int rowStride = d3.h().get(0).getRowStride();
                                final int rowStride2 = d3.h().get(2).getRowStride();
                                ((ljt)d3.h().get(0)).getBuffer().position(0);
                                ((ljt)d3.h().get(2)).getBuffer().position(0);
                                final hny o2 = l.O;
                                FrameUtilNative.convertNV21ToNV12(d3.h().get(0).getBuffer(), rowStride, d3.h().get(2).getBuffer(), rowStride2, c5, b6);
                                l.f(l.r.get(), a6, d3, nii.a, nii.a);
                            }
                            if (value5 != 0) {
                                if (l.e.get()) {
                                    l.e.set(false);
                                }
                                else {
                                    l.r.incrementAndGet();
                                }
                            }
                            l.p.incrementAndGet();
                        }
                        return;
                    }
                }
            }
        }
        this.a.close();
    }
    
    @Override
    public final void d(final ljm ljm) {
        if (ljm == null) {
            return;
        }
        this.b.t.a(ljm);
    }
}
