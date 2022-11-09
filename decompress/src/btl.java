import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class btl
{
    public static final nsd a;
    public final oey b;
    public final long c;
    
    static {
        a = nsd.g("com/google/android/apps/camera/async/OptionalFuture");
    }
    
    public btl(final oey b, final long c) {
        this.b = b;
        this.c = c;
    }
    
    public static btl a() {
        return new btl(ofi.n(null), 0L);
    }
    
    public final niz b() {
        try {
            return niz.h(this.b.get(this.c, TimeUnit.MILLISECONDS));
        }
        catch (final Exception ex) {
            btl.a.c().E(141).r("Failed to resolve %s, returning absent instead.", this.b);
            return nii.a;
        }
    }
}
