// 
// Decompiled by Procyon v0.6.0
// 

public final class hao
{
    private final niz a;
    
    public hao(final niz a) {
        this.a = a;
    }
    
    public final float a(final lju lju) {
        final niz a = haa.a(this.a, lju.d());
        if (!a.g()) {
            return 0.0f;
        }
        final fja fja = (fja)a.c();
        final float abs = Math.abs(fja.b);
        final double n = Math.abs(fja.c);
        if (abs <= 10.0 && n <= 10.0) {
            final double n2 = 1.0 / (Math.exp(n) + 1.0);
            return (float)(n2 + n2 - 1.0);
        }
        return -1.0f;
    }
}
