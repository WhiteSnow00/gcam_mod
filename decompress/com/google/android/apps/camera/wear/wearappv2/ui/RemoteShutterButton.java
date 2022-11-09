// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.wear.wearappv2.ui;

import java.util.Iterator;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;

public class RemoteShutterButton extends ShutterButton
{
    public RemoteShutterButton(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    @Override
    protected final float getDefaultScale() {
        return 0.95f;
    }
    
    @Override
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        for (final AccessibilityNodeInfo$AccessibilityAction accessibilityNodeInfo$AccessibilityAction : accessibilityNodeInfo.getActionList()) {
            if (accessibilityNodeInfo$AccessibilityAction.getId() == 32) {
                accessibilityNodeInfo.removeAction(accessibilityNodeInfo$AccessibilityAction);
                break;
            }
        }
    }
}
