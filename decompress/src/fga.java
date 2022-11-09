import java.util.Locale;
import android.media.MediaFormat;
import java.util.concurrent.CancellationException;

// 
// Decompiled by Procyon v0.6.0
// 

final class fga implements oen
{
    final /* synthetic */ fgb a;
    
    public fga(final fgb a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
        if (t instanceof CancellationException) {
            return;
        }
        final nsa nsa = (nsa)fgc.a.c().h(t).E(1640);
        final fgb a = this.a;
        nsa.v("%s: track id %d failed", a.b.b, a.a);
    }
}
