// 
// Decompiled by Procyon v0.6.0
// 

final class epr extends ivr
{
    final /* synthetic */ eqa a;
    
    public epr(final eqa a) {
        this.a = a;
    }
    
    @Override
    public final void onShutterButtonClick() {
        final eqa a = this.a;
        if (a.r.g) {
            a.u();
            return;
        }
        if (a.w()) {
            return;
        }
        final int g = ((hjg)a.e.aQ()).g;
        if (g > 0) {
            final epg r = a.r;
            r.c.f = a;
            kjm.a();
            r.c.b(g);
            return;
        }
        a.v();
    }
}
