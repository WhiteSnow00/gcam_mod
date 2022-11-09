import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fnv implements DialogInterface$OnClickListener
{
    private final /* synthetic */ int b;
    
    static {
        a = new fnv(2);
    }
    
    public fnv() {
    }
    
    public fnv(final int b) {
        this.b = b;
    }
    
    public final void onClick(final DialogInterface dialogInterface, int b) {
        b = this.b;
    }
}
