// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.microvideo.xmp.nativemotionphotos;

public final class NativeMotionPhotoProcessor
{
    static {
        nte.g("NativeMotionPhotoProc");
        System.loadLibrary("native");
    }
    
    private NativeMotionPhotoProcessor() {
    }
    
    public static byte[] a(final oon oon) {
        return encodeVideoMetadata(oon.g());
    }
    
    private static native byte[] encodeVideoMetadata(final byte[] p0);
}
