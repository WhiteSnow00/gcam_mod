import com.google.android.apps.camera.bottombar.BottomBarListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class eqm extends BottomBarListener
{
    final /* synthetic */ equ a;
    
    public eqm(final equ a) {
        this.a = a;
    }
    
    @Override
    public final void onCameraSwitchButtonClicked() {
        this.a.c.i(new eql(this));
    }
    
    @Override
    public final void onThumbnailButtonClicked() {
    }
}
