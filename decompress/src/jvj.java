import android.util.SparseIntArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jvj
{
    public final SparseIntArray a;
    public jpx b;
    
    public jvj() {
        final jpw a = jpw.a;
        throw null;
    }
    
    public jvj(final jpx b) {
        this.a = new SparseIntArray();
        jvu.a(b);
        this.b = b;
    }
    
    public final void a() {
        this.a.clear();
    }
    
    public final int b(final int n) {
        return this.a.get(n, -1);
    }
}
