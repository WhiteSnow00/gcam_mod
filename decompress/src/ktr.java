// 
// Decompiled by Procyon v0.6.0
// 

public final class ktr implements ktq
{
    private final kqu a;
    private final ktq b;
    private boolean c;
    private boolean d;
    
    public ktr(final ktq b, final kqu a) {
        this.b = b;
        this.a = a;
        this.c = true;
        this.d = false;
    }
    
    @Override
    public final lfg a() {
        if (this.c) {
            this.c = false;
            for (lfg lfg = this.b.a(); lfg != null; lfg = this.b.a()) {
                if (this.a.a(lfg)) {
                    this.d = true;
                    return lfg;
                }
            }
            this.b.b();
        }
        if (!this.d) {
            return this.b.a();
        }
        for (lfg lfg2 = this.b.a(); lfg2 != null; lfg2 = this.b.a()) {
            if (this.a.a(lfg2)) {
                return lfg2;
            }
        }
        return null;
    }
    
    @Override
    public final void b() {
        this.b.b();
    }
}
