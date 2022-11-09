// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam;

public class Tuning
{
    public transient long a;
    
    public Tuning(final long a) {
        this.a = a;
    }
    
    public final void a() {
        synchronized (this) {
            if (this.a != 0L) {
                this.a = 0L;
            }
        }
    }
    
    @Override
    protected final void finalize() {
        this.a();
    }
}
