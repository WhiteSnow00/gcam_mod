// 
// Decompiled by Procyon v0.6.0
// 

package com.google.mediapipe.framework;

public class MediaPipeException extends RuntimeException
{
    public MediaPipeException(final int n, final String s) {
        final String r = ojb.values()[n].r;
        final StringBuilder sb = new StringBuilder(String.valueOf(r).length() + 2 + String.valueOf(s).length());
        sb.append(r);
        sb.append(": ");
        sb.append(s);
        super(sb.toString());
        final ojb ojb = ojb.values()[n];
    }
    
    MediaPipeException(final int n, final byte[] array) {
        this(n, new String(array, nip.a));
    }
}
