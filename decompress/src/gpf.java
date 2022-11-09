import android.graphics.Bitmap;
import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

final class gpf implements hik
{
    final /* synthetic */ gpb a;
    final /* synthetic */ gen b;
    
    public gpf(final gpb a, final gen b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b() {
        final gpb a = this.a;
        a.b.b("HdrPlusBurst#abortCaptures");
        a.h = true;
        final okt n = a.n;
        final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (n.c) {
            n.m();
            n.c = false;
        }
        final nxk nxk = (nxk)n.b;
        final nxk d = nxk.d;
        nxk.a |= 0x2;
        nxk.c = elapsedRealtimeNanos;
        if (!a.i.k(cxs.A)) {
            try {
                final kwh j = a.j;
                if (j != null) {
                    ((kzi)j).a.f();
                }
                else {
                    a.b.d("FrameServerSession not provided. Failed to abort capture.");
                }
            }
            catch (final kuw kuw) {
                a.b.d("Failed to abort capture.");
            }
        }
        this.b.c.f();
    }
}
