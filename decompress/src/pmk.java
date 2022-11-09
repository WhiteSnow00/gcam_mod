import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pmk implements pml
{
    public final pml a;
    
    public pmk(final pml a) {
        this.a = a;
    }
    
    @Override
    public final Iterator a() {
        return new pmj(this);
    }
}
