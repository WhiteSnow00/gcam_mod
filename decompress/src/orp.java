import android.content.ActivityNotFoundException;
import android.util.Log;
import android.net.Uri;
import android.content.Intent;
import android.content.DialogInterface;
import android.content.Context;
import android.content.DialogInterface$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class orp implements DialogInterface$OnClickListener
{
    final /* synthetic */ Context a;
    private final /* synthetic */ int b;
    
    public orp(final Context a) {
        this.a = a;
    }
    
    public orp(final Context a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        switch (this.b) {
            default: {
                final Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("market://details?id=com.google.vr.vrcore"));
                intent.setPackage("com.android.vending");
                try {
                    this.a.startActivity(intent);
                    return;
                }
                catch (final ActivityNotFoundException ex) {
                    Log.e(orq.a, "Google Play Services is not installed, unable to download VrCore.");
                    return;
                }
                break;
            }
            case 0: {
                this.a.startActivity(new Intent("android.settings.VR_LISTENER_SETTINGS"));
            }
        }
    }
}
