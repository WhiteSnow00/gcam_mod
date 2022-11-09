// 
// Decompiled by Procyon v0.6.0
// 

final class adx implements Runnable
{
    final /* synthetic */ Object a;
    final /* synthetic */ ady b;
    
    public adx(final ady b, final Object a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final ady b = this.b;
        final Object a = this.a;
        if (b.f()) {
            b.c();
        }
        else {
            b.b(a);
        }
        b.f = 3;
    }
}
