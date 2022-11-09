import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jea
{
    private final jeb a;
    
    private jea(final jeb a) {
        a.getClass();
        this.a = a;
    }
    
    public static jea a(final View view) {
        return b(new jec(view));
    }
    
    public static jea b(final jeb jeb) {
        return new jea(jeb);
    }
    
    public final Object c(final int n) {
        final jeb a = this.a;
        a.getClass();
        final View a2 = a.a(n);
        a2.getClass();
        return a2;
    }
}
