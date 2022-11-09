// 
// Decompiled by Procyon v0.6.0
// 

public final class ceo
{
    public final boolean a;
    public final cek b;
    public final Object c;
    public final niz d;
    public boolean e;
    public int f;
    private final klj g;
    private final niz h;
    
    public ceo(final boolean a, final cek b, final klj g, final niz d, final niz h) {
        this.c = new Object();
        this.f = 1;
        this.a = a;
        this.b = b;
        this.g = g;
        this.d = d;
        this.h = h;
    }
    
    public final boolean a() {
        return this.a && this.e && this.g.aQ() == cep.b;
    }
    
    public final void b(final lju lju) {
        synchronized (this.c) {
            if (this.a()) {
                final int f = this.f;
                if (f == 0) {
                    throw null;
                }
                if (f == 2) {
                    if (this.h.g()) {
                        ((hua)this.h.c()).a();
                        lju.close();
                    }
                    return;
                }
            }
            lju.close();
        }
    }
}
