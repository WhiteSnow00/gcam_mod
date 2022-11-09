import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jwk
{
    private final String a;
    private final String b;
    private final int c;
    
    public jwk(final String a) {
        this.b = "";
        this.a = a;
        new jvh(a);
        int c;
        for (c = 2; c <= 7 && !Log.isLoggable(this.a, c); ++c) {}
        this.c = c;
    }
    
    protected final String a(final String s) {
        return this.b.concat(s);
    }
    
    public final void b(final String s) {
        if (this.c <= 3) {
            this.a(s);
        }
    }
    
    public final void c(final String s) {
        Log.e(this.a, this.a(s));
    }
}
