import com.google.googlex.gcam.FloatDeque;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.DirtyLensHistory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bpq
{
    public final DirtyLensHistory a;
    
    public bpq() {
        this.a = new DirtyLensHistory();
    }
    
    public final bpr a() {
        final DirtyLensHistory a = this.a;
        final long dirtyLensHistory_raw_score_history__get = GcamModuleJNI.DirtyLensHistory_raw_score_history__get(a.a, a);
        FloatDeque floatDeque;
        if (dirtyLensHistory_raw_score_history__get == 0L) {
            floatDeque = null;
        }
        else {
            floatDeque = new FloatDeque(dirtyLensHistory_raw_score_history__get, false);
        }
        return new bpr(floatDeque);
    }
}
