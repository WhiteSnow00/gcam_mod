import java.util.List;
import java.util.Collection;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.PixelCopy;
import android.os.Looper;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Matrix;
import android.view.View;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.graphics.RectF;
import java.util.ArrayList;
import android.view.WindowManager;
import android.view.TextureView;
import android.support.constraint.ConstraintLayout;
import android.view.View$OnLayoutChangeListener;
import android.view.TextureView$SurfaceTextureListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ita implements TextureView$SurfaceTextureListener, View$OnLayoutChangeListener, isu
{
    private final ConstraintLayout a;
    private final TextureView b;
    private final WindowManager c;
    private final TextureView$SurfaceTextureListener d;
    private final ArrayList e;
    private final ioe f;
    private int g;
    private int h;
    private boolean i;
    private final RectF j;
    private int k;
    private Surface l;
    private SurfaceTexture m;
    
    public ita(final ConstraintLayout a, final ioe f, final WindowManager c, final TextureView$SurfaceTextureListener d) {
        new ArrayList();
        this.e = new ArrayList();
        this.g = 0;
        this.h = 0;
        this.j = new RectF();
        this.k = -1;
        this.l = null;
        this.m = null;
        (this.a = a).addOnLayoutChangeListener((View$OnLayoutChangeListener)this);
        final TextureView b = new TextureView(a.getContext());
        jwn.ac((View)b);
        (this.b = b).setSurfaceTextureListener((TextureView$SurfaceTextureListener)this);
        this.c = c;
        this.f = f;
        this.d = d;
    }
    
    public final int a() {
        return this.b.getHeight();
    }
    
    public final int b() {
        return this.b.getWidth();
    }
    
    public final niz c() {
        final TextureView b = this.b;
        RectF rectF;
        if (b == null) {
            rectF = new RectF();
        }
        else {
            final Matrix matrix = new Matrix();
            rectF = new RectF(0.0f, 0.0f, (float)this.g, (float)this.h);
            this.b.getTransform(matrix).mapRect(rectF);
        }
        final int n = (int)Math.min(rectF.width(), rectF.height()) / 2;
        final int n2 = (int)Math.max(rectF.height(), rectF.width()) / 2;
        niz niz;
        if (n > 0 && n2 > 0) {
            final Bitmap bitmap = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
            PixelCopy.request(new Surface(b.getSurfaceTexture()), bitmap, (PixelCopy$OnPixelCopyFinishedListener)ixk.e, kpo.d(Looper.getMainLooper()));
            niz = niz.i(ixt.b(bitmap, 2));
        }
        else {
            niz = nii.a;
        }
        return niz;
    }
    
    public final oey d() {
        this.a.addView((View)this.b, 0);
        return ofi.n(null);
    }
    
    public final oey e() {
        njo.p(true, "Last Create Synchronization has not finished yet.");
        this.a.removeView((View)this.b);
        return ofi.n(null);
    }
    
    public final void f() {
        this.b.setTransform(new Matrix());
        this.j.set(0.0f, 0.0f, (float)this.g, (float)this.h);
        this.b.post((Runnable)new isz(new ArrayList(this.e)));
        if (this.g > 0 && this.h > 0) {
            this.f.a.h();
        }
    }
    
    public final void g() {
        this.b.requestLayout();
    }
    
    public final void h(final View$OnLayoutChangeListener view$OnLayoutChangeListener) {
    }
    
    public final void onLayoutChange(final View view, int g, int a, int h, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (this.b.getParent() == null) {
            return;
        }
        g = h - g;
        h = n - a;
        final boolean b = this.f.b();
        a = gkn.a(this.c);
        if (this.g == g && this.h == h && this.k == a && this.i == b) {
            return;
        }
        this.g = g;
        this.h = h;
        this.k = a;
        this.i = b;
    }
    
    public final void onSurfaceTextureAvailable(final SurfaceTexture m, final int n, final int n2) {
        this.l = new Surface(m);
        this.m = m;
        this.d.onSurfaceTextureAvailable(m, n, n2);
    }
    
    public final boolean onSurfaceTextureDestroyed(final SurfaceTexture surfaceTexture) {
        this.d.onSurfaceTextureDestroyed(surfaceTexture);
        return false;
    }
    
    public final void onSurfaceTextureSizeChanged(final SurfaceTexture surfaceTexture, final int n, final int n2) {
        this.d.onSurfaceTextureSizeChanged(surfaceTexture, n, n2);
    }
    
    public final void onSurfaceTextureUpdated(final SurfaceTexture t) {
        ((bsa)this.d).t = t;
    }
}
