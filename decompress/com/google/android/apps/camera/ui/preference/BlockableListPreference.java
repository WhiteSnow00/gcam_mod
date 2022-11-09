// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.preference;

import android.util.AttributeSet;
import android.content.Context;
import j$.util.function.Function;
import android.preference.ListPreference;

public class BlockableListPreference extends ListPreference implements isi
{
    private Function a;
    
    public BlockableListPreference(final Context context) {
        super(context);
    }
    
    public BlockableListPreference(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public BlockableListPreference(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public final void a(final Function a) {
        this.a = a;
    }
    
    protected final void onClick() {
        final Function a = this.a;
        if (a != null && (boolean)a.apply((Object)this)) {
            return;
        }
        super.onClick();
    }
}
