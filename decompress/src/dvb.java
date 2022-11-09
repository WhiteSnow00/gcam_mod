// 
// Decompiled by Procyon v0.6.0
// 

public final class dvb implements njp
{
    private final niz a;
    private final int b;
    private final int c;
    private final int d;
    
    public dvb(final dug dug, final niz a) {
        this.a = a;
        final int c = dug.c;
        this.d = c;
        this.b = c - dug.e;
        this.c = c - dug.f;
    }
    
    public final Integer b() {
        if (!this.a.g()) {
            return this.d;
        }
        if (((fva)this.a.c()).a() == 1) {
            return this.d;
        }
        if (((fva)this.a.c()).a() == 2) {
            return this.c;
        }
        return this.b;
    }
}
