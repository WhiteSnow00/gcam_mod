import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public abstract class bib extends bhs
{
    protected final View a;
    public final bia b;
    
    public bib(final View a) {
        bit.a(a);
        this.a = a;
        this.b = new bia(a);
    }
    
    @Override
    public final bhj c() {
        final Object tag = this.a.getTag(2131427625);
        bhj bhj;
        if (tag != null) {
            if (!(tag instanceof bhj)) {
                throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
            }
            bhj = (bhj)tag;
        }
        else {
            bhj = null;
        }
        return bhj;
    }
    
    @Override
    public final void d(final bhx bhx) {
        final bia b = this.b;
        final int b2 = b.b();
        final int a = b.a();
        if (bia.d(b2, a)) {
            bhx.g(b2, a);
            return;
        }
        if (!b.c.contains(bhx)) {
            b.c.add(bhx);
        }
        if (b.d == null) {
            b.b.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)(b.d = new bhz(b)));
        }
    }
    
    @Override
    public final void j(final bhx bhx) {
        this.b.c.remove(bhx);
    }
    
    @Override
    public final void k(final bhj bhj) {
        this.a.setTag(2131427625, (Object)bhj);
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 12);
        sb.append("Target for: ");
        sb.append(value);
        return sb.toString();
    }
}
