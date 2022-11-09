import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class noh implements Serializable
{
    private static final long serialVersionUID = 0L;
    final Object[] a;
    
    public noh(final Object[] a) {
        this.a = a;
    }
    
    Object readResolve() {
        return noi.G(this.a);
    }
}
