import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyh implements gxs
{
    public final ofn a;
    public gyb b;
    
    public gyh() {
        this.a = ofn.f();
    }
    
    @Override
    public final void close() {
        final gyb b = this.b;
        if (b == null) {
            this.a.o(Collections.emptySet());
            return;
        }
        this.a.o(noi.H(b));
    }
}
