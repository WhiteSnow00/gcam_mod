import com.google.googlex.gcam.BurstSpec;
import java.util.Iterator;
import com.integrity.annotations.PaiConfiguration;
import j$.util.function.BiConsumer;
import java.util.Map;
import j$.util.Map$_EL;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.google.android.libraries.camera.jni.yuv.YuvUtilNative;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class guc implements duz, dvr, dwc
{
    private final gry a;
    private final HashMap b;
    private final dxk c;
    private final hdz d;
    private final fxu e;
    
    public guc(final gry a, final dxk c, final hdz d, final fxu e) {
        this.b = new HashMap();
        this.a = a;
        this.c = c;
        this.e = e;
        this.d = d;
    }
    
    @PaiConfiguration(continueOnFailure = false, modeFallback = false)
    @Override
    public void a(final dxh dxh, int n, final long n2, final ljm ljm) {
        new HashMap();
        synchronized (this) {
            if (this.b.containsKey(dxh)) {
                final HashMap hashMap = this.b.remove(dxh);
                monitorexit(this);
                if (hashMap != null) {
                    final Long value = n2;
                    if (hashMap.containsKey(value)) {
                        final lju lju = (lju)hashMap.get(value);
                        if (lju != null) {
                            try {
                                final Bitmap a = YuvUtilNative.a(lju);
                                final int b = boa.b(dxh.c.a.a, this.e);
                                if (!this.d.c(this.e.l())) {
                                    n = b;
                                }
                                else {
                                    n = 0;
                                }
                                final hdz d = this.d;
                                a.getClass();
                                Bitmap bitmap2;
                                final Bitmap bitmap = bitmap2 = d.a(a, b, this.e.l());
                                if (n != 0 && (bitmap2 = bitmap) != null) {
                                    final Matrix matrix = new Matrix();
                                    matrix.postRotate((float)n);
                                    bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                                }
                                dxh.c.b.U(bitmap2, 0);
                                dxh.c.b.W(bitmap2);
                            }
                            finally {
                                lju.close();
                            }
                        }
                    }
                }
                if (hashMap != null) {
                    Map$_EL.forEach((Map)hashMap, (BiConsumer)gub.a);
                    hashMap.clear();
                }
                return;
            }
            throw new IllegalStateException("Shot hasn't been started yet!");
        }
    }
    
    @Override
    public final void c(final dxh dxh, final dvv dvv) {
        this.j(dxh);
    }
    
    @Override
    public final void d(final him him) {
        monitorenter(this);
        try {
            while (true) {
                for (dxh dxh : this.b.keySet()) {
                    if (dxh.c.b.h().equals(him)) {
                        final dxh dxh2 = dxh;
                        if (dxh2 != null) {
                            this.j(dxh2);
                        }
                        monitorexit(this);
                        return;
                    }
                }
                final dxh dxh2 = null;
                continue;
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @PaiConfiguration(continueOnFailure = false, modeFallback = false)
    @Override
    public void e(final dxh dxh, final kvs kvs) {
        synchronized (this) {
            if (this.b.containsKey(dxh)) {
                final lju g = this.a.a(kvs).g();
                final kvx b = kvs.b();
                if (b != null) {
                    this.b.get(dxh).put(b.a, g);
                }
            }
            kvs.close();
        }
    }
    
    @Override
    public final void f(final dxh dxh, final BurstSpec burstSpec, final ljm ljm) {
        synchronized (this) {
            this.b.put(dxh, new HashMap<dxh, HashMap>());
        }
    }
    
    @Override
    public final void g(final him him) {
        final dxi a = this.c.a(him);
        a.a(new gua(this));
        a.e(this);
    }
    
    @Override
    public final void h(final dxh dxh) {
    }
    
    protected final void j(final dxh dxh) {
        synchronized (this) {
            final HashMap hashMap = this.b.remove(dxh);
            if (hashMap != null) {
                Map$_EL.forEach((Map)hashMap, (BiConsumer)gub.b);
                hashMap.clear();
            }
        }
    }
    
    @Override
    public final void n(final dxh dxh) {
        synchronized (this) {
            this.j(dxh);
        }
    }
}
