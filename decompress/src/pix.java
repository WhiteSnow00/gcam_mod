import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pix implements pml
{
    final /* synthetic */ Object[] a;
    
    public pix(final Object[] a) {
        this.a = a;
    }
    
    @Override
    public final Iterator a() {
        return new plk(this.a);
    }
}
