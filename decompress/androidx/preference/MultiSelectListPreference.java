// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.content.res.TypedArray;
import java.util.HashSet;
import android.util.AttributeSet;
import android.content.Context;

public class MultiSelectListPreference extends DialogPreference
{
    public MultiSelectListPreference(final Context context, final AttributeSet set) {
        final int e = gz.e(context, 2130968990, 16842897);
        super(context, set, e);
        new HashSet();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aeo.e, e, 0);
        gz.l(obtainStyledAttributes, 2, 0);
        gz.l(obtainStyledAttributes, 3, 1);
        obtainStyledAttributes.recycle();
    }
    
    @Override
    protected final void d(final TypedArray typedArray, int i) {
        final CharSequence[] textArray = typedArray.getTextArray(i);
        final HashSet set = new HashSet();
        int length;
        for (length = textArray.length, i = 0; i < length; ++i) {
            set.add(textArray[i].toString());
        }
    }
}
