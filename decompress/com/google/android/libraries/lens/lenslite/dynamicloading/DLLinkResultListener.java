// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.lens.lenslite.dynamicloading;

import java.nio.ByteBuffer;
import java.util.List;

public interface DLLinkResultListener
{
    void onResultUpdate(final List p0, final ByteBuffer p1);
    
    void onResultUpdate(final List p0, final ByteBuffer p1, final ByteBuffer p2);
}
