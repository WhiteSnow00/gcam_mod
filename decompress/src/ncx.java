import android.view.ViewGroup$LayoutParams;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ncx implements Runnable
{
    final /* synthetic */ View a;
    final /* synthetic */ ViewGroup$LayoutParams b;
    
    public ncx(final View a, final ViewGroup$LayoutParams b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        this.a.setLayoutParams(this.b);
    }
}
