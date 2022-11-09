import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jqr
{
    public lsp a;
    private Looper b;
    
    public final jqs a() {
        if (this.a == null) {
            this.a = new lsp();
        }
        if (this.b == null) {
            this.b = Looper.getMainLooper();
        }
        return new jqs(this.a, this.b, null, null, null);
    }
}
