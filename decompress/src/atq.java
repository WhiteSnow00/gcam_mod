// 
// Decompiled by Procyon v0.6.0
// 

final class atq implements Runnable
{
    final /* synthetic */ RuntimeException a;
    final /* synthetic */ String b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ att e;
    
    public atq(final att e, final RuntimeException a, final String b, final int c, final int d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void run() {
        this.e.a.b(this.a, this.b, this.c, this.d);
    }
}
