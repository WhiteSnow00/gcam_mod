import android.view.Window;

// 
// Decompiled by Procyon v0.6.0
// 

public final class efw implements oun
{
    private final efs a;
    
    public efw(final efs a) {
        this.a = a;
    }
    
    public static Window b(final efs efs) {
        final Window window = efs.a.getWindow();
        pqf.k(window);
        return window;
    }
    
    public final Window a() {
        return b(this.a);
    }
}
