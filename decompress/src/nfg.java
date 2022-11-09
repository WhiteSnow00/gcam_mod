// 
// Decompiled by Procyon v0.6.0
// 

public final class nfg extends njo
{
    @Override
    public final void a(final nfq nfq, float n, float n2) {
        nfq.f(n2 * n, 180.0f, 90.0f);
        n *= n2 + n2;
        final nfm nfm = new nfm(0.0f, 0.0f, n, n);
        nfm.e = 180.0f;
        nfm.f = 90.0f;
        nfq.f.add(nfm);
        nfq.b(new nfp(), 180.0f, 270.0f);
        n2 = n + 0.0f;
        n = 0.5f * n2;
        n2 /= 2.0f;
        nfq.b = (float)Math.cos(Math.toRadians(270.0)) * n2 + n;
        nfq.c = n + n2 * (float)Math.sin(Math.toRadians(270.0));
    }
}
