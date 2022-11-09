import android.graphics.drawable.Drawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hpg
{
    public final long a;
    public final boolean b;
    public final String c;
    public final Drawable d;
    public final Runnable e;
    public final Runnable f;
    public final String g;
    public final Runnable h;
    public final Runnable i;
    public final Runnable j;
    public final Runnable k;
    public final boolean l;
    
    public hpg() {
    }
    
    public hpg(final long a, final boolean b, final String c, final Drawable d, final Runnable e, final Runnable f, final String g, final Runnable h, final Runnable i, final Runnable j, final Runnable k, final boolean l) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public static hpf a() {
        final hpf hpf = new hpf();
        hpf.d(0L);
        hpf.a = false;
        hpf.c(false);
        return hpf;
    }
    
    public final hpf b() {
        return new hpf(this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hpg) {
            final hpg hpg = (hpg)o;
            if (this.a == hpg.a && this.b == hpg.b) {
                final String c = this.c;
                if (c == null) {
                    if (hpg.c != null) {
                        return false;
                    }
                }
                else if (!c.equals(hpg.c)) {
                    return false;
                }
                final Drawable d = this.d;
                if (d == null) {
                    if (hpg.d != null) {
                        return false;
                    }
                }
                else if (!d.equals(hpg.d)) {
                    return false;
                }
                final Runnable e = this.e;
                if (e == null) {
                    if (hpg.e != null) {
                        return false;
                    }
                }
                else if (!e.equals(hpg.e)) {
                    return false;
                }
                final Runnable f = this.f;
                if (f == null) {
                    if (hpg.f != null) {
                        return false;
                    }
                }
                else if (!f.equals(hpg.f)) {
                    return false;
                }
                final String g = this.g;
                if (g == null) {
                    if (hpg.g != null) {
                        return false;
                    }
                }
                else if (!g.equals(hpg.g)) {
                    return false;
                }
                final Runnable h = this.h;
                if (h == null) {
                    if (hpg.h != null) {
                        return false;
                    }
                }
                else if (!h.equals(hpg.h)) {
                    return false;
                }
                final Runnable i = this.i;
                if (i == null) {
                    if (hpg.i != null) {
                        return false;
                    }
                }
                else if (!i.equals(hpg.i)) {
                    return false;
                }
                final Runnable j = this.j;
                if (j == null) {
                    if (hpg.j != null) {
                        return false;
                    }
                }
                else if (!j.equals(hpg.j)) {
                    return false;
                }
                final Runnable k = this.k;
                if (k == null) {
                    if (hpg.k != null) {
                        return false;
                    }
                }
                else if (!k.equals(hpg.k)) {
                    return false;
                }
                if (this.l == hpg.l) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final boolean b = this.b;
        int n2 = 1237;
        int n3;
        if (!b) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        final String c = this.c;
        int hashCode = 0;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final Drawable d = this.d;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final Runnable e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        final Runnable f = this.f;
        int hashCode5;
        if (f == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = f.hashCode();
        }
        final String g = this.g;
        int hashCode6;
        if (g == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = g.hashCode();
        }
        final Runnable h = this.h;
        int hashCode7;
        if (h == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = h.hashCode();
        }
        final Runnable i = this.i;
        int hashCode8;
        if (i == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = i.hashCode();
        }
        final Runnable j = this.j;
        int hashCode9;
        if (j == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = j.hashCode();
        }
        final Runnable k = this.k;
        if (k != null) {
            hashCode = k.hashCode();
        }
        if (this.l) {
            n2 = 1231;
        }
        return (((((((((((n ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * -721379959 ^ hashCode5) * 1000003 ^ hashCode6) * -721379959 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode9) * 1000003 ^ hashCode) * 1000003 ^ n2;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final boolean b = this.b;
        final String c = this.c;
        final String value = String.valueOf(this.d);
        final String value2 = String.valueOf(this.e);
        final String value3 = String.valueOf((Object)null);
        final String value4 = String.valueOf(this.f);
        final String g = this.g;
        final String value5 = String.valueOf(this.h);
        final String value6 = String.valueOf(this.i);
        final String value7 = String.valueOf(this.j);
        final String value8 = String.valueOf(this.k);
        final boolean l = this.l;
        final StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 332 + String.valueOf(value).length() + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length() + String.valueOf(g).length() + String.valueOf((Object)null).length() + String.valueOf(value5).length() + String.valueOf(value6).length() + String.valueOf(value7).length() + String.valueOf(value8).length());
        sb.append("SmartsSuggestion{timeoutMillis=");
        sb.append(a);
        sb.append(", autoHideOnClick=");
        sb.append(b);
        sb.append(", text=");
        sb.append(c);
        sb.append(", icon=");
        sb.append(value);
        sb.append(", onChipClickListener=");
        sb.append(value2);
        sb.append(", button=");
        sb.append(value3);
        sb.append(", onButtonClickListener=");
        sb.append(value4);
        sb.append(", chipContentDescription=");
        sb.append(g);
        sb.append(", buttonContentDescription=null, onDismissButtonClickListener=");
        sb.append(value5);
        sb.append(", onSuggestionDisplayedListener=");
        sb.append(value6);
        sb.append(", onSuggestionHiddenListener=");
        sb.append(value7);
        sb.append(", onSuggestionTimeoutListener=");
        sb.append(value8);
        sb.append(", sticky=");
        sb.append(l);
        sb.append("}");
        return sb.toString();
    }
}
