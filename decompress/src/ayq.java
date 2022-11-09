import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class ayq implements Iterable
{
    public final List a;
    
    public ayq() {
        this(new ArrayList(2));
    }
    
    public ayq(final List a) {
        this.a = a;
    }
    
    public static ayp b(final bhp bhp) {
        return new ayp(bhp, bin.b);
    }
    
    final int a() {
        return this.a.size();
    }
    
    final ayq c() {
        return new ayq(new ArrayList(this.a));
    }
    
    final boolean d(final bhp bhp) {
        return this.a.contains(b(bhp));
    }
    
    final boolean e() {
        return this.a.isEmpty();
    }
    
    @Override
    public final Iterator iterator() {
        return this.a.iterator();
    }
}
