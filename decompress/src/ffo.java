// 
// Decompiled by Procyon v0.6.0
// 

final class ffo
{
    public final long a;
    public long b;
    public long c;
    public boolean d;
    public boolean e;
    final /* synthetic */ ffp f;
    private final lup g;
    
    public ffo(final ffp f, final lup g, final long a) {
        this.f = f;
        this.b = 0L;
        this.d = false;
        this.e = false;
        this.g = g;
        this.a = a;
        final long d = f.d;
        this.c = d;
        for (long c = d + 1L; c < f.e; ++c) {
            final mca mca = f.b.get(c);
            mca.getClass();
            if (mca.b.presentationTimeUs >= a) {
                break;
            }
            this.c = c;
        }
    }
    
    public final void a(final long b, final boolean d) {
        final ffp f = this.f;
        monitorenter(f);
        try {
            if (this.e) {
                monitorexit(f);
                return;
            }
            this.b = b;
            this.d = d;
            long c = this.c + 1L;
            while (true) {
                final ffp f2 = this.f;
                if (c >= f2.e) {
                    break;
                }
                if (c <= f2.d) {
                    if (c >= 0L) {
                        final krr a = f2.a;
                        final StringBuilder sb = new StringBuilder(65);
                        sb.append("packet at index ");
                        sb.append(c);
                        sb.append(" was likely dropped too early");
                        a.h(sb.toString());
                    }
                }
                else {
                    final mca mca = f2.b.get(c);
                    mca.getClass();
                    if (b < mca.b.presentationTimeUs) {
                        break;
                    }
                    if (mca.b.presentationTimeUs < this.a) {
                        this.c = c;
                    }
                    else {
                        this.c(mca, c);
                    }
                }
                ++c;
            }
            this.b();
            monitorexit(f);
        }
        finally {
            monitorexit(f);
            while (true) {}
        }
    }
    
    public final void b() {
        if (this.e) {
            return;
        }
        if (this.d) {
            final ffp f = this.f;
            final long c = f.c;
            final long b = this.b;
            if (c >= b || f.f || this.a == b) {
                this.g.close();
                this.e = true;
            }
        }
    }
    
    public final void c(final mca mca, final long c) {
        if (this.e) {
            return;
        }
        final krr a = this.f.a;
        final long presentationTimeUs = mca.b.presentationTimeUs;
        final StringBuilder sb = new StringBuilder(37);
        sb.append("writing packet <");
        sb.append(presentationTimeUs);
        sb.append(">");
        a.g(sb.toString());
        this.g.b(mca.a, mca.b);
        this.c = c;
    }
}
