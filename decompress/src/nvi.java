import java.util.Iterator;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Comparator;
import java.util.AbstractMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nvi extends AbstractMap
{
    public static final Comparator a;
    public final Object[] b;
    public final int[] c;
    public final Set d;
    private Integer e;
    private String f;
    
    static {
        a = new nvf();
    }
    
    public nvi(final List list) {
        this.d = new nvh(this);
        this.e = null;
        this.f = null;
        final Iterator iterator = list.iterator();
        if (iterator.hasNext()) {
            nve.a((nve)iterator.next());
            throw null;
        }
        final int size = list.size();
        final Object[] array = new Object[size];
        final Iterator iterator2 = list.iterator();
        if (!iterator2.hasNext()) {
            Object[] copy;
            if (size > 16) {
                if (size * 9 > 0) {
                    copy = Arrays.copyOf(array, 0);
                }
                else {
                    copy = array;
                }
            }
            else {
                copy = array;
            }
            this.b = copy;
            this.c = new int[] { 0 };
            return;
        }
        nve.a((nve)iterator2.next());
        throw null;
    }
    
    @Override
    public final Set entrySet() {
        return this.d;
    }
    
    @Override
    public final int hashCode() {
        if (this.e == null) {
            this.e = super.hashCode();
        }
        return this.e;
    }
    
    @Override
    public final String toString() {
        if (this.f == null) {
            this.f = super.toString();
        }
        return this.f;
    }
}
