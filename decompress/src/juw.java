import android.content.ActivityNotFoundException;
import android.util.Log;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class juw implements DialogInterface$OnClickListener
{
    protected abstract void a();
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        try {
            try {
                this.a();
                dialogInterface.dismiss();
            }
            finally {
                dialogInterface.dismiss();
                while (true) {}
                final Throwable t;
                Log.e("DialogRedirect", "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.", t);
            }
        }
        catch (final ActivityNotFoundException ex) {}
    }
}
