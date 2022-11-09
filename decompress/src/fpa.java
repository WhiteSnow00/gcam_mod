import com.google.android.apps.camera.bottombar.BottomBarListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class fpa extends BottomBarListener
{
    final /* synthetic */ fpc a;
    
    public fpa(final fpc a) {
        this.a = a;
    }
    
    @Override
    public final void onFpsSwitch(final int n) {
        synchronized (this.a.e) {
            this.a.c.setClickable(false);
            this.a.u(n);
        }
    }
    
    @Override
    public final void onPauseButtonClicked() {
        synchronized (this.a.e) {
            this.a.b.d();
            this.a.d.f();
        }
    }
    
    @Override
    public final void onResumeButtonClicked() {
        synchronized (this.a.e) {
            this.a.b.f();
            this.a.d.g();
        }
    }
    
    @Override
    public final void onSnapshotButtonClicked() {
        synchronized (this.a.e) {
            this.a.b.h();
        }
    }
    
    @Override
    public final void onThumbnailButtonClicked() {
        synchronized (this.a.e) {
            this.a.b.i();
        }
    }
}
