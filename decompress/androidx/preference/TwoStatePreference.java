// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.text.TextUtils;
import android.widget.TextView;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public abstract class TwoStatePreference extends Preference
{
    protected boolean a;
    public CharSequence b;
    public CharSequence c;
    private boolean d;
    
    public TwoStatePreference(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public TwoStatePreference(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    @Override
    protected final void b() {
        this.e(this.a ^ true);
    }
    
    @Override
    protected final void d(final TypedArray typedArray, final int n) {
        typedArray.getBoolean(n, false);
    }
    
    public final void e(final boolean a) {
        if (this.a == a && this.d) {
            return;
        }
        this.a = a;
        this.d = true;
    }
    
    protected final void j(final View view) {
        if (!(view instanceof TextView)) {
            return;
        }
        final TextView textView = (TextView)view;
        final boolean a = this.a;
        int visibility = 0;
        if (a && !TextUtils.isEmpty(this.b)) {
            textView.setText(this.b);
        }
        else if (!this.a && !TextUtils.isEmpty(this.c)) {
            textView.setText(this.c);
        }
        else {
            final CharSequence f = this.f();
            if (!TextUtils.isEmpty(f)) {
                textView.setText(f);
            }
            else {
                visibility = 8;
            }
        }
        if (visibility != textView.getVisibility()) {
            textView.setVisibility(visibility);
        }
    }
}
