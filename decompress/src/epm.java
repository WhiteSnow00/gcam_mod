import android.view.View;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class epm implements oun
{
    private final pii a;
    private final pii b;
    private final pii c;
    
    public epm(final pii a, final pii b, final pii c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final epg a() {
        final bqm bqm = (bqm)this.a.get();
        return new epg(bqm.g(), (View)((bsa)bqm.g()).f, (Executor)this.c.get(), (imb)this.b.get());
    }
}
