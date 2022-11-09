import j$.time.temporal.TemporalAccessor;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ExecutionException;
import android.graphics.Bitmap;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dah extends czt
{
    private static final nsd h;
    private kre i;
    
    static {
        h = nsd.g("com/google/android/apps/camera/data/VideoItem");
    }
    
    public dah(final Context context, final czu czu, final bqs bqs, final hip hip) {
        super(context, czu, bqs, hip);
    }
    
    private final int p() {
        final int a = this.f.a();
        if (a > 0) {
            return a;
        }
        return this.e.e().b;
    }
    
    private final int q() {
        final int b = this.f.b();
        if (b > 0) {
            return b;
        }
        return this.e.e().a;
    }
    
    private final boolean r() {
        final String c = super.f.c();
        return "90".equals(c) || "270".equals(c);
    }
    
    @Override
    public final bqt b() {
        return bqt.c;
    }
    
    @Override
    public final jca e(final int n, final int n2) {
        try {
            final niz h = niz.h(this.d.a().b(this.d.c(czt.n(this.e), this.o())).b(czu.f()).e(this.e.c()).i().get());
            final jbz a = jbz.a;
            return new jca(h);
        }
        catch (final ExecutionException ex) {}
        catch (final InterruptedException ex2) {}
        a.l(dah.h.b(), "Fails to generate thumbnail", '\u02ad');
        final nii a2 = nii.a;
        final jbz a3 = jbz.a;
        return new jca(a2);
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
        j.setTag(2131427744, (Object)bqt.c.ordinal());
        czs2.c.setVisibility(8);
        this.l(j);
        czs2.a.setContentDescription((CharSequence)super.c.getResources().getString(2131952782, new Object[] { dah.b.format((TemporalAccessor)this.e.h()) }));
        return j;
    }
    
    @Override
    protected final void m(final czs czs) {
        this.d.a().b(this.d.c(czt.n(this.e), this.o())).b(czu.f()).e(this.e.c()).j(czs.a).c();
    }
    
    public final kre o() {
        int n;
        if (this.r()) {
            n = this.p();
        }
        else {
            n = this.q();
        }
        int n2;
        if (this.r()) {
            n2 = this.q();
        }
        else {
            n2 = this.p();
        }
        final kre i = this.i;
        if (i == null || n != i.a || n2 != i.b) {
            this.i = new kre(n, n2);
        }
        return this.i;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.e);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 11);
        sb.append("VideoItem: ");
        sb.append(value);
        return sb.toString();
    }
}
