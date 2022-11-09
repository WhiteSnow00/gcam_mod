import android.view.View$OnSystemUiVisibilityChangeListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class hyv implements View$OnSystemUiVisibilityChangeListener
{
    final /* synthetic */ hyw a;
    
    public hyv(final hyw a) {
        this.a = a;
    }
    
    public final void onSystemUiVisibilityChange(int systemUiVisibility) {
        systemUiVisibility = this.a.a.getDecorView().getSystemUiVisibility();
        final hyw a = this.a;
        if ((systemUiVisibility ^ a.c) == 0x0) {
            return;
        }
        if (!a.b) {
            a.e();
        }
    }
}
