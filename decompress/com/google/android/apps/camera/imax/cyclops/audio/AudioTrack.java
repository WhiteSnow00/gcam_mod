// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.imax.cyclops.audio;

public class AudioTrack
{
    private final byte[] audioData;
    private final String mime;
    
    public AudioTrack(final String mime, final byte[] audioData) {
        this.mime = mime;
        this.audioData = audioData;
    }
}
