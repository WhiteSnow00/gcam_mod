import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

final class end implements eip
{
    final /* synthetic */ enm a;
    
    public end(final enm a) {
        this.a = a;
    }
    
    @Override
    public final void d(final boolean b) {
        Object o = this.a;
        if (((enm)o).M) {
            return;
        }
        Label_0389: {
            if (b) {
                if (((enm)o).aj.h) {
                    break Label_0389;
                }
                final boolean g = ((enm)o).S.g();
                boolean b2 = false;
                if (g && (boolean)((hyo)this.a.S.c()).a().aQ()) {
                    b2 = true;
                }
                if (!this.a.O.f() && !this.a.v.c() && !b2) {
                    final eis g2 = this.a.g;
                    final lmm b3 = g2.b;
                    final long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    synchronized (g2.a) {
                        final int f = g2.f;
                        if (f == 1) {
                            g2.f = 2;
                            g2.e = elapsedRealtimeNanos;
                        }
                        else if (elapsedRealtimeNanos - g2.e > g2.c && f == 2) {
                            g2.f = 3;
                            g2.d.a(3);
                        }
                    }
                }
                if (this.a.L()) {
                    this.a.i.onShutterTouchStart();
                    break Label_0389;
                }
                break Label_0389;
            }
            final eis g3 = ((enm)o).g;
            o = g3.a;
            synchronized (o) {
                final int f2 = g3.f;
                if (f2 == 2) {
                    g3.f = 1;
                    monitorexit(o);
                }
                else {
                    if (f2 == 3) {
                        g3.f = 1;
                        g3.d.b(3);
                        monitorexit(o);
                        break Label_0389;
                    }
                    monitorexit(o);
                }
                if (this.a.v.c()) {
                    this.a.v();
                    return;
                }
                o = this.a;
                if (((enm)o).aj.h) {
                    ((enm)o).p.b(3);
                    return;
                }
                if (((enm)o).L()) {
                    o = this.a;
                    ((enm)o).L = true;
                    ((enm)o).i.onShutterButtonClick();
                }
                this.a.h.A(b);
            }
        }
    }
    
    @Override
    public final void e(final boolean b) {
        final enm a = this.a;
        final boolean h = a.aj.h;
        if (b && (a.L() || h)) {
            this.a.j.z();
        }
    }
    
    @Override
    public final void f(final boolean b) {
        final enm a = this.a;
        final boolean h = a.aj.h;
        if (b && (a.L() || h)) {
            this.a.j.A();
        }
    }
}
