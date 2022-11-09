// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.stats.timing;

public class CameraActivityTiming extends hwh
{
    public static final hwg a;
    public static final hwg b;
    public boolean c;
    public final hvp d;
    public final kse e;
    public ksh f;
    public ksh g;
    public ksh h;
    
    static {
        final hwf a2 = hwg.a();
        a2.b(false);
        a = a2.a();
        b = CameraActivityTiming.i;
    }
    
    public CameraActivityTiming(final long n, final lmp lmp, final hvp d, final kse e) {
        super(lmp, n, hvu.values());
        this.c = false;
        this.h = ksh.b;
        this.d = d;
        this.e = e;
        this.f = e.a("FirstPreviewFrame");
        this.g = e.a("ShutterButtonEnabled");
    }
    
    public final void a() {
        super.a();
        this.c = false;
    }
    
    public final void c() {
        this.c = true;
    }
    
    public final boolean d() {
        for (final hvu hvu : hvu.values()) {
            if (hvu.s && !this.l(hvu)) {
                return false;
            }
        }
        return true;
    }
    
    public long getActivityInitializedNs() {
        return this.g(hvu.k);
    }
    
    public long getActivityOnCreateEndNs() {
        return this.g(hvu.b);
    }
    
    public long getActivityOnCreateStartNs() {
        return this.g(hvu.a);
    }
    
    public long getActivityOnResumeEndNs() {
        return this.g(hvu.i);
    }
    
    public long getActivityOnResumeStartNs() {
        return this.g(hvu.h);
    }
    
    public long getActivityOnStartStartNs() {
        return this.g(hvu.g);
    }
    
    public long getFirstPreviewFrameReceivedNs() {
        return this.g(hvu.l);
    }
    
    public long getFirstPreviewFrameRenderedNs() {
        return this.g(hvu.m);
    }
    
    public long getFirstVfePreviewFrameRenderedNs() {
        return this.g(hvu.n);
    }
    
    public long getPermissionStartupTaskTimeEndNs() {
        return this.g(hvu.d);
    }
    
    public long getPermissionStartupTaskTimeStartNs() {
        return this.g(hvu.c);
    }
    
    public long getShutterButtonFirstDrawnNs() {
        return this.g(hvu.o);
    }
    
    public long getShutterButtonFirstEnabledNs() {
        return this.g(hvu.p);
    }
    
    public long getWaitForCameraDevicesTaskTimeEndNs() {
        return this.g(hvu.f);
    }
    
    public long getWaitForCameraDevicesTaskTimeStartNs() {
        return this.g(hvu.e);
    }
    
    public void recordActivityOnCreateStart(final long n) {
        this.k(hvu.a, n, CameraActivityTiming.a);
    }
}
