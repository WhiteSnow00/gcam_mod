import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x
{
    public final i a;
    private final Handler b;
    private w c;
    
    public x(final k k) {
        this.a = new i(k);
        this.b = new Handler();
    }
    
    public final void a(final g g) {
        final w c = this.c;
        if (c != null) {
            c.run();
        }
        final w c2 = new w(this.a, g);
        this.c = c2;
        this.b.postAtFrontOfQueue((Runnable)c2);
    }
}
