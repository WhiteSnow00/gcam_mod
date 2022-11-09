// 
// Decompiled by Procyon v0.6.0
// 

public final class ajn implements ajc
{
    public final aox c;
    private final t d;
    
    public ajn() {
        this.d = new t();
        this.c = aox.h();
        this.a(ajc.b);
    }
    
    public final void a(final cwy cwy) {
        this.d.h(cwy);
        if (cwy instanceof ajb) {
            this.c.e(cwy);
            return;
        }
        if (cwy instanceof aiz) {
            this.c.f(((aiz)cwy).a);
        }
    }
}
