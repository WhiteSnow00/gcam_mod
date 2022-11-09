import java.util.EnumMap;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class nnl implements Serializable
{
    private static final long serialVersionUID = 0L;
    final EnumMap a;
    
    public nnl(final EnumMap a) {
        this.a = a;
    }
    
    Object readResolve() {
        return new nnm(this.a);
    }
}
