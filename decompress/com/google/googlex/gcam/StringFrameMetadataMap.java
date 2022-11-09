// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class StringFrameMetadataMap
{
    public transient long a;
    protected transient boolean b;
    
    public StringFrameMetadataMap() {
        this(GcamModuleJNI.new_StringFrameMetadataMap__SWIG_0(), true);
    }
    
    public StringFrameMetadataMap(final long a, final boolean b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_StringFrameMetadataMap(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final void b(final String s, final FrameMetadata frameMetadata) {
        GcamModuleJNI.StringFrameMetadataMap_set(this.a, this, s, FrameMetadata.b(frameMetadata), frameMetadata);
    }
    
    @Override
    protected final void finalize() {
        this.a();
    }
}
