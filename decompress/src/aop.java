// 
// Decompiled by Procyon v0.6.0
// 

final class aop
{
    static final aop a;
    static final aop b;
    final boolean c;
    final Throwable d;
    
    static {
        if (aox.a) {
            b = null;
            a = null;
            return;
        }
        b = new aop(false, null);
        a = new aop(true, null);
    }
    
    public aop(final boolean c, final Throwable d) {
        this.c = c;
        this.d = d;
    }
}
