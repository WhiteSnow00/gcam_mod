import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.SearchView$OnQueryTextListener;
import android.widget.SearchView;
import android.preference.Preference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ddv extends Preference
{
    public SearchView a;
    public SearchView$OnQueryTextListener b;
    public CharSequence c;
    
    public ddv(final Context context) {
        super(context);
        this.c = "";
    }
    
    protected final View onCreateView(final ViewGroup viewGroup) {
        super.onCreateView(viewGroup);
        final View inflate = ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624134, viewGroup, false);
        (this.a = (SearchView)inflate.findViewById(2131427927)).setOnQueryTextListener((SearchView$OnQueryTextListener)new ddu(this));
        this.a.setQuery(this.c, true);
        return inflate;
    }
}
