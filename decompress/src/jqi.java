import android.content.DialogInterface;
import android.content.Context;
import android.app.AlertDialog$Builder;
import android.content.DialogInterface$OnCancelListener;
import android.app.Dialog;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jqi extends ec
{
    public Dialog ac;
    public DialogInterface$OnCancelListener ad;
    private Dialog ae;
    
    @Override
    public final Dialog m() {
        Dialog dialog;
        if ((dialog = this.ac) == null) {
            super.b = false;
            if (this.ae == null) {
                final em v = this.v();
                jvu.a(v);
                this.ae = (Dialog)new AlertDialog$Builder((Context)v).create();
            }
            dialog = this.ae;
        }
        return dialog;
    }
    
    @Override
    public final void onCancel(final DialogInterface dialogInterface) {
        final DialogInterface$OnCancelListener ad = this.ad;
        if (ad != null) {
            ad.onCancel(dialogInterface);
        }
    }
}
