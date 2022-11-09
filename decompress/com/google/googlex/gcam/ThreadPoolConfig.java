// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class ThreadPoolConfig
{
    public transient long a;
    protected transient boolean b;
    
    public ThreadPoolConfig() {
        this(GcamModuleJNI.new_ThreadPoolConfig(), true);
    }
    
    public ThreadPoolConfig(final long a, final boolean b) {
        this.b = b;
        this.a = a;
    }
    
    public static long a(final ThreadPoolConfig threadPoolConfig) {
        if (threadPoolConfig == null) {
            return 0L;
        }
        return threadPoolConfig.a;
    }
    
    public final void b() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_ThreadPoolConfig(a);
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
