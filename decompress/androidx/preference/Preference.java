// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.text.TextUtils;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public class Preference implements Comparable
{
    private int a;
    private CharSequence b;
    private boolean c;
    private boolean d;
    public Context e;
    public CharSequence f;
    public String g;
    public String h;
    public aem i;
    private boolean j;
    private boolean k;
    
    public Preference(final Context context, final AttributeSet set) {
        this(context, set, gz.e(context, 2130969563, 16842894));
    }
    
    public Preference(final Context e, final AttributeSet set, final int n) {
        this.a = Integer.MAX_VALUE;
        this.c = true;
        this.d = true;
        this.j = true;
        this.k = true;
        new ael(this);
        this.e = e;
        final TypedArray obtainStyledAttributes = e.obtainStyledAttributes(set, aeo.f, n, 0);
        gz.p(obtainStyledAttributes, 23, 0, 0);
        this.g = gz.i(obtainStyledAttributes, 26, 6);
        this.f = gz.h(obtainStyledAttributes, 34, 4);
        this.b = gz.h(obtainStyledAttributes, 33, 7);
        this.a = gz.m(obtainStyledAttributes, 28, 8);
        this.h = gz.i(obtainStyledAttributes, 22, 13);
        gz.p(obtainStyledAttributes, 27, 3, 2131624094);
        gz.p(obtainStyledAttributes, 35, 9, 0);
        this.c = gz.j(obtainStyledAttributes, 21, 2, true);
        this.d = gz.j(obtainStyledAttributes, 30, 5, true);
        gz.j(obtainStyledAttributes, 29, 1, true);
        gz.i(obtainStyledAttributes, 19, 10);
        gz.j(obtainStyledAttributes, 16, 16, this.d);
        gz.j(obtainStyledAttributes, 17, 17, this.d);
        if (obtainStyledAttributes.hasValue(18)) {
            this.d(obtainStyledAttributes, 18);
        }
        else if (obtainStyledAttributes.hasValue(11)) {
            this.d(obtainStyledAttributes, 11);
        }
        gz.j(obtainStyledAttributes, 31, 12, true);
        if (obtainStyledAttributes.hasValue(32)) {
            gz.j(obtainStyledAttributes, 32, 14, true);
        }
        gz.j(obtainStyledAttributes, 24, 15, false);
        gz.j(obtainStyledAttributes, 25, 25, true);
        gz.j(obtainStyledAttributes, 20, 20, false);
        obtainStyledAttributes.recycle();
    }
    
    public void a(final View view) {
        this.g();
    }
    
    protected void b() {
    }
    
    public void c() {
    }
    
    protected void d(final TypedArray typedArray, final int n) {
    }
    
    public CharSequence f() {
        final aem i = this.i;
        if (i != null) {
            return i.a(this);
        }
        return this.b;
    }
    
    public final void g() {
        if (this.i() && this.d) {
            this.b();
        }
    }
    
    public final void h(final aem i) {
        this.i = i;
        this.c();
    }
    
    public boolean i() {
        return this.c && this.j && this.k;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        final CharSequence f = this.f;
        if (!TextUtils.isEmpty(f)) {
            sb.append(f);
            sb.append(' ');
        }
        final CharSequence f2 = this.f();
        if (!TextUtils.isEmpty(f2)) {
            sb.append(f2);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }
}
