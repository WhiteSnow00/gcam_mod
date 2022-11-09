import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class fmy implements DialogInterface$OnClickListener
{
    final /* synthetic */ fmz a;
    
    public fmy(final fmz a) {
        this.a = a;
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.a.a("CaptureModule: Out of storage space on device.");
    }
}
