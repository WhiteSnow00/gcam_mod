import android.view.WindowInsets;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

class ij
{
    public static ix a(final View view) {
        final WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        final ix l = ix.l(rootWindowInsets);
        l.q(l);
        l.o(view.getRootView());
        return l;
    }
}
