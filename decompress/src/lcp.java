import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class lcp extends lco
{
    private final lda a;
    
    public lcp(final lda a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Handler handler) {
        leg.b(this.a, handler);
    }
    
    @Override
    public final void b(final lcr lcr) {
        lcr.e(this.a);
    }
}
