import android.graphics.drawable.Drawable;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class imn implements bhn
{
    final /* synthetic */ imp a;
    private final /* synthetic */ int b;
    
    public imn(final imp a) {
        this.a = a;
    }
    
    public imn(final imp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void l(final ayv ayv) {
        switch (this.b) {
            default: {
                this.a.b.a.setImportantForAccessibility(2);
                return;
            }
            case 0: {
                this.a.b.a.setOnClickListener((View$OnClickListener)new imm(this));
                this.a.c();
            }
        }
    }
}
