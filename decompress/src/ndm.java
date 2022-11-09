import android.os.Bundle;
import android.view.Window;
import android.graphics.Color;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.content.Context;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ndm extends ky
{
    public BottomSheetBehavior a;
    public FrameLayout b;
    public boolean c;
    boolean d;
    public boolean e;
    public boolean f;
    public ndd g;
    private FrameLayout h;
    private CoordinatorLayout i;
    private final boolean j;
    private final ndd k;
    
    public ndm(final Context context, final int n) {
        super(context, n);
        this.d = true;
        this.e = true;
        this.k = new ndk(this);
        this.d();
        this.j = this.getContext().getTheme().obtainStyledAttributes(new int[] { 2130969052 }).getBoolean(0, false);
    }
    
    public static void e(final View view, final boolean b) {
        final int systemUiVisibility = view.getSystemUiVisibility();
        int systemUiVisibility2;
        if (b) {
            systemUiVisibility2 = (systemUiVisibility | 0x2000);
        }
        else {
            systemUiVisibility2 = (systemUiVisibility & 0xFFFFDFFF);
        }
        view.setSystemUiVisibility(systemUiVisibility2);
    }
    
    private final View f(final int n, View inflate, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.g();
        final CoordinatorLayout coordinatorLayout = (CoordinatorLayout)this.h.findViewById(2131427520);
        if (n != 0 && inflate == null) {
            inflate = this.getLayoutInflater().inflate(n, (ViewGroup)coordinatorLayout, false);
        }
        if (this.j) {
            ik.L((View)this.b, new ndh(this));
        }
        this.b.removeAllViews();
        if (viewGroup$LayoutParams == null) {
            this.b.addView(inflate);
        }
        else {
            this.b.addView(inflate, viewGroup$LayoutParams);
        }
        coordinatorLayout.findViewById(2131428087).setOnClickListener((View$OnClickListener)new ndi(this));
        ik.F((View)this.b, new ndj(this));
        this.b.setOnTouchListener((View$OnTouchListener)new gkb(2));
        return (View)this.h;
    }
    
    private final void g() {
        if (this.h == null) {
            final FrameLayout h = (FrameLayout)View.inflate(this.getContext(), 2131623986, (ViewGroup)null);
            this.h = h;
            this.i = (CoordinatorLayout)h.findViewById(2131427520);
            final FrameLayout b = (FrameLayout)this.h.findViewById(2131427542);
            this.b = b;
            (this.a = BottomSheetBehavior.y((View)b)).z(this.k);
            this.a.C(this.d);
        }
    }
    
    public final BottomSheetBehavior a() {
        if (this.a == null) {
            this.g();
        }
        return this.a;
    }
    
    public final void cancel() {
        final BottomSheetBehavior a = this.a();
        if (this.c && a.s != 5) {
            a.E(5);
            return;
        }
        super.cancel();
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        final Window window = this.getWindow();
        if (window != null) {
            final boolean j = this.j;
            boolean b = false;
            if (j && Color.alpha(window.getNavigationBarColor()) < 255) {
                b = true;
            }
            final FrameLayout h = this.h;
            if (h != null) {
                h.setFitsSystemWindows(b ^ true);
            }
            final CoordinatorLayout i = this.i;
            if (i != null) {
                i.setFitsSystemWindows(b ^ true);
            }
            if (b) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }
    
    @Override
    protected final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        final Window window = this.getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }
    
    protected final void onStart() {
        super.onStart();
        final BottomSheetBehavior a = this.a;
        if (a != null && a.s == 5) {
            a.E(4);
        }
    }
    
    public final void setCancelable(final boolean b) {
        super.setCancelable(b);
        if (this.d != b) {
            this.d = b;
            final BottomSheetBehavior a = this.a;
            if (a != null) {
                a.C(b);
            }
        }
    }
    
    public final void setCanceledOnTouchOutside(final boolean b) {
        super.setCanceledOnTouchOutside(b);
        if (b && !this.d) {
            this.d = true;
        }
        this.e = b;
        this.f = true;
    }
    
    @Override
    public final void setContentView(final int n) {
        super.setContentView(this.f(n, null, null));
    }
    
    @Override
    public final void setContentView(final View view) {
        super.setContentView(this.f(0, view, null));
    }
    
    @Override
    public final void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super.setContentView(this.f(0, view, viewGroup$LayoutParams));
    }
}
