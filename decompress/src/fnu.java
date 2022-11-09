import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class fnu implements DialogInterface$OnClickListener
{
    final /* synthetic */ fnt a;
    
    public fnu(final fnt a, final byte[] array) {
        this.a = a;
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.a.x();
    }
}
