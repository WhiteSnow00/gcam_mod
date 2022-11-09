// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.content.res.TypedArray;
import android.util.Log;
import android.text.TextUtils;
import java.util.ArrayList;
import android.os.Handler;
import android.util.AttributeSet;
import android.content.Context;
import java.util.List;

public abstract class PreferenceGroup extends Preference
{
    public final zb a;
    public List b;
    
    public PreferenceGroup(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public PreferenceGroup(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, null);
    }
    
    public PreferenceGroup(final Context context, final AttributeSet set, final int n, final byte[] array) {
        super(context, set, n);
        this.a = new zb();
        new Handler();
        new aen(this);
        this.b = new ArrayList();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aeo.g, n, 0);
        gz.j(obtainStyledAttributes, 2, 2, true);
        if (obtainStyledAttributes.hasValue(1) && gz.m(obtainStyledAttributes, 1, 1) != Integer.MAX_VALUE && TextUtils.isEmpty((CharSequence)super.g)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.getClass().getSimpleName());
            sb.append(" should have a key defined if it contains an expandable preference");
            Log.e("PreferenceGroup", sb.toString());
        }
        obtainStyledAttributes.recycle();
    }
}
