// 
// Decompiled by Procyon v0.6.0
// 

package com.google.lens.sdk;

public @interface LensApi$LensAvailabilityStatus {
    public static final int LENS_AVAILABILITY_UNKNOWN = -1;
    public static final int LENS_READY = 0;
    public static final int LENS_UNAVAILABLE = 1;
    public static final int LENS_UNAVAILABLE_AGSA_OUTDATED = 6;
    @Deprecated
    public static final int LENS_UNAVAILABLE_ASSISTANT_EYES_FLAG_DISABLED = 8;
    public static final int LENS_UNAVAILABLE_DEVICE_INCOMPATIBLE = 3;
    public static final int LENS_UNAVAILABLE_DEVICE_LOCKED = 5;
    public static final int LENS_UNAVAILABLE_FEATURE_UNAVAILABLE = 11;
    public static final int LENS_UNAVAILABLE_INVALID_CURSOR = 4;
    @Deprecated
    public static final int LENS_UNAVAILABLE_LOCALE_NOT_SUPPORTED = 2;
    public static final int LENS_UNAVAILABLE_SERVICE_BUSY_FAILURE = 10;
    public static final int LENS_UNAVAILABLE_SERVICE_UNAVAILABLE = 9;
    public static final int LENS_UNAVAILABLE_UNKNOWN_ERROR_CODE = 12;
}
