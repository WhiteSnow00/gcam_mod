import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.ViewGroup$LayoutParams;
import android.view.Display;
import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.List;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

final class bia
{
    static Integer a;
    public final View b;
    public final List c;
    public bhz d;
    
    public bia(final View b) {
        this.c = new ArrayList();
        this.b = b;
    }
    
    public static final boolean d(final int n, final int n2) {
        return f(n) && f(n2);
    }
    
    private final int e(int n, final int n2, final int n3) {
        final int n4 = n2 - n3;
        if (n4 > 0) {
            return n4;
        }
        n -= n3;
        if (n > 0) {
            return n;
        }
        if (!this.b.isLayoutRequested() && n2 == -2) {
            final Context context = this.b.getContext();
            if (bia.a == null) {
                final WindowManager windowManager = (WindowManager)context.getSystemService("window");
                bit.a(windowManager);
                final Display defaultDisplay = windowManager.getDefaultDisplay();
                final Point point = new Point();
                defaultDisplay.getSize(point);
                bia.a = Math.max(point.x, point.y);
            }
            return bia.a;
        }
        return 0;
    }
    
    private static final boolean f(final int n) {
        return n > 0 || n == Integer.MIN_VALUE;
    }
    
    public final int a() {
        final int paddingTop = this.b.getPaddingTop();
        final int paddingBottom = this.b.getPaddingBottom();
        final ViewGroup$LayoutParams layoutParams = this.b.getLayoutParams();
        int height;
        if (layoutParams != null) {
            height = layoutParams.height;
        }
        else {
            height = 0;
        }
        return this.e(this.b.getHeight(), height, paddingTop + paddingBottom);
    }
    
    public final int b() {
        final int paddingLeft = this.b.getPaddingLeft();
        final int paddingRight = this.b.getPaddingRight();
        final ViewGroup$LayoutParams layoutParams = this.b.getLayoutParams();
        int width;
        if (layoutParams != null) {
            width = layoutParams.width;
        }
        else {
            width = 0;
        }
        return this.e(this.b.getWidth(), width, paddingLeft + paddingRight);
    }
    
    final void c() {
        final ViewTreeObserver viewTreeObserver = this.b.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.d);
        }
        this.d = null;
        this.c.clear();
    }
}
