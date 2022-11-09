import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemSelectedListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class re implements AdapterView$OnItemSelectedListener
{
    final /* synthetic */ rj a;
    
    public re(final rj a) {
        this.a = a;
    }
    
    public final void onItemSelected(final AdapterView adapterView, final View view, final int n, final long n2) {
        if (n != -1) {
            final ql e = this.a.e;
            if (e != null) {
                e.a = false;
            }
        }
    }
    
    public final void onNothingSelected(final AdapterView adapterView) {
    }
}
