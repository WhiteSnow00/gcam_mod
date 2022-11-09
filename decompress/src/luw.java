import android.os.Debug;
import android.os.Debug$MemoryInfo;
import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.6.0
// 

public final class luw extends luv
{
    public luw() {
        super(null);
    }
    
    public luw(final byte[] array) {
    }
    
    public final lrz b() {
        synchronized (this) {
            final Debug$MemoryInfo debug$MemoryInfo = new Debug$MemoryInfo();
            Debug.getMemoryInfo(debug$MemoryInfo);
            final lsb c = lsb.c();
            return new lrz(lrz.b(debug$MemoryInfo.otherPrivateDirty), lrz.b(debug$MemoryInfo.otherPss), lrz.b(debug$MemoryInfo.dalvikPrivateDirty), lrz.b(debug$MemoryInfo.dalvikPss), c.n, c.o, c.p, Debug.getNativeHeapAllocatedSize(), lrz.b(debug$MemoryInfo.getTotalPss()), lrz.a(debug$MemoryInfo, "getSummaryJavaHeap"), lrz.a(debug$MemoryInfo, "getSummaryNativeHeap"), lrz.a(debug$MemoryInfo, "getSummaryPrivateOther"), lrz.a(debug$MemoryInfo, "getSummaryCode"), lrz.a(debug$MemoryInfo, "getSummaryGraphics"), lrz.a(debug$MemoryInfo, "getSummaryStack"), lrz.a(debug$MemoryInfo, "getSummarySystem"));
        }
    }
}
