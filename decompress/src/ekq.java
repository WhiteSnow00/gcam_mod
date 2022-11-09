import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class ekq implements oen
{
    final /* synthetic */ jbm a;
    final /* synthetic */ ekw b;
    
    public ekq(final ekw b, final jbm a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
        a.m(ekw.a.c(), "Failure disconnecting camera device", '\u04f1', t);
    }
}
