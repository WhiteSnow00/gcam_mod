import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class fob implements DialogInterface$OnClickListener
{
    final /* synthetic */ fol a;
    private final /* synthetic */ int b;
    
    public fob(final fol a) {
        this.a = a;
    }
    
    public fob(final fol a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        switch (this.b) {
            default: {
                this.a.t.g().d();
                return;
            }
            case 0: {
                this.a.t.v("Fatal error in Panorama module: 2131952420");
            }
        }
    }
}
