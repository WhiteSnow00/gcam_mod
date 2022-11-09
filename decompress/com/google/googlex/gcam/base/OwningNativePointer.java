// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam.base;

public class OwningNativePointer implements AutoCloseable
{
    private long nativeSharedPointer;
    
    protected OwningNativePointer(final long nativeSharedPointer) {
        this.nativeSharedPointer = nativeSharedPointer;
    }
    
    private native void delete(final long p0);
    
    @Override
    public final void close() {
        synchronized (this) {
            final long nativeSharedPointer = this.nativeSharedPointer;
            if (nativeSharedPointer == 0L) {
                return;
            }
            this.delete(nativeSharedPointer);
            this.nativeSharedPointer = 0L;
        }
    }
    
    @Override
    protected final void finalize() {
        synchronized (this) {
            if (this.nativeSharedPointer == 0L) {
                return;
            }
            System.err.printf("OwningNativePointer finalized with a non-zero nativeSharedPointer (0x%x), this indicates a resource management error%n", this.nativeSharedPointer);
            this.close();
        }
    }
}
