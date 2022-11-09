// 
// Decompiled by Procyon v0.6.0
// 

public final class okl
{
    private final Object a;
    private final int b;
    
    public okl(final Object a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof okl)) {
            return false;
        }
        final okl okl = (okl)o;
        return this.a == okl.a && this.b == okl.b;
    }
    
    @Override
    public final int hashCode() {
        return System.identityHashCode(this.a) * 65535 + this.b;
    }
}
