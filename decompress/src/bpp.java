import com.google.googlex.gcam.DirtyLensHistory;
import com.google.googlex.gcam.GcamModuleJNI;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bpp implements oun
{
    private final pii a;
    
    public bpp(final pii a) {
        this.a = a;
    }
    
    public final bpq a() {
        final byz byz = (byz)this.a.get();
        final bpq bpq = new bpq();
        final DirtyLensHistory a = bpq.a;
        GcamModuleJNI.DirtyLensHistory_max_photo_count__set(a.a, a, 32);
        final DirtyLensHistory a2 = bpq.a;
        GcamModuleJNI.DirtyLensHistory_weighted_score_threshold__set(a2.a, a2, 0.5f);
        final DirtyLensHistory a3 = bpq.a;
        GcamModuleJNI.DirtyLensHistory_initial_score__set(a3.a, a3, -17.0f);
        final DirtyLensHistory a4 = bpq.a;
        GcamModuleJNI.DirtyLensHistory_frame_influence_decay_rate__set(a4.a, a4, 0.29f);
        return bpq;
    }
}
