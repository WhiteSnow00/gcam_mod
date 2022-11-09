import java.util.List;
import java.util.ArrayList;
import android.os.Trace;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hag implements dpz
{
    private static final nsd a;
    private final gzw b;
    private final hah c;
    private final dpy d;
    private final fev e;
    private final niz f;
    private final niz g;
    private long h;
    
    static {
        a = nsd.g("com/google/android/apps/camera/qualityscore/FrameQualityScoreProcessor");
    }
    
    public hag(final gzw b, final hah c, final dpy d, final fev e, final cxl cxl, final pii pii) {
        this.h = -1L;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        final cxm a = cxj.a;
        cxl.c();
        this.f = niz.i(pii.get());
        this.g = nii.a;
    }
    
    public final void b(final long h) {
        monitorenter(this);
        try {
            final lju c = this.e.c(h);
            if (c == null) {
                monitorexit(this);
                return;
            }
            try {
                if (this.c.c(h) == null) {
                    final gzn a = this.d.a(h);
                    if (a != null) {
                        Trace.beginSection("frameQualityScorer.getFrameScore");
                        final had a2 = this.b.a(c, a);
                        Trace.endSection();
                        if (h <= this.h) {
                            hag.a.b().E(2202).o("Out of order frame scores detected!");
                        }
                        this.c.f(a2);
                        if (a2.p.g()) {
                            final dqq dqq = (dqq)((njd)this.f).a;
                            final hat hat = (hat)a2.p.c();
                            final ArrayList list = new ArrayList();
                            for (final has has : hat.a) {
                                final dql dql = new dql(null);
                                dql.c(-1L);
                                dql.b = nii.a;
                                dql.b(0.0f);
                                dql.d = nii.a;
                                dql.a(0.0f);
                                dql.c(has.a);
                                dql.b = has.b;
                                dql.b(has.c);
                                dql.d = has.d;
                                dql.a(has.e);
                                final Long a4 = dql.a;
                                if (a4 == null || dql.c == null || dql.e == null) {
                                    final StringBuilder sb = new StringBuilder();
                                    if (dql.a == null) {
                                        sb.append(" trackId");
                                    }
                                    if (dql.c == null) {
                                        sb.append(" score");
                                    }
                                    if (dql.e == null) {
                                        sb.append(" aggregatedToneConfidence");
                                    }
                                    final String value = String.valueOf(sb);
                                    final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
                                    sb2.append("Missing required properties:");
                                    sb2.append(value);
                                    throw new IllegalStateException(sb2.toString());
                                }
                                list.add(new dqm(a4, dql.b, dql.c, dql.d, dql.e));
                            }
                            final dqn dqn = new dqn(hat.f, list);
                            try {
                                synchronized (dqq.c) {
                                    dqq.b[dqq.a.b(dqn.a)] = dqn;
                                }
                            }
                            catch (final IllegalArgumentException ex) {}
                        }
                        this.h = h;
                    }
                }
                c.close();
                monitorexit(this);
            }
            finally {
                try {
                    c.close();
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    t.addSuppressed(t2);
                }
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void k(final gzn gzn) {
        synchronized (this) {
            this.b(gzn.b);
        }
    }
}
