import java.util.concurrent.Executor;
import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class cpq implements ViewTreeObserver$OnGlobalLayoutListener
{
    final /* synthetic */ View a;
    final /* synthetic */ cpr b;
    
    public cpq(final cpr b, final View a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        final iwg iwg = new iwg(this.b.f.getResources().getString(2131952759));
        final jcb a = jcb.a;
        switch (this.b.n.d.ordinal()) {
            default: {
                iwg.o(this.a);
                break;
            }
            case 2: {
                iwg.h(this.a, 0);
                break;
            }
            case 1: {
                iwg.s(this.a);
                break;
            }
        }
        final cpr b = this.b;
        iwg.p();
        iwg.h = this.b.i.k(cxr.at);
        iwg.u();
        iwg.g(new cpp(this, 1), this.b.e);
        iwg.f(new cpp(this), this.b.e);
        iwg.c = 1000;
        iwg.d = 5000;
        iwg.m = 10;
        iwg.i = this.b.c;
        iwg.v();
        iwg.f = true;
        iwg.k();
        iwg.n();
        b.t = iwg.a();
    }
}
