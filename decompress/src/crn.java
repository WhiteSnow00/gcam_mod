// 
// Decompiled by Procyon v0.6.0
// 

public final class crn implements kvp
{
    public final crg a;
    public final Runnable b;
    public final lfu c;
    private final cxl d;
    private final kjm e;
    private final dfz f;
    private final ctr g;
    private final crw h;
    private final lfw i;
    
    public crn(final cxl d, final crw h, final crg a, final kjm e, final lfw i, final dfz f, final ctr g, final lfu c, final Runnable b) {
        this.d = d;
        this.h = h;
        this.a = a;
        this.e = e;
        this.i = i;
        this.f = f;
        this.g = g;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final kst kst, final long n) {
        final long e = this.h.e();
        if (kst.d(kst) && n < e && this.h.h()) {
            this.g.h(this.c);
            this.e.execute(new crm(this));
            return;
        }
        final lfj b = der.b(this.i, this.d, this.c);
        b.getClass();
        this.f.c(new dga(b, kst, n));
    }
    
    @Override
    public final void b() {
        this.g.g(this.c);
    }
}
