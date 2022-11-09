import android.view.WindowManager;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ega
{
    private final Context a;
    
    public ega(final Context a) {
        this.a = a;
    }
    
    public final WindowManager a() {
        return (WindowManager)egb.c(this.a, "window");
    }
}
