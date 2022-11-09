import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.widget.ListAdapter;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import android.view.View;
import android.view.MotionEvent;
import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import android.util.AttributeSet;
import android.content.Context;
import java.lang.reflect.Field;
import android.graphics.Rect;
import android.widget.ListView;

// 
// Decompiled by Procyon v0.6.0
// 

public class ql extends ListView
{
    public boolean a;
    qk b;
    private final Rect c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private Field i;
    private qj j;
    private final boolean k;
    private boolean l;
    private jo m;
    
    public ql(final Context context, final boolean k) {
        super(context, (AttributeSet)null, 2130969036);
        this.c = new Rect();
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = k;
        this.setCacheColorHint(0);
        try {
            (this.i = AbsListView.class.getDeclaredField("mIsChildViewEnabled")).setAccessible(true);
        }
        catch (final NoSuchFieldException ex) {
            ex.printStackTrace();
        }
    }
    
    private final void c(final boolean b) {
        final qj j = this.j;
        if (j != null) {
            j.b = b;
        }
    }
    
    private final void d() {
        final Drawable selector = this.getSelector();
        if (selector != null && this.l && this.isPressed()) {
            selector.setState(this.getDrawableState());
        }
    }
    
    public final boolean a(final MotionEvent motionEvent, int h) {
        final int actionMasked = motionEvent.getActionMasked();
        final int n = 0;
        boolean b = false;
        Label_0579: {
            switch (actionMasked) {
                default: {
                    b = true;
                    h = 0;
                    break Label_0579;
                }
                case 3: {
                    b = false;
                    h = n;
                    break Label_0579;
                }
                case 2: {
                    b = true;
                    break;
                }
                case 1: {
                    b = false;
                    break;
                }
            }
            h = motionEvent.findPointerIndex(h);
            if (h < 0) {
                b = false;
                h = n;
            }
            else {
                final int n2 = (int)motionEvent.getX(h);
                final int n3 = (int)motionEvent.getY(h);
                h = this.pointToPosition(n2, n3);
                if (h == -1) {
                    h = 1;
                }
                else {
                    final View child = this.getChildAt(h - this.getFirstVisiblePosition());
                    final float n4 = (float)n2;
                    final float n5 = (float)n3;
                    this.l = true;
                    this.drawableHotspotChanged(n4, n5);
                    if (!this.isPressed()) {
                        this.setPressed(true);
                    }
                    this.layoutChildren();
                    final int h2 = this.h;
                    if (h2 != -1) {
                        final View child2 = this.getChildAt(h2 - this.getFirstVisiblePosition());
                        if (child2 != null && child2 != child && child2.isPressed()) {
                            child2.setPressed(false);
                        }
                    }
                    this.h = h;
                    child.drawableHotspotChanged(n4 - child.getLeft(), n5 - child.getTop());
                    if (!child.isPressed()) {
                        child.setPressed(true);
                    }
                    final Drawable selector = this.getSelector();
                    int n6 = 0;
                    boolean b2 = false;
                    Label_0299: {
                        if (selector != null) {
                            if (h != -1) {
                                n6 = h;
                                b2 = true;
                                break Label_0299;
                            }
                            h = -1;
                            n6 = -1;
                        }
                        else {
                            n6 = h;
                        }
                        b2 = false;
                    }
                    if (b2) {
                        selector.setVisible(false, false);
                    }
                    final Rect c = this.c;
                    c.set(child.getLeft(), child.getTop(), child.getRight(), child.getBottom());
                    c.left -= this.d;
                    c.top -= this.e;
                    c.right += this.f;
                    c.bottom += this.g;
                    try {
                        final boolean boolean1 = this.i.getBoolean(this);
                        if (child.isEnabled() != boolean1) {
                            this.i.set(this, boolean1 ^ true);
                            if (h != -1) {
                                this.refreshDrawableState();
                            }
                        }
                    }
                    catch (final IllegalAccessException ex) {
                        ex.printStackTrace();
                    }
                    if (b2) {
                        final Rect c2 = this.c;
                        final float exactCenterX = c2.exactCenterX();
                        final float exactCenterY = c2.exactCenterY();
                        selector.setVisible(this.getVisibility() == 0, false);
                        selector.setHotspot(exactCenterX, exactCenterY);
                    }
                    final Drawable selector2 = this.getSelector();
                    if (selector2 != null && n6 != -1) {
                        selector2.setHotspot(n4, n5);
                    }
                    this.c(false);
                    this.refreshDrawableState();
                    if (actionMasked == 1) {
                        this.performItemClick(child, n6, this.getItemIdAtPosition(n6));
                    }
                    b = true;
                    h = 0;
                }
            }
        }
        if (!b || h != 0) {
            this.setPressed(this.l = false);
            this.drawableStateChanged();
            final View child3 = this.getChildAt(this.h - this.getFirstVisiblePosition());
            if (child3 != null) {
                child3.setPressed(false);
            }
        }
        if (b) {
            if (this.m == null) {
                this.m = new jo(this);
            }
            this.m.c(true);
            this.m.onTouch((View)this, motionEvent);
        }
        else {
            final jo m = this.m;
            if (m != null) {
                m.c(false);
            }
        }
        return b;
    }
    
