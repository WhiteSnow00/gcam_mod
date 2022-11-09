// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.popupmenu;

import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import android.content.res.Resources$Theme;
import android.widget.LinearLayout$LayoutParams;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout$LayoutParams;
import android.widget.ListView;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.widget.TextView;
import android.content.Context;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.FrameLayout;

public class PopupMenuView extends FrameLayout
{
    public LinearLayout a;
    public ImageButton b;
    private final Context c;
    private jcb d;
    private LinearLayout e;
    private FrameLayout f;
    private TextView g;
    private int h;
    private int i;
    private isg j;
    
    public PopupMenuView(final Context c, final AttributeSet set) {
        super(c, set);
        this.d = jcb.a;
        this.c = c;
        super.onFinishInflate();
        ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624051, (ViewGroup)this);
        this.b = (ImageButton)this.findViewById(2131427751);
        this.a = (LinearLayout)this.findViewById(2131427752);
        this.e = (LinearLayout)this.findViewById(2131427747);
        this.f = (FrameLayout)this.findViewById(2131427749);
        this.g = (TextView)this.findViewById(2131427750);
    }
    
    public final void a(final jcb d) {
        this.d = d;
        jvu.s((View)this.a, d);
        if (this.h == 0 || this.i == 0) {
            this.h = this.e.getWidth();
            final int height = this.e.getHeight();
            this.i = height;
            if (this.h == 0 || height == 0) {
                return;
            }
        }
        if (!d.equals(jcb.b) && !d.equals(jcb.c)) {
            final ViewGroup$LayoutParams layoutParams = this.e.getLayoutParams();
            layoutParams.height = this.i;
            layoutParams.width = this.h;
            this.e.setLayoutParams(layoutParams);
            final ViewGroup$LayoutParams layoutParams2 = this.a.getLayoutParams();
            layoutParams2.height = this.i;
            layoutParams2.width = this.h;
            this.a.setTranslationY(0.0f);
            this.a.setTranslationX(0.0f);
            return;
        }
        final ViewGroup$LayoutParams layoutParams3 = this.e.getLayoutParams();
        final int min = Math.min(this.i, this.getResources().getDisplayMetrics().heightPixels - ((ViewGroup$MarginLayoutParams)((ViewGroup)this.e.getParent()).getLayoutParams()).rightMargin);
        layoutParams3.height = this.h;
        layoutParams3.width = min;
        this.e.setLayoutParams(layoutParams3);
        final ViewGroup$LayoutParams layoutParams4 = this.a.getLayoutParams();
        layoutParams4.height = min;
        layoutParams4.width = this.h;
        final LinearLayout a = this.a;
        a.setTranslationY((float)((a.getWidth() - this.a.getHeight()) / 2));
        final LinearLayout a2 = this.a;
        a2.setTranslationX((float)((a2.getHeight() - this.a.getWidth()) / 2));
    }
    
    public final void b() {
        this.setVisibility(8);
    }
    
    public final void c(final int text, final isg isg, final int n, final boolean b) {
        final ListView listView = (ListView)this.findViewById(2131427816);
        final View viewById = this.findViewById(2131427430);
        final View viewById2 = this.findViewById(2131427429);
        if (!b) {
            final View viewById3 = this.findViewById(2131427748);
            final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)viewById3.getLayoutParams();
            layoutParams.rightMargin = this.getResources().getDimensionPixelSize(2131165827);
            viewById3.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            final GradientDrawable background = (GradientDrawable)this.e.getBackground();
            background.setCornerRadius((float)this.getResources().getDimensionPixelSize(2131165812));
            background.setTintMode(PorterDuff$Mode.DST);
            background.setTint(this.getContext().getColor(2131100944));
            this.e.setBackground((Drawable)background);
            final LinearLayout$LayoutParams layoutParams2 = (LinearLayout$LayoutParams)this.a.getLayoutParams();
            layoutParams2.width = this.getResources().getDimensionPixelSize(2131165831);
            this.a.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
            this.a.setPadding(0, 0, 0, 0);
            final LinearLayout$LayoutParams layoutParams3 = (LinearLayout$LayoutParams)this.f.getLayoutParams();
            layoutParams3.height = this.getResources().getDimensionPixelSize(2131165815);
            this.f.setLayoutParams((ViewGroup$LayoutParams)layoutParams3);
            this.f.setPadding(this.getResources().getDimensionPixelSize(2131165816), 0, this.getResources().getDimensionPixelSize(2131165817), 0);
            this.g.setTextAppearance(2132017563);
            this.b.getLayoutParams().width = this.getResources().getDimensionPixelSize(2131165737);
            this.b.getLayoutParams().height = this.getResources().getDimensionPixelSize(2131165737);
            this.b.setImageResource(2131231482);
            this.b.setColorFilter(this.getResources().getColor(2131099677, (Resources$Theme)null));
            listView.setPadding(this.getResources().getDimensionPixelSize(2131165819), 0, this.getResources().getDimensionPixelSize(2131165820), this.getResources().getDimensionPixelSize(2131165818));
            ((LinearLayout$LayoutParams)viewById.getLayoutParams()).rightMargin = this.getResources().getDimensionPixelSize(2131165810);
            ((LinearLayout$LayoutParams)viewById2.getLayoutParams()).rightMargin = this.getResources().getDimensionPixelSize(2131165810);
        }
        this.j = isg;
        if (n == 48) {
            viewById.setVisibility(0);
        }
        else {
            viewById2.setVisibility(0);
        }
        this.g.setText(text);
        final ImageButton b2 = this.b;
        final Context c = this.c;
        b2.setContentDescription((CharSequence)c.getString(2131952226, new Object[] { c.getString(text) }));
        listView.setAdapter((ListAdapter)isg);
        listView.setOnItemClickListener((AdapterView$OnItemClickListener)new ish(this, isg));
        this.b();
    }
    
    public final void d() {
        this.setVisibility(0);
        final Context c = this.c;
        final CharSequence text = this.g.getText();
        final isg j = this.j;
        j.getClass();
        this.announceForAccessibility((CharSequence)c.getString(2131952227, new Object[] { text, j.b().b }));
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (b) {
            this.a(this.d);
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        if (jcb.d(this.d)) {
            super.onMeasure(n, n2);
            return;
        }
        super.onMeasure(n2, n);
    }
}
