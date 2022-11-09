import com.google.android.apps.camera.bottombar.BottomBarListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class epq extends BottomBarListener
{
    final /* synthetic */ eqa a;
    
    public epq(final eqa a) {
        this.a = a;
    }
    
    @Override
    public final void onCameraSwitchButtonClicked() {
        final crg l = this.a.l;
        if (l != null) {
            l.i(aas.c);
            this.a.d.j();
        }
    }
    
    @Override
    public final void onRetakeButtonPressed() {
        this.a.i.b();
        final epg r = this.a.r;
        kjm.a();
        r.g = false;
        r.e.a();
        r.f.setVisibility(8);
        r.b.k(true);
        ((bsa)r.b).q.e(true);
        r.b.o();
    }
}
