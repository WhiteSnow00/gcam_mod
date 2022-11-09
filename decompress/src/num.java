import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class num extends ntl
{
    private final String a;
    
    protected num(final String a) {
        this.a = a;
    }
    
    @Override
    public String a() {
        return this.a;
    }
    
    @Override
    public void b(final RuntimeException ex, final ntk ntk) {
        Log.e("AbstractAndroidBackend", "Internal logging error", (Throwable)ex);
    }
}
