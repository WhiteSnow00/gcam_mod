import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class arg extends att
{
    public arg() {
        super(null);
    }
    
    @Override
    public final void a(final int n) {
        final aub a = asa.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("onCameraError called with no handler set: ");
        sb.append(n);
        auc.c(a, sb.toString());
    }
    
    @Override
    public final void b(final RuntimeException ex, final String s, final int n, final int n2) {
        auc.d(asa.a, "onCameraException called with no handler set", ex);
    }
    
    @Override
    public final void c(final RuntimeException ex) {
        auc.d(asa.a, "onDispatchThreadException called with no handler set", ex);
    }
}
