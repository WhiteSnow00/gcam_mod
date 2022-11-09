import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eih implements eij
{
    private static final nsd d;
    public final hia a;
    public final hie b;
    public final huz c;
    private final drs e;
    private boolean f;
    
    static {
        d = nsd.g("com/google/android/apps/camera/kepler/VideoAstrolapseSession");
    }
    
    public eih(final hif hif, final drs e, final huz c) {
        this.f = false;
        final hie c2 = hif.c(System.currentTimeMillis());
        this.b = c2;
        this.a = c2.a(llk.e.j);
        this.e = e;
        this.c = c;
        final nsx a = ntf.a;
    }
    
    public final void a(final lkb lkb) {
        synchronized (this) {
            if (this.f) {
                return;
            }
            try {
                lkb.i();
                final String lastPathSegment = lkb.b().getLastPathSegment();
                lastPathSegment.getClass();
                this.e.b(Long.parseLong(lastPathSegment), drk.f);
                this.c.u();
                this.f = true;
            }
            catch (final IOException ex) {
                a.m(eih.d.b().g(ntf.a, "VideoKeplerSession"), "Error initializing output file.", '\u04d6', ex);
            }
        }
    }
}
