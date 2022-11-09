import android.content.pm.ResolveInfo;

// 
// Decompiled by Procyon v0.6.0
// 

class hqu implements hqt
{
    final /* synthetic */ hrc b;
    
    public hqu(final hrc b) {
        this.b = b;
    }
    
    private final void q(final bqr bqr) {
        this.b.p.b();
        this.b.r(bqr);
        this.b.p.e(4);
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void b(final bqr bqr, final boolean b) {
        njo.d(b ^ true);
        this.q(bqr);
    }
    
    @Override
    public void bw() {
        this.b.p.a();
    }
    
    @Override
    public void d(final bqr bqr, final boolean b) {
        njo.d(b ^ true);
        this.q(bqr);
    }
    
    @Override
    public final void f() {
        this.b.q(true, true);
    }
}
