// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.lens.lenslite.api;

import android.graphics.drawable.Drawable;
import android.graphics.Point;
import java.util.List;

public interface LinkChipResult
{
    int getActionType();
    
    LinkChipResult$BitmapProvider getBitmapProvider();
    
    List getBoundingBox();
    
    Point getCenterpoint();
    
    String getChipContentDescription();
    
    Drawable getIcon();
    
    long getId();
    
    Runnable getOnChipClickListener();
    
    Runnable getOnCloseButtonClickListener();
    
    int getResultType();
    
    String getText();
    
    long getTimeout();
}
