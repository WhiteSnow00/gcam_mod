// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.lens.lenslite.dynamicloading;

import android.os.Bundle;
import java.util.concurrent.Callable;
import android.content.Context;

public interface EngineApiLoader
{
    @Deprecated
    DLEngineApi getEngineApi(final Context p0, final Callable p1, final long p2);
    
    DLEngineApi getEngineApi(final Context p0, final Callable p1, final Bundle p2);
}
