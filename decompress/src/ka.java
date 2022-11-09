import android.content.DialogInterface$OnClickListener;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.DialogInterface;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.NestedScrollView;
import android.os.Message;
import android.widget.Button;
import android.view.View;
import android.widget.ListView;
import android.view.Window;
import android.content.Context;
import android.view.View$OnClickListener;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ka
{
    public final int A;
    final int B;
    final int C;
    final int D;
    public final boolean E;
    final Handler F;
    public final View$OnClickListener G;
    public final Context a;
    final ky b;
    public final Window c;
    public CharSequence d;
    public CharSequence e;
    public ListView f;
    public View g;
    public boolean h;
    Button i;
    public CharSequence j;
    Message k;
    Button l;
    public CharSequence m;
    Message n;
    Button o;
    public CharSequence p;
    NestedScrollView q;
    public int r;
    public Drawable s;
    public ImageView t;
    public TextView u;
    public TextView v;
    public View w;
    ListAdapter x;
    int y;
    public final int z;
    
    public ka(final Context a, final ky b, final Window c) {
        this.h = false;
        this.r = 0;
        this.y = -1;
        this.G = (View$OnClickListener)new jv(this);
        this.a = a;
        this.b = b;
        this.c = c;
        this.F = new jy((DialogInterface)b);
        final TypedArray obtainStyledAttributes = a.obtainStyledAttributes((AttributeSet)null, lo.e, 2130968621, 0);
        this.z = obtainStyledAttributes.getResourceId(0, 0);
        this.A = obtainStyledAttributes.getResourceId(2, 0);
        this.B = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.C = obtainStyledAttributes.getResourceId(7, 0);
        this.D = obtainStyledAttributes.getResourceId(3, 0);
        this.E = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        b.d();
    }
    
    static boolean b(final View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        final ViewGroup viewGroup = (ViewGroup)view;
        int i = viewGroup.getChildCount();
        while (i > 0) {
            if (b(viewGroup.getChildAt(--i))) {
                return true;
            }
        }
        return false;
    }
    
    public static final void c(final Button button) {
        final LinearLayout$LayoutParams layoutParams = (LinearLayout$LayoutParams)button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public static final ViewGroup d(final View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub)view2).inflate();
            }
            return (ViewGroup)view2;
        }
        if (view2 != null) {
            final ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup)parent).removeView(view2);
            }
        }
        view2 = view;
        if (view instanceof ViewStub) {
            view2 = ((ViewStub)view).inflate();
        }
        return (ViewGroup)view2;
    }
    
    public final void a(final CharSequence charSequence) {
        this.d = charSequence;
        final TextView u = this.u;
        if (u != null) {
            u.setText(charSequence);
        }
    }
    
    public final void e(final int n, final CharSequence charSequence, final DialogInterface$OnClickListener dialogInterface$OnClickListener) {
        Message obtainMessage;
        if (dialogInterface$OnClickListener != null) {
            obtainMessage = this.F.obtainMessage(n, (Object)dialogInterface$OnClickListener);
        }
        else {
            obtainMessage = null;
        }
        switch (n) {
            default: {
                this.j = charSequence;
                this.k = obtainMessage;
                return;
            }
            case -2: {
                this.m = charSequence;
                this.n = obtainMessage;
            }
        }
    }
}
