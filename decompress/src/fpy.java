import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.content.Intent;
import com.google.android.apps.camera.bottombar.BottomBarListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class fpy extends BottomBarListener
{
    final /* synthetic */ fpz a;
    
    public fpy(final fpz a) {
        this.a = a;
    }
    
    @Override
    public final void onCameraSwitchButtonClicked() {
        this.a.c.c();
    }
    
    @Override
    public final void onRetakeButtonPressed() {
        this.a.v();
    }
    
    @Override
    public final void onReviewPlayButtonPressed() {
        synchronized (this.a.f) {
            final fpz a = this.a;
            if (a.j != null) {
                njo.p(a.h.g(), "URI not set.");
                final Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(1);
                intent.setDataAndType((Uri)this.a.h.c(), this.a.j.h.a.f.i);
                try {
                    this.a.g.o(intent);
                }
                catch (final ActivityNotFoundException ex) {
                    fpz.b.b().h((Throwable)ex).E(1759).o("Couldn't view video");
                }
            }
        }
    }
}
