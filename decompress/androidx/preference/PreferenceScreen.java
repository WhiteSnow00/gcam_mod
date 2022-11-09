// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.util.AttributeSet;
import android.content.Context;

public final class PreferenceScreen extends PreferenceGroup
{
    public PreferenceScreen(final Context context, final AttributeSet set) {
        super(context, set, gz.e(context, 2130969562, 16842891));
    }
    
    @Override
    protected final void b() {
        if (super.h == null && super.b.size() != 0) {
            throw null;
        }
    }
}
