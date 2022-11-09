import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

// 
// Decompiled by Procyon v0.6.0
// 

final class lcj extends lci
{
    private final ljo a;
    
    public lcj(final ldw ldw, final Surface surface, final OutputConfiguration outputConfiguration) {
        super(ldw, ofi.n(surface));
        ljo a;
        if (outputConfiguration == null) {
            a = null;
        }
        else {
            a = new lfb(outputConfiguration);
        }
        this.a = a;
    }
    
    public static lcj b(final ldw ldw, final Surface surface) {
        return new lcj(ldw, surface, lck.a(ldw, surface));
    }
    
    @Override
    public final ljo a() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 15);
        sb.append("SurfaceConfig<");
        sb.append(value);
        sb.append(">");
        return sb.toString();
    }
}
