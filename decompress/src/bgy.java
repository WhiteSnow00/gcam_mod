import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bgy
{
    private final List a;
    
    public bgy() {
        this.a = new ArrayList();
    }
    
    public final List a() {
        synchronized (this) {
            return this.a;
        }
    }
    
    public final void b(final avt avt) {
        synchronized (this) {
            this.a.add(avt);
        }
    }
}
