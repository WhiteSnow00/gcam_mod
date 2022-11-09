import com.google.android.apps.camera.bottombar.BottomBarListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class eor extends BottomBarListener
{
    final /* synthetic */ epb a;
    
    public eor(final epb a) {
        this.a = a;
    }
    
    @Override
    public final void onCameraSwitchButtonClicked() {
        this.a.b.i(new eoq(this));
    }
}
