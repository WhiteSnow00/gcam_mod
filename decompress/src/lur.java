import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lur
{
    public final List a;
    
    public lur() {
        this.a = new ArrayList();
    }
    
    public final List a() {
        synchronized (this) {
            return Collections.unmodifiableList((List<?>)this.a);
        }
    }
    
    public final void b(final lut lut) {
        synchronized (this) {
            this.a.add(lut);
        }
    }
}
