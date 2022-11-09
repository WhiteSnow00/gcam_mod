// 
// Decompiled by Procyon v0.6.0
// 

public final class nto extends ntp
{
    public static final nto a;
    
    static {
        a = new nto();
    }
    
    private nto() {
    }
    
    @Override
    public final int b() {
        return 0;
    }
    
    @Override
    public final nsx c(final int n) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }
    
    @Override
    public final Object d(final nsx nsx) {
        return null;
    }
    
    @Override
    public final Object e(final int n) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }
}
