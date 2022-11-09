import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ddx
{
    public final Context a;
    private final kjm b;
    
    public ddx(final Context a, final kjm b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final String s) {
        this.b.execute(new ddw(this, s));
    }
}
