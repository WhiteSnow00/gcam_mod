// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class StringStaticMetadataMap
{
    public transient long a;
    protected transient boolean b;
    
    public StringStaticMetadataMap() {
        this(GcamModuleJNI.new_StringStaticMetadataMap__SWIG_0(), true);
    }
    
    public StringStaticMetadataMap(final long a, final boolean b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_StringStaticMetadataMap(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final void b(final String s, final StaticMetadata staticMetadata) {
        GcamModuleJNI.StringStaticMetadataMap_set(this.a, this, s, StaticMetadata.b(staticMetadata), staticMetadata);
    }
    
    @Override
    protected final void finalize() {
        this.a();
    }
}
