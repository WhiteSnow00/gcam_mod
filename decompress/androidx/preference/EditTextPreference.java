// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public class EditTextPreference extends DialogPreference
{
    public EditTextPreference(final Context context, final AttributeSet set) {
        final int e = gz.e(context, 2130969044, 16842898);
        super(context, set, e);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aeo.c, e, 0);
        if (gz.j(obtainStyledAttributes, 0, 0, false)) {
            if (aek.b == null) {
                aek.b = new aek(1);
            }
            this.h(aek.b);
        }
        obtainStyledAttributes.recycle();
    }
    
    @Override
    protected final void d(final TypedArray typedArray, final int n) {
        typedArray.getString(n);
    }
}
