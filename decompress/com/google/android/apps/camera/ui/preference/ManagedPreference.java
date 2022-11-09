// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.preference;

import android.view.View$AccessibilityDelegate;
import android.widget.TextView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.preference.Preference;

public class ManagedPreference extends Preference
{
    public ManagedPreference(final Context context) {
        super(context);
    }
    
    public ManagedPreference(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public ManagedPreference(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    protected final void onBindView(final View view) {
        super.onBindView(view);
        final TextView textView = (TextView)view.findViewById(16908304);
        if (textView != null) {
            textView.setAccessibilityDelegate((View$AccessibilityDelegate)new isl());
        }
    }
}
