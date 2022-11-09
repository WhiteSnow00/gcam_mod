import java.util.concurrent.Executor;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class epk
{
    public static final nsd a;
    public final WeakReference b;
    public final kjm c;
    public final niz d;
    public final bql e;
    public final Executor f;
    
    static {
        a = nsd.g("com/google/android/apps/camera/legacy/app/module/pckimageintent/ImageIntentResultHandler");
    }
    
    public epk(final WeakReference b, final kjm c, final bmq bmq, final bqm e, final Executor f) {
        this.b = b;
        this.c = c;
        this.e = e;
        this.f = f;
        this.d = bmx.e(bmq.a());
    }
}
