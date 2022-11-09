import android.hardware.display.DisplayManager$DisplayListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class fnq implements DisplayManager$DisplayListener
{
    final /* synthetic */ fol a;
    
    public fnq(final fol a) {
        this.a = a;
    }
    
    public final void onDisplayAdded(final int n) {
    }
    
    public final void onDisplayChanged(int a) {
        a = gkn.a(this.a.n.a());
        final fol a2 = this.a;
        if ((a - a2.z + 360) % 360 == 180) {
            a2.G();
        }
        this.a.z = a;
    }
    
    public final void onDisplayRemoved(final int n) {
    }
}
