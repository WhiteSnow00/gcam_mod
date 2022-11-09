// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public abstract class DialogPreference extends Preference
{
    private CharSequence a;
    
    public DialogPreference(final Context context, final AttributeSet set) {
        this(context, set, gz.e(context, 2130968990, 16842897));
    }
    
    public DialogPreference(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aeo.b, n, 0);
        final String i = gz.i(obtainStyledAttributes, 9, 0);
        this.a = i;
        if (i == null) {
            this.a = super.f;
        }
        gz.i(obtainStyledAttributes, 8, 1);
        if (obtainStyledAttributes.getDrawable(6) == null) {
            obtainStyledAttributes.getDrawable(2);
        }
        gz.i(obtainStyledAttributes, 11, 3);
        gz.i(obtainStyledAttributes, 10, 4);
        gz.p(obtainStyledAttributes, 7, 5, 0);
        obtainStyledAttributes.recycle();
    }
    
    @Override
    protected void b() {
        throw null;
    }
}
