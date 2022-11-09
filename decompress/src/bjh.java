// 
// Decompiled by Procyon v0.6.0
// 

public final class bjh
{
    private final dgn a;
    private final iru b;
    private final pii c;
    private bkn d;
    
    public bjh(final dgn a, final iru b, final pii c) {
        this.d = null;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final bkk a() {
        final bkn d = this.d;
        if (d != null) {
            d.close();
            this.d = null;
        }
        this.a.l(false);
        this.b.a();
        this.a.o(true, true);
        return this.d = ((bko)this.c).a();
    }
}
