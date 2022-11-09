import android.graphics.Bitmap$Config;
import com.google.googlex.gcam.ShotMetadata;
import android.graphics.Bitmap;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fjv implements dvr, dvs, dwc
{
    public final ofn a;
    public final krc b;
    public boolean c;
    final ofn d;
    final ofn e;
    public final /* synthetic */ fjw f;
    private final ofn g;
    
    public fjv(final fjw f, final krc b) {
        this.f = f;
        this.c = false;
        this.g = ofn.f();
        this.d = ofn.f();
        this.e = ofn.f();
        this.a = ofn.f();
        this.b = b;
    }
    
    @Override
    public final void a(dxh dxh, final int n, final long n2, final ljm ljm) {
        dxh = (dxh)this.f;
        synchronized (dxh) {
            this.c = true;
            monitorexit(dxh);
            final lju c = this.f.a.c(n2);
            if (c != null) {
                final fjr d = this.f.d;
                final ofn d2 = this.d;
                dxh = (dxh)this.e;
                new fjs(d.a, d2, (oey)dxh, this.g);
                this.d.o(c);
                this.a.e(odg.h(this.g, btt.u, odx.a));
                return;
            }
            this.a.o(nii.a);
        }
    }
    
    @Override
    public final void b(final hvc hvc, final dua dua) {
    }
    
    @Override
    public final void c(final dxh dxh, final dvv dvv) {
        this.a.o(nii.a);
    }
    
    @Override
    public final void m(final dxh dxh, final Bitmap bitmap, final ShotMetadata shotMetadata) {
        this.e.o(bitmap.copy(Bitmap$Config.ARGB_8888, false));
    }
    
    @Override
    public final void n(final dxh dxh) {
        this.a.o(nii.a);
    }
}
