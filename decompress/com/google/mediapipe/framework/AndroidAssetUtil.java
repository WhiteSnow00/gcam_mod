// 
// Decompiled by Procyon v0.6.0
// 

package com.google.mediapipe.framework;

import android.content.Context;

public final class AndroidAssetUtil
{
    public static void a(final Context context) {
        synchronized (AndroidAssetUtil.class) {
            nativeInitializeAssetManager(context, context.getCacheDir().getAbsolutePath());
        }
    }
    
    private static native boolean nativeInitializeAssetManager(final Context p0, final String p1);
}
