import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class ezi implements duo
{
    final /* synthetic */ ezj a;
    
    public ezi(final ezj a) {
        this.a = a;
    }
    
    @Override
    public final void b(final boolean b) {
        if (b) {
            final ezj a = this.a;
            if (!a.h) {
                if (a.f.a("Astro_smarts_chip") < 3) {
                    if (a.a.compareAndSet(false, true)) {
                        final hph b2 = a.b;
                        if (b2 != null) {
                            b2.b(a.c);
                        }
                    }
                }
            }
        }
        else {
            final ezj a2 = this.a;
            if (a2.a.compareAndSet(true, false)) {
                final hph b3 = a2.b;
                if (b3 != null) {
                    a2.i = a2.e.schedule(new ezh(b3), 2000L, TimeUnit.MILLISECONDS);
                }
            }
        }
    }
}
