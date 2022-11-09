// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.mars;

import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.apps.camera.ui.popupmenu.PopupMenuButton;
import com.google.android.apps.camera.ui.popupmenu.PopupMenuView;
import android.widget.FrameLayout;

public class MarsSwitch extends FrameLayout
{
    public PopupMenuView a;
    public PopupMenuButton b;
    private jcb c;
    
    public MarsSwitch(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = jcb.a;
        ((LayoutInflater)this.getContext().getSystemService("layout_inflater")).inflate(2131624044, (ViewGroup)this);
        this.b = (PopupMenuButton)this.findViewById(2131427722);
        this.a = (PopupMenuView)this.findViewById(2131427723);
    }
    
    public final void a(final jcb c) {
        jvu.r((View)this, this.c = c);
        jvu.s((View)this.b, c);
        this.a.a(c);
    }
    
    public final void b(final isd isd, final boolean b) {
        this.b.setImageResource(isd.c);
        if (b) {
            if (((hip)isd.a).equals(hip.b)) {
                this.b.a(leg.m((View)this));
                this.b.setColorFilter(leg.i((View)this));
                return;
            }
            this.b.a(leg.l((View)this));
            this.b.setColorFilter(leg.k((View)this));
        }
        else {
            if (((hip)isd.a).equals(hip.b)) {
                this.b.a(this.getContext().getColor(2131100905));
                this.b.b(this.getContext().getColor(2131099719));
                return;
            }
            this.b.a(this.getContext().getColor(2131101022));
            this.b.b(this.getContext().getColor(2131099719));
        }
    }
    
    protected final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (b) {
            this.a(this.c);
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        if (jcb.d(this.c)) {
            super.onMeasure(n, n2);
            return;
        }
        super.onMeasure(n2, n);
    }
}
