import java.util.Iterator;
import java.util.List;
import android.hardware.HardwareBuffer;
import com.google.android.libraries.oliveoil.gl.EGLImage;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.SizeF;
import android.hardware.camera2.CaptureResult;
import android.util.ArrayMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dko implements jfy
{
    private static final nsd a;
    private static final String b;
    private static final String c;
    private static final float[] d;
    private final Map e;
    private final maq f;
    private final mao g;
    private final lzu h;
    private final lyp i;
    private final dkj j;
    private man k;
    private lyo l;
    private lfu m;
    private float n;
    private float o;
    
    static {
        a = nsd.g("com/google/android/apps/camera/fastzoom/FastZoomEffect");
        b = nfa.i("in vec2 position;", new Object[] { "uniform float zoomFactor;", "out vec2 texCoord;", "void main() {", "  texCoord = (1.0 + position) / 2.0;", "  gl_Position = vec4(zoomFactor * position, 0.0, 1.0);", "}" }, "\n");
        c = nfa.i("#extension GL_EXT_YUV_target : enable", new Object[] { "precision highp float;", "uniform highp sampler2D imgTex;", "in vec2 texCoord;", "layout(yuv) out vec4 outColor;", "void main() {", "  outColor = vec4(rgb_2_yuv(texture(imgTex, texCoord).rgb, itu_601_full_range), 1.0);", "}" }, "\n");
        d = new float[] { -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f };
    }
    
    public dko(final lyp i, final dkj j) {
        this.e = (Map)new ArrayMap();
        this.n = 1.0f;
        this.o = 0.001953125f;
        this.i = i;
        this.j = j;
        this.f = maq.f(i, mar.b(dko.d));
        this.g = mao.a(i);
        final lzt b = lzu.b(i);
        b.b(mga.g(mal.d(i, dko.b)));
        b.b(mga.g(mal.b(i, dko.c)));
        this.h = b.a();
        this.m = j.b.get();
    }
    
    private final boolean d(final float n, final float n2) {
        return Math.abs(n - n2) < this.o;
    }
    
    @Override
    public final jfz a() {
        return jfz.d;
    }
    
    @Override
    public final boolean b() {
        return !this.d(this.j.a(), this.n);
    }
    
    @Override
    public final void c(kvs d, kwz f, kvs kvs) {
        final lfu m = this.j.b.get();
        if (m == null) {
            return;
        }
        if (this.m == null) {
            this.m = m;
        }
        if (this.m != m) {
            return;
        }
        final dkn a = this.j.a.a();
        if (a != null) {
            if (this.k == null || this.l == null) {
                final dkn a2 = this.j.a.a();
                if (a2 == null) {
                    return;
                }
                final kre b = a2.b;
                final man c = man.c(this.i, new lxy(lvl.d(b.a, b.b)));
                this.k = c;
                this.l = lyo.d(mga.f(c));
                this.o = 2.0f / Math.max((float)b.a, (float)b.b);
            }
            final man k = this.k;
            final lyo l = this.l;
            final ljm c2 = d.c();
            if (l != null && k != null) {
                if (c2 != null) {
                    if (this.d(this.j.a(), this.n)) {
                        return;
                    }
                    final String s = (String)c2.d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
                    final Map h = c2.h();
                    lji lji = c2;
                    String s2;
                    if ((s2 = s) != null) {
                        lji = c2;
                        s2 = s;
                        if (!h.isEmpty()) {
                            final lji lji2 = lji = h.get(s);
                            s2 = s;
                            if (lji2 == null) {
                                final Map.Entry<Object, V> entry = ((nnx)h).s().iterator().next();
                                dko.a.c().E(824).x("Missing camera metadata for activeId=%s. Resorting to metadata from id=%s", s, entry.getKey());
                                s2 = entry.getKey();
                                lji = (lji)entry.getValue();
                            }
                        }
                    }
                    if (this.e.isEmpty()) {
                        final dkn a3 = this.j.a.a();
                        if (a3 != null) {
                            final List f2 = a3.a.f();
                            if (f2.size() > 1) {
                                final lfg d2 = a3.a.d();
                                final SizeF sizeF = (SizeF)d2.m(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
                                final float[] array = (float[])d2.m(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                                if (sizeF != null && array != null) {
                                    final float d3 = och.d(array);
                                    for (final lfj lfj : f2) {
                                        final SizeF sizeF2 = (SizeF)a3.a.a(lfj.a).m(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
                                        if (sizeF2 != null) {
                                            this.e.put(lfj.a, sizeF.getWidth() / d3 / sizeF2.getWidth());
                                        }
                                    }
                                }
                            }
                        }
                    }
                    final Rect rect = (Rect)lji.d(CaptureResult.SCALER_CROP_REGION);
                    if (rect == null) {
                        a.l(dko.a.b(), "Scaler crop region unexpectedly missing.", '\u0337');
                        return;
                    }
                    final Float n = (Float)lji.d(CaptureResult.LENS_FOCAL_LENGTH);
                    if (n == null) {
                        a.l(dko.a.b(), "Focal length unexpectedly missing.", '\u0336');
                        return;
                    }
                    float n2;
                    if (this.e.containsKey(s2)) {
                        n2 = this.e.get(s2) * n;
                    }
                    else {
                        n2 = 1.0f;
                    }
                    final Rect rect2 = (Rect)a.a.a(s2).m(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                    if (rect2 == null) {
                        a.l(dko.a.b(), "Active array size unexpectedly missing.", '\u0335');
                        return;
                    }
                    final float n3 = rect2.width() / (float)rect.width() * n2;
                    final float max = Math.max(1.0f, this.j.a() / n3);
                    this.n = n3;
                    d = (kvs)d.d(f);
                    Label_0829: {
                        if (d != null) {
                            break Label_0829;
                        }
                        try {
                            dko.a.b().E(820).o("inputImage unexpectedly null");
                            return;
                            f = (kwz)((lju)d).f();
                            try {
                                f.getClass();
                                kvs = (kvs)new EGLImage((HardwareBuffer)f);
                                try {
                                    final lzn b2 = lzn.b(this.i, (EGLImage)kvs);
                                    try {
                                        final lyo b3 = lyo.b(this.i, (EGLImage)kvs);
                                        try {
                                            this.g.c(b2, l);
                                            final lzi a4 = lzi.a(this.f).a(this.h);
                                            a4.c("position", 0);
                                            a4.e("zoomFactor", max);
                                            a4.f(k);
                                            a4.b(b3);
                                            lza.c(this.i);
                                            b3.close();
                                            b2.close();
                                            ((EGLImage)kvs).close();
                                            if (f != null) {
                                                ((HardwareBuffer)f).close();
                                            }
                                            d.close();
                                        }
                                        finally {
                                            try {
                                                b3.close();
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
                                            b2.close();
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
                                        ((EGLImage)kvs).close();
                                    }
                                    finally {
                                        final Throwable t5;
                                        final Throwable t6;
                                        t5.addSuppressed(t6);
                                    }
                                }
                            }
                            finally {
                                if (f != null) {
                                    try {
                                        ((HardwareBuffer)f).close();
                                    }
                                    finally {
                                        final Throwable t7;
                                        ((Throwable)kvs).addSuppressed(t7);
                                    }
                                }
                            }
                        }
                        finally {
                            if (d != null) {
                                try {
                                    d.close();
                                }
                                finally {
                                    final Throwable t8;
                                    ((Throwable)f).addSuppressed(t8);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public final void close() {
        final man k = this.k;
        if (k != null) {
            k.a();
            this.k = null;
        }
        final lyo l = this.l;
        if (l != null) {
            l.a();
            this.l = null;
        }
        this.f.a();
        this.h.a();
        final mao g = this.g;
        final lzu c = g.c;
        if (c != null) {
            c.a();
            g.c = null;
        }
    }
}
