// 
// Decompiled by Procyon v0.6.0
// 

public final class mdx
{
    public final String a;
    
    public mdx(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof mdx && this.a.equals(((mdx)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
}
