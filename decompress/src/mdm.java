import java.util.Iterator;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mdm implements Iterable
{
    public final int[] a;
    
    private mdm(final int[] array) {
        final int length = array.length;
        final int n = 0;
        if (length == 0) {
            this.a = new int[0];
            return;
        }
        Arrays.sort(array);
        int n2 = array[0] + 1;
        int i = 0;
        int n3 = 0;
        while (i < length) {
            final int n4 = array[i];
            int n5;
            if (n2 == n4) {
                n5 = 0;
            }
            else {
                n5 = 1;
            }
            n3 += n5;
            ++i;
            n2 = n4;
        }
        final int[] a = new int[n3];
        this.a = a;
        final int n6 = array[0];
        final int length2 = array.length;
        int n7 = n6 + 1;
        int n8 = 0;
        for (int j = n; j < length2; ++j) {
            final int n9 = array[j];
            if (n7 != n9) {
                a[n8] = n9;
                ++n8;
                n7 = n9;
            }
        }
    }
    
    public static mdm a(final int... array) {
        return new mdm(Arrays.copyOf(array, array.length));
    }
    
    public final boolean b() {
        return Arrays.binarySearch(this.a, 32856) >= 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof mdm && Arrays.equals(this.a, ((mdm)o).a));
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
    
    @Override
    public final Iterator iterator() {
        return new mdl(this);
    }
    
    @Override
    public final String toString() {
        final int length = this.a.length;
        final StringBuilder sb = new StringBuilder(19);
        sb.append("IntSet[");
        sb.append(length);
        sb.append("]");
        return sb.toString();
    }
}
