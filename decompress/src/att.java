import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public class att
{
    public final ats a;
    private final Handler b;
    
    public att(final Handler b) {
        this.a = new ato();
        this.b = b;
    }
    
    public att(final ats a, final Handler b) {
        this.b = b;
        this.a = a;
    }
    
    public void a(final int n) {
        this.b.post((Runnable)new atp(this, n));
    }
    
    public void b(final RuntimeException ex, final String s, final int n, final int n2) {
        this.b.post((Runnable)new atq(this, ex, s, n, n2));
    }
    
    public void c(final RuntimeException ex) {
        this.b.post((Runnable)new atr(this, ex));
    }
}
