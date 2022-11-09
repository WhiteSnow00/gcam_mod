import android.content.Intent;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class hxc implements DialogInterface$OnClickListener
{
    final /* synthetic */ hxd a;
    
    public hxc(final hxd a) {
        this.a = a;
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.a.startActivity(new Intent("android.os.storage.action.MANAGE_STORAGE"));
    }
}
