import android.content.pm.ResolveInfo;
import android.widget.Toast;

// 
// Decompiled by Procyon v0.6.0
// 

class hrb implements hqt
{
    final /* synthetic */ hrc b;
    
    public hrb(final hrc b) {
        this.b = b;
    }
    
    @Override
    public void a() {
        this.b.q(false, true);
    }
    
    @Override
    public void bj() {
    }
    
    @Override
    public final void f() {
        final hrc b = this.b;
        final ResolveInfo u = b.u;
        u.getClass();
        final CharSequence loadLabel = u.loadLabel(b.i);
        final hrc b2 = this.b;
        final hqo n = b2.n;
        final bqr t = b2.t;
        t.getClass();
        final int d = n.d(u, t);
        this.b.p.d(hqr.c);
        final hqs p = this.b.p;
        final String packageName = u.activityInfo.packageName;
        njo.o(p.c);
        final okt d2 = p.d;
        if (d2.c) {
            d2.m();
            d2.c = false;
        }
        final obe obe = (obe)d2.b;
        final obe j = obe.j;
        packageName.getClass();
        obe.a |= 0x20;
        obe.g = packageName;
        if (d == 1) {
            this.b.p.f(1);
            final hrc b3 = this.b;
            Toast.makeText(b3.h, (CharSequence)hsn.a(u, b3.i, b3.j), 0).show();
            return;
        }
        if (d == 3) {
            this.b.p.f(5);
            return;
        }
        final hrc b4 = this.b;
        Toast.makeText(b4.h, (CharSequence)b4.j.getString(2131952647, new Object[] { loadLabel }), 0).show();
        this.b.p.f(4);
        final hrc b5 = this.b;
        b5.o.post((Runnable)new hpn(b5, 4));
    }
    
    @Override
    public final void g() {
        this.b.u = null;
    }
    
    @Override
    public void k() {
    }
    
    @Override
    public void n() {
        this.b.q(false, false);
    }
}