    public final int b(final int n, final int n2) {
        final int listPaddingTop = this.getListPaddingTop();
        final int listPaddingBottom = this.getListPaddingBottom();
        int dividerHeight = this.getDividerHeight();
        final Drawable divider = this.getDivider();
        final ListAdapter adapter = this.getAdapter();
        int n3 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return n3;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        final int count = adapter.getCount();
        View view = null;
        int i = 0;
        int n4 = 0;
        while (i < count) {
            final int itemViewType = adapter.getItemViewType(i);
            int n5;
            if (itemViewType != n4) {
                n5 = itemViewType;
            }
            else {
                n5 = n4;
            }
            if (itemViewType != n4) {
                view = null;
            }
            final View view2 = adapter.getView(i, view, (ViewGroup)this);
            ViewGroup$LayoutParams layoutParams;
            if ((layoutParams = view2.getLayoutParams()) == null) {
                layoutParams = this.generateDefaultLayoutParams();
                view2.setLayoutParams(layoutParams);
            }
            int n6;
            if (layoutParams.height > 0) {
                n6 = View$MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            }
            else {
                n6 = View$MeasureSpec.makeMeasureSpec(0, 0);
            }
            view2.measure(n, n6);
            view2.forceLayout();
            int n7 = n3;
            if (i > 0) {
                n7 = n3 + dividerHeight;
            }
            n3 = n7 + view2.getMeasuredHeight();
            if (n3 >= n2) {
                return n2;
            }
            ++i;
            n4 = n5;
            view = view2;
        }
        return n3;
    }
    
    protected final void dispatchDraw(final Canvas canvas) {
        if (!this.c.isEmpty()) {
            final Drawable selector = this.getSelector();
            if (selector != null) {
                selector.setBounds(this.c);
                selector.draw(canvas);
            }
        }
        super.dispatchDraw(canvas);
    }
    
    protected final void drawableStateChanged() {
        if (this.b != null) {
            return;
        }
        super.drawableStateChanged();
        this.c(true);
        this.d();
    }
    
    public final boolean hasFocus() {
        return this.k || super.hasFocus();
    }
    
    public final boolean hasWindowFocus() {
        return this.k || super.hasWindowFocus();
    }
    
    public final boolean isFocused() {
        return this.k || super.isFocused();
    }
    
    public final boolean isInTouchMode() {
        return (this.k && this.a) || super.isInTouchMode();
    }
    
    protected final void onDetachedFromWindow() {
        this.b = null;
        super.onDetachedFromWindow();
    }
    
    public boolean onHoverEvent(final MotionEvent motionEvent) {
        int actionMasked;
        if ((actionMasked = motionEvent.getActionMasked()) == 10) {
            if (this.b == null) {
                final qk b = new qk(this);
                this.b = b;
                b.a.post((Runnable)b);
                actionMasked = 10;
            }
            else {
                actionMasked = 10;
            }
        }
        final boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            this.setSelection(-1);
        }
        else {
            final int pointToPosition = this.pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != this.getSelectedItemPosition()) {
                final View child = this.getChildAt(pointToPosition - this.getFirstVisiblePosition());
                if (child.isEnabled()) {
                    this.setSelectionFromTop(pointToPosition, child.getTop() - this.getTop());
                }
                this.d();
            }
        }
        return onHoverEvent;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0: {
                this.h = this.pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY());
                break;
            }
        }
        final qk b = this.b;
        if (b != null) {
            final ql a = b.a;
            a.b = null;
            a.removeCallbacks((Runnable)b);
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public final void setSelector(final Drawable drawable) {
        qj j;
        if (drawable != null) {
            j = new qj(drawable);
        }
        else {
            j = null;
        }
        super.setSelector((Drawable)(this.j = j));
        final Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.d = rect.left;
        this.e = rect.top;
        this.f = rect.right;
        this.g = rect.bottom;
    }
}
