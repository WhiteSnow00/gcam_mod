import java.util.List;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class gqt implements gfg
{
    private static final nsd a;
    private final gue b;
    private final gfg c;
    private final Set d;
    private final kse e;
    private final gnu f;
    
    static {
        a = nsd.g("com/google/android/apps/camera/pixelcamerakit/commands/PckZslImageCaptureCommandBase");
    }
    
    public gqt(final gue b, final gfg c, final Set d, final kse e, final gnu f) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    protected static final void e(final List list) {
        final nrw t = ((nns)list).t();
        while (t.hasNext()) {
            ((kvs)t.next()).close();
        }
    }
    
    private static final void f(final gfg gfg, final List list, final gff gff, final gen gen) {
        e(list);
        gen.b.k().w();
        gen.c.g();
        gfg.c(gff, gen);
    }
    
    @Override
    public final klj a() {
        return this.c.a();
    }
    
    @Override
    public final klj b() {
        return klq.g(fzu.c(nqb.n(this.d)));
    }
    
    @Override
    public void c(final gff gff, final gen gen) {
        this.e.f("pckZsl#lockBuffer");
        final gud a = this.b.a();
        try {
            this.e.h("pckZsl#getFrames");
            Object o = this.b.i();
            a.a();
            this.e.g();
            Object o2 = gen.b;
            boolean b = true;
            ((hhy)o2).D(true);
            Label_0413: {
                if (((nql)o).c <= 0) {
                    gqt.a.b().E(2004).o("Can't execute command, not enough ZSL images");
                    f(this.c, (List)o, gff, gen);
                }
                else {
                    this.e.f("pckHdrZsl#captureIndicator");
                    if (gen.c.d() == null) {
                        gen.c.c().e();
                    }
                    this.e.h("pckZsl#afMetadata");
                    this.f.b(gen.b);
                    this.e.h("pckZsl#filterFrames");
                    o2 = this.b.h((List)o);
                    this.e.g();
                    while (true) {
                        try {
                            try {
                                this.e.f("pckZsl#processZslFrames");
                                final boolean d = this.d((List)o2, gff, gen);
                                this.e.g();
                                if (!d) {
                                    o = this.c;
                                    f((gfg)o, (List)o2, gff, gen);
                                }
                            }
                            finally {}
                        }
                        catch (final dgi o) {
                            if (o instanceof dgf) {
                                gqt.a.b().h((Throwable)o).E(2003).o("Aborted main ZSL shot, not executing fallback");
                                b = false;
                            }
                            else {
                                gqt.a.b().h((Throwable)o).E(2002).o("Error executing main ZSL command, executing fallback");
                            }
                            this.e.g();
                            if (b) {
                                o = this.c;
                                continue;
                            }
                            gen.c.f();
                            gen.b.C(iwx.a, (Throwable)o);
                        }
                        break;
                    }
                    break Label_0413;
                    this.e.g();
                    f(this.c, (List)o2, gff, gen);
                }
            }
            a.a();
        }
        finally {
            a.a();
            while (true) {}
        }
    }
    
    protected abstract boolean d(final List p0, final gff p1, final gen p2);
}
