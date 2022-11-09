import android.view.Window$Callback;
import android.view.MenuItem;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class tw implements View$OnClickListener
{
    final mf a;
    final /* synthetic */ ty b;
    
    public tw(final ty b) {
        this.b = b;
        this.a = new mf(b.a.getContext(), b.c);
    }
    
    public final void onClick(final View view) {
        final ty b = this.b;
        final Window$Callback d = b.d;
        if (d != null && b.e) {
            d.onMenuItemSelected(0, (MenuItem)this.a);
        }
    }
}
