import java.util.Iterator;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pkm implements pml
{
    public final File a;
    
    public pkm(final File a) {
        this.a = a;
    }
    
    @Override
    public final Iterator a() {
        return new piv(this);
    }
}
