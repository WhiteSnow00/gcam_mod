import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class ply implements Serializable
{
    public static final ply a;
    private static final long serialVersionUID = 0L;
    
    static {
        a = new ply();
    }
    
    private ply() {
    }
    
    private final Object readResolve() {
        return pma.c;
    }
}
