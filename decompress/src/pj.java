import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class pj implements AdapterView$OnItemClickListener
{
    final /* synthetic */ pm a;
    
    public pj(final pm a) {
        this.a = a;
    }
    
    public final void onItemClick(final AdapterView adapterView, final View view, final int selection, final long n) {
        this.a.d.setSelection(selection);
        if (this.a.d.getOnItemClickListener() != null) {
            final pm a = this.a;
            a.d.performItemClick(view, selection, a.b.getItemId(selection));
        }
        this.a.k();
    }
}
