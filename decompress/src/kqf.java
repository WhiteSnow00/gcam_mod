import java.util.concurrent.Future;
import java.io.FileDescriptor;
import android.media.MediaCodec$Callback;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import android.view.Surface;
import android.location.Location;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kqf implements kog
{
    public final ofa a;
    public final kpz b;
    public final kpy c;
    public kmz d;
    public knc e;
    public int f;
    public long g;
    public int h;
    public oey i;
    public Location j;
    public Surface k;
    public koh l;
    public int m;
    
    public kqf(final kpz b, final ofa a, final kpy c) {
        this.f = 0;
        this.g = 0L;
        this.h = 0;
        this.m = 6;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void b(final kmz d) {
        this.d = d;
    }
    
    @Override
    public final void c(final int m) {
        this.m = m;
    }
    
    @Override
    public final void d(final knu knu) {
        if (knu == knu.a) {
            return;
        }
        final String value = String.valueOf(knu.a);
        final String simpleName = kqg.class.getSimpleName();
        final String value2 = String.valueOf(knu);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 36 + String.valueOf(simpleName).length() + String.valueOf(value2).length());
        sb.append("Only ");
        sb.append(value);
        sb.append(" is supported for ");
        sb.append(simpleName);
        sb.append(", but we get ");
        sb.append(value2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public final void e(final Surface k) {
        this.k = k;
    }
    
    @Override
    public final void f(final Location j) {
        this.j = j;
    }
    
    @Override
    public final void g(oey ex) {
        try {
            ex = (InterruptedException)((Future<niz>)ex).get();
            if (((niz)ex).g()) {
                this.j = (Location)((niz)ex).c();
            }
            return;
        }
        catch (final InterruptedException ex) {}
        catch (final ExecutionException ex2) {}
        Log.w("VidRecMedRec", "Failed to set the location, Ignoring.", (Throwable)ex);
    }
    
    @Override
    public final void h(final int f) {
        this.f = f;
    }
    
    @Override
    public final void i(final long g) {
        this.g = g;
    }
    
    @Override
    public final void j(final long n) {
    }
    
    @Override
    public final void k(final MediaCodec$Callback mediaCodec$Callback) {
        throw new UnsupportedOperationException("Cannot add a MediaCodec's callback with VideoRecorderMediaRecorder, please use VideoRecorderMediaCodec");
    }
    
    @Override
    public final void l(final boolean b) {
        throw new UnsupportedOperationException("Cannot apply synchronous mode with VideoRecorderMediaRecorder, please use VideoRecorderMediaCodec");
    }
    
    @Override
    public final void m(final int h) {
        this.h = h;
    }
    
    @Override
    public final void n(final oey i) {
        this.i = i;
    }
    
    @Override
    public final void o(final FileDescriptor fileDescriptor) {
        this.i = ofi.n(fileDescriptor);
    }
    
    @Override
    public final void p(final knc e) {
        this.e = e;
    }
    
    @Override
    public final void q(final boolean b) {
    }
    
    @Override
    public final void r(final koh l) {
        this.l = l;
    }
}
