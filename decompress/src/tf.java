import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tf
{
    public int[] a;
    public List b;
    
    public final void a() {
        final int[] a = this.a;
        if (a != null) {
            Arrays.fill(a, -1);
        }
        this.b = null;
    }
    
    public final void b(int length) {
        final int[] a = this.a;
        if (a == null) {
            Arrays.fill(this.a = new int[Math.max(length, 10) + 1], -1);
            return;
        }
        int i = a.length;
        if (length >= i) {
            while (i <= length) {
                i += i;
            }
            final int[] a2 = new int[i];
            this.a = a2;
            length = a.length;
            System.arraycopy(a, 0, a2, 0, length);
            final int[] a3 = this.a;
            Arrays.fill(a3, length, a3.length, -1);
        }
    }
}
