import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pmz implements pml
{
    public final CharSequence a;
    public final int b;
    public final plc c;
    
    public pmz(final CharSequence a, final int b, final plc c) {
        a.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Iterator a() {
        return new pmy(this);
    }
}
