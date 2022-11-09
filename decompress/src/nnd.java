import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class nnd implements Serializable
{
    private static final long serialVersionUID = 0L;
    final nnj a;
    
    public nnd(final nnj a) {
        this.a = a;
    }
    
    Object readResolve() {
        return this.a.v();
    }
}
