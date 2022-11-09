// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.widget.Checkable;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.support.v7.widget.SwitchCompat;
import android.view.accessibility.AccessibilityManager;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public class SwitchPreferenceCompat extends TwoStatePreference
{
    private final aes d;
    private CharSequence j;
    private CharSequence k;
    
    public SwitchPreferenceCompat(final Context context, final AttributeSet set) {
        super(context, set, 2130969711);
        this.d = new aes(this);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aeo.k, 2130969711, 0);
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
        final View viewById = view.findViewById(2131428028);
        final boolean b = viewById instanceof SwitchCompat;
        if (b) {
            ((SwitchCompat)viewById).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        }
        if (viewById instanceof Checkable) {
            ((Checkable)viewById).setChecked(this.a);
        }
        if (b) {
            final SwitchCompat switchCompat = (SwitchCompat)viewById;
            switchCompat.a = this.j;
            switchCompat.requestLayout();
            if (switchCompat.isChecked()) {
                switchCompat.b();
            }
            switchCompat.b = this.k;
            switchCompat.requestLayout();
            if (!switchCompat.isChecked()) {
                switchCompat.a();
            }
            switchCompat.setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)this.d);
        }
        this.j(view.findViewById(16908304));
    }
}
