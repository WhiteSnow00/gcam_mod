// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam.clientallocator;

import com.google.googlex.gcam.base.LongPair;

public interface YuvClientAllocator
{
    LongPair allocate(final int p0, final int p1, final int p2);
    
    void doneWriting(final long p0);
}
