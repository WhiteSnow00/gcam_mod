import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jec implements jeb
{
    private final View a;
    
    public jec(final View a) {
        this.a = a;
    }
    
    @Override
    public final View a(final int n) {
        return this.a.findViewById(n);
    }
}
