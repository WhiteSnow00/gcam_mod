import com.google.googlex.gcam.hdrplus.ManagedImageCallback;
import com.google.googlex.gcam.hdrplus.HdrPlusInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oid
{
    public final HdrPlusInterface a;
    
    public oid(final HdrPlusInterface a) {
        this.a = a;
    }
    
    public static ManagedImageCallback a(final oic oic) {
        return new oia(oic);
    }
}
