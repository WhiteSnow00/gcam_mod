// 
// Decompiled by Procyon v0.6.0
// 

package com.google.googlex.gcam.base;

import j$.util.Objects;

public final class LongPair
{
    public long first;
    public long second;
    
    public LongPair() {
        this.first = 0L;
        this.second = 0L;
    }
    
    public LongPair(final long first, final long second) {
        this.first = first;
        this.second = second;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof LongPair) {
            final LongPair longPair = (LongPair)o;
            if (this.first == longPair.first && this.second == longPair.second) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.first, this.second });
    }
}
