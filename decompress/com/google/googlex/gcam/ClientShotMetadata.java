// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class ClientShotMetadata
{
    public transient long a;
    protected transient boolean b;
    
    public ClientShotMetadata() {
        final long new_ClientShotMetadata = GcamModuleJNI.new_ClientShotMetadata();
        this.b = true;
        this.a = new_ClientShotMetadata;
    }
    
    public static long a(final ClientShotMetadata clientShotMetadata) {
        if (clientShotMetadata == null) {
            return 0L;
        }
        return clientShotMetadata.a;
    }
    
    public final void b() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_ClientShotMetadata(a);
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
