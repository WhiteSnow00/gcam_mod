// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.util.Log;
import android.text.TextUtils;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public class ListPreference extends DialogPreference
{
    public CharSequence[] a;
    public CharSequence[] b;
    public String c;
    public boolean d;
    private String j;
    
    public ListPreference(final Context context, final AttributeSet set) {
        this(context, set, gz.e(context, 2130968990, 16842897));
    }
    
    public ListPreference(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, aeo.d, n, 0);
        this.a = gz.l(obtainStyledAttributes, 3, 0);
        this.b = gz.l(obtainStyledAttributes, 4, 1);
        if (gz.j(obtainStyledAttributes, 7, 7, false)) {
            if (aek.a == null) {
                aek.a = new aek();
            }
            this.h(aek.a);
        }
        obtainStyledAttributes.recycle();
        final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(set, aeo.f, n, 0);
        this.j = gz.i(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }
    
    @Override
    protected final void d(final TypedArray typedArray, final int n) {
        typedArray.getString(n);
    }
    
    public final CharSequence e() {
        final String c = this.c;
        final int n = -1;
        int i = 0;
        Label_0062: {
            if (c != null) {
                final CharSequence[] b = this.b;
                if (b != null) {
                    for (int i = b.length - 1; i >= 0; --i) {
                        if (TextUtils.equals((CharSequence)this.b[i].toString(), (CharSequence)c)) {
                            break Label_0062;
                        }
                    }
                }
            }
            i = n;
        }
        if (i >= 0) {
            final CharSequence[] a = this.a;
            if (a != null) {
                return a[i];
            }
        }
        return null;
    }
    
    @Override
    public final CharSequence f() {
        final aem i = super.i;
        if (i != null) {
            return i.a(this);
        }
        CharSequence e = this.e();
        final CharSequence f = super.f();
        final String j = this.j;
        if (j == null) {
            return f;
        }
        if (e == null) {
            e = "";
        }
        final String format = String.format(j, e);
        if (TextUtils.equals((CharSequence)format, f)) {
            return f;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }
}
