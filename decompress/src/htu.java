import android.media.SoundPool;

// 
// Decompiled by Procyon v0.6.0
// 

final class htu implements oen
{
    final /* synthetic */ int a;
    final /* synthetic */ int[] b;
    final /* synthetic */ float c;
    final /* synthetic */ htw d;
    
    public htu(final htw d, final int a, final int[] b, final float c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final Throwable t) {
        htw.a.b().E(2495).t("Sound resource %d failed to load: %s", this.a, t);
        this.d.g(this.a);
    }
}
