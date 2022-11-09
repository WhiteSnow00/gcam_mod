// 
// Decompiled by Procyon v0.6.0
// 

final class ze
{
    static final ze a;
    static final ze b;
    final boolean c;
    final Throwable d;
    
    static {
        if (zm.a) {
            b = null;
            a = null;
            return;
        }
        b = new ze(false, null);
        a = new ze(true, null);
    }
    
    public ze(final boolean c, final Throwable d) {
        this.c = c;
        this.d = d;
    }
}
