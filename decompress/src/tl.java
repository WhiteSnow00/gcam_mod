import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.content.res.AssetManager;
import android.content.Context;
import android.content.ContextWrapper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tl extends ContextWrapper
{
    public static void a(final Context context) {
        if (!(context instanceof tl) && !(context.getResources() instanceof tn)) {
            context.getResources();
        }
    }
    
    public final AssetManager getAssets() {
        throw null;
    }
    
    public final Resources getResources() {
        throw null;
    }
    
    public final Resources$Theme getTheme() {
        throw null;
    }
    
    public final void setTheme(final int n) {
        throw null;
    }
}
