import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

final class ibt implements oen
{
    final /* synthetic */ ibu a;
    private final /* synthetic */ int b;
    
    public ibt(final ibu a) {
        this.a = a;
    }
    
    public ibt(final ibu a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
        switch (this.b) {
            default: {
                this.a.E.g();
                return;
            }
            case 0: {
                a.k(ibu.a.b(), "CamcorderSnapshot is not available: %s", t, '\u0a53');
                this.a.D.d();
                final ibu a = this.a;
                a.H.a(t, a.g.e());
            }
        }
    }
}
