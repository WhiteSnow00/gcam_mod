// 
// Decompiled by Procyon v0.6.0
// 

final class bdq extends bdt
{
    public bdq() {
    }
    
    @Override
    public final float a(final int n, final int n2, final int n3, final int n4) {
        return Math.max(n3 / (float)n, n4 / (float)n2);
    }
    
    @Override
    public final int b(final int n, final int n2, final int n3, final int n4) {
        return 2;
    }
}
