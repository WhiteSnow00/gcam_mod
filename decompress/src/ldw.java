import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ldw implements kwz
{
    private static int a;
    private final int b;
    public final lfj f;
    public final boolean g;
    public final kxb h;
    
    static {
        ldw.a = 0;
    }
    
    public ldw(final kxb h, final lfj f, final boolean g) {
        this.h = h;
        this.f = f;
        this.g = g;
        this.b = j();
    }
    
    private static int j() {
        synchronized (ldw.class) {
            final int a = ldw.a;
            ldw.a = a + 1;
            return a;
        }
    }
    
    @Override
    public final lfj c() {
        return this.f;
    }
    
    @Override
    public final boolean e() {
        return this.h.h;
    }
    
    public abstract long f();
    
    public abstract Surface g();
    
    public abstract kxd h();
    
    public abstract boolean i();
    
    @Override
    public final String toString() {
        final int b = this.b;
        final StringBuilder sb = new StringBuilder(18);
        sb.append("Stream-");
        sb.append(b);
        return sb.toString();
    }
}
