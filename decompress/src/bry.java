import android.hardware.display.DisplayManager$DisplayListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class bry implements DisplayManager$DisplayListener
{
    final /* synthetic */ bsa a;
    
    public bry(final bsa a) {
        this.a = a;
    }
    
    public final void onDisplayAdded(final int n) {
    }
    
    public final void onDisplayChanged(int a) {
        a = gkn.a(this.a.x);
        final bsa a2 = this.a;
        if ((a - a2.m + 360) % 360 == 180) {
            final isx o = a2.o;
            if (o != null) {
                o.c();
                this.a.r.g();
            }
        }
        this.a.m = a;
    }
    
    public final void onDisplayRemoved(final int n) {
    }
}
