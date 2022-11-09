import java.util.List;
import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.imageproc.Resample;
import com.google.googlex.gcam.YuvWriteView;
import com.google.android.libraries.camera.jni.yuv.YuvUtilNative;
import com.google.android.libraries.oliveoil.gl.EGLImage;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gxg implements gxi
{
    private final ohs a;
    private final mao b;
    private gxj c;
    private gxh d;
    
    public gxg(final ohs a, final mao b) {
        this.a = a;
        this.b = b;
    }
    
    private final gxh b() {
        synchronized (this) {
            if (this.d == null) {
                this.d = new gxh(this.b);
            }
            return this.d;
        }
    }
    
    private final gxi c() {
        synchronized (this) {
            if (this.c == null) {
                this.c = new gxj(this.a);
            }
            return this.c;
        }
    }
    
    @Override
    public final void a(lju lju, lju lju2) {
        final HardwareBuffer f = lju.f();
        try {
            final HardwareBuffer f2 = lju2.f();
            Label_0199: {
                if (f == null || f2 == null) {
                    break Label_0199;
                }
                try {
                    final gxh b = this.b();
                    final lyp b2 = b.a.b;
                    lju = (lju)new EGLImage(f);
                    try {
                        lju2 = (lju)new EGLImage(f2);
                        try {
                            final lzn b3 = lzn.b(b2, (EGLImage)lju);
                            try {
                                final lyo b4 = lyo.b(b2, (EGLImage)lju2);
                                try {
                                    b.a.c(b3, b4);
                                    lza.c(b2);
                                    b4.close();
                                    b3.close();
                                    ((EGLImage)lju2).close();
                                    ((EGLImage)lju).close();
                                    f2.close();
                                    f.close();
                                    return;
                                }
                                finally {
                                    try {
                                        b4.close();
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
                                    b3.close();
                                }
                                finally {
                                    final Throwable t3;
                                    final Throwable t4;
                                    t3.addSuppressed(t4);
                                }
                            }
                        }
                        finally {
                            try {
                                ((EGLImage)lju2).close();
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
                            ((EGLImage)lju).close();
                        }
                        finally {
                            final Throwable t7;
                            ((Throwable)lju2).addSuppressed(t7);
                        }
                    }
                    if (lju.a() == ((let)lju2).a && lju.a() == 35) {
                        final gxi c = this.c();
                        lju.getClass();
                        final int a = lju.a();
                        final int a2 = ((let)lju2).a;
                        final boolean b5 = false;
                        njo.d(a == a2);
                        njo.d(lju.a() == 35);
                        if (lju.c() == ((let)lju2).b && lju.b() == ((let)lju2).c) {
                            final gyi b6 = ((gxj)c).b;
                            lju.getClass();
                            njo.d(lju.a() == ((let)lju2).a);
                            njo.d(lju.a() != 34);
                            njo.d(((let)lju2).a != 34);
                            final kre kre = new kre(lju.c(), lju.b());
                            final kre kre2 = new kre(((let)lju2).b, ((let)lju2).c);
                            final boolean equals = kre.equals(kre2);
                            final String value = String.valueOf(kre);
                            final String value2 = String.valueOf(kre2);
                            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 60 + String.valueOf(value2).length());
                            sb.append("source image size ");
                            sb.append(value);
                            sb.append(" is different with destination image size ");
                            sb.append(value2);
                            njo.e(equals, sb.toString());
                            if (lju.a() != 35) {
                                final int a3 = lju.a();
                                final StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Unsupported image format: ");
                                sb2.append(a3);
                                throw new UnsupportedOperationException(sb2.toString());
                            }
                            final List h = lju.h();
                            final nns k = ((let)lju2).k();
                            if (!YuvUtilNative.copyYUV_420_888Native(lju.c(), lju.b(), h.get(0).getBuffer(), h.get(1).getBuffer(), h.get(2).getBuffer(), h.get(0).getRowStride(), h.get(1).getRowStride(), h.get(1).getPixelStride(), ((ljt)k.get(0)).getBuffer(), ((ljt)k.get(1)).getBuffer(), ((ljt)k.get(2)).getBuffer(), ((ljt)k.get(0)).getRowStride(), ((ljt)k.get(1)).getRowStride(), ((ljt)k.get(1)).getPixelStride())) {
                                throw new IllegalStateException("Copy failed.");
                            }
                            final nrw t8 = ((let)lju2).k().t();
                            while (t8.hasNext()) {
                                ((ljt)t8.next()).getBuffer().rewind();
                            }
                        }
                        else {
                            final YuvWriteView c2 = ((gxj)c).a.c(lju);
                            final YuvWriteView c3 = ((gxj)c).a.c(lju2);
                            final long a4 = c2.a;
                            final long e = YuvWriteView.e(c3);
                            njo.e(a4 != 0L, "src is null");
                            njo.e(e != 0L || b5, "dst is null");
                            Resample.resampleLanczosYuvImpl(a4, 0.0f, e);
                        }
                        if (f2 != null) {
                            f2.close();
                        }
                        if (f != null) {
                            f.close();
                        }
                        return;
                    }
                    throw new UnsupportedOperationException("No transformer available to transform image!");
                }
                finally {
                    if (f2 != null) {
                        try {
                            f2.close();
                        }
                        finally {
                            final Throwable t9;
                            ((Throwable)lju).addSuppressed(t9);
                        }
                    }
                }
            }
        }
        finally {
            Label_1083: {
                if (f != null) {
                    try {
                        f.close();
                        break Label_1083;
                    }
                    finally {
                        final Throwable t10;
                        ((Throwable)lju).addSuppressed(t10);
                    }
                    break Label_1083;
                }
                break Label_1083;
            }
            while (true) {}
        }
    }
}
