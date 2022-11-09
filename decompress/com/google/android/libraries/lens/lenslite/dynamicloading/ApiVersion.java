// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.lens.lenslite.dynamicloading;

public enum ApiVersion
{
    public static final int CURRENT_VERSION = 17;
    public static final int MIN_VERSION = 4;
    
    ORIGINAL("ORIGINAL", 0, 1), 
    VERSION_10("VERSION_10", 9, 10), 
    VERSION_11("VERSION_11", 10, 11), 
    VERSION_12("VERSION_12", 11, 12), 
    VERSION_13("VERSION_13", 12, 13), 
    VERSION_14("VERSION_14", 13, 14), 
    VERSION_15("VERSION_15", 14, 15), 
    VERSION_16("VERSION_16", 15, 16), 
    VERSION_17("VERSION_17", 16, 17), 
    VERSION_2("VERSION_2", 1, 2), 
    VERSION_3("VERSION_3", 2, 3), 
    VERSION_4("VERSION_4", 3, 4), 
    VERSION_5("VERSION_5", 4, 5), 
    VERSION_6("VERSION_6", 5, 6), 
    VERSION_7("VERSION_7", 6, 7), 
    VERSION_8("VERSION_8", 7, 8), 
    VERSION_9("VERSION_9", 8, 9);
    
    private final int versionCode;
    
    private ApiVersion(final String s, final int n, final int versionCode) {
        this.versionCode = versionCode;
    }
    
    public int getVersionCode() {
        return this.versionCode;
    }
}
