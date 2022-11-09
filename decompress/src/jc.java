import android.text.Spannable;
import java.util.Collections;
import android.text.SpannableString;
import android.text.TextUtils;
import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo;
import android.view.accessibility.AccessibilityNodeInfo$CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import java.util.ArrayList;
import java.util.List;
import android.view.accessibility.AccessibilityNodeInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jc
{
    public final AccessibilityNodeInfo a;
    
    private jc(final AccessibilityNodeInfo a) {
        this.a = a;
    }
    
    public static jc a(final AccessibilityNodeInfo accessibilityNodeInfo) {
        return new jc(accessibilityNodeInfo);
    }
    
    private final List k(final String s) {
        ArrayList integerArrayList;
        if ((integerArrayList = this.a.getExtras().getIntegerArrayList(s)) == null) {
            integerArrayList = new ArrayList();
            this.a.getExtras().putIntegerArrayList(s, integerArrayList);
        }
        return integerArrayList;
    }
    
    public final void b(final int n) {
        this.a.addAction(n);
    }
    
    public final void c(final iz iz) {
        this.a.addAction((AccessibilityNodeInfo$AccessibilityAction)iz.i);
    }
    
    public final void d(final boolean checkable) {
        this.a.setCheckable(checkable);
    }
    
    public final void e(final CharSequence className) {
        this.a.setClassName(className);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof jc)) {
            return false;
        }
        final jc jc = (jc)o;
        final AccessibilityNodeInfo a = this.a;
        final AccessibilityNodeInfo a2 = jc.a;
        if (a == null) {
            if (a2 != null) {
                return false;
            }
        }
        else if (!a.equals((Object)a2)) {
            return false;
        }
        return true;
    }
    
    public final void f(final Object o) {
        this.a.setCollectionInfo((AccessibilityNodeInfo$CollectionInfo)((ja)o).a);
    }
    
    public final void g(final Object o) {
        this.a.setCollectionItemInfo((AccessibilityNodeInfo$CollectionItemInfo)((jb)o).a);
    }
    
    public final void h(final boolean dismissable) {
        this.a.setDismissable(dismissable);
    }
    
    @Override
    public final int hashCode() {
        final AccessibilityNodeInfo a = this.a;
        if (a == null) {
            return 0;
        }
        return a.hashCode();
    }
    
    public final void i(final boolean scrollable) {
        this.a.setScrollable(scrollable);
    }
    
    public final void j(final iz iz) {
        this.a.removeAction((AccessibilityNodeInfo$AccessibilityAction)iz.i);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        final Rect rect = new Rect();
        this.a.getBoundsInParent(rect);
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("; boundsInParent: ");
        sb2.append(rect);
        sb.append(sb2.toString());
        this.a.getBoundsInScreen(rect);
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("; boundsInScreen: ");
        sb3.append(rect);
        sb.append(sb3.toString());
        sb.append("; packageName: ");
        sb.append(this.a.getPackageName());
        sb.append("; className: ");
        sb.append(this.a.getClassName());
        sb.append("; text: ");
        final boolean empty = this.k("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        final int n = 0;
        Object text;
        if (!empty) {
            final List k = this.k("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            final List i = this.k("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            final List j = this.k("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            final List l = this.k("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            text = new SpannableString((CharSequence)TextUtils.substring(this.a.getText(), 0, this.a.getText().length()));
            for (int n2 = 0; n2 < k.size(); ++n2) {
                ((Spannable)text).setSpan((Object)new iy((int)l.get(n2), this, this.a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), (int)k.get(n2), (int)i.get(n2), (int)j.get(n2));
            }
        }
        else {
            text = this.a.getText();
        }
        sb.append((CharSequence)text);
        sb.append("; contentDescription: ");
        sb.append(this.a.getContentDescription());
        sb.append("; viewId: ");
        sb.append(this.a.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.a.isChecked());
        sb.append("; focusable: ");
        sb.append(this.a.isFocusable());
        sb.append("; focused: ");
        sb.append(this.a.isFocused());
        sb.append("; selected: ");
        sb.append(this.a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.a.isEnabled());
        sb.append("; password: ");
        sb.append(this.a.isPassword());
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("; scrollable: ");
        sb4.append(this.a.isScrollable());
        sb.append(sb4.toString());
        sb.append("; [");
        final List actionList = this.a.getActionList();
        List<Object> emptyList;
        if (actionList != null) {
            emptyList = new ArrayList<Object>();
            for (int size = actionList.size(), n3 = 0; n3 < size; ++n3) {
                emptyList.add(new iz(actionList.get(n3), 0, null, null, null));
            }
        }
        else {
            emptyList = (List<Object>)Collections.emptyList();
        }
        for (int n4 = n; n4 < emptyList.size(); ++n4) {
            final iz iz = emptyList.get(n4);
            String s = null;
            switch (iz.a()) {
                default: {
                    s = "ACTION_UNKNOWN";
                    break;
                }
                case 16908372: {
                    s = "ACTION_IME_ENTER";
                    break;
                }
                case 16908362: {
                    s = "ACTION_PRESS_AND_HOLD";
                    break;
                }
                case 16908361: {
                    s = "ACTION_PAGE_RIGHT";
                    break;
                }
                case 16908360: {
                    s = "ACTION_PAGE_LEFT";
                    break;
                }
                case 16908359: {
                    s = "ACTION_PAGE_DOWN";
                    break;
                }
                case 16908358: {
                    s = "ACTION_PAGE_UP";
                    break;
                }
                case 16908357: {
                    s = "ACTION_HIDE_TOOLTIP";
                    break;
                }
                case 16908356: {
                    s = "ACTION_SHOW_TOOLTIP";
                    break;
                }
                case 16908354: {
                    s = "ACTION_MOVE_WINDOW";
                    break;
                }
                case 16908349: {
                    s = "ACTION_SET_PROGRESS";
                    break;
                }
                case 16908348: {
                    s = "ACTION_CONTEXT_CLICK";
                    break;
                }
                case 16908347: {
                    s = "ACTION_SCROLL_RIGHT";
                    break;
                }
                case 16908346: {
                    s = "ACTION_SCROLL_DOWN";
                    break;
                }
                case 16908345: {
                    s = "ACTION_SCROLL_LEFT";
                    break;
                }
                case 16908344: {
                    s = "ACTION_SCROLL_UP";
                    break;
                }
                case 16908343: {
                    s = "ACTION_SCROLL_TO_POSITION";
                    break;
                }
                case 16908342: {
                    s = "ACTION_SHOW_ON_SCREEN";
                    break;
                }
                case 2097152: {
                    s = "ACTION_SET_TEXT";
                    break;
                }
                case 524288: {
                    s = "ACTION_COLLAPSE";
                    break;
                }
                case 262144: {
                    s = "ACTION_EXPAND";
                    break;
                }
                case 131072: {
                    s = "ACTION_SET_SELECTION";
                    break;
                }
                case 65536: {
                    s = "ACTION_CUT";
                    break;
                }
                case 32768: {
                    s = "ACTION_PASTE";
                    break;
                }
                case 16384: {
                    s = "ACTION_COPY";
                    break;
                }
                case 8192: {
                    s = "ACTION_SCROLL_BACKWARD";
                    break;
                }
                case 4096: {
                    s = "ACTION_SCROLL_FORWARD";
                    break;
                }
                case 2048: {
                    s = "ACTION_PREVIOUS_HTML_ELEMENT";
                    break;
                }
                case 1024: {
                    s = "ACTION_NEXT_HTML_ELEMENT";
                    break;
                }
                case 512: {
                    s = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    break;
                }
                case 256: {
                    s = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    break;
                }
                case 128: {
                    s = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    break;
                }
                case 64: {
                    s = "ACTION_ACCESSIBILITY_FOCUS";
                    break;
                }
                case 32: {
                    s = "ACTION_LONG_CLICK";
                    break;
                }
                case 16: {
                    s = "ACTION_CLICK";
                    break;
                }
                case 8: {
                    s = "ACTION_CLEAR_SELECTION";
                    break;
                }
                case 4: {
                    s = "ACTION_SELECT";
                    break;
                }
                case 2: {
                    s = "ACTION_CLEAR_FOCUS";
                    break;
                }
                case 1: {
                    s = "ACTION_FOCUS";
                    break;
                }
            }
            String string = s;
            if (s.equals("ACTION_UNKNOWN")) {
                string = s;
                if (iz.b() != null) {
                    string = iz.b().toString();
                }
            }
            sb.append(string);
            if (n4 != emptyList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
