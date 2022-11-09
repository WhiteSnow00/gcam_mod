import com.google.android.apps.camera.bottombar.BottomBarListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class enf extends BottomBarListener
{
    final /* synthetic */ crg a;
    final /* synthetic */ enm b;
    final /* synthetic */ jbj c;
    
    public enf(final enm b, final jbj c, final crg a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public final void onCameraSwitchButtonClicked() {
        if (!this.c.h) {
            this.a.i(new ene(this));
        }
    }
    
    @Override
    public final void onThumbnailButtonClicked() {
    }
}
