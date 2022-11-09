import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sj
{
    public final SparseArray a;
    public int b;
    
    public sj() {
        this.a = new SparseArray();
        this.b = 0;
    }
    
    static final long b(final long n, final long n2) {
        if (n == 0L) {
            return n2;
        }
        return n / 4L * 3L + n2 / 4L;
    }
    
    public final si a(final int n) {
        si si;
        if ((si = (si)this.a.get(n)) == null) {
            si = new si();
            this.a.put(n, (Object)si);
        }
        return si;
    }
}
