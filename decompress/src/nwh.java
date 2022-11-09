import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class nwh implements Serializable
{
    private static final long serialVersionUID = 0L;
    private final String a;
    private final int b;
    
    public nwh(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    private Object readResolve() {
        return new nwi(this.a, this.b);
    }
}
