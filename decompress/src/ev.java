import android.os.Bundle;
import android.content.res.TypedArray;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.view.LayoutInflater$Factory2;

// 
// Decompiled by Procyon v0.6.0
// 

final class ev implements LayoutInflater$Factory2
{
    final fi a;
    
    public ev(final fi a) {
        this.a = a;
    }
    
    public final View onCreateView(View o, final String s, Context context, final AttributeSet set) {
        if (eq.class.getName().equals(s)) {
            return (View)new eq(context, set, this.a);
        }
        final boolean equals = "fragment".equals(s);
        ei c = null;
        if (!equals) {
            return null;
        }
        final String attributeValue = set.getAttributeValue((String)null, "class");
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, dj.a);
        int id = 0;
        String string;
        if ((string = attributeValue) == null) {
            string = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        final String string2 = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (string == null || !es.b(context.getClassLoader(), string)) {
            return null;
        }
        if (o != null) {
            id = o.getId();
        }
        if (id == -1) {
            if (resourceId == -1) {
                if (string2 == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(set.getPositionDescription());
                    sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
                    sb.append(string);
                    throw new IllegalArgumentException(sb.toString());
                }
                id = -1;
                resourceId = -1;
            }
            else {
                id = -1;
            }
        }
        if (resourceId != -1) {
            c = this.a.c(resourceId);
        }
        ei d;
        if ((d = c) == null) {
            d = c;
            if (string2 != null) {
                d = this.a.d(string2);
            }
        }
        ei ei;
        if ((ei = d) == null) {
            ei = d;
            if (id != -1) {
                ei = this.a.c(id);
            }
        }
        fo fo;
        if (ei == null) {
            final es f = this.a.f();
            context.getClassLoader();
            ei = f.c(string);
            ei.v = true;
            int e;
            if (resourceId != 0) {
                e = resourceId;
            }
            else {
                e = id;
            }
            ei.E = e;
            ei.F = id;
            ei.G = string2;
            ei.w = true;
            ei.A = this.a;
            final fi a = this.a;
            ei.B = a.j;
            context = a.j.c;
            final Bundle i = ei.i;
            ei.X();
            fo = this.a.g(ei);
            if (fi.R(2)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Fragment ");
                sb2.append(ei);
                sb2.append(" has been inflated via the <fragment> tag: id=0x");
                sb2.append(Integer.toHexString(resourceId));
                sb2.toString();
            }
        }
        else {
            if (ei.w) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(set.getPositionDescription());
                sb3.append(": Duplicate id 0x");
                sb3.append(Integer.toHexString(resourceId));
                sb3.append(", tag ");
                sb3.append(string2);
                sb3.append(", or parent id 0x");
                sb3.append(Integer.toHexString(id));
                sb3.append(" with another fragment for ");
                sb3.append(string);
                throw new IllegalArgumentException(sb3.toString());
            }
            ei.w = true;
            ei.A = this.a;
            final fi a2 = this.a;
            ei.B = a2.j;
            context = a2.j.c;
            ei.X();
            fo = this.a.h(ei);
            if (fi.R(2)) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append("Retained Fragment ");
                sb4.append(ei);
                sb4.append(" has been re-attached via the <fragment> tag: id=0x");
                sb4.append(Integer.toHexString(resourceId));
                sb4.toString();
            }
        }
        final ViewGroup n = (ViewGroup)o;
        adc.b(ei, n);
        ei.N = n;
        fo.d();
        fo.c();
        o = ei.O;
        if (o != null) {
            if (resourceId != 0) {
                o.setId(resourceId);
            }
            if (ei.O.getTag() == null) {
                ei.O.setTag((Object)string2);
            }
            ei.O.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new eu(this, fo));
            return ei.O;
        }
        final StringBuilder sb5 = new StringBuilder();
        sb5.append("Fragment ");
        sb5.append(string);
        sb5.append(" did not create a view.");
        throw new IllegalStateException(sb5.toString());
    }
    
    public final View onCreateView(final String s, final Context context, final AttributeSet set) {
        return this.onCreateView(null, s, context, set);
    }
}
