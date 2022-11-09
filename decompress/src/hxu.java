// 
// Decompiled by Procyon v0.6.0
// 

public final class hxu
{
    private final klv a;
    private final klv b;
    private final klv c;
    private final hko d;
    private final hkn e;
    private final hkc f;
    
    public hxu(final klv a, final klv b, final klv c, final hko d, final hkn e, final hkc f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final hxt a(final hyj hyj) {
        final long b = hyj.b;
        long n;
        if (!"full".equals(this.b.aQ())) {
            n = 2000000L;
        }
        else {
            n = 3500000L;
        }
        if ((int)this.c.aQ() != 0) {
            n += 4300000L;
        }
        if (this.a.aQ()) {
            n += 13000000L;
        }
        final int n2 = (int)(b / n);
        final long b2 = hyj.b;
        final Object aq = this.d.aQ();
        final hjh a = hjh.a;
        float n3 = 22.0f;
        if (aq == a) {
            final hjd hjd = (hjd)this.e.a.aQ();
            if (hjd != hjd.a) {
                if (hjd != hjd.c) {
                    n3 = 33.0f;
                }
            }
        }
        else if (this.e.b.aQ() == hjd.d) {
            n3 = 72.0f;
        }
        else {
            n3 = 48.0f;
        }
        if (this.f.c(hjq.r)) {
            n3 *= 0.9f;
        }
        final int n4 = (int)(b2 / (int)(n3 * 1000000.0f / 8.0f) / 60L);
        return new hxt(n2, n4, n2 < 50, n4 < 6, hyj.b() ^ true, hyj.c() ^ true);
    }
}
