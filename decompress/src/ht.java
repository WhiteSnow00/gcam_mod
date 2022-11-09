import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.lang.ref.WeakReference;
import android.util.SparseArray;
import android.util.Log;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.Collections;
import java.util.List;
import android.view.View;
import android.view.View$AccessibilityDelegate;

// 
// Decompiled by Procyon v0.6.0
// 

public class ht
{
    private static final View$AccessibilityDelegate b;
    public final View$AccessibilityDelegate a;
    private final View$AccessibilityDelegate c;
    
    static {
        b = new View$AccessibilityDelegate();
    }
    
    public ht() {
        this(ht.b);
    }
    
    public ht(final View$AccessibilityDelegate c) {
        this.c = c;
        this.a = new hs(this);
    }
    
    static List b(final View view) {
        List<Object> emptyList;
        if ((emptyList = (List)view.getTag(2131428031)) == null) {
            emptyList = Collections.emptyList();
        }
        return emptyList;
    }
    
    public jd a(final View view) {
        final AccessibilityNodeProvider accessibilityNodeProvider = this.c.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new jd(accessibilityNodeProvider);
        }
        return null;
    }
    
    public void c(final View view, final AccessibilityEvent accessibilityEvent) {
        this.c.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
    
    public void d(final View view, final jc jc) {
        this.c.onInitializeAccessibilityNodeInfo(view, jc.a);
    }
    
    public void e(final View view, final AccessibilityEvent accessibilityEvent) {
        this.c.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }
    
    public void f(final View view, final int n) {
        this.c.sendAccessibilityEvent(view, n);
    }
    
    public void g(final View view, final AccessibilityEvent accessibilityEvent) {
        this.c.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
    
    public boolean h(final View view, final AccessibilityEvent accessibilityEvent) {
        return this.c.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }
    
    public boolean i(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
        return this.c.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
    
    public boolean j(final View view, int int1, final Bundle bundle) {
        final List b = b(view);
        final boolean b2 = false;
        int i = 0;
        while (true) {
            while (i < b.size()) {
                final iz iz = b.get(i);
                if (iz.a() == int1) {
                    if (iz.l == null) {
                        break;
                    }
                    final Class k = iz.k;
                    if (k != null) {
                        try {
                            final hh hh = k.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                        }
                        catch (final Exception ex) {
                            final Class j = iz.k;
                            String name;
                            if (j == null) {
                                name = "null";
                            }
                            else {
                                name = j.getName();
                            }
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Failed to execute command with argument class ViewCommandArgument: ");
                            sb.append(name);
                            Log.e("A11yActionCompat", sb.toString(), (Throwable)ex);
                        }
                    }
                    boolean b3 = iz.l.a(view);
                    if (!b3) {
                        b3 = this.c.performAccessibilityAction(view, int1, bundle);
                    }
                    if (!b3 && int1 == 2131427345) {
                        int1 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
                        final SparseArray sparseArray = (SparseArray)view.getTag(2131428032);
                        if (sparseArray != null) {
                            final WeakReference weakReference = (WeakReference)sparseArray.get(int1);
                            if (weakReference != null) {
                                final ClickableSpan clickableSpan = (ClickableSpan)weakReference.get();
                                if (clickableSpan != null) {
                                    final CharSequence text = view.createAccessibilityNodeInfo().getText();
                                    ClickableSpan[] array;
                                    if (text instanceof Spanned) {
                                        array = (ClickableSpan[])((Spanned)text).getSpans(0, text.length(), (Class)ClickableSpan.class);
                                    }
                                    else {
                                        array = null;
                                    }
                                    boolean b4;
                                    for (int1 = 0; array != null && int1 < array.length; ++int1) {
                                        if (clickableSpan.equals(array[int1])) {
                                            clickableSpan.onClick(view);
                                            b4 = true;
                                            return b4;
                                        }
                                    }
                                }
                            }
                        }
                        return b2;
                    }
                    return b3;
                }
                else {
                    ++i;
                }
            }
            boolean b3 = false;
            continue;
        }
    }
}
