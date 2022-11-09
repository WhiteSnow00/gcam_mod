import java.util.List;
import android.hardware.camera2.params.OutputConfiguration;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lfb implements ljo
{
    private final Object a;
    private final OutputConfiguration b;
    
    public lfb(final OutputConfiguration b) {
        this.a = new Object();
        this.b = b;
    }
    
    @Override
    public final List a() {
        synchronized (this.a) {
            return this.b.getSurfaces();
        }
    }
    
    @Override
    public final lfa g() {
        synchronized (this.a) {
            return new lfa(this.b);
        }
    }
    
    @Override
    public final String toString() {
        synchronized (this.a) {
            final niy d = nfa.d("AndroidOutputConfiguration");
            d.b("outputConfiguration", this.b);
            return d.toString();
        }
    }
}
