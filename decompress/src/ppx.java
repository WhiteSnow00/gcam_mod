// 
// Decompiled by Procyon v0.6.0
// 

public final class ppx
{
    private final pnf a;
    
    public ppx() {
        this.a = plv.g(new ppz(8, false));
    }
    
    public final int a() {
        final long b = ((ppz)this.a.a).b.b;
        return 0x3FFFFFFF & (int)((0xFFFFFFFC0000000L & b) >> 30) - (int)(b & 0x3FFFFFFFL);
    }
    
    public final Object b() {
        final pnf a = this.a;
        Object b;
        while (true) {
            final ppz ppz = (ppz)a.a;
            b = ppz.b();
            if (b != ppz.a) {
                break;
            }
            this.a.c(ppz, ppz.c());
        }
        return b;
    }
    
    public final void c() {
        final pnf a = this.a;
        while (true) {
            final ppz ppz = (ppz)a.a;
            if (ppz.d()) {
                break;
            }
            this.a.c(ppz, ppz.c());
        }
    }
    
    public final boolean d(final Object o) {
        final pnf a = this.a;
        while (true) {
            final ppz ppz = (ppz)a.a;
            switch (ppz.a(o)) {
                default: {
                    return false;
                }
                case 1: {
                    this.a.c(ppz, ppz.c());
                    continue;
                }
                case 0: {
                    return true;
                }
            }
        }
    }
}
