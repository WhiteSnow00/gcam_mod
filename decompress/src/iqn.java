import android.view.View;
import com.google.android.apps.camera.ui.modeswitcher.ModeSwitcher;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iqn implements View$OnClickListener
{
    final /* synthetic */ jbm a;
    final /* synthetic */ ModeSwitcher b;
    
    public iqn(final ModeSwitcher b, final jbm a) {
        this.b = b;
        this.a = a;
    }
    
    public final void onClick(final View view) {
        jdj.e(view);
        final ModeSwitcher b = this.b;
        final eyt h = b.h;
        if (h != null) {
            h.W(3, b.k.toString(), this.a.toString());
        }
        this.b.h(this.a);
    }
}
