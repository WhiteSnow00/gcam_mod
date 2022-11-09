// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load;

public enum ImageHeaderParser$ImageType
{
    GIF("GIF", 0, true), 
    JPEG("JPEG", 1, false), 
    PNG("PNG", 4, false), 
    PNG_A("PNG_A", 3, true), 
    RAW("RAW", 2, false), 
    UNKNOWN("UNKNOWN", 7, false), 
    WEBP("WEBP", 6, false), 
    WEBP_A("WEBP_A", 5, true);
    
    private final boolean a;
    
    private ImageHeaderParser$ImageType(final String s, final int n, final boolean a) {
        this.a = a;
    }
    
    public boolean hasAlpha() {
        return this.a;
    }
}
