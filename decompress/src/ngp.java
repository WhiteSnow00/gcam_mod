import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class ngp implements AdapterView$OnItemClickListener
{
    final /* synthetic */ ngq a;
    
    public ngp(final ngq a) {
        this.a = a;
    }
    
    public final void onItemClick(final AdapterView adapterView, final View view, int o, long selectedItemId) {
        Object o2;
        if (o < 0) {
            final rj a = this.a.a;
            if (!a.u()) {
                o2 = null;
            }
            else {
                o2 = a.e.getSelectedItem();
            }
        }
        else {
            o2 = this.a.getAdapter().getItem(o);
        }
        this.a.a(o2);
        final AdapterView$OnItemClickListener onItemClickListener = this.a.getOnItemClickListener();
        if (onItemClickListener != null) {
            View selectedView;
            if (view != null && o >= 0) {
                selectedView = view;
            }
            else {
                final rj a2 = this.a.a;
                if (!a2.u()) {
                    selectedView = null;
                }
                else {
                    selectedView = a2.e.getSelectedView();
                }
                o = this.a.a.o();
                final rj a3 = this.a.a;
                if (!a3.u()) {
                    selectedItemId = Long.MIN_VALUE;
                }
                else {
                    selectedItemId = a3.e.getSelectedItemId();
                }
            }
            onItemClickListener.onItemClick((AdapterView)this.a.a.e, selectedView, o, selectedItemId);
        }
        this.a.a.k();
    }
}
