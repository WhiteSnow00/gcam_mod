import android.widget.PopupWindow$OnDismissListener;
import android.view.View$OnTouchListener;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import android.widget.AbsListView$OnScrollListener;
import android.widget.AdapterView$OnItemSelectedListener;
import android.graphics.drawable.Drawable;
import android.widget.ListView;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.graphics.Rect;
import android.database.DataSetObserver;
import android.widget.PopupWindow;
import android.os.Handler;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View;
import android.widget.ListAdapter;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class rj implements nn
{
    private Context a;
    private ListAdapter b;
    private int c;
    private int d;
    public ql e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    int k;
    public View l;
    public AdapterView$OnItemClickListener m;
    final Handler n;
    public boolean o;
    public PopupWindow p;
    final rf q;
    private int r;
    private boolean s;
    private DataSetObserver t;
    private final ri u;
    private final rh v;
    private final rf w;
    private final Rect x;
    private Rect y;
    
    public rj(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, null);
    }
    
    public rj(final Context a, final AttributeSet set, final int n, final byte[] array) {
        this.c = -2;
        this.f = -2;
        this.r = 1002;
        this.j = 0;
        this.k = Integer.MAX_VALUE;
        this.q = new rf(this, 2);
        this.u = new ri(this);
        this.v = new rh(this);
        this.w = new rf(this);
        this.x = new Rect();
        this.a = a;
        this.n = new Handler(a.getMainLooper());
        final TypedArray obtainStyledAttributes = a.obtainStyledAttributes(set, lo.n, n, 0);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        final int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.d = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.s = true;
        }
        obtainStyledAttributes.recycle();
        (this.p = new oy(a, set, n)).setInputMethodMode(1);
    }
    
    public final int a() {
        return this.g;
    }
    
    @Override
    public final ListView aE() {
        return this.e;
    }
    
    public final int b() {
        if (!this.s) {
            return 0;
        }
        return this.d;
    }
    
    public final Drawable c() {
        return this.p.getBackground();
    }
    
    public void e(final ListAdapter b) {
        final DataSetObserver t = this.t;
        if (t == null) {
            this.t = new rg(this);
        }
        else {
            final ListAdapter b2 = this.b;
            if (b2 != null) {
                b2.unregisterDataSetObserver(t);
            }
        }
        if ((this.b = b) != null) {
            b.registerDataSetObserver(this.t);
        }
        final ql e = this.e;
        if (e != null) {
            e.setAdapter(this.b);
        }
    }
    
    public final void f(final Drawable backgroundDrawable) {
        this.p.setBackgroundDrawable(backgroundDrawable);
    }
    
    public final void g(final int g) {
        this.g = g;
    }
    
    public final void j(final int d) {
        this.d = d;
        this.s = true;
    }
    
    @Override
    public final void k() {
        this.p.dismiss();
        this.p.setContentView((View)null);
        this.e = null;
        this.n.removeCallbacks((Runnable)this.q);
    }
    
    public final int o() {
        if (!this.u()) {
            return -1;
        }
        return this.e.getSelectedItemPosition();
    }
    
    public ql p(final Context context, final boolean b) {
        return new ql(context, b);
    }
    
    public final void q() {
        final ql e = this.e;
        if (e != null) {
            e.a = true;
            e.requestLayout();
        }
    }
    
    public final void r(final int f) {
        final Drawable background = this.p.getBackground();
        if (background != null) {
            background.getPadding(this.x);
            this.f = this.x.left + this.x.right + f;
            return;
        }
        this.f = f;
    }
    
    @Override
    public final void s() {
        if (this.e == null) {
            final Context a = this.a;
            new rf(this, 1);
            (this.e = this.p(a, this.o ^ true)).setAdapter(this.b);
            this.e.setOnItemClickListener(this.m);
            this.e.setFocusable(true);
            this.e.setFocusableInTouchMode(true);
            this.e.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new re(this));
            this.e.setOnScrollListener((AbsListView$OnScrollListener)this.v);
            this.p.setContentView((View)this.e);
        }
        else {
            final ViewGroup viewGroup = (ViewGroup)this.p.getContentView();
        }
        final Drawable background = this.p.getBackground();
        int width = 0;
        int n2;
        if (background != null) {
            background.getPadding(this.x);
            final int n = n2 = this.x.top + this.x.bottom;
            if (!this.s) {
                this.d = -this.x.top;
                n2 = n;
            }
        }
        else {
            this.x.setEmpty();
            n2 = 0;
        }
        final int maxAvailableHeight = this.p.getMaxAvailableHeight(this.l, this.d, this.p.getInputMethodMode() == 2);
        int height;
        if (this.c == -1) {
            height = maxAvailableHeight + n2;
        }
        else {
            final int f = this.f;
            int n3 = 0;
            switch (f) {
                default: {
                    n3 = View$MeasureSpec.makeMeasureSpec(f, 1073741824);
                    break;
                }
                case -1: {
                    n3 = View$MeasureSpec.makeMeasureSpec(this.a.getResources().getDisplayMetrics().widthPixels - (this.x.left + this.x.right), 1073741824);
                    break;
                }
                case -2: {
                    n3 = View$MeasureSpec.makeMeasureSpec(this.a.getResources().getDisplayMetrics().widthPixels - (this.x.left + this.x.right), Integer.MIN_VALUE);
                    break;
                }
            }
            final int b = this.e.b(n3, maxAvailableHeight);
            int n4;
            if (b > 0) {
                n4 = n2 + (this.e.getPaddingTop() + this.e.getPaddingBottom());
            }
            else {
                n4 = 0;
            }
            height = b + n4;
        }
        final boolean w = this.w();
        this.p.setWindowLayoutType(this.r);
        if (!this.p.isShowing()) {
            final int f2 = this.f;
            int width2;
            if (f2 == -1) {
                width2 = -1;
            }
            else if ((width2 = f2) == -2) {
                width2 = this.l.getWidth();
            }
            final int c = this.c;
            if (c == -1) {
                height = -1;
            }
            else if (c != -2) {
                height = c;
            }
            this.p.setWidth(width2);
            this.p.setHeight(height);
            this.p.setIsClippedToScreen(true);
            this.p.setOutsideTouchable(true);
            this.p.setTouchInterceptor((View$OnTouchListener)this.u);
            if (this.i) {
                this.p.setOverlapAnchor(this.h);
            }
            this.p.setEpicenterBounds(this.y);
            this.p.showAsDropDown(this.l, this.g, this.d, this.j);
            this.e.setSelection(-1);
            if (!this.o || this.e.isInTouchMode()) {
                this.q();
            }
            if (!this.o) {
                this.n.post((Runnable)this.w);
            }
            return;
        }
        if (!ik.T(this.l)) {
            return;
        }
        final int f3 = this.f;
        int width3;
        if (f3 == -1) {
            width3 = -1;
        }
        else if ((width3 = f3) == -2) {
            width3 = this.l.getWidth();
        }
        final int c2 = this.c;
        if (c2 == -1) {
            if (!w) {
                height = -1;
            }
            if (w) {
                final PopupWindow p = this.p;
                int width4;
                if (this.f == -1) {
                    width4 = -1;
                }
                else {
                    width4 = 0;
                }
                p.setWidth(width4);
                this.p.setHeight(0);
            }
            else {
                final PopupWindow p2 = this.p;
                if (this.f == -1) {
                    width = -1;
                }
                p2.setWidth(width);
                this.p.setHeight(-1);
            }
        }
        else if (c2 != -2) {
            height = c2;
        }
        this.p.setOutsideTouchable(true);
        final PopupWindow p3 = this.p;
        final View l = this.l;
        final int g = this.g;
        final int d = this.d;
        if (width3 < 0) {
            width3 = -1;
        }
        if (height < 0) {
            height = -1;
        }
        p3.update(l, g, d, width3, height);
    }
    
    public final void t(Rect y) {
        if (y != null) {
            y = new Rect(y);
        }
        else {
            y = null;
        }
        this.y = y;
    }
    
    @Override
    public final boolean u() {
        return this.p.isShowing();
    }
    
    public final void v(final PopupWindow$OnDismissListener onDismissListener) {
        this.p.setOnDismissListener(onDismissListener);
    }
    
    public final boolean w() {
        return this.p.getInputMethodMode() == 2;
    }
    
    public final void x() {
        this.p.setInputMethodMode(2);
    }
    
    public final void y() {
        this.o = true;
        this.p.setFocusable(true);
    }
}
