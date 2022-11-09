import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pmi implements pml
{
    public final pml a;
    public final pky b;
    public final pky c;
    
    public pmi(final pml a, final pky b, final pky c) {
        a.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Iterator a() {
        return new pmh(this);
    }
}
