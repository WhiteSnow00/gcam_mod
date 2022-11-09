import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hyl
{
    public static final nsd a;
    public final kse b;
    public final liy c;
    public final cxl d;
    public final hwy e;
    private final Executor f;
    
    static {
        a = nsd.g("com/google/android/apps/camera/storage/spacechecker/StorageSpaceCheckerImpl");
    }
    
    public hyl(final hwy e, final Executor f, final kse b, final liy c, final cxl d) {
        this.e = e;
        this.f = f;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final oey a() {
        return this.b(this.f);
    }
    
    public final oey b(final Executor executor) {
        return ofi.q(new hyk(this), executor);
    }
}
