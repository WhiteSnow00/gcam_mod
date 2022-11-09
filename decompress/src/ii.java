import android.view.WindowInsets;
import android.view.View;
import android.view.View$OnApplyWindowInsetsListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class ii implements View$OnApplyWindowInsetsListener
{
    final /* synthetic */ ie a;
    
    public ii(final ie a) {
        this.a = a;
    }
    
    public final WindowInsets onApplyWindowInsets(final View view, final WindowInsets windowInsets) {
        return this.a.a(view, ix.m(windowInsets, view)).n();
    }
}
