import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fxf implements fxc
{
    public static final nsd a;
    public kjk b;
    public oey c;
    public fvp d;
    public fxr e;
    public flq f;
    public fxu g;
    private final kue h;
    private final fmb i;
    private final ixn j;
    private final cxl k;
    private final Runnable l;
    private final lfw m;
    
    static {
        a = nsd.g("com/google/android/apps/camera/one/capture/CaptureCameraDeviceManagerImpl");
    }
    
    public fxf(final kue h, final fmb i, final lfw m, final ixn j, final cxl k) {
        this.l = new fxe(this);
        this.h = h;
        this.i = i;
        this.m = m;
        this.j = j;
        this.k = k;
        this.b = h.a();
    }
    
    @Override
    public final flu a(final crg crg, final fxr e, final jbm jbm) {
        e.getClass();
        final flu flu = new flu(this.l);
        final lfj b = der.b(this.m, this.k, crg.e());
        b.getClass();
        final flq a = this.i.a(b, jbm);
        this.f = a;
        this.e = e;
        this.b.close();
        final kue h = this.h;
        final String value = String.valueOf(this.toString());
        String concat;
        if (value.length() != 0) {
            concat = "CaptureCameraDeviceOpener : ".concat(value);
        }
        else {
            concat = new String("CaptureCameraDeviceOpener : ");
        }
        final krc b2 = h.b(concat);
        final kjk a2 = this.h.a();
        a2.c(b2);
        this.b = a2;
        this.g = this.m.f(a.a);
        final btf btf = new btf();
        a2.c(btf);
        ofi.w(this.c = this.e.b(a, ofi.n(this.j)), new fxd(this, btf, flu, a2), mcn.h("CCDevMngr"));
        return flu;
    }
}
