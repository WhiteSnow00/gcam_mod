import android.widget.SearchView$OnQueryTextListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class ddq implements SearchView$OnQueryTextListener
{
    final /* synthetic */ dds a;
    
    public ddq(final dds a) {
        this.a = a;
    }
    
    public final boolean onQueryTextChange(final String s) {
        this.a.b(s);
        return false;
    }
    
    public final boolean onQueryTextSubmit(final String s) {
        this.a.b(s);
        return true;
    }
}
