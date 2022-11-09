// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class LiveHdrMetadata
{
    public transient long a;
    protected transient boolean b;
    
    public LiveHdrMetadata() {
        this(GcamModuleJNI.new_LiveHdrMetadata(), true);
    }
    
    public LiveHdrMetadata(final long a, final boolean b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_LiveHdrMetadata(a);
                }
                this.a = 0L;
            }
        }
    }
    
    public final void b(final float n) {
        GcamModuleJNI.LiveHdrMetadata_manual_long_tet_override_set(this.a, this, n);
    }
    
    public final void c(final float n) {
        GcamModuleJNI.LiveHdrMetadata_manual_short_tet_override_set(this.a, this, n);
    }
    
    public final void d(final float n) {
        GcamModuleJNI.LiveHdrMetadata_viewfinder_long_tet_set(this.a, this, n);
    }
    
    public final void e(final float n) {
        GcamModuleJNI.LiveHdrMetadata_viewfinder_portrait_tet_set(this.a, this, n);
    }
    
    public final void f(final float n) {
        GcamModuleJNI.LiveHdrMetadata_viewfinder_short_tet_set(this.a, this, n);
    }
    
    @Override
    protected final void finalize() {
        this.a();
    }
}
