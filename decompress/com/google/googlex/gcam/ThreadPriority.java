// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class ThreadPriority
{
    public transient long a;
    protected transient boolean b;
    
    public ThreadPriority() {
        final long new_ThreadPriority = GcamModuleJNI.new_ThreadPriority();
        this.b = true;
        this.a = new_ThreadPriority;
    }
    
    public final void a() {
        synchronized (this) {
            final long a = this.a;
            if (a != 0L) {
                if (this.b) {
                    this.b = false;
                    GcamModuleJNI.delete_ThreadPriority(a);
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
