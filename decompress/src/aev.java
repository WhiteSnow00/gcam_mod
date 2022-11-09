import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aev
{
    public final xg a;
    public Bundle b;
    public boolean c;
    
    public aev() {
        this.a = new xg();
    }
    
    public final Bundle a(final String s) {
        if (!this.c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        final Bundle b = this.b;
        if (b != null) {
            final Bundle bundle = b.getBundle(s);
            this.b.remove(s);
            if (this.b.isEmpty()) {
                this.b = null;
            }
            return bundle;
        }
        return null;
    }
    
    public final void b(final String s, final aeu aeu) {
        if (this.a.f(s, aeu) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }
}
