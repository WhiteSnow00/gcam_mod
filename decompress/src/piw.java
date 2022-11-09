import java.util.List;
import java.util.AbstractList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class piw extends AbstractList implements List
{
    private final List a;
    
    protected piw() {
    }
    
    public piw(final List a) {
        a.getClass();
        this.a = a;
    }
    
    public final int a() {
        return this.a.size();
    }
    
    @Override
    public final void add(final int n, final Object o) {
        final List a = this.a;
        final int a2 = this.a();
        if (n >= 0 && a2 >= n) {
            a.add(this.a() - n, o);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Position index ");
        sb.append(n);
        sb.append(" must be in range [");
        sb.append(new pmc(0, this.a()));
        sb.append("].");
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @Override
    public final void clear() {
        this.a.clear();
    }
    
    @Override
    public final Object get(final int n) {
        return this.a.get(pjf.f(this, n));
    }
    
    @Override
    public final /* bridge */ Object remove(final int n) {
        return this.a.remove(pjf.f(this, n));
    }
    
    @Override
    public final Object set(final int n, final Object o) {
        return this.a.set(pjf.f(this, n), o);
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.a();
    }
}
