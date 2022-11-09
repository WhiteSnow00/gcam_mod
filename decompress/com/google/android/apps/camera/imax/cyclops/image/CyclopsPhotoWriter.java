// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.imax.cyclops.image;

import com.google.android.apps.camera.imax.cyclops.audio.AudioTrack;
import com.google.android.apps.camera.imax.cyclops.metadata.PanoMeta;

public class CyclopsPhotoWriter
{
    static {
        System.loadLibrary("cyclops");
    }
    
    public static native boolean writeToFile(final byte[] p0, final byte[] p1, final PanoMeta p2, final AudioTrack p3, final String p4);
}
