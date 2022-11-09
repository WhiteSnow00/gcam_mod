import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class brk implements Iterable
{
    public final List a;
    
    public brk() {
        this.a = new ArrayList();
    }
    
    public final krc a(final brj brj) {
        synchronized (this) {
            this.a.add(brj);
            return new bri(this, brj);
        }
    }
    
    @Override
    public final Iterator iterator() {
        synchronized (this) {
            return new ArrayList(this.a).iterator();
        }
    }
}
