import java.util.concurrent.Executor;
import com.google.android.apps.camera.autotimer.ui.AutoTimerIndicatorView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izk implements jap
{
    private final bwq a;
    private final pii b;
    
    public izk(final bwq a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a() {
        final AutoTimerIndicatorView c = (AutoTimerIndicatorView)((ixw)this.b.get()).c.c(2131427437);
        final bwq a = this.a;
        a.c = c;
        a.e.i().c(a.a.a(new bwp(a), a.b));
    }
}
