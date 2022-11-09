import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class nmg implements Serializable
{
    private static final long serialVersionUID = 0L;
    private final nmf a;
    
    public nmg(final nmf a) {
        this.a = a;
    }
    
    private Object readResolve() {
        return new nmh(this.a);
    }
}
