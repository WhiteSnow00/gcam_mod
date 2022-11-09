// 
// Decompiled by Procyon v0.6.0
// 

public final class hwn extends hwh
{
    private static hwn a;
    
    public hwn(final long n, final lmm lmm) {
        super(lmm, n, hvv.values());
    }
    
    public hwn(final lmm lmm) {
        super(lmm, hwm.values());
    }
    
    public static void d(final long n) {
        synchronized (hwn.class) {
            njo.e(hwn.a == null, "CameraAppTiming shouldn't have been set before.");
            hwn.a = new hwn(n, new lmm());
        }
    }
    
    public static hwn e() {
        synchronized (hwn.class) {
            final hwn a = hwn.a;
            a.getClass();
            return a;
        }
    }
    
    public final void c() {
        this.i(hwm.b);
    }
    
    public long getMediaRecorderPrepareEndNs() {
        return this.g(hwm.b);
    }
    
    public long getMediaRecorderPrepareStartNs() {
        return this.g(hwm.a);
    }
}
