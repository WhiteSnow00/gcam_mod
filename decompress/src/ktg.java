// 
// Decompiled by Procyon v0.6.0
// 

final class ktg
{
    public final kst a;
    public final String b;
    public final int c;
    
    public ktg(final int c) {
        this.c = c;
        this.a = kst.m;
        this.b = kst.m.b();
    }
    
    public ktg(final int c, final kst a, String b) {
        this.c = c;
        this.a = a;
        if (b == null) {
            b = kst.m.b();
        }
        this.b = b;
    }
}
