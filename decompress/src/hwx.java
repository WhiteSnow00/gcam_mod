import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hwx
{
    public static final nsd a;
    public final oey b;
    public final String c;
    public final Executor d;
    public Object e;
    public final Object f;
    
    static {
        a = nsd.g("com/google/android/apps/camera/storage/cache/SingleKeyCache");
    }
    
    public hwx(final oey b, final Executor d) {
        this.f = new Object();
        b.getClass();
        this.b = b;
        this.c = "indicatorThumbnail";
        this.d = d;
    }
    
    public final oey a() {
        synchronized (this.f) {
            final Object e = this.e;
            if (e != null) {
                return ofi.n(e);
            }
            monitorexit(this.f);
            return odg.i(this.b, new hwu(this), this.d);
        }
    }
}
