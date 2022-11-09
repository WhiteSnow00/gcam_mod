import com.google.android.apps.camera.stats.ViewfinderJankSession;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gia implements ghw
{
    private final ViewfinderJankSession a;
    
    public gia(final ViewfinderJankSession a) {
        this.a = a;
    }
    
    @Override
    public final void a(final ljm ljm, final double n, final double n2) {
        final ViewfinderJankSession a = this.a;
        synchronized (a.a) {
            if (a.b.size() < 30) {
                final nzd c = ViewfinderJankSession.c(ljm, n, n2);
                a.b.add(c);
                a.a(c);
            }
        }
    }
}
