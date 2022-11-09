import java.util.Iterator;
import java.util.List;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gql extends gqt
{
    private static final nsd a;
    private final gov b;
    private final gdg c;
    private final int d;
    
    static {
        a = nsd.g("com/google/android/apps/camera/pixelcamerakit/commands/PckZslBurstImageCaptureCommand");
    }
    
    public gql(final gov b, final gfg gfg, final Set set, final gdg c, final int d, final kse kse, final gnu gnu) {
        super(b, gfg, set, kse, gnu);
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    protected final boolean d(final List list, final gff gff, gen b) {
        try {
            b = (gen)this.c.b(b);
            Label_0054: {
                if (b != null) {
                    break Label_0054;
                }
                try {
                    gql.a.b().E(1981).o("Cannot acquire image saver session.");
                    final nrw t;
                    Label_0081: {
                        while (true) {
                            int n;
                            while (true) {
                                gff.close();
                                gqt.e(list);
                                return false;
                                iftrue(Label_0385:)(n != 0);
                                Block_6: {
                                    break Block_6;
                                    Label_0385: {
                                        ((krc)b).close();
                                    }
                                    gff.close();
                                    gqt.e(list);
                                    return true;
                                }
                                gql.a.b().E(1980).o("No images found.");
                                ((krc)b).close();
                                continue;
                            }
                            final kvs kvs = t.next();
                            try {
                                final Set d = this.b.b.d(this.d);
                                final nnn e = nns.e();
                                if (!d.isEmpty()) {
                                    try {
                                        kwp.j(kvs);
                                        for (final kwz kwz : d) {
                                            final lju d2 = kvs.d(kwz);
                                            if (d2 != null) {
                                                kwz.c();
                                                e.g(new ljr(d2));
                                            }
                                        }
                                    }
                                    catch (final InterruptedException ex) {
                                        a.k(gov.a.b(), "Error retrieving the images from Frame %s", kvs.b(), '\u0787');
                                    }
                                }
                                final nns f = e.f();
                                final ljm c = kvs.c();
                                int n2 = n;
                                if (!f.isEmpty()) {
                                    n2 = n;
                                    if (c != null) {
                                        ((gdf)b).a(f.get(0), ofi.n(c));
                                        n2 = 1;
                                    }
                                }
                                kvs.close();
                                n = n2;
                                break Label_0081;
                            }
                            finally {
                                kvs.close();
                            }
                            continue;
                        }
                        gff.close();
                        final int c2 = ((nql)list).c;
                        t = ((nns)list).t();
                        int n = 0;
                    }
                    iftrue(Label_0344:)(!t.hasNext());
                }
                finally {
                    if (b != null) {
                        try {
                            ((krc)b).close();
                        }
                        finally {
                            final Throwable t2;
                            final Throwable t3;
                            t2.addSuppressed(t3);
                        }
                    }
                }
            }
        }
        finally {
            gff.close();
            e(list);
            while (true) {}
        }
    }
}
