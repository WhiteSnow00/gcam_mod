// 
// Decompiled by Procyon v0.6.0
// 

public final class hr extends hq
{
    private final Object a;
    
    public hr(final int n) {
        super(n);
        this.a = new Object();
    }
    
    @Override
    public final Object a() {
        synchronized (this.a) {
            return super.a();
        }
    }
    
    @Override
    public final boolean b(final Object o) {
        synchronized (this.a) {
            return super.b(o);
        }
    }
}
