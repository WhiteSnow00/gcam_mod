import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class dz implements DialogInterface$OnDismissListener
{
    final /* synthetic */ ec a;
    
    public dz(final ec a) {
        this.a = a;
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        final ec a = this.a;
        final Dialog c = a.c;
        if (c != null) {
            a.onDismiss((DialogInterface)c);
        }
    }
}
