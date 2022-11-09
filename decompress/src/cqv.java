// 
// Decompiled by Procyon v0.6.0
// 

public final class cqv
{
    public Integer a;
    public Integer b;
    public Integer c;
    public lfu d;
    public int e;
    public int f;
    
    public final void a(final lfu d) {
        if (d != null) {
            this.d = d;
            return;
        }
        throw new NullPointerException("Null cameraFacing");
    }
    
    public final void b(final int n) {
        this.a = n;
    }
    
    public final void c(final int n) {
        this.c = n;
    }
    
    public final void d(final int n) {
        this.b = n;
    }
}
