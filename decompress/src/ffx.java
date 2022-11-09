// 
// Decompiled by Procyon v0.6.0
// 

public final class ffx
{
    public final int a;
    
    public ffx(final int a) {
        this.a = a;
    }
    
    public static ffx a(final boolean b) {
        int n;
        if (!b) {
            n = 0;
        }
        else {
            n = 4;
        }
        return new ffx(n | 0x1);
    }
    
    public final boolean b() {
        return this.a == 0;
    }
    
    public final boolean c() {
        return (this.a & 0x2) != 0x0;
    }
    
    public final boolean d() {
        return (this.a & 0x4) != 0x0;
    }
}
