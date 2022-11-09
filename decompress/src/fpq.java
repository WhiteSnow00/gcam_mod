import com.google.android.apps.camera.bottombar.BottomBarListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class fpq extends BottomBarListener
{
    final /* synthetic */ fpt a;
    
    public fpq(final fpt a) {
        this.a = a;
    }
    
    @Override
    public final void onCameraSwitchButtonClicked() {
        synchronized (this.a.m) {
            this.a.l.c();
        }
    }
    
    @Override
    public final void onPauseButtonClicked() {
        synchronized (this.a.m) {
            this.a.l.d();
            this.a.n.f();
        }
    }
    
    @Override
    public final void onResumeButtonClicked() {
        synchronized (this.a.m) {
            this.a.l.f();
            this.a.n.g();
        }
    }
    
    @Override
    public final void onSnapshotButtonClicked() {
        synchronized (this.a.m) {
            this.a.l.h();
        }
    }
    
    @Override
    public final void onThumbnailButtonClicked() {
        synchronized (this.a.m) {
            this.a.l.i();
        }
    }
}
