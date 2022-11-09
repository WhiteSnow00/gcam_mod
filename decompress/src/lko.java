// 
// Decompiled by Procyon v0.6.0
// 

public final class lko
{
    public lkk a;
    public Long b;
    public Long c;
    public String d;
    public lkd e;
    public noi f;
    public noi g;
    public noi h;
    public nns i;
    public llu j;
    public int k;
    
    public final void a(final nns i) {
        if (i != null) {
            this.i = i;
            return;
        }
        throw new NullPointerException("Null listeners");
    }
    
    public final void b(final int k) {
        if (k != 0) {
            this.k = k;
            return;
        }
        throw new NullPointerException("Null publishIntent");
    }
}
