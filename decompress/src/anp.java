import androidx.work.impl.WorkDatabase;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anp extends anr
{
    final /* synthetic */ akh a;
    final /* synthetic */ UUID b;
    
    public anp(final akh a, final UUID b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a() {
        final WorkDatabase d = this.a.d;
        d.h();
        try {
            anr.c(this.a, this.b.toString());
            d.j();
            d.i();
            anr.d(this.a);
        }
        finally {
            d.i();
        }
    }
}
