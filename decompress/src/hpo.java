import android.graphics.Bitmap;
import android.content.res.Resources;
import android.app.Activity;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hpo implements hhz, bqp
{
    public static final nsd a;
    private static final noi i;
    public final pii b;
    public final hqo c;
    public final Handler d;
    public final Runnable e;
    public final Activity f;
    public final duq g;
    public him h;
    private final pii j;
    private final kjm k;
    private final Resources l;
    private him m;
    
    static {
        a = nsd.g("com/google/android/apps/camera/socialshare/CaptureSessionManagerListener");
        i = noi.K(hio.b, hio.c, hio.d, hio.k);
    }
    
    public hpo(final pii b, final pii j, final hqo c, final kjm k, final Handler d, final Activity f, final Resources l, final duq g) {
        this.e = new hpm(this);
        this.b = b;
        this.j = j;
        this.c = c;
        this.k = k;
        this.d = d;
        this.f = f;
        this.l = l;
        this.g = g;
    }
    
    private final void d(final him him) {
        this.c();
        this.b();
        this.f(him);
        if (him.equals(this.h)) {
            this.d.postDelayed(this.e, (long)this.l.getInteger(2131492981));
        }
    }
    
    private final void e(final him him) {
        this.c();
        final bqr t = ((hrc)this.b.get()).t;
        Object d;
        if (t == null) {
            d = null;
        }
        else {
            d = t.a().d();
        }
        this.b();
        this.f(him);
        final him h = this.h;
        if (h == null) {
            ((hrc)this.b.get()).j();
        }
        else if (h.equals(him)) {
            this.h = null;
        }
        if (d != null && d.equals(him)) {
            ((hrc)this.b.get()).k();
        }
    }
    
    private final void f(final him him) {
        if (him.equals(this.m)) {
            this.b();
            this.m = null;
            ((hqj)this.j.get()).l(hri.c);
        }
    }
    
    @Override
    public final void a() {
        final bqr t = ((hrc)this.b.get()).t;
        boolean b = false;
        final boolean b2 = t != null && !t.a().j();
        if (t != null && t.a().j()) {
            b = true;
        }
        this.b();
        if (b2) {
            final kjm k = this.k;
            final hrc hrc = (hrc)this.b.get();
            hrc.getClass();
            k.b(new hpn(hrc, 1));
            return;
        }
        if (b) {
            final kjm i = this.k;
            final hrc hrc2 = (hrc)this.b.get();
            hrc2.getClass();
            i.b(new hpn(hrc2));
        }
    }
    
    public final String b() {
        final String hexString = Integer.toHexString(this.b.get().hashCode());
        final StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 2);
        sb.append("[");
        sb.append(hexString);
        sb.append("]");
        return sb.toString();
    }
    
    final void c() {
        this.d.removeCallbacks(this.e);
    }
    
    @Override
    public final void i(final him him) {
        this.e(him);
    }
    
    @Override
    public final void j(final him him, final Bitmap bitmap, final int n) {
        this.b();
        this.d(him);
    }
    
    @Override
    public final void k(final him him) {
        this.b();
        this.d(him);
    }
    
    @Override
    public final void o(final him him, final hih hih, final hip hip) {
        this.c();
        final hio c = hih.c;
        this.b();
        this.h = him;
        final boolean contains = hpo.i.contains(c);
        final boolean booleanValue = (boolean)this.g.a().aQ();
        final int n = 1;
        final boolean b = contains && booleanValue;
        int n2;
        if (!c.equals(hio.m)) {
            if (b) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
        }
        else {
            n2 = n;
        }
        if (((hqj)this.j.get()).q == 0 && n2 != 0) {
            this.b();
            ((hqj)this.j.get()).k(hri.c);
            this.m = him;
        }
    }
    
    @Override
    public final void v(final him him) {
        this.e(him);
    }
}
