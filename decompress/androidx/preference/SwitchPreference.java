// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.widget.Checkable;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.Switch;
import android.view.accessibility.AccessibilityManager;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public class SwitchPreference extends TwoStatePreference
{
    private final aer d;
    private CharSequence j;
    private CharSequence k;
    
    public SwitchPreference(final Context context, final AttributeSet set) {
        final int e = gz.e(context, 2130969712, 16843629);
        super(context, set, e);
        this.d = new aer(this);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aeo.j, e, 0);
        super.b = gz.i(obtainStyledAttributes, 7, 0);
        super.c = gz.i(obtainStyledAttributes, 6, 1);
        this.j = gz.i(obtainStyledAttributes, 9, 3);
        this.k = gz.i(obtainStyledAttributes, 8, 4);
        gz.j(obtainStyledAttributes, 5, 2, false);
        obtainStyledAttributes.recycle();
    }
    
    @Override
    public final void a(final View view) {
        this.g();
        if (!((AccessibilityManager)super.e.getSystemService("accessibility")).isEnabled()) {
            return;
        }
        final View viewById = view.findViewById(16908352);
        final boolean b = viewById instanceof Switch;
        if (b) {
            ((Switch)viewById).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        }
        if (viewById instanceof Checkable) {
            ((Checkable)viewById).setChecked(this.a);
        }
        if (b) {
            final Switch switch1 = (Switch)viewById;
            switch1.setTextOn(this.j);
            switch1.setTextOff(this.k);
            switch1.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)this.d);
        }
        this.j(view.findViewById(16908304));
    }
}
