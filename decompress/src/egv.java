import com.google.android.apps.camera.jni.eis.EisNative;

// 
// Decompiled by Procyon v0.6.0
// 

public final class egv
{
    private long a;
    
    public egv(final egw egw, final int n, final int n2, final float n3, final boolean b) {
        this.a = EisNative.createHandle(egw.j, n, n2, n3, b, -1);
    }
    
    public final int a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                return EisNative.getNumOfFramesToLookAhead(a);
            }
            throw new IllegalStateException("getNumOfFramesToLookAhead() called on a released EisNativeWrapper.");
        }
    }
    
    public final int b() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                return EisNative.getNumStrips(a);
            }
            throw new IllegalStateException("getNumStrips() called on a released EisNativeWrapper.");
        }
    }
    
    public final void c() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                EisNative.releaseHandle(a);
                this.a = 0L;
                return;
            }
            throw new IllegalStateException("release() called on a released EisNativeWrapper.");
        }
    }
    
    public final void d(final int n, final int n2) {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                EisNative.setActiveArraySize(a, n, n2);
                return;
            }
            throw new IllegalStateException("setActiveArraySize() called on a released EisNativeWrapper.");
        }
    }
    
    public final void e(final int n, final int n2) {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                EisNative.setCropWindowSize(a, n, n2);
                return;
            }
            throw new IllegalStateException("setCropWindowSize() called on a released EisNativeWrapper.");
        }
    }
    
    public final boolean f() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                return EisNative.isTripodMode(a);
            }
            throw new IllegalStateException("isTripodMode() called on a released EisNativeWrapper.");
        }
    }
    
    public final long g(final byte[] array, final int n, final int n2, long processFrame, final long n3, final long n4, final long n5, final float n6, final float n7, final float n8, final float[] array2, final float[] array3, final float[] array4) {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                processFrame = EisNative.processFrame(a, array, n, n2, processFrame, n3, n4, n5, n6, n7, n8, true, 0L, array2, array3, array4);
                return processFrame;
            }
            throw new IllegalStateException("processFrame() called on a released EisNativeWrapper.");
        }
    }
    
    public final void h(final float n, final float n2, final float n3, final long n4) {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                EisNative.processGyro(a, n, n2, n3, n4);
                return;
            }
            throw new IllegalStateException("processGyro() called on a released EisNativeWrapper.");
        }
    }
    
    public final void i(final float n, final float n2, final long n3) {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                EisNative.processLensOffset(a, n, n2, n3);
                return;
            }
            throw new IllegalStateException("processLensOffset() called on a released EisNativeWrapper.");
        }
    }
    
    public final void j() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                EisNative.setStabilizationStrength(a, 1.0f);
                return;
            }
            throw new IllegalStateException("setStabilizationStrength() called on a released EisNativeWrapper.");
        }
    }
}
