// 
// Decompiled by Procyon v0.6.0
// 

final class hto implements exn, exl, exm
{
    final /* synthetic */ htp a;
    
    public hto(final htp a) {
        this.a = a;
    }
    
    @Override
    public final void bk() {
        final htp a = this.a;
        a.b = true;
        a.e();
    }
    
    @Override
    public final void e() {
        final htp a = this.a;
        a.b = false;
        a.a();
        a.a.d();
        this.a.f();
    }
}
