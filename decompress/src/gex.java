// 
// Decompiled by Procyon v0.6.0
// 

public final class gex implements gfg
{
    private static final nsd a;
    private final gfg b;
    private final klj c;
    private final fea d;
    private final gid e;
    
    static {
        a = nsd.g("com/google/android/apps/camera/one/photo/commands/PortraitCaptureCommand");
    }
    
    public gex(final gid e, final fea d, final gfg b) {
        this.e = e;
        this.d = d;
        this.b = b;
        this.c = klq.d(b.a(), klq.e(e.a, 1));
    }
    
    @Override
    public final klj a() {
        return this.c;
    }
    
    @Override
    public final klj b() {
        return this.b.b();
    }
    
    @Override
    public final void c(final gff gff, final gen gen) {
        final gid e = this.e;
        Object b = e.b;
        synchronized (b) {
            final boolean f = e.f;
            boolean b2 = false;
            if (!f && e.c.isEmpty()) {
                final int e2 = e.e;
                if (e2 > 0) {
                    e.e = e2 - 1;
                    e.d.a = e.a();
                    b2 = true;
                }
            }
            monitorexit(b);
            e.d.c();
            if (b2) {
                b = new gib(e);
            }
            else {
                b = null;
            }
            this.e.a.aQ();
            if (b == null) {
                a.l(gex.a.c(), "Ticket not available", '\u0714');
                return;
            }
            final hhy b3 = gen.b;
            final niz h = niz.h(b3);
            if (!h.g()) {
                a.k(gex.a.c(), "Capture session not a MultiImageCaptureSession: %s", b3, '\u0713');
            }
            final fdz a = this.d.a(gen);
            a.b();
            if (h.g()) {
                final niz a2 = a.a();
                if (a2.g()) {
                    ((hgm)h.c()).c = niz.i(a2.c());
                }
            }
            gen.a.f.c((krc)b);
            this.b.c(gff, gen);
            a.c();
        }
    }
}
