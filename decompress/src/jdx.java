import android.view.View;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jdx implements jeb
{
    public final Activity a;
    
    public jdx(final Activity a) {
        this.a = a;
    }
    
    @Override
    public final View a(final int n) {
        return this.a.findViewById(n);
    }
}
