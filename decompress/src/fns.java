import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class fns implements DialogInterface$OnClickListener
{
    final /* synthetic */ fnt a;
    
    public fns(final fnt a) {
        this.a = a;
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        final fol a = this.a.a;
        final ess s = a.s;
        if (s != null && !s.s) {
            a.v();
            return;
        }
        a.l(fol.b.c(), "Photo is being taken, ignoring user's request for cancel.", '\u06ad');
    }
}
