import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ldm extends ldw
{
    public final kkz a;
    public final long b;
    
    public ldm(final kxb kxb, final lfj lfj, final kre kre, final int n, final boolean b) {
        super(kxb, lfj, b);
        this.a = new kkz(nii.a);
        this.b = lou.e(n, kre);
        final niz c = kxb.c;
    }
    
    @Override
    public final int a() {
        return this.h.e;
    }
    
    @Override
    public final kre b() {
        return this.h.d;
    }
    
    @Override
    public final void d(final Surface surface) {
        if (surface == null) {
            this.a.aR(nii.a);
            return;
        }
        final niz niz = (niz)this.a.d;
        if (niz.g() && surface == niz.c()) {
            return;
        }
        this.a.aR(niz.i(surface));
    }
    
    @Override
    public final long f() {
        return this.b;
    }
    
    @Override
    public final Surface g() {
        return (Surface)((niz)this.a.d).f();
    }
    
    @Override
    public final kxd h() {
        return this.h.a;
    }
    
    @Override
    public final boolean i() {
        return true;
    }
}
