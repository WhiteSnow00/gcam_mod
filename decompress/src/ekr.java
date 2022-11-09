// 
// Decompiled by Procyon v0.6.0
// 

final class ekr implements hrk
{
    final /* synthetic */ ekw a;
    
    public ekr(final ekw a) {
        this.a = a;
    }
    
    private final void e() {
        final ekw a = this.a;
        a.x = true;
        a.E();
    }
    
    @Override
    public final void a() {
        final ekw a = this.a;
        if (a.x) {
            a.x = false;
            a.E();
        }
    }
    
    @Override
    public final void c() {
        if (!this.a.x) {
            this.e();
        }
    }
    
    @Override
    public final void d() {
        this.e();
    }
}
