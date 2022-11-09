// 
// Decompiled by Procyon v0.6.0
// 

public final class lzf
{
    private final int a;
    private final maq b;
    private final lzr c;
    
    public lzf(final int a, final maq b, final lzr c) {
        boolean b2 = true;
        if (c != null) {
            if (c.a.a != b.a.a) {
                b2 = false;
            }
        }
        njo.d(b2);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final lzi a(final lzu lzu) {
        njo.d(this.b.a.a == lzu.a);
        return new lzi(this.a, this.b, this.c, lzu);
    }
}
