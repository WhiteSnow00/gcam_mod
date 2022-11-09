import com.google.android.apps.camera.ui.views.MainActivityLayout;
import android.view.ViewStub;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izj implements jap
{
    private final niz a;
    private final pii b;
    private final Context c;
    
    public izj(final niz a, final pii b, final Context c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a() {
        if (this.a.g()) {
            ((bvb)this.a.c()).g((ViewStub)((ixw)this.b.get()).c.c(2131428083), this.c);
            final MainActivityLayout mainActivityLayout = (MainActivityLayout)((ixw)this.b.get()).c.c(2131427411);
            mainActivityLayout.l = this.a;
            mainActivityLayout.i();
        }
    }
}
