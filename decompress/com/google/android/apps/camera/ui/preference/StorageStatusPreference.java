// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.ui.preference;

import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.text.style.TypefaceSpan;
import android.text.SpannableString;
import java.text.NumberFormat;
import android.text.format.Formatter;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.view.View;
import android.graphics.Typeface;
import android.preference.Preference;

public class StorageStatusPreference extends Preference
{
    private static final Typeface h;
    public long a;
    public long b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    private View i;
    private TextView j;
    private TextView k;
    private ProgressBar l;
    
    static {
        h = Typeface.create("sans-serif-medium", 0);
    }
    
    public StorageStatusPreference(final Context context) {
        super(context);
        this.a = -1L;
        this.b = -1L;
    }
    
    public StorageStatusPreference(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = -1L;
        this.b = -1L;
    }
    
    public StorageStatusPreference(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = -1L;
        this.b = -1L;
    }
    
    public final void a() {
        if (this.j != null && this.k != null) {
            final ProgressBar l = this.l;
            if (l != null) {
                final long b = this.b;
                float n;
                if (b == 0L) {
                    n = 0.0f;
                }
                else {
                    n = this.a * 100.0f / b;
                }
                l.setProgress(Math.round(100.0f - n));
                final Resources resources = this.getContext().getResources();
                this.j.setText((CharSequence)resources.getString(2131952683, new Object[] { Formatter.formatFileSize(this.getContext(), this.a) }));
                final NumberFormat instance = NumberFormat.getInstance();
                final String format = instance.format(this.c);
                final String format2 = instance.format(this.d);
                final String string = resources.getString(2131952681, new Object[] { resources.getQuantityString(2131820548, this.c, new Object[] { format }), resources.getQuantityString(2131820558, this.d, new Object[] { format2 }) });
                final SpannableString text = new SpannableString((CharSequence)string);
                final int index = string.indexOf(format);
                if (index != -1) {
                    text.setSpan((Object)new TypefaceSpan(StorageStatusPreference.h), index, format.length() + index, 33);
                }
                final int lastIndex = string.lastIndexOf(format2);
                if (lastIndex != -1) {
                    text.setSpan((Object)new TypefaceSpan(StorageStatusPreference.h), lastIndex, format2.length() + lastIndex, 33);
                }
                this.k.setText((CharSequence)text);
                if (!this.e) {
                    int n2;
                    int n3;
                    if (this.g) {
                        n2 = 2131101461;
                        n3 = 2131231639;
                    }
                    else if (this.f) {
                        n2 = 2131101459;
                        n3 = 2131231637;
                    }
                    else {
                        n2 = 2131101460;
                        n3 = 2131231638;
                    }
                    this.i.setBackgroundColor(this.getContext().getResources().getColor(n2, (Resources$Theme)null));
                    this.l.setProgressDrawable(resources.getDrawable(n3, (Resources$Theme)null));
                }
            }
        }
    }
    
    protected final void onBindView(final View i) {
        super.onBindView(i);
        this.i = i;
        this.j = (TextView)i.findViewById(2131428022);
        this.k = (TextView)i.findViewById(2131428021);
        this.l = (ProgressBar)i.findViewById(2131428020);
        this.a();
    }
}
