import com.google.android.apps.camera.jni.facebeautification.FaceBeautificationNative;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class dhs implements dja
{
    public static final nsd a;
    public final int b;
    public final Executor c;
    public final long d;
    private final gae e;
    
    static {
        a = nsd.g("com/google/android/apps/camera/facebeautification/CpuFaceBeautificationController");
    }
    
    public dhs(final liz liz, final gae e, final Executor c, final int b) {
        this.e = e;
        this.c = c;
        this.b = b;
        final boolean b2 = liz.b();
        int n = 0;
        if (!b2 && !liz.c() && !liz.d() && !liz.e()) {
            if (!liz.f()) {
                n = 1;
            }
        }
        this.d = FaceBeautificationNative.createHandle(n, b);
    }
    
    @Override
    public final oey a(final diz diz) {
        if (!diz.b.b()) {
            return ofi.n(new dih(diz.a));
        }
        return this.e.a(new dhq(this, diz));
    }
    
    @Override
    public final void close() {
        this.c.execute(new dhp(this));
    }
}
