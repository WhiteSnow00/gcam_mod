// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.lens.lenslite.api;

import java.util.Locale;

public interface DownloadEvent
{
    int getErrorCode();
    
    int getEventType();
    
    Locale getLocale();
    
    String getModelName();
}
