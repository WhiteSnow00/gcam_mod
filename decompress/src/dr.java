// 
// Decompiled by Procyon v0.6.0
// 

final class dr implements Runnable
{
    final /* synthetic */ ds a;
    
    public dr(final ds a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final ds a = this.a;
        a.a.endViewTransition(a.b);
        this.a.c.b();
    }
}
