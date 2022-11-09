import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class nnq implements Serializable
{
    private static final long serialVersionUID = 0L;
    final Object[] a;
    
    public nnq(final Object[] a) {
        this.a = a;
    }
    
    Object readResolve() {
        return nns.k(this.a);
    }
}
