import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class ccb implements oen
{
    final /* synthetic */ List a;
    final /* synthetic */ cce b;
    
    public ccb(final cce b, final List a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
        this.b.k.b(cic.c);
        a.m(cce.a.b(), "Failed to stop recording.", '\u014c', t);
    }
}
