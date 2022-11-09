import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aat
{
    private final abd a;
    private final Handler b;
    
    public aat(final abd a, final Handler b) {
        this.a = a;
        this.b = b;
    }
    
    public final void a(final aba aba) {
        if (aba.b == 0) {
            this.b.post((Runnable)new aar(this.a, aba.a));
            return;
        }
        this.b.post((Runnable)new aas());
    }
}
