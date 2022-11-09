import j$.util.function.Supplier;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class jjp implements jiz
{
    final /* synthetic */ jjq a;
    
    public jjp(final jjq a) {
        this.a = a;
    }
    
    @Override
    public final void o(final int n) {
        if (n == 3) {
            final jjq a = this.a;
            if (a.T()) {
                if (a.j.a("wide_selfie_tooltip_display_count") <= 2) {
                    if ((float)a.g.aQ() < (float)((kkz)a.f).d * (float)Math.sqrt(a.P / (float)((kkz)a.f).d)) {
                        a.j.b("wide_selfie_tooltip_display_count", 3);
                        return;
                    }
                    if (a.j.a("wide_selfie_tooltip_display_count") < 2) {
                        a.j.c("wide_selfie_tooltip_display_count");
                    }
                    final iwg iwg = new iwg(a.E.getString(2131952834));
                    iwg.o((View)a.F);
                    iwg.p();
                    iwg.h = a.c.k(cxr.at);
                    iwg.u();
                    iwg.c = 1000;
                    iwg.d = a.E.getInteger(2131492989) - 1000;
                    iwg.d((Supplier)new jje(a));
                    iwg.e(new jjd(a, 1));
                    iwg.m = 4;
                    iwg.i = a.i;
                    iwg.v();
                    iwg.k();
                    final krc a2 = iwg.a();
                    if (a.D.g()) {
                        ((krc)a.D.c()).close();
                    }
                    a.D = niz.i(a2);
                    a.d.c(a2);
                }
            }
        }
    }
}
