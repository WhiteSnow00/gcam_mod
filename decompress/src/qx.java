import android.util.SparseIntArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qx
{
    final SparseIntArray a;
    final SparseIntArray b;
    
    public qx() {
        this.a = new SparseIntArray();
        this.b = new SparseIntArray();
    }
    
    public static final int c(int n, final int n2) {
        int i = 0;
        int n3 = 0;
        int n4 = 0;
        while (i < n) {
            final int n5 = n3 + 1;
            int n6;
            if (n5 == n2) {
                n6 = n4 + 1;
                n3 = 0;
            }
            else {
                n3 = n5;
                n6 = n4;
                if (n5 > n2) {
                    n6 = n4 + 1;
                    n3 = 1;
                }
            }
            ++i;
            n4 = n6;
        }
        n = n4;
        if (n3 + 1 > n2) {
            n = n4 + 1;
        }
        return n;
    }
    
    public final void a() {
        this.b.clear();
    }
    
    public final void b() {
        this.a.clear();
    }
}
