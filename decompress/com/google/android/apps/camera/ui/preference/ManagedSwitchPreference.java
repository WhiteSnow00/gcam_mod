// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.preference;

import android.preference.Preference;
import android.widget.ImageView;
import android.view.View$OnClickListener;
import android.graphics.PorterDuff$Mode;
import android.widget.FrameLayout;
import android.util.AttributeSet;
import android.content.Context;
import j$.util.function.Function;
import android.widget.TextView;
import android.widget.Switch;
import android.widget.LinearLayout;
import android.widget.Button;
import android.view.View;
import android.content.res.ColorStateList;
import android.preference.Preference$OnPreferenceChangeListener;
import android.preference.SwitchPreference;

public class ManagedSwitchPreference extends SwitchPreference implements Preference$OnPreferenceChangeListener, isi
{
    public hjx a;
    public hkc b;
    public Preference$OnPreferenceChangeListener c;
    public ColorStateList d;
    public ColorStateList e;
    public Integer f;
    public Integer g;
    public Integer h;
    public Runnable i;
    public String j;
    public String k;
    public View l;
    private Button n;
    private LinearLayout o;
    private String p;
    private Switch q;
    private TextView r;
    private Function s;
    
    public ManagedSwitchPreference(final Context context) {
        super(context);
        this.c = (Preference$OnPreferenceChangeListener)ism.a;
        this.d(context);
    }
    
    public ManagedSwitchPreference(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = (Preference$OnPreferenceChangeListener)ism.a;
        this.d(context);
    }
    
    public ManagedSwitchPreference(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.c = (Preference$OnPreferenceChangeListener)ism.a;
        this.d(context);
    }
    
    public static final int c(final FrameLayout frameLayout) {
        if (frameLayout.getVisibility() == 0) {
            return 2131231465;
        }
        return 2131231466;
    }
    
    private final void d(final Context context) {
        ((isq)((egp)context.getApplicationContext()).c(isq.class)).q(this);
        this.setPersistent(false);
        final hjo hjo = hjo.a.get(this.getKey());
        if (hjo != null) {
            this.setDefaultValue(this.b.c(hjo));
        }
        else {
            this.setDefaultValue((Object)this.a.m(this.getKey()));
        }
        super.setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)this);
    }
    
    public final void a(final Function s) {
        this.s = s;
    }
    
    public final void b(final String p2, final Runnable i) {
        this.p = p2;
        this.i = i;
    }
    
    public final Preference$OnPreferenceChangeListener getOnPreferenceChangeListener() {
        return this.c;
    }
    
    public final boolean getPersistedBoolean(final boolean b) {
        return this.a.m(this.getKey());
    }
    
    protected final void onBindView(final View view) {
        super.onBindView(view);
        if (this.d != null) {
            final Switch q = (Switch)view.findViewById(16908352);
            if ((this.q = q) != null) {
                q.setThumbTintList(this.d);
                this.q.setThumbTintMode(PorterDuff$Mode.MULTIPLY);
            }
        }
        if (this.e != null) {
            final Switch q2 = (Switch)view.findViewById(16908352);
            if ((this.q = q2) != null) {
                q2.setTrackTintList(this.e);
                this.q.setTrackTintMode(PorterDuff$Mode.MULTIPLY);
            }
        }
        if (this.f != null) {
            final LinearLayout o = (LinearLayout)view.findViewById(16908288);
            if ((this.o = o) != null) {
                o.setBackgroundColor((int)this.f);
            }
        }
        if (this.g != null) {
            final TextView r = (TextView)view.findViewById(16908310);
            if ((this.r = r) != null) {
                r.setTextColor((int)this.g);
            }
        }
        if (this.k != null) {
            final TextView textView = (TextView)view.findViewById(2131428026);
            if (textView != null) {
                textView.setText((CharSequence)this.k);
                textView.setTextColor((int)this.h);
            }
        }
        if (this.p != null && this.i != null) {
            final Button n = (Button)view.findViewById(2131427389);
            if ((this.n = n) != null) {
                n.setText((CharSequence)this.p);
                this.n.setOnClickListener((View$OnClickListener)new iso(this));
            }
        }
        if (this.j != null && this.l != null) {
            final Button button = (Button)view.findViewById(2131427592);
            final ImageView imageView = (ImageView)view.findViewById(2131427594);
            final LinearLayout linearLayout = (LinearLayout)view.findViewById(2131427593);
            final FrameLayout frameLayout = (FrameLayout)view.findViewById(2131427508);
            if (button != null && imageView != null && linearLayout != null && frameLayout != null) {
                button.setText((CharSequence)this.j);
                button.setOnClickListener((View$OnClickListener)new isp(frameLayout, imageView));
                imageView.setImageResource(c(frameLayout));
                linearLayout.setContentDescription((CharSequence)this.j);
                linearLayout.setOnClickListener((View$OnClickListener)new isn(button));
                frameLayout.removeAllViews();
                frameLayout.addView(this.l);
            }
        }
    }
    
    protected final void onClick() {
        final Function s = this.s;
        if (s != null && (boolean)s.apply((Object)this)) {
            return;
        }
        super.onClick();
    }
    
    public final boolean onPreferenceChange(final Preference preference, final Object o) {
        this.a.l(this.getKey(), (boolean)o);
        return this.c.onPreferenceChange(preference, o);
    }
    
    public final void setOnPreferenceChangeListener(final Preference$OnPreferenceChangeListener c) {
        this.c = c;
    }
}
