import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class nny implements Serializable
{
    private static final long serialVersionUID = 0L;
    final nnx a;
    
    public nny(final nnx a) {
        this.a = a;
    }
    
    Object readResolve() {
        return this.a.s();
    }
}
