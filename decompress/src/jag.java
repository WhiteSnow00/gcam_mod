import com.google.android.apps.camera.bottombar.BottomBarListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class jag extends BottomBarListener
{
    final /* synthetic */ jak a;
    
    public jag(final jak a) {
        this.a = a;
    }
    
    @Override
    public final void onShutterButtonClicked() {
        if (this.a.i.A()) {
            this.a.i.f();
        }
    }
}
