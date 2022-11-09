import android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jb
{
    final Object a;
    
    public jb(final Object a) {
        this.a = a;
    }
    
    public static jb a(final int n, final int n2, final int n3, final int n4, final boolean b) {
        return new jb(AccessibilityNodeInfo$CollectionItemInfo.obtain(n, n2, n3, n4, false, b));
    }
}
