// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v7.view.menu;

import android.widget.CompoundButton;
import android.view.ViewGroup$LayoutParams;
import android.content.res.Resources;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout$LayoutParams;
import android.graphics.Rect;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.ImageView;
import android.widget.AbsListView$SelectionBoundsAdjuster;
import android.widget.LinearLayout;

public class ListMenuItemView extends LinearLayout implements AbsListView$SelectionBoundsAdjuster, nk
{
    public my a;
    public ImageView b;
    public boolean c;
    public boolean d;
    public boolean e;
    private ImageView f;
    private RadioButton g;
    private TextView h;
    private CheckBox i;
    private TextView j;
    private ImageView k;
    private LinearLayout l;
    private Drawable m;
    private int n;
    private Context o;
    private Drawable p;
    private LayoutInflater q;
    
    public ListMenuItemView(final Context context, final AttributeSet set) {
        this(context, set, 2130969360);
    }
    
    public ListMenuItemView(final Context o, final AttributeSet set, final int n) {
        super(o, set);
        final to q = to.q(this.getContext(), set, lo.q, n);
        this.m = q.h(5);
        this.n = q.f(1, -1);
        this.c = q.o(7, false);
        this.o = o;
        this.p = q.h(8);
        final TypedArray obtainStyledAttributes = o.getTheme().obtainStyledAttributes((AttributeSet)null, new int[] { 16843049 }, 2130969036, 0);
        this.d = obtainStyledAttributes.hasValue(0);
        q.n();
        obtainStyledAttributes.recycle();
    }
    
    private final LayoutInflater b() {
        if (this.q == null) {
            this.q = LayoutInflater.from(this.getContext());
        }
        return this.q;
    }
    
    private final void c(final View view) {
        this.d(view, -1);
    }
    
    private final void d(final View view, final int n) {
        final LinearLayout l = this.l;
        if (l != null) {
            l.addView(view, n);
            return;
        }
        this.addView(view, n);
    }
    
    public final my a() {
        return this.a;
    }
    
