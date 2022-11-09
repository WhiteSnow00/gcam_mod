import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

final class est implements asg
{
    final /* synthetic */ esv a;
    
    public est(final esv a) {
        this.a = a;
    }
    
    @Override
    public final void a(final boolean b, final asx asx) {
        final etc h = this.a.h;
        final etp b2 = h.b;
        if (b2 != null) {
            b2.b();
            h.b.e();
            h.c = SystemClock.elapsedRealtimeNanos();
            esh.p(h.b.k);
            h.g = true;
            h.h = false;
        }
        this.a.v = false;
    }
}
