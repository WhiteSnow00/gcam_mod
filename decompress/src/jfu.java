import com.google.android.libraries.camera.jni.surface.SurfaceNative;
import android.util.Size;
import java.util.Iterator;
import android.hardware.HardwareBuffer;
import com.google.android.libraries.oliveoil.gl.EGLImage;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import java.util.Comparator;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import android.view.Surface;
import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class jfu implements jge
{
    public final List a;
    private final Set b;
    private final jgd c;
    private final kse d;
    private Surface e;
    private boolean f;
    
    public jfu(final Set b, final jgd c, final kse d) {
        this.a = new ArrayList();
        this.f = false;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a(final kvw kvw, final kwz kwz) {
        this.c.d(kvw, kwz);
    }
    
    public final void b() {
        monitorenter(this);
        try {
            if (this.f) {
                monitorexit(this);
                return;
            }
            final jgd c = this.c;
            final ArrayList list = new ArrayList<Object>(this.b);
            Collections.sort((List<Object>)list, bzj.l);
            final ArrayList list2 = new ArrayList();
            for (int size = list.size(), i = 0; i < size; ++i) {
                final jgc jgc = (jgc)list.get(i);
                if (jgc.b.aQ()) {
                    list2.add(jgc.a.a(this.c));
                }
            }
            c.g(list2);
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final niz c(final int n, final int n2) {
        final jgd c = this.c;
        synchronized (c) {
            Object o;
            if (((jfr)c).o) {
                jfr.a.c().E(3024).o("cannot take screenshot after viewfinder effects pipeline is closed");
                o = nii.a;
                monitorexit(c);
            }
            else {
                o = ((jfr)c).k;
                if (o != null) {
                    ((jfq)o).c();
                }
                else {
                    o = null;
                }
                if (o != null) {
                    try {
                        final HardwareBuffer a = ((jfq)o).a();
                        final lfu h = ((jfr)c).h;
                        final lfu a2 = lfu.a;
                        final Bitmap bitmap = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
                        Object i = new EGLImage(a);
                        try {
                            final lzn b = lzn.b(((jfr)c).c, (EGLImage)i);
                            try {
                                final mcz a3 = mdb.a(bitmap);
                                try {
                                    final lyo e = lyo.e(((jfr)c).b(), ((mda)a3).a);
                                    try {
                                        final mao a4 = mao.a(((jfr)c).b());
                                        try {
                                            final float[] array = { 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f };
                                            if (h == a2) {
                                                array[4] = -1.0f;
                                                array[12] = 1.0f;
                                            }
                                            a4.d(b, e, array);
                                            e.f(a3);
                                            lza.c(((jfr)c).c);
                                            a4.close();
                                            e.close();
                                            b.close();
                                            ((EGLImage)i).close();
                                            i = niz.i(bitmap);
                                            ((jfq)o).onBufferReleased();
                                            monitorexit(c);
                                            o = i;
                                        }
                                        finally {
                                            try {
                                                a4.close();
                                            }
                                            finally {
                                                final Throwable t;
                                                final Throwable t2;
                                                t.addSuppressed(t2);
                                            }
                                        }
                                    }
                                    finally {
                                        try {
                                            e.close();
                                        }
                                        finally {
                                            final Throwable t3;
                                            final Throwable t4;
                                            t3.addSuppressed(t4);
                                        }
                                    }
                                }
                                finally {}
                            }
                            finally {
                                try {
                                    b.close();
                                }
                                finally {
                                    final Throwable t5;
                                    final Throwable t6;
                                    t5.addSuppressed(t6);
                                }
                            }
                        }
                        finally {
                            try {
                                ((EGLImage)i).close();
                            }
                            finally {
                                final Throwable t7;
                                final Throwable t8;
                                t7.addSuppressed(t8);
                            }
                        }
                    }
                    finally {
                        ((jfq)o).onBufferReleased();
                    }
                }
                o = nii.a;
            }
            return (niz)o;
        }
    }
    
    @Override
    public final void close() {
        monitorenter(this);
        try {
            njo.p(this.f ^ true, "ViewfinderFilter is closed already");
            this.f = true;
            try {
                final Iterator iterator = this.a.iterator();
                while (iterator.hasNext()) {
                    ((krc)iterator.next()).close();
                }
                this.c.close();
                final Surface e = this.e;
                if (e != null) {
                    e.release();
                    monitorexit(this);
                    return;
                }
                monitorexit(this);
            }
            catch (final Exception ex) {
                throw new RuntimeException(ex);
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void d(final Surface e, int setSurfaceGeometry, final Size size) {
        synchronized (this) {
            njo.p(e.isValid(), "Surface is invalid: ignoring set filter output");
            final Surface e2 = this.e;
            if (e == e2) {
                return;
            }
            this.d.f("setSurfaceGeometry");
            setSurfaceGeometry = SurfaceNative.setSurfaceGeometry(e, size.getWidth(), size.getHeight(), setSurfaceGeometry);
            if (setSurfaceGeometry != 0) {
                jfv.a.b().E(3026).p("Failed to setSurfaceGeometry: %d", setSurfaceGeometry);
            }
            this.d.g();
            this.e = e;
            this.c.f(e, size);
            if (e2 != null) {
                e2.release();
            }
        }
    }
}
