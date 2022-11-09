// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class DirtyLensHistory
{
    public transient long a;
    protected transient boolean b;
    
    public DirtyLensHistory() {
        final long new_DirtyLensHistory = GcamModuleJNI.new_DirtyLensHistory();
        this.b = true;
        this.a = new_DirtyLensHistory;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_DirtyLensHistory(a);
                }
                this.a = 0L;
            }
        }
    }
    
    @Override
    protected final void finalize() {
        this.a();
    }
}
