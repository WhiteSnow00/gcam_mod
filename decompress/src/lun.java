import android.media.MediaFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lun implements lum
{
    private final mbz a;
    
    public lun(final mbz a) {
        this.a = a;
    }
    
    @Override
    public final lup a() {
        final mbz a = this.a;
        final ofn f = ofn.f();
        new MediaFormat();
        return new luo(f, a.a(mce.a(f)));
    }
    
    @Override
    public final oey b() {
        return luq.a(((mcd)this.a).g);
    }
    
    @Override
    public final void c() {
        ((mcd)this.a).g.cancel(false);
    }
    
    @Override
    public final void d() {
        this.a.c();
    }
}
