import java.util.Locale;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public class lvl
{
    public final oci a;
    
    protected lvl(final int[] array) {
        njo.d(true);
        for (int i = 0; i < 2; ++i) {
            final int n = array[i];
            if (n < 0) {
                final StringBuilder sb = new StringBuilder(33);
                sb.append("One dimension is < 0: ");
                sb.append(n);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.a = new oci(Arrays.copyOf(array, 2));
    }
    
    public static lvk d(final int n, final int n2) {
        return new lvk(n, n2);
    }
    
    public final int a() {
        final oci a = this.a;
        if (a.a > 1) {
            return a.a(1);
        }
        return 1;
    }
    
    public final int b() {
        return this.a.a(0);
    }
    
    public final lvk c() {
        final int a = this.a.a;
        if (a == 2) {
            return d(this.b(), this.a());
        }
        final StringBuilder sb = new StringBuilder(46);
        sb.append("Attempting to convert ");
        sb.append(a);
        sb.append("D size to 2D!");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof lvl && this.a.equals(((lvl)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public String toString() {
        final Locale english = Locale.ENGLISH;
        final oci a = this.a;
        int a2 = 0;
        if (a.a != 0) {
            a2 = a.a(0);
            int n = 1;
            while (true) {
                final oci a3 = this.a;
                if (n >= a3.a) {
                    break;
                }
                a2 *= a3.a(n);
                ++n;
            }
        }
        return String.format(english, "Dimensions = %s, Volume = %d)", a, a2);
    }
}
