import android.hardware.display.DisplayManager$DisplayListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class iws implements DisplayManager$DisplayListener
{
    final /* synthetic */ iwt a;
    
    public iws(final iwt a) {
        this.a = a;
    }
    
    public final void onDisplayAdded(final int n) {
    }
    
    public final void onDisplayChanged(int a) {
        if (a == 0) {
            a = this.a.a();
            if (a > 0 && this.a.e.get() != a) {
                this.a.b(false);
            }
        }
    }
    
    public final void onDisplayRemoved(final int n) {
    }
}
