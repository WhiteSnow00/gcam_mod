import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bzh implements bzi
{
    public static final nsd a;
    public final bys b;
    private final Executor c;
    private final ExecutorService d;
    
    static {
        a = nsd.g("com/google/android/apps/camera/brella/examplestorecontroller/BrellaExampleStoreControllerImpl");
    }
    
    public bzh(final Executor c, final ExecutorService d, final bys b) {
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    @Override
    public final bye a(final bza bza, final byx byx) {
        return new bye(this.b, bza, byx, this.d);
    }
    
    @Override
    public final oey b(final String s) {
        return this.b.b(new fli(s, 1));
    }
    
    @Override
    public final oey c(final long n, final String s, final Map map, final byte[] array) {
        return this.b.b(new bzg(s, n, map, array));
    }
    
    @Override
    public final oey d(final noi noi) {
        return this.b.b(new bzf(this, noi));
    }
    
    @Override
    public final oey e(final long n) {
        return this.b.b(new bze(this, n));
    }
    
    @Override
    public final oey f() {
        final bys b = this.b;
        return ofi.r(new bym(b, 1), b.e);
    }
    
    @Override
    public final oey g(final List list) {
        final bys b = this.b;
        return ofi.r(new byn(b, list), b.e);
    }
    
    @Override
    public final void h() {
        ofi.w(this.b.b(new bzd(this)), new doh(1), this.c);
    }
    
    @Override
    public final oey i() {
        final bys b = this.b;
        return ofi.r(new bym(b), b.e);
    }
}
