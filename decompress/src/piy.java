import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class piy implements pml
{
    final /* synthetic */ Iterable a;
    
    public piy(final Iterable a) {
        this.a = a;
    }
    
    @Override
    public final Iterator a() {
        return this.a.iterator();
    }
}
