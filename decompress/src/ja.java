import android.view.accessibility.AccessibilityNodeInfo$CollectionInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ja
{
    final Object a;
    
    public ja(final Object a) {
        this.a = a;
    }
    
    public static ja a(final int n, final int n2, final int n3) {
        return new ja(AccessibilityNodeInfo$CollectionInfo.obtain(n, n2, false, n3));
    }
}
