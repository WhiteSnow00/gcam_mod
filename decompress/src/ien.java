import android.content.res.Resources$Theme;
import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ien extends iej
{
    final /* synthetic */ ieo d;
    
    public ien(final ieo d, final Context context, final ieg ieg) {
        this.d = d;
        super(context, ieg);
    }
    
    protected final void onLayout(final boolean b, int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (b) {
            this.d.t.close();
            final ieo d = this.d;
            n = d.o.getProgress();
            final idb c = d.o.c(n);
            final String a = d.a(c);
            final String a2 = d.a(c);
            if (d.q != null) {
                if (d.a.get()) {
                    final jcb a3 = jcb.a(d.i.getDefaultDisplay(), d.c);
                    n = d.g.getDimensionPixelSize(2131166311);
                    iwg iwg = null;
                    switch (a3.ordinal()) {
                        default: {
                            return;
                        }
                        case 2: {
                            iwg = new iwg(a);
                            iwg.h((View)d.q, n);
                            iwg.r();
                            break;
                        }
                        case 1: {
                            iwg = new iwg(a);
                            iwg.i((View)d.q, n);
                            iwg.q();
                            break;
                        }
                        case 0: {
                            iwg = new iwg(a);
                            iwg.o((View)d.q);
                            iwg.p();
                            break;
                        }
                    }
                    iwg.j = d.g.getColor(2131100616, (Resources$Theme)null);
                    iwg.k();
                    iwg.f = true;
                    iwg.c = 300;
                    iwg.d = 3300;
                    iwg.m = 5;
                    iwg.v();
                    iwg.i = d.h;
                    d.t = iwg.a();
                    d.q.announceForAccessibility((CharSequence)a2);
                    d.e.c(d.t);
                }
            }
        }
    }
}
