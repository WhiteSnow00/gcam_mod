import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class jw implements AdapterView$OnItemClickListener
{
    final /* synthetic */ ka a;
    final /* synthetic */ jx b;
    
    public jw(final jx b, final ka a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.b.o.onClick((DialogInterface)this.a.b, n);
        if (!this.b.q) {
            this.a.b.dismiss();
        }
    }
}
