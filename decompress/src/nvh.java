import java.util.Iterator;
import java.util.Comparator;
import java.util.Arrays;
import java.util.AbstractSet;

// 
// Decompiled by Procyon v0.6.0
// 

final class nvh extends AbstractSet
{
    final int a;
    final /* synthetic */ nvi b;
    
    public nvh(final nvi b) {
        this.b = b;
        this.a = -1;
    }
    
    final int a() {
        return this.b.c[this.a + 1];
    }
    
    final int b() {
        if (this.a == -1) {
            return 0;
        }
        return this.b.c[0];
    }
    
    @Override
    public final boolean contains(final Object o) {
        final Object[] b = this.b.b;
        final int b2 = this.b();
        final int a = this.a();
        Comparator comparator;
        if (this.a == -1) {
            comparator = nvi.a;
        }
        else {
            comparator = nvk.a;
        }
        return Arrays.binarySearch(b, b2, a, o, comparator) >= 0;
    }
    
    @Override
    public final Iterator iterator() {
        return new nvg(this);
    }
    
    @Override
    public final int size() {
        return this.a() - this.b();
    }
}
