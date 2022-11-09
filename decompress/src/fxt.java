// 
// Decompiled by Procyon v0.6.0
// 

public final class fxt
{
    private final fmb a;
    private final fmw b;
    private final oey c;
    
    public fxt(final fmb a, final fmw b, final oey c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final fxr fxr) {
        final fmb a = this.a;
        final fmw b = this.b;
        lfu lfu;
        if (bmx.m(b.a)) {
            lfu = lfu.a;
        }
        else {
            lfu = lfu.b;
        }
        final der b2 = b.b;
        lfj lfj;
        if ((lfj = der.b(b.d, b.c, lfu)) == null) {
            lfj = b.d.b();
            lfj.getClass();
        }
        fxr.b(a.a(lfj, fxr.m), this.c);
    }
}
