import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pmw implements pml
{
    public final pml a;
    public final pky b;
    private final /* synthetic */ int c;
    
    public pmw(final pml a, final pky b) {
        this.a = a;
        this.b = b;
    }
    
    public pmw(final pml a, final pky b, final int c) {
        this.c = c;
        a.getClass();
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Iterator a() {
        switch (this.c) {
            default: {
                return new pmg(this, null);
            }
            case 0: {
                return new pmv(this);
            }
        }
    }
}
