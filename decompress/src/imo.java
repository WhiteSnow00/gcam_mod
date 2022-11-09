import android.graphics.drawable.Drawable;
import android.view.View$OnClickListener;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class imo implements bhn
{
    final /* synthetic */ Context a;
    final /* synthetic */ imp b;
    
    public imo(final imp b, final Context a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void l(final ayv ayv) {
        this.b.b.a.setOnClickListener((View$OnClickListener)new iow(this.a, 1));
        this.b.c();
    }
}
