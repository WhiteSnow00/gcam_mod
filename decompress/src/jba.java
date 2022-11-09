import android.view.ScaleGestureDetector$OnScaleGestureListener;
import com.google.android.apps.camera.ui.wirers.PreviewOverlay;
import com.google.android.apps.camera.bottombar.BottomBarController;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jba implements jap
{
    private final pii a;
    private final Context b;
    private final jgi c;
    private final jgg d;
    private final dgn e;
    private final jjb f;
    private final iqg g;
    private final BottomBarController h;
    private final eiq i;
    private final cxl j;
    private final hkc k;
    
    public jba(final pii a, final Context b, final jgi c, final jgg d, final dgn e, final jjb f, final eiq i, final iqg g, final BottomBarController h, final cxl j, final hkc k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    @Override
    public final void a() {
        final PreviewOverlay previewOverlay = (PreviewOverlay)((ixw)this.a.get()).c.c(2131427861);
        final Context b = this.b;
        final jgu jgu = new jgu(new jay(b, kpo.d(b.getMainLooper())), new jat(this.g.w(), this.e), new jav(this.g.w(), this.e), this.d, new jaw(this.c), (ScaleGestureDetector$OnScaleGestureListener)new jaz(this.f), new jax(this.f, this.h), new jau(this.g.w()), this.k.a(hjq.e), previewOverlay.getRootView(), this.b, this.j);
        this.i.a(jgu.p);
        previewOverlay.e = new jas(jgu);
    }
}
