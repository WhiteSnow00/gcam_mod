import android.graphics.Paint$FontMetricsInt;
import android.util.DisplayMetrics;
import android.content.res.TypedArray;
import android.graphics.PorterDuff$Mode;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.util.AttributeSet;
import android.content.res.Resources$NotFoundException;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.content.Context;
import android.widget.TextView;
import android.graphics.Typeface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ps
{
    public int a;
    public Typeface b;
    public boolean c;
    private final TextView d;
    private tm e;
    private tm f;
    private tm g;
    private tm h;
    private tm i;
    private tm j;
    private final pu k;
    private int l;
    
    public ps(final TextView d) {
        this.a = 0;
        this.l = -1;
        this.d = d;
        this.k = new pu(d);
    }
    
    private static tm e(final Context context, final ot ot, final int n) {
        final ColorStateList a = ot.a(context, n);
        if (a != null) {
            final tm tm = new tm();
            tm.d = true;
            tm.a = a;
            return tm;
        }
        return null;
    }
    
    private final void f(final Drawable drawable, final tm tm) {
        if (drawable != null && tm != null) {
            sx.h(drawable, tm, this.d.getDrawableState());
        }
    }
    
    private final void g(final Context context, final to to) {
        final int[] a = lo.a;
        this.a = to.c(2, this.a);
        final int c = to.c(14, -1);
        this.l = c;
        if (c != -1) {
            this.a &= 0x2;
        }
        int n = 10;
        final boolean p2 = to.p(10);
        final boolean b = false;
        if (!p2 && !to.p(15)) {
            if (to.p(1)) {
                this.c = false;
                Typeface b2 = null;
                switch (to.c(1, 1)) {
                    default: {
                        return;
                    }
                    case 3: {
                        b2 = Typeface.MONOSPACE;
                        break;
                    }
                    case 2: {
                        b2 = Typeface.SERIF;
                        break;
                    }
                    case 1: {
                        b2 = Typeface.SANS_SERIF;
                        break;
                    }
                }
                this.b = b2;
            }
            return;
        }
        final Typeface typeface = null;
        this.b = null;
        if (to.p(15)) {
            n = 15;
        }
        final int l = this.l;
        final int a2 = this.a;
        if (!context.isRestricted()) {
            final pq pq = new pq(this, l, a2, new WeakReference((T)this.d));
            try {
                final int a3 = this.a;
                final int resourceId = to.b.getResourceId(n, 0);
                Typeface a4;
                if (resourceId == 0) {
                    a4 = typeface;
                }
                else {
                    if (to.c == null) {
                        to.c = new TypedValue();
                    }
                    a4 = gu.a(to.a, resourceId, to.c, a3, pq);
                }
                if (a4 != null) {
                    if (this.l != -1) {
                        this.b = Typeface.create(Typeface.create(a4, 0), this.l, (this.a & 0x2) != 0x0);
                    }
                    else {
                        this.b = a4;
                    }
                }
                this.c = (this.b == null);
            }
            catch (final Resources$NotFoundException ex) {}
            catch (final UnsupportedOperationException ex2) {}
        }
        if (this.b == null) {
            final String m = to.m(n);
            if (m != null) {
                if (this.l != -1) {
                    this.b = Typeface.create(Typeface.create(m, 0), this.l, (this.a & 0x2) != 0x0 || b);
                    return;
                }
                this.b = Typeface.create(m, this.a);
            }
        }
    }
    
    public final void a() {
        if (this.e != null || this.f != null || this.g != null || this.h != null) {
            final Drawable[] compoundDrawables = this.d.getCompoundDrawables();
            this.f(compoundDrawables[0], this.e);
            this.f(compoundDrawables[1], this.f);
            this.f(compoundDrawables[2], this.g);
            this.f(compoundDrawables[3], this.h);
        }
        if (this.i == null && this.j == null) {
            return;
        }
        final Drawable[] compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        this.f(compoundDrawablesRelative[0], this.i);
        this.f(compoundDrawablesRelative[2], this.j);
    }
    
    public final void b(final AttributeSet set, int i) {
        final Context context = this.d.getContext();
        final ot d = ot.d();
        final to q = to.q(context, set, lo.h, i);
        final TextView d2 = this.d;
        ik.E((View)d2, d2.getContext(), lo.h, set, q.b, i, 0);
        final int f = q.f(0, -1);
        if (q.p(3)) {
            this.e = e(context, d, q.f(3, 0));
        }
        if (q.p(1)) {
            this.f = e(context, d, q.f(1, 0));
        }
        if (q.p(4)) {
            this.g = e(context, d, q.f(4, 0));
        }
        if (q.p(2)) {
            this.h = e(context, d, q.f(2, 0));
        }
        if (q.p(5)) {
            this.i = e(context, d, q.f(5, 0));
        }
        if (q.p(6)) {
            this.j = e(context, d, q.f(6, 0));
        }
        q.n();
        final boolean b = this.d.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean b2;
        boolean b3;
        String l;
        String m2;
        if (f != -1) {
            final to j = to.j(context, f, lo.v);
            if (!b && j.p(17)) {
                b2 = j.o(17, false);
                b3 = true;
            }
            else {
                b2 = false;
                b3 = false;
            }
            this.g(context, j);
            String m;
            if (j.p(18)) {
                m = j.m(18);
            }
            else {
                m = null;
            }
            String k;
            if (j.p(16)) {
                k = j.m(16);
            }
            else {
                k = null;
            }
            j.n();
            l = m;
            m2 = k;
        }
        else {
            b2 = false;
            b3 = false;
            l = null;
            m2 = null;
        }
        final to q2 = to.q(context, set, lo.v, i);
        if (!b && q2.p(17)) {
            b2 = q2.o(17, false);
            b3 = true;
        }
        if (q2.p(18)) {
            l = q2.m(18);
        }
        if (q2.p(16)) {
            m2 = q2.m(16);
        }
        if (q2.p(0) && q2.b(0, -1) == 0) {
            this.d.setTextSize(0, 0.0f);
        }
        this.g(context, q2);
        q2.n();
        if (!b && b3) {
            this.d(b2);
        }
        final Typeface b4 = this.b;
        if (b4 != null) {
            if (this.l == -1) {
                this.d.setTypeface(b4, this.a);
            }
            else {
                this.d.setTypeface(b4);
            }
        }
        if (m2 != null) {
            this.d.setFontVariationSettings(m2);
        }
        if (l != null) {
            this.d.setTextLocales(LocaleList.forLanguageTags(l));
        }
        final pu k2 = this.k;
        final TypedArray obtainStyledAttributes = k2.h.obtainStyledAttributes(set, lo.i, i, 0);
        final TextView g = k2.g;
        ik.E((View)g, g.getContext(), lo.i, set, obtainStyledAttributes, i, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            k2.a = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension;
        if (obtainStyledAttributes.hasValue(4)) {
            dimension = obtainStyledAttributes.getDimension(4, -1.0f);
        }
        else {
            dimension = -1.0f;
        }
        float c;
        if (obtainStyledAttributes.hasValue(2)) {
            c = obtainStyledAttributes.getDimension(2, -1.0f);
        }
        else {
            c = -1.0f;
        }
        float dimension2;
        if (obtainStyledAttributes.hasValue(1)) {
            dimension2 = obtainStyledAttributes.getDimension(1, -1.0f);
        }
        else {
            dimension2 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(3)) {
            i = obtainStyledAttributes.getResourceId(3, 0);
            if (i > 0) {
                final TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(i);
                final int length = obtainTypedArray.length();
                final int[] array = new int[length];
                if (length > 0) {
                    for (i = 0; i < length; ++i) {
                        array[i] = obtainTypedArray.getDimensionPixelSize(i, -1);
                    }
                    k2.e = pu.b(array);
                    final int[] e = k2.e;
                    i = e.length;
                    final boolean f2 = i > 0;
                    k2.f = f2;
                    if (f2) {
                        k2.a = 1;
                        k2.c = (float)e[0];
                        k2.d = (float)e[i - 1];
                        k2.b = -1.0f;
                    }
                }
                obtainTypedArray.recycle();
            }
        }
        obtainStyledAttributes.recycle();
        if (k2.a()) {
            if (k2.a == 1) {
                if (!k2.f) {
                    final DisplayMetrics displayMetrics = k2.h.getResources().getDisplayMetrics();
                    if (c == -1.0f) {
                        c = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    float applyDimension = dimension2;
                    if (dimension2 == -1.0f) {
                        applyDimension = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    float b5 = dimension;
                    if (dimension == -1.0f) {
                        b5 = 1.0f;
                    }
                    if (c <= 0.0f) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Minimum auto-size text size (");
                        sb.append(c);
                        sb.append("px) is less or equal to (0px)");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    if (applyDimension <= c) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Maximum auto-size text size (");
                        sb2.append(applyDimension);
                        sb2.append("px) is less or equal to minimum auto-size text size (");
                        sb2.append(c);
                        sb2.append("px)");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    if (b5 <= 0.0f) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("The auto-size step granularity (");
                        sb3.append(b5);
                        sb3.append("px) is less or equal to (0px)");
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    k2.a = 1;
                    k2.c = c;
                    k2.d = applyDimension;
                    k2.b = b5;
                    k2.f = false;
                }
                if (k2.a() && k2.a == 1 && (!k2.f || k2.e.length == 0)) {
                    final int n = (int)Math.floor((k2.d - k2.c) / k2.b) + 1;
                    final int[] array2 = new int[n];
                    for (i = 0; i < n; ++i) {
                        array2[i] = Math.round(k2.c + i * k2.b);
                    }
                    k2.e = pu.b(array2);
                }
            }
        }
        else {
            k2.a = 0;
        }
        final pu k3 = this.k;
        if (k3.a != 0) {
            final int[] e2 = k3.e;
            if (e2.length > 0) {
                if (this.d.getAutoSizeStepGranularity() != -1.0f) {
                    this.d.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.k.c), Math.round(this.k.d), Math.round(this.k.b), 0);
                }
                else {
                    this.d.setAutoSizeTextTypeUniformWithPresetSizes(e2, 0);
                }
            }
        }
        final to k4 = to.k(context, set, lo.i);
        i = k4.f(8, -1);
        Drawable c2;
        if (i != -1) {
            c2 = d.c(context, i);
        }
        else {
            c2 = null;
        }
        i = k4.f(13, -1);
        Drawable c3;
        if (i != -1) {
            c3 = d.c(context, i);
        }
        else {
            c3 = null;
        }
        i = k4.f(9, -1);
        Drawable c4;
        if (i != -1) {
            c4 = d.c(context, i);
        }
        else {
            c4 = null;
        }
        i = k4.f(6, -1);
        Drawable c5;
        if (i != -1) {
            c5 = d.c(context, i);
        }
        else {
            c5 = null;
        }
        i = k4.f(10, -1);
        Drawable c6;
        if (i != -1) {
            c6 = d.c(context, i);
        }
        else {
            c6 = null;
        }
        i = k4.f(7, -1);
        Drawable c7;
        if (i != -1) {
            c7 = d.c(context, i);
        }
        else {
            c7 = null;
        }
        if (c6 == null && c7 == null) {
            if (c2 != null || c3 != null || c4 != null || c5 != null) {
                final Drawable[] compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
                final Drawable drawable = compoundDrawablesRelative[0];
                if (drawable == null && compoundDrawablesRelative[2] == null) {
                    final Drawable[] compoundDrawables = this.d.getCompoundDrawables();
                    final TextView d3 = this.d;
                    Drawable drawable2;
                    if ((drawable2 = c2) == null) {
                        drawable2 = compoundDrawables[0];
                    }
                    Drawable drawable3;
                    if ((drawable3 = c3) == null) {
                        drawable3 = compoundDrawables[1];
                    }
                    Drawable drawable4;
                    if ((drawable4 = c4) == null) {
                        drawable4 = compoundDrawables[2];
                    }
                    Drawable drawable5;
                    if ((drawable5 = c5) == null) {
                        drawable5 = compoundDrawables[3];
                    }
                    d3.setCompoundDrawablesWithIntrinsicBounds(drawable2, drawable3, drawable4, drawable5);
                }
                else {
                    final TextView d4 = this.d;
                    if (c3 == null) {
                        c3 = compoundDrawablesRelative[1];
                    }
                    final Drawable drawable6 = compoundDrawablesRelative[2];
                    if (c5 == null) {
                        c5 = compoundDrawablesRelative[3];
                    }
                    d4.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, c3, drawable6, c5);
                }
            }
        }
        else {
            final Drawable[] compoundDrawablesRelative2 = this.d.getCompoundDrawablesRelative();
            final TextView d5 = this.d;
            if (c6 == null) {
                c6 = compoundDrawablesRelative2[0];
            }
            Drawable drawable7 = c3;
            if (c3 == null) {
                drawable7 = compoundDrawablesRelative2[1];
            }
            if (c7 == null) {
                c7 = compoundDrawablesRelative2[2];
            }
            Drawable drawable8 = c5;
            if (c5 == null) {
                drawable8 = compoundDrawablesRelative2[3];
            }
            d5.setCompoundDrawablesRelativeWithIntrinsicBounds(c6, drawable7, c7, drawable8);
        }
        if (k4.p(11)) {
            this.d.setCompoundDrawableTintList(k4.g(11));
        }
        if (k4.p(12)) {
            this.d.setCompoundDrawableTintMode(qi.a(k4.c(12, -1), null));
        }
        i = k4.b(14, -1);
        final int b6 = k4.b(17, -1);
        final int b7 = k4.b(18, -1);
        k4.n();
        if (i != -1) {
            final TextView d6 = this.d;
            hh.c(i);
            d6.setFirstBaselineToTopHeight(i);
        }
        if (b6 != -1) {
            final TextView d7 = this.d;
            hh.c(b6);
            final Paint$FontMetricsInt fontMetricsInt = d7.getPaint().getFontMetricsInt();
            if (d7.getIncludeFontPadding()) {
                i = fontMetricsInt.bottom;
            }
            else {
                i = fontMetricsInt.descent;
            }
            if (b6 > Math.abs(i)) {
                d7.setPadding(d7.getPaddingLeft(), d7.getPaddingTop(), d7.getPaddingRight(), b6 - i);
            }
        }
        if (b7 != -1) {
            jp.d(this.d, b7);
        }
    }
    
    public final void c(final Context context, final int n) {
        final to j = to.j(context, n, lo.v);
        if (j.p(17)) {
            this.d(j.o(17, false));
        }
        if (j.p(0) && j.b(0, -1) == 0) {
            this.d.setTextSize(0, 0.0f);
        }
        this.g(context, j);
        if (j.p(16)) {
            final String m = j.m(16);
            if (m != null) {
                this.d.setFontVariationSettings(m);
            }
        }
        j.n();
        final Typeface b = this.b;
        if (b != null) {
            this.d.setTypeface(b, this.a);
        }
    }
    
    final void d(final boolean allCaps) {
        this.d.setAllCaps(allCaps);
    }
}
