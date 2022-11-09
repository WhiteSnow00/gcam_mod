import android.content.res.TypedArray;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class ndi implements View$OnClickListener
{
    final /* synthetic */ ndm a;
    
    public ndi(final ndm a) {
        this.a = a;
    }
    
    public final void onClick(final View view) {
        final ndm a = this.a;
        if (a.d && a.isShowing()) {
            final ndm a2 = this.a;
            if (!a2.f) {
                final TypedArray obtainStyledAttributes = a2.getContext().obtainStyledAttributes(new int[] { 16843611 });
                a2.e = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                a2.f = true;
            }
            if (a2.e) {
                this.a.cancel();
            }
        }
    }
}
