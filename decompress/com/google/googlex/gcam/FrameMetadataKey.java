// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class FrameMetadataKey
{
    public transient long a;
    protected transient boolean b;
    
    public FrameMetadataKey(long new_FrameMetadataKey, final int n) {
        new_FrameMetadataKey = GcamModuleJNI.new_FrameMetadataKey(new_FrameMetadataKey, n);
        this.b = true;
        this.a = new_FrameMetadataKey;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_FrameMetadataKey(a);
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
