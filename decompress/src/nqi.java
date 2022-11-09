import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class nqi implements Serializable
{
    final nqe a;
    final nmf b;
    
    public nqi(final nqe a, final nmf b) {
        this.a = a;
        this.b = b;
    }
    
    private Object readResolve() {
        return new nqj(this.a, this.b);
    }
}
