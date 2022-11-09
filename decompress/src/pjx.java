// 
// Decompiled by Procyon v0.6.0
// 

public final class pjx implements pjl
{
    public static final pjx a;
    
    static {
        a = new pjx();
    }
    
    private pjx() {
    }
    
    @Override
    public final pjq d() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }
    
    @Override
    public final void e(final Object o) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }
    
    @Override
    public final String toString() {
        return "This continuation is already complete";
    }
}
