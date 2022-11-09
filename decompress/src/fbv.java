import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fbv
{
    public final List a;
    
    public fbv() {
        this.a = new ArrayList();
    }
    
    public final krc a(final fbu fbu) {
        synchronized (this) {
            this.a.add(fbu);
            return new fbs(this, fbu);
        }
    }
    
    public final niz b() {
        synchronized (this) {
            return niz.h(nov.e(this.a, null));
        }
    }
}
