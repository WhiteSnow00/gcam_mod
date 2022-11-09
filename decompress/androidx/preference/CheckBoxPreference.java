// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.widget.Checkable;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.CompoundButton;
import android.view.accessibility.AccessibilityManager;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public class CheckBoxPreference extends TwoStatePreference
{
    private final aei d;
    
    public CheckBoxPreference(final Context context, final AttributeSet set) {
        final int e = gz.e(context, 2130968762, 16842895);
        super(context, set, e);
        this.d = new aei(this);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aeo.a, e, 0);
        super.b = gz.i(obtainStyledAttributes, 5, 0);
        super.c = gz.i(obtainStyledAttributes, 4, 1);
        gz.j(obtainStyledAttributes, 3, 2, false);
        obtainStyledAttributes.recycle();
    }
    
    @Override
    public final void a(final View view) {
        this.g();
        if (!((AccessibilityManager)super.e.getSystemService("accessibility")).isEnabled()) {
            return;
        }
        final View viewById = view.findViewById(16908289);
        final boolean b = viewById instanceof CompoundButton;
        if (b) {
            ((CompoundButton)viewById).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)null);
        }
        if (viewById instanceof Checkable) {
            ((Checkable)viewById).setChecked(this.a);
        }
        if (b) {
            ((CompoundButton)viewById).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)this.d);
        }
        this.j(view.findViewById(16908304));
    }
}
