import com.google.android.libraries.oliveoil.gl.EGLImage;
import android.hardware.HardwareBuffer;
import android.os.Handler;
import java.util.concurrent.Executor;
import android.view.Surface;
import android.media.MediaFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fgw implements fgj
{
    public static final float[] a;
    public mao b;
    private final MediaFormat c;
    private lyp d;
    private dsh e;
    private mbl f;
    private Surface g;
    private lyo h;
    private mbk i;
    
    static {
        a = new float[] { 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f };
    }
    
    public fgw(MediaFormat c) {
        c = new MediaFormat(c);
        (this.c = c).setInteger("color-format", 2130708361);
        c.setInteger("color-range", 2);
    }
    
    @Override
    public final oey a() {
        synchronized (this) {
            final mbl f = this.f;
            oey oey;
            if (f != null) {
                oey = f.a();
            }
            else {
                oey = oev.a;
            }
            return odg.h(oey, new fgv(this), odx.a);
        }
    }
    
    @Override
    public final void b(final lup lup, final lyp d, final mbv mbv, final Handler c) {
        synchronized (this) {
            this.d = d;
            synchronized (dsh.class) {
                if (dsh.b == null) {
                    dsh.b = mcn.h("gl-guard");
                }
                final dsh e = new dsh(d, dsh.b);
                monitorexit(dsh.class);
                this.e = e;
                final mbl c2 = mcn.c(new fgo(lup));
                final mbr c3 = ((mbp)c2).c(this.c);
                c3.c = c;
                c3.d = true;
                c3.e = null;
                c3.b(mbv);
                final mbk a = c3.a();
                final Surface a2 = a.a();
                a2.getClass();
                this.g = a2;
                this.h = lyo.c(d, mga.f(a2), lvl.d(this.c.getInteger("width"), this.c.getInteger("height")));
                c2.b();
                this.b = mao.a(d);
                this.i = a;
                this.f = c2;
            }
        }
    }
    
    @Override
    public final boolean c() {
        monitorenter(this);
        try {
            final boolean b = this.i != null;
            monitorexit(this);
            return b;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void d(final lju lju) {
        synchronized (this) {
            this.e(lju, new fgu(this));
        }
    }
    
    @Override
    public final void e(final lju lju, final fgi fgi) {
        synchronized (this) {
            final lyo h = this.h;
            h.getClass();
            Object o = this.e;
            ((dsh)o).getClass();
            Object o2 = this.d;
            ((lyp)o2).getClass();
            final dsg a = ((dsh)o).a((AutoCloseable)lju.f());
            try {
                Label_0153: {
                    if (a.a == null) {
                        break Label_0153;
                    }
                    o = ((dsh)o).a(new EGLImage((HardwareBuffer)a.a()));
                    try {
                        o2 = lzn.b((lyp)o2, (EGLImage)((dsg)o).a());
                        try {
                            h.i(ftm.e, new ftl(lju.d(), 3)).h(lvm.a);
                            fgi.a((lzn)o2, h);
                            ((lyv)o2).close();
                            ((dsg)o).close();
                            a.close();
                        }
                        finally {
                            try {
                                ((lyv)o2).close();
                            }
                            finally {
                                final Throwable t;
                                ((Throwable)lju).addSuppressed(t);
                            }
                        }
                    }
                    finally {
                        try {
                            ((dsg)o).close();
                        }
                        finally {
                            final Throwable t2;
                            ((Throwable)lju).addSuppressed(t2);
                        }
                    }
                }
            }
            finally {
                try {
                    a.close();
                }
                finally {
                    final Throwable t3;
                    ((Throwable)lju).addSuppressed(t3);
                }
            }
        }
    }
    
    public final void f() {
        synchronized (this) {
            try (final mao b = this.b) {}
            try (final lyo h = this.h) {}
            final Surface g = this.g;
            if (g != null) {
                g.release();
            }
        }
    }
}
