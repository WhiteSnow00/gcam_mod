// 
// Decompiled by Procyon v0.6.0
// 

public final class adr extends y
{
    public static final z c;
    public final zc d;
    public boolean e;
    
    static {
        c = new adq();
    }
    
    public adr() {
        this.d = new zc();
        this.e = false;
    }
    
    @Override
    public final void a() {
        for (int b = this.d.b(), i = 0; i < b; ++i) {
            ((ado)this.d.e(i)).j();
        }
        final zc d = this.d;
        final int e = d.e;
        final Object[] d2 = d.d;
        for (int j = 0; j < e; ++j) {
            d2[j] = null;
        }
        d.e = 0;
        d.b = false;
    }
    
    public final ado b(final int n) {
        return (ado)this.d.d(n);
    }
    
    final void c() {
        this.e = false;
    }
}
