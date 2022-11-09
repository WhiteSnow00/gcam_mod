// 
// Decompiled by Procyon v0.6.0
// 

final class tx extends ip
{
    final /* synthetic */ int a;
    final /* synthetic */ ty b;
    private boolean c;
    
    public tx(final ty b, final int a) {
        this.b = b;
        this.a = a;
        this.c = false;
    }
    
    @Override
    public final void a() {
        this.c = true;
    }
    
    @Override
    public final void b() {
        if (!this.c) {
            this.b.a.setVisibility(this.a);
        }
    }
    
    @Override
    public final void c() {
        this.b.a.setVisibility(0);
    }
}
