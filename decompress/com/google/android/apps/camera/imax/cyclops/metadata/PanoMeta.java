// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.imax.cyclops.metadata;

public class PanoMeta
{
    public int croppedAreaImageHeightPixels;
    public int croppedAreaImageWidthPixels;
    public int croppedAreaLeftPixels;
    public int croppedAreaTopPixels;
    public int fullPanoHeightPixels;
    public int fullPanoWidthPixels;
    public int initialViewHeadingDegrees;
    public float poseRollDegrees;
    
    public PanoMeta() {
        this.croppedAreaLeftPixels = 0;
        this.croppedAreaTopPixels = 0;
        this.croppedAreaImageWidthPixels = 0;
        this.croppedAreaImageHeightPixels = 0;
        this.fullPanoWidthPixels = 0;
        this.fullPanoHeightPixels = 0;
        this.initialViewHeadingDegrees = 0;
        this.poseRollDegrees = 0.0f;
    }
}
