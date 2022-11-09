// 
// Decompiled by Procyon v0.6.0
// 

public final class ns implements io
{
    int a;
    final /* synthetic */ nt b;
    private boolean c;
    
    protected ns(final nt b) {
        this.b = b;
        this.c = false;
    }
    
    @Override
    public final void a() {
        this.c = true;
    }
    
    @Override
    public final void b() {
        if (this.c) {
            return;
        }
        final nt b = this.b;
        b.f = null;
        nt.c(b, this.a);
    }
    
    @Override
    public final void c() {
        nt.e(this.b);
        this.c = false;
    }
    
    public final void d(final in f, final int a) {
        this.b.f = f;
        this.a = a;
    }
}
