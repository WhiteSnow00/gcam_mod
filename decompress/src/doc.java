import java.util.concurrent.atomic.AtomicBoolean;
import com.google.android.apps.camera.filmstrip.transition.FilmstripTransitionLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public final class doc implements exl, exj, exh, exm, exn, evw
{
    public final dny a;
    public final FilmstripTransitionLayout b;
    public eks c;
    private final bqv d;
    private final AtomicBoolean e;
    
    public doc(final dny a, final FilmstripTransitionLayout b, final bqv d) {
        this.e = new AtomicBoolean(false);
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    public final void a() {
        this.a.b();
    }
    
    @Override
    public final void bi() {
        this.e.set(true);
        final FilmstripTransitionLayout b = this.b;
        if (b.b.isStarted()) {
            b.b.pause();
        }
        if (b.a.isStarted()) {
            b.a.pause();
        }
    }
    
    @Override
    public final void bj() {
        this.e.set(false);
        this.a.c();
        final FilmstripTransitionLayout b = this.b;
        if (b.b.isPaused()) {
            b.b.resume();
        }
        if (b.a.isPaused()) {
            b.a.resume();
        }
    }
    
    @Override
    public final void bk() {
        this.d.bd();
    }
    
    @Override
    public final boolean bl() {
        return this.a.e();
    }
    
    @Override
    public final void e() {
        final FilmstripTransitionLayout b = this.b;
        if (b.b.isStarted()) {
            b.d = true;
            b.b.cancel();
        }
        if (b.a.isStarted()) {
            b.c = true;
            b.a.cancel();
        }
        this.b.setVisibility(4);
    }
    
    public final boolean f() {
        return this.a.e();
    }
}
