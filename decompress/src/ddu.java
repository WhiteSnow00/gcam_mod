import android.widget.SearchView$OnQueryTextListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class ddu implements SearchView$OnQueryTextListener
{
    final /* synthetic */ ddv a;
    
    public ddu(final ddv a) {
        this.a = a;
    }
    
    public final boolean onQueryTextChange(final String c) {
        final ddv a = this.a;
        a.c = c;
        final SearchView$OnQueryTextListener b = a.b;
        return b != null && b.onQueryTextChange(c);
    }
    
    public final boolean onQueryTextSubmit(final String c) {
        final ddv a = this.a;
        a.c = c;
        final SearchView$OnQueryTextListener b = a.b;
        final boolean b2 = b != null && b.onQueryTextSubmit(c);
        this.a.a.clearFocus();
        return b2;
    }
}
