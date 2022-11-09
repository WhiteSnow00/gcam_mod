import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ldk extends ldw
{
    public final ldt a;
    public final ldl b;
    public final kre c;
    public final long d;
    public final int e;
    
    public ldk(final kxb kxb, final lfj lfj, final ldt a, final int e, final boolean b) {
        super(kxb, lfj, b);
        this.a = a;
        this.e = e;
        final kre c = a.c;
        this.c = c;
        this.d = lou.e(a.b, c);
        this.b = new ldl(e);
    }
    
    @Override
    public final int a() {
        return this.a.b;
    }
    
    @Override
    public final kre b() {
        return this.c;
    }
    
    @Override
    public final void d(final Surface surface) {
        throw new UnsupportedOperationException("setSurface should never be called on buffered streams.");
    }
    
    @Override
    public final long f() {
        return this.d;
    }
    
    @Override
    public final Surface g() {
        return this.a.a.e();
    }
    
    @Override
    public final kxd h() {
        return kxd.a;
    }
    
    @Override
    public final boolean i() {
        return this.h.i;
    }
}
