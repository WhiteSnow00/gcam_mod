import com.google.android.apps.camera.bottombar.BottomBarListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class enx extends BottomBarListener
{
    final /* synthetic */ eok a;
    
    public enx(final eok a) {
        this.a = a;
    }
    
    @Override
    public final void onCameraSwitchButtonClicked() {
        this.a.w();
        this.a.d.i(new enw(this));
    }
    
    @Override
    public final void onThumbnailButtonClicked() {
    }
}
