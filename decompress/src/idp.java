import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class idp
{
    public static final nsd a;
    public final AtomicInteger b;
    public final ExecutorService c;
    public final Queue d;
    public final Queue e;
    public idg f;
    public idr g;
    public final jvh h;
    
    static {
        a = nsd.g("com/google/android/apps/camera/timelapse/stabilization/EisProcessExecutor");
    }
    
    public idp(final jvh h, final byte[] array, final byte[] array2) {
        this.b = new AtomicInteger(0);
        this.d = new ArrayDeque();
        this.e = new ArrayDeque();
        this.h = h;
        this.c = mcn.h("Cheetah-eis-executor");
    }
}
