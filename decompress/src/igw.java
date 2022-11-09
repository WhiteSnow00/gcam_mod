import java.util.Iterator;
import java.util.List;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.view.accessibility.AccessibilityManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class igw
{
    private final AccessibilityManager a;
    
    public igw(final AccessibilityManager a) {
        this.a = a;
    }
    
    public final boolean a() {
        if (!this.a.isTouchExplorationEnabled()) {
            final List enabledAccessibilityServiceList = this.a.getEnabledAccessibilityServiceList(-1);
            if (enabledAccessibilityServiceList != null) {
                final Iterator iterator = enabledAccessibilityServiceList.iterator();
                while (iterator.hasNext()) {
                    final String id = ((AccessibilityServiceInfo)iterator.next()).getId();
                    if (enabledAccessibilityServiceList.size() == 1 && id.endsWith("com.google.android.accessibility.accessibilitymenu.AccessibilityMenuService")) {
                        break;
                    }
                    if (id != null && !id.startsWith("com.google.android.apps.userpanel") && id.startsWith("com.google")) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
}
