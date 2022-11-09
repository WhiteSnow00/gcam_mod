import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iz
{
    public static final iz a;
    public static final iz b;
    public static final iz c;
    public static final iz d;
    public static final iz e;
    public static final iz f;
    public static final iz g;
    public static final iz h;
    final Object i;
    public final int j;
    public final Class k;
    public final jl l;
    
    static {
        new iz(1);
        new iz(2);
        new iz(4);
        new iz(8);
        a = new iz(16);
        new iz(32);
        new iz(64);
        new iz(128);
        new iz(256, je.class);
        new iz(512, je.class);
        new iz(1024, jf.class);
        new iz(2048, jf.class);
        b = new iz(4096);
        c = new iz(8192);
        new iz(16384);
        new iz(32768);
        new iz(65536);
        new iz(131072, jj.class);
        d = new iz(262144);
        e = new iz(524288);
        f = new iz(1048576);
        new iz(2097152, jk.class);
        new iz(AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
        new iz(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, jh.class);
        g = new iz(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
        new iz(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
        h = new iz(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
        new iz(AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);
        new iz(AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_UP, 16908358, null, null, null);
        new iz(AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_DOWN, 16908359, null, null, null);
        new iz(AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_LEFT, 16908360, null, null, null);
        new iz(AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_RIGHT, 16908361, null, null, null);
        new iz(AccessibilityNodeInfo$AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
        new iz(AccessibilityNodeInfo$AccessibilityAction.ACTION_SET_PROGRESS, 16908349, null, null, ji.class);
        new iz(AccessibilityNodeInfo$AccessibilityAction.ACTION_MOVE_WINDOW, 16908354, null, null, jg.class);
        new iz(AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_TOOLTIP, 16908356, null, null, null);
        new iz(AccessibilityNodeInfo$AccessibilityAction.ACTION_HIDE_TOOLTIP, 16908357, null, null, null);
        new iz(AccessibilityNodeInfo$AccessibilityAction.ACTION_PRESS_AND_HOLD, 16908362, null, null, null);
        new iz(AccessibilityNodeInfo$AccessibilityAction.ACTION_IME_ENTER, 16908372, null, null, null);
    }
    
    public iz(final int n) {
        this(null, n, null, null, null);
    }
    
    private iz(final int n, final Class clazz) {
        this(null, n, null, null, clazz);
    }
    
    public iz(Object i, final int j, final CharSequence charSequence, final jl l, final Class k) {
        this.j = j;
        this.l = l;
        if (i == null) {
            i = new AccessibilityNodeInfo$AccessibilityAction(j, charSequence);
        }
        this.i = i;
        this.k = k;
    }
    
    public final int a() {
        return ((AccessibilityNodeInfo$AccessibilityAction)this.i).getId();
    }
    
    public final CharSequence b() {
        return ((AccessibilityNodeInfo$AccessibilityAction)this.i).getLabel();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o != null && o instanceof iz && this.i.equals(((iz)o).i);
    }
    
    @Override
    public final int hashCode() {
        return this.i.hashCode();
    }
}
