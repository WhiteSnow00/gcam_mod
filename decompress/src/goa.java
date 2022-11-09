import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class goa implements gfg
{
    public static final nsd a;
    private final kwd b;
    private final kwz c;
    private final gdg d;
    private final int e;
    private final gna f;
    private final glv g;
    private final kwx h;
    private final kse i;
    private final klj j;
    private final kzl k;
    
    static {
        a = nsd.g("com/google/android/apps/camera/pixelcamerakit/commands/PckConvergedCaptureCommand");
    }
    
    public goa(final kwd b, final kwz c, final kzl k, final gdg d, final int e, final gna f, final glv g, final kwx h, final kse i) {
        this.b = b;
        this.c = c;
        this.k = k;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = klq.e(k.a(), 1);
    }
    
    @Override
    public final klj a() {
        return this.j;
    }
    
    @Override
    public final klj b() {
        return klq.g(fzu.e());
    }
    
    @Override
    public final void c(final gff gff, final gen gen) {
        if (this.b != null && this.k != null) {
            this.i.f("PckConvergedCaptureCommand");
            this.i.f("AcquireFrameServerSession");
            try {
                final kwh c = this.b.c();
                try {
                    final gmz a = this.f.a(c);
                    try {
                        final fwt a2 = this.g.a(c, this.h);
                        try {
                            final kyh f = c.f();
                            f.f(this.k);
                            gen.a.g.aR(this.f instanceof gnq);
                            this.i.h("AcquireImageSaverSession");
                            final gdf a3 = this.d.a(gen);
                            try {
                                this.i.h("BuildingFrameRequests");
                                final ArrayList list = new ArrayList();
                                for (int max = Math.max(1, Math.min(this.e, (int)this.k.a().aQ())), i = 0; i < max; ++i) {
                                    final kyh a4 = kyh.a(f);
                                    if (i <= 0) {
                                        a4.g(new gny(gen));
                                    }
                                    list.add(a4.b());
                                }
                                this.i.h("SubmittingFrameRequests");
                                list.size();
                                final List c2 = c.c(list);
                                njo.o(c2.isEmpty() ^ true);
                                a.close();
                                a2.close();
                                c.close();
                                this.i.h("RetrievingImages");
                                c2.size();
                                for (final kzh kzh : c2) {
                                    this.i.f("GettingImageFromFrame");
                                    final kvs a5 = kzh.a(this.k);
                                    Label_0632: {
                                        if (a5 != null) {
                                            final kwz c3 = this.c;
                                            final ofn f2 = ofn.f();
                                            a5.j(new gnz(a5, f2));
                                            Label_0570: {
                                                try {
                                                    try {
                                                        if (!a5.e() && !a5.g() && !a5.f()) {
                                                            final kwk kwk = new kwk();
                                                            a5.j(kwk);
                                                            kwk.g();
                                                        }
                                                        final lju d = a5.d(c3);
                                                        if (d == null) {
                                                            goa.a.c().E(1904).x("Failed to get image from %s for frame %s", c3, a5);
                                                        }
                                                        final gaa gaa = new gaa(d, f2);
                                                        a5.close();
                                                        break Label_0570;
                                                    }
                                                    finally {}
                                                }
                                                catch (final InterruptedException ex) {
                                                    Thread.currentThread().interrupt();
                                                }
                                                a5.close();
                                            }
                                            if (gen != null) {
                                                final oey k = ((gaa)gen).k();
                                                k.getClass();
                                                this.i.h("AddingImageToImageSaver");
                                                ((ljr)gen).d();
                                                a3.a((lju)gen, k);
                                            }
                                            a5.close();
                                            break Label_0632;
                                            a5.close();
                                        }
                                    }
                                    kzh.close();
                                    this.i.g();
                                }
                                gff.close();
                                if (a3 != null) {
                                    a3.close();
                                }
                                a2.close();
                                if (a != null) {
                                    a.close();
                                }
                                c.close();
                                return;
                            }
                            finally {
                                if (a3 != null) {
                                    try {
                                        a3.close();
                                    }
                                    finally {
                                        final Throwable t;
                                        ((Throwable)gen).addSuppressed(t);
                                    }
                                }
                            }
                        }
                        finally {
                            try {
                                a2.close();
                            }
                            finally {
                                final Throwable t2;
                                ((Throwable)gen).addSuppressed(t2);
                            }
                        }
                    }
                    finally {
                        if (a != null) {
                            try {
                                a.close();
                            }
                            finally {
                                final Throwable t3;
                                ((Throwable)gen).addSuppressed(t3);
                            }
                        }
                    }
                }
                finally {
                    try {
                        c.close();
                    }
                    finally {
                        final Throwable t4;
                        ((Throwable)gen).addSuppressed(t4);
                    }
                }
            }
            finally {
                this.i.g();
                this.i.g();
                this.f.b();
                gff.close();
            }
        }
        gff.close();
        throw new kuw("FrameServer is not available");
    }
}
