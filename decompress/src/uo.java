import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon$OnDrawableLoadedListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class uo implements Icon$OnDrawableLoadedListener
{
    final /* synthetic */ ur a;
    private final /* synthetic */ int b;
    
    public uo(final ur a) {
        this.a = a;
    }
    
    public uo(final ur a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onDrawableLoaded(final Drawable e) {
        switch (this.b) {
            default: {
                if (e == null) {
                    return;
                }
                final ur a = this.a;
                a.h = e;
                a.c();
                return;
            }
            case 3: {
                if (e == null) {
                    return;
                }
                final ur a2 = this.a;
                a2.g = e;
                a2.c();
                return;
            }
            case 2: {
                if (e == null) {
                    return;
                }
                final ur a3 = this.a;
                a3.f = e;
                a3.c();
                return;
            }
            case 1: {
                if (e == null) {
                    return;
                }
                (this.a.d = e).mutate();
                this.a.c();
                return;
            }
            case 0: {
                if (e == null) {
                    return;
                }
                (this.a.e = e).mutate();
                this.a.c();
            }
        }
    }
}
