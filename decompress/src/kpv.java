import java.io.FileDescriptor;
import android.location.Location;
import android.util.Log;
import java.util.ArrayList;
import android.media.MediaCodec$Callback;
import android.view.Surface;
import java.util.List;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kpv implements kog
{
    public final ofa a;
    public final kse b;
    public kmz c;
    public knc d;
    public knu e;
    public final Handler f;
    public int g;
    public long h;
    public oey i;
    public int j;
    public kny k;
    public final List l;
    public boolean m;
    public boolean n;
    public boolean o;
    public oey p;
    public Surface q;
    public koh r;
    public MediaCodec$Callback s;
    public lhb t;
    public int u;
    private oey v;
    
    public kpv(final ofa a, final Handler f, final kse b) {
        this.e = knu.a;
        this.u = 6;
        this.g = 0;
        this.h = 4000000000L;
        this.i = ofi.n(0L);
        this.j = 0;
        this.k = new knt();
        this.l = new ArrayList();
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = ofi.n(nii.a);
        this.a = a;
        this.f = f;
        this.b = b;
    }
    
    @Override
    public final void b(final kmz c) {
        this.c = c;
    }
    
    @Override
    public final void c(final int u) {
        this.u = u;
    }
    
    @Override
    public final void d(final knu e) {
        this.e = e;
    }
    
    @Override
    public final void e(final Surface q) {
        if (this.e != knu.a) {
            Log.w("VidRMedCodBdr", "colorformat will be set to SURFACE as a surface is provided");
            this.e = knu.a;
        }
        this.q = q;
    }
    
    @Override
    public final void f(final Location location) {
        this.p = ofi.n(niz.i(location));
    }
    
    @Override
    public final void g(final oey p) {
        this.p = p;
    }
    
    @Override
    public final void h(final int g) {
        this.g = g;
    }
    
    @Override
    public final void i(final long n) {
        this.i = ofi.n(n);
    }
    
    @Override
    public final void j(final long h) {
        this.h = h;
    }
    
    @Override
    public final void k(final MediaCodec$Callback s) {
        this.s = s;
    }
    
    @Override
    public final void l(final boolean n) {
        this.n = n;
    }
    
    @Override
    public final void m(final int j) {
        this.j = j;
    }
    
    @Override
    public final void n(final oey v) {
        this.v = v;
    }
    
    @Override
    public final void o(final FileDescriptor fileDescriptor) {
        this.v = ofi.n(fileDescriptor);
    }
    
    @Override
    public final void p(final knc d) {
        this.d = d;
    }
    
    @Override
    public final void q(final boolean o) {
        this.o = o;
    }
    
    public final oey s() {
        final oey v = this.v;
        if (v != null) {
            return v;
        }
        return ofi.n(null);
    }
}
