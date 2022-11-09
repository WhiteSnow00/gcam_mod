import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnCancelListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class dy implements DialogInterface$OnCancelListener
{
    final /* synthetic */ ec a;
    
    public dy(final ec a) {
        this.a = a;
    }
    
    public final void onCancel(final DialogInterface dialogInterface) {
        final ec a = this.a;
        final Dialog c = a.c;
        if (c != null) {
            a.onCancel((DialogInterface)c);
        }
    }
}
