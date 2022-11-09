// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.rewind;

import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextSwitcher;

public class RewindExportShotView extends TextSwitcher
{
    public final String a;
    public final String b;
    
    public RewindExportShotView(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = this.getResources().getString(2131952221);
        this.b = this.getResources().getString(2131952222);
    }
}
