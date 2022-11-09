// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.imax.cyclops.image;

import com.google.android.apps.camera.imax.cyclops.audio.AudioTrack;
import com.google.android.apps.camera.imax.cyclops.metadata.PanoMeta;

public class StereoPanorama
{
    public final byte[] a;
    public final byte[] b;
    public final PanoMeta c;
    public AudioTrack d;
    
    public StereoPanorama(final byte[] array, final byte[] array2, final PanoMeta panoMeta) {
        this(array, array2, panoMeta, null);
    }
    
    public StereoPanorama(final byte[] a, final byte[] b, final PanoMeta c, final AudioTrack d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}
