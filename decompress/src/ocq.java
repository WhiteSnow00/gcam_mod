// 
// Decompiled by Procyon v0.6.0
// 

final class ocq
{
    static final ocq a;
    static final ocq b;
    final boolean c;
    final Throwable d;
    
    static {
        if (odc.d) {
            b = null;
            a = null;
            return;
        }
        b = new ocq(false, null);
        a = new ocq(true, null);
    }
    
    public ocq(final boolean c, final Throwable d) {
        this.c = c;
        this.d = d;
    }
}
