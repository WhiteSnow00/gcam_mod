import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class fnr implements asy
{
    final /* synthetic */ fol a;
    
    public fnr(final fol a) {
        this.a = a;
    }
    
    @Override
    public final void a() {
        final fol a = this.a;
        final ess s = a.s;
        if (s == null) {
            return;
        }
        a.k = true;
        s.t = true;
        final esv b = s.b;
        boolean g = false;
        b.D = false;
        a.h.start();
        final fol a2 = this.a;
        a2.u();
        a2.o.h();
        try {
            final fol a3 = this.a;
            if (a3.s.b() <= 0.0f) {
                g = true;
            }
            a3.G = g;
            final fol a4 = this.a;
            final Handler h = a4.H;
            if (h != null) {
                h.obtainMessage(1).sendToTarget();
                a4.H.obtainMessage(2, a4.x, a4.y).sendToTarget();
                final fol a5 = this.a;
                a5.s.u = a5.I;
            }
            this.a.D(true);
            this.a.f.setSideButtonsClickable(true);
        }
        catch (final IllegalStateException ex) {}
    }
}
