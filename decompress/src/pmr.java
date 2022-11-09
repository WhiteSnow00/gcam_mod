import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pmr implements Iterable
{
    final /* synthetic */ pml a;
    
    public pmr(final pml a) {
        this.a = a;
    }
    
    @Override
    public final Iterator iterator() {
        return this.a.a();
    }
}
