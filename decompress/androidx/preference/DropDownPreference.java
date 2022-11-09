// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.content.Context;

public class DropDownPreference extends ListPreference
{
    private final Context j;
    private final ArrayAdapter k;
    
    public DropDownPreference(final Context j, final AttributeSet set) {
        super(j, set, 2130969038);
        new aej(this);
        this.j = j;
        (this.k = new ArrayAdapter(j, 17367049)).clear();
        final CharSequence[] a = super.a;
        if (a != null) {
            for (int length = a.length, i = 0; i < length; ++i) {
                this.k.add((Object)a[i].toString());
            }
        }
    }
    
    @Override
    protected final void b() {
        throw null;
    }
    
    @Override
    public final void c() {
        final ArrayAdapter k = this.k;
        if (k != null) {
            k.notifyDataSetChanged();
        }
    }
}
