import java.util.Set;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gnu
{
    public static final nsd a;
    public final kwd b;
    public final kse c;
    private final boolean d;
    private final Executor e;
    
    static {
        a = nsd.g("com/google/android/apps/camera/pixelcamerakit/commands/AfDebugMetadataFetcherShutterAsap");
    }
    
    public gnu(final kwd b, final cxl cxl, final kse c, final Executor e) {
        this.b = b;
        this.c = c;
        this.e = e;
        final niz a = cxl.a(cxs.a);
        this.d = (a.g() && ((Integer)a.c()).equals(3));
    }
    
    public static void c(final kwh kwh, final hhy hhy) {
        ((kzi)kwh).a.m(noi.H(kxc.p(jli.g, 2)), new gnt(hhy));
    }
    
    private final boolean d() {
        return this.d && jli.g != null;
    }
    
    public final void a(final kwh kwh, final hhy hhy) {
        if (!this.d()) {
            return;
        }
        this.c.f("AfDebugFetch#request");
        try {
            try {
                c(kwh, hhy);
                this.c.g();
            }
            finally {
                this.c.g();
                while (true) {}
            }
        }
        catch (final kuw kuw) {}
    }
    
    public final void b(final hhy hhy) {
        if (!this.d()) {
            return;
        }
        this.e.execute(new gns(this, hhy));
    }
}
