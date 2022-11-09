// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class StaticMetadataVector
{
    public transient long a;
    protected transient boolean b;
    
    public StaticMetadataVector() {
        final long new_StaticMetadataVector__SWIG_0 = GcamModuleJNI.new_StaticMetadataVector__SWIG_0();
        this.b = true;
        this.a = new_StaticMetadataVector__SWIG_0;
    }
    
    public final void a(final StaticMetadata staticMetadata) {
        GcamModuleJNI.StaticMetadataVector_add(this.a, this, StaticMetadata.b(staticMetadata), staticMetadata);
    }
    
    public final void b() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_StaticMetadataVector(a);
                }
                this.a = 0L;
            }
        }
    }
    
    @Override
    protected final void finalize() {
        this.b();
    }
}
