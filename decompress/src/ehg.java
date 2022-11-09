import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import com.google.android.apps.camera.jni.lensoffset.LensOffsetQueueNative;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ehg implements ehf
{
    private final Object a;
    private final Set b;
    private final long c;
    private boolean d;
    
    public ehg(final int n, final kre kre) {
        this.a = new Object();
        this.b = new HashSet();
        this.c = LensOffsetQueueNative.createHandle(n, kre.a, kre.b);
        this.d = false;
    }
    
    @Override
    public final float[] a(final long n) {
        final float[] array2;
        final float[] array = array2 = new float[2];
        array2[1] = (array2[0] = 0.0f);
        synchronized (this.a) {
            if (this.d) {
                return array;
            }
            if (!LensOffsetQueueNative.getLensOffsetAtTime(this.c, n, array)) {
                nsd.b.F(TimeUnit.MILLISECONDS);
            }
            return array;
        }
    }
    
    @Override
    public final float[] b(final long n, long n2) {
        final float[] array2;
        final float[] array = array2 = new float[2];
        array2[1] = (array2[0] = 0.0f);
        final Object a = this.a;
        monitorenter(a);
        try {
            if (this.d) {
                monitorexit(a);
                return array;
            }
            if (n2 < 2000000L) {
                if (!LensOffsetQueueNative.getLensOffsetAtTime(this.c, n, array)) {
                    nsd.b.F(TimeUnit.MILLISECONDS);
                }
            }
            else {
                final long n3 = n2 / 2L;
                n2 = n - n3;
                final float[] array3 = { 0.0f, 0.0f };
                int n4 = 0;
                while (n2 < n + n3) {
                    if (!LensOffsetQueueNative.getLensOffsetAtTime(this.c, n2, array3)) {
                        nsd.b.F(TimeUnit.MILLISECONDS);
                    }
                    array[0] += array3[0];
                    array[1] += array3[1];
                    ++n4;
                    n2 += 2000000L;
                }
                if (n4 > 0) {
                    final float n5 = array[0];
                    final float n6 = (float)n4;
                    array[0] = n5 / n6;
                    array[1] /= n6;
                }
            }
            monitorexit(a);
            return array;
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    @Override
    public final void c(final long n, final float n2, final float n3) {
        final Object a = this.a;
        monitorenter(a);
        try {
            if (!this.d) {
                if (LensOffsetQueueNative.processAndEnqueueLensOffset(this.c, n, n2, n3)) {
                    final Iterator iterator = this.b.iterator();
                    while (iterator.hasNext()) {
                        ((ehe)iterator.next()).a();
                    }
                }
                monitorexit(a);
                return;
            }
            monitorexit(a);
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
    
    @Override
    public final void close() {
        synchronized (this.a) {
            if (this.d) {
                return;
            }
            this.d = true;
            LensOffsetQueueNative.releaseHandle(this.c);
        }
    }
}
