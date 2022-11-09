import com.google.android.apps.camera.bottombar.BottomBarListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class ebf extends BottomBarListener
{
    final /* synthetic */ eby a;
    
    public ebf(final eby a) {
        this.a = a;
    }
    
    @Override
    public final void onCancelButtonPressed() {
        this.a.h(false, 2);
    }
    
    @Override
    public final void onThumbnailButtonClicked() {
        this.a.D = true;
    }
}
