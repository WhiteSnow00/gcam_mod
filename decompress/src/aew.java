import androidx.savedstate.SavedStateRegistry$1;
import androidx.savedstate.Recreator;
import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aew
{
    public final aev a;
    private final aex b;
    
    private aew(final aex b) {
        this.b = b;
        this.a = new aev();
    }
    
    public static aew a(final aex aex) {
        return new aew(aex);
    }
    
    public final void b(final Bundle bundle) {
        final i ad = this.b.aD();
        if (ad.a != h.b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        ad.b(new Recreator(this.b));
        final aev a = this.a;
        if (!a.c) {
            if (bundle != null) {
                a.b = bundle.getBundle("android.arch.lifecycle.BundlableSavedStateRegistry.key");
            }
            ad.b(new SavedStateRegistry$1());
            a.c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }
    
    public final void c(final Bundle bundle) {
        final aev a = this.a;
        final Bundle bundle2 = new Bundle();
        final Bundle b = a.b;
        if (b != null) {
            bundle2.putAll(b);
        }
        final xd e = a.a.e();
        while (e.hasNext()) {
            final xc xc = (xc)e.a();
            bundle2.putBundle((String)xc.a, ((aeu)xc.b).a());
        }
        bundle.putBundle("android.arch.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
