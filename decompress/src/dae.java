import android.net.Uri;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import j$.time.temporal.TemporalAccessor;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ExecutionException;
import android.graphics.Bitmap;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dae extends czt
{
    private static final nsd j;
    public niz h;
    private final hxg k;
    
    static {
        j = nsd.g("com/google/android/apps/camera/data/PhotoItem");
    }
    
    public dae(final Context context, final czu czu, final bqs bqs, final hxg k, final hip hip) {
        super(context, czu, bqs, hip);
        this.h = nii.a;
        this.k = k;
    }
    
    @Override
    public final bqt b() {
        return bqt.b;
    }
    
    @Override
    public final jca e(int b, int n) {
        final bqs e = super.e;
        if (!e.j()) {
            final int n2 = (int)(b * 0.7f);
            final int n3 = (int)(n * 0.7f);
            final int a = e.e().a;
            b = e.e().b;
            Object a2;
            if (a > 1 && b > 1) {
                if (e.a() % 180 != 0) {
                    n = a;
                }
                else {
                    n = b;
                    b = a;
                }
                while (b > n2 || n > n3) {
                    b >>= 1;
                    n >>= 1;
                }
                a2 = new kre(b, n);
            }
            else {
                a2 = new kre(n2, n3);
            }
            e.c();
            try {
                a2 = this.d.a().b(this.d.c(czt.n(e), (kre)a2)).e(e.c()).i().get();
                e.c();
                ((Bitmap)a2).getWidth();
                ((Bitmap)a2).getHeight();
                final niz i = niz.i(a2);
                a2 = jbz.a;
                a2 = new jca(i);
                return (jca)a2;
            }
            catch (final InterruptedException a2) {}
            catch (final ExecutionException ex) {}
            a.n(dae.j.b(), "Failed to generate thumbnail for %s", e.c(), '\u02ab', (Throwable)a2);
            final nii a3 = nii.a;
            final jbz a4 = jbz.a;
            return new jca(a3);
        }
        final hxg k = this.k;
        final him d = e.d();
        d.getClass();
        final niz b2 = k.a(d).b(btt.m);
        final jbz a5 = jbz.a;
        return new jca(b2);
    }
    
    @Override
    public final View i(final niz niz, final ViewGroup viewGroup) {
        final boolean g = niz.g();
        final czs czs = null;
        View j;
        czs czs2;
        if (g) {
            j = (View)niz.c();
            czs2 = czt.k(j);
        }
        else {
            j = null;
            czs2 = czs;
        }
        if (czs2 == null) {
            j = this.j(viewGroup);
            czs2 = czt.k(j);
            czs2.getClass();
        }
        j.getClass();
        j.setTag(2131427744, (Object)bqt.b.ordinal());
        czs2.b.setVisibility(8);
        if (this.f.f() && czs2.c.isClickable()) {
            czs2.c.setVisibility(0);
        }
        else {
            czs2.c.setVisibility(8);
        }
        this.l(j);
        final ImageView a = czs2.a;
        if (this.e.j()) {
            a.setContentDescription((CharSequence)super.c.getResources().getString(2131952224));
        }
        else {
            final boolean d = super.f.d();
            int n = 2131952376;
            if (!d) {
                if (!super.f.e()) {
                    if (super.f.f()) {
                        n = 2131952415;
                    }
                    else {
                        n = 2131952400;
                    }
                }
            }
            a.setContentDescription((CharSequence)super.c.getResources().getString(n, new Object[] { dae.b.format((TemporalAccessor)this.e.h()) }));
        }
        return j;
    }
    
    @Override
    protected final void m(final czs czs) {
        if (!super.e.j()) {
            final Uri c = this.e.c();
            final bho c2 = this.d.c(czt.n(this.e), this.g);
            final bqs e = this.e;
            bho bho = c2;
            if (e != null) {
                bho = c2;
                if (llk.a(e.i()) == llk.b) {
                    bho = (bho)c2.o();
                }
            }
            auw auw;
            if (this.h.g()) {
                auw = this.d.b().b(bho.u((Drawable)this.h.c())).e(c);
            }
            else {
                final auw b = this.d.b().b(bho);
                final czu d = this.d;
                final awc n = czt.n(this.e);
                final kre d2 = czu.d(d.a, d.b, czu.e());
                auw = b.f(this.d.b().b(new bho().x(n).G().p().t(d2.a, d2.b).w(bft.b, true)).e(c)).e(c);
            }
            auw.j(czs.a);
            return;
        }
        final him d3 = this.e.d();
        d3.getClass();
        final ImageView a = czs.a;
        final niz a2 = this.k.a(d3);
        if (a2.g()) {
            final Drawable f = ((bfc)a2.c()).f();
            if (f instanceof Animatable) {
                ((Animatable)f).start();
            }
            a.setImageDrawable(f);
            return;
        }
        a.l(czt.a.c(), "renderPlaceholderInto: No placeholder. Use default resource.", '\u0296');
        a.setImageResource(2131101048);
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.e);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 11);
        sb.append("PhotoItem: ");
        sb.append(value);
        return sb.toString();
    }
}
