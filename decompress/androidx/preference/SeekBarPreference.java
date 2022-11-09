// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.widget.SeekBar;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public class SeekBarPreference extends Preference
{
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean j;
    private int k;
    private int l;
    
    public SeekBarPreference(final Context context, final AttributeSet set) {
        super(context, set, 2130969619);
        new aep(this);
        new aeq(this);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aeo.i, 2130969619, 0);
        this.b = obtainStyledAttributes.getInt(3, 0);
        final int int1 = obtainStyledAttributes.getInt(1, 100);
        final int b = this.b;
        int k = int1;
        if (int1 < b) {
            k = b;
        }
        if (k != this.k) {
            this.k = k;
        }
        final int int2 = obtainStyledAttributes.getInt(4, 0);
        if (int2 != this.l) {
            this.l = Math.min(this.k - this.b, Math.abs(int2));
        }
        this.d = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.getBoolean(5, false);
        this.j = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }
    
    @Override
    protected final void d(final TypedArray typedArray, final int n) {
        typedArray.getInt(n, 0);
    }
    
    public final void e(final SeekBar seekBar) {
        final int n = this.b + seekBar.getProgress();
        final int a = this.a;
        if (n != a) {
            final int b = this.b;
            int n2;
            if ((n2 = n) < b) {
                n2 = b;
            }
            final int k = this.k;
            int a2;
            if ((a2 = n2) > k) {
                a2 = k;
            }
            if (a2 != a) {
                this.a = a2;
            }
        }
    }
}