    public final void adjustListItemSelectionBounds(final Rect rect) {
        final ImageView b = this.b;
        if (b != null && b.getVisibility() == 0) {
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)this.b.getLayoutParams();
            rect.top += this.b.getHeight() + linearLayout$LayoutParams.topMargin + linearLayout$LayoutParams.bottomMargin;
        }
    }
    
    public final boolean e() {
        return false;
    }
    
    public final void f(final my a) {
        this.a = a;
        final boolean visible = a.isVisible();
        final int n = 0;
        int visibility;
        if (!visible) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        this.setVisibility(visibility);
        final CharSequence f = a.f(this);
        if (f != null) {
            this.h.setText(f);
            if (this.h.getVisibility() != 0) {
                this.h.setVisibility(0);
            }
        }
        else if (this.h.getVisibility() != 8) {
            this.h.setVisibility(8);
        }
        final boolean checkable = a.isCheckable();
        if (checkable || this.g != null || this.i != null) {
            Object o;
            RadioButton radioButton;
            Object o2;
            if (this.a.p()) {
                if (this.g == null) {
                    this.c((View)(this.g = (RadioButton)this.b().inflate(2131623953, (ViewGroup)this, false)));
                }
                o = this.g;
                o2 = (radioButton = (RadioButton)this.i);
            }
            else {
                if (this.i == null) {
                    this.c((View)(this.i = (CheckBox)this.b().inflate(2131623950, (ViewGroup)this, false)));
                }
                o = this.i;
                radioButton = this.g;
                o2 = o;
            }
            if (checkable) {
                ((CompoundButton)o).setChecked(this.a.isChecked());
                if (((CompoundButton)o).getVisibility() != 0) {
                    ((CompoundButton)o).setVisibility(0);
                }
                if (radioButton != null && ((CompoundButton)radioButton).getVisibility() != 8) {
                    ((CompoundButton)radioButton).setVisibility(8);
                }
            }
            else {
                if (o2 != null) {
                    ((CheckBox)o2).setVisibility(8);
                }
                final RadioButton g = this.g;
                if (g != null) {
                    g.setVisibility(8);
                }
            }
        }
        final boolean t = a.t();
        a.e();
        int visibility2;
        if (t && this.a.t()) {
            visibility2 = 0;
        }
        else {
            visibility2 = 8;
        }
        if (visibility2 == 0) {
            final TextView j = this.j;
            final my a2 = this.a;
            final char e = a2.e();
            String string;
            if (e == '\0') {
                string = "";
            }
            else {
                final Resources resources = a2.j.a.getResources();
                final StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(a2.j.a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(2131951636));
                }
                int n2;
                if (a2.j.x()) {
                    n2 = a2.i;
                }
                else {
                    n2 = a2.g;
                }
                my.g(sb, n2, 65536, resources.getString(2131951632));
                my.g(sb, n2, 4096, resources.getString(2131951628));
                my.g(sb, n2, 2, resources.getString(2131951627));
                my.g(sb, n2, 1, resources.getString(2131951633));
                my.g(sb, n2, 4, resources.getString(2131951635));
                my.g(sb, n2, 8, resources.getString(2131951631));
                switch (e) {
                    default: {
                        sb.append(e);
                        break;
                    }
                    case ' ': {
                        sb.append(resources.getString(2131951634));
                        break;
                    }
                    case '\n': {
                        sb.append(resources.getString(2131951630));
                        break;
                    }
                    case '\b': {
                        sb.append(resources.getString(2131951629));
                        break;
                    }
                }
                string = sb.toString();
            }
            j.setText((CharSequence)string);
        }
        if (this.j.getVisibility() != visibility2) {
            this.j.setVisibility(visibility2);
        }
        Drawable icon = a.getIcon();
        final mv i = this.a.j;
        final boolean e2 = this.e;
        if (e2 || this.c) {
            final ImageView f2 = this.f;
            if (f2 != null || icon != null || this.c) {
                if (f2 == null) {
                    this.d((View)(this.f = (ImageView)this.b().inflate(2131623951, (ViewGroup)this, false)), 0);
                }
                if (icon == null && !this.c) {
                    this.f.setVisibility(8);
                }
                else {
                    final ImageView f3 = this.f;
                    if (!e2) {
                        icon = null;
                    }
                    f3.setImageDrawable(icon);
                    if (this.f.getVisibility() != 0) {
                        this.f.setVisibility(0);
                    }
                }
            }
        }
        this.setEnabled(a.isEnabled());
        final boolean hasSubMenu = a.hasSubMenu();
        final ImageView k = this.k;
        if (k != null) {
            int visibility3;
            if (!hasSubMenu) {
                visibility3 = 8;
            }
            else {
                visibility3 = n;
            }
            k.setVisibility(visibility3);
        }
        this.setContentDescription(a.l);
    }
    
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ik.G((View)this, this.m);
        final TextView h = (TextView)this.findViewById(2131428063);
        this.h = h;
        final int n = this.n;
        if (n != -1) {
            h.setTextAppearance(this.o, n);
        }
        this.j = (TextView)this.findViewById(2131427944);
        final ImageView k = (ImageView)this.findViewById(2131428024);
        if ((this.k = k) != null) {
            k.setImageDrawable(this.p);
        }
        this.b = (ImageView)this.findViewById(2131427634);
        this.l = (LinearLayout)this.findViewById(2131427514);
    }
    
    protected final void onMeasure(final int n, final int n2) {
        if (this.f != null && this.c) {
            final ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)this.f.getLayoutParams();
            if (layoutParams.height > 0 && linearLayout$LayoutParams.width <= 0) {
                linearLayout$LayoutParams.width = layoutParams.height;
            }
        }
        super.onMeasure(n, n2);
    }
}
