import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kfy extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final byte g;
    public final byte h;
    public final byte i;
    public final byte j;
    public final String k;
    private final String l;
    
    static {
        CREATOR = (Parcelable$Creator)new kff(5);
    }
    
    public kfy(final int a, final String b, final String c, final String d, final String e, final String f, final String l, final byte b2, final byte b3, final byte b4, final byte b5, final String k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.l = l;
        this.g = b2;
        this.h = b3;
        this.i = b4;
        this.j = b5;
        this.k = k;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        boolean equals = false;
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final kfy kfy = (kfy)o;
        if (this.a != kfy.a) {
            return false;
        }
        if (this.g != kfy.g) {
            return false;
        }
        if (this.h != kfy.h) {
            return false;
        }
        if (this.i != kfy.i) {
            return false;
        }
        if (this.j != kfy.j) {
            return false;
        }
        if (!this.b.equals(kfy.b)) {
            return false;
        }
        final String c = this.c;
        Label_0145: {
            if (c != null) {
                if (c.equals(kfy.c)) {
                    break Label_0145;
                }
            }
            else if (kfy.c == null) {
                break Label_0145;
            }
            return false;
        }
        if (!this.d.equals(kfy.d)) {
            return false;
        }
        if (!this.e.equals(kfy.e)) {
            return false;
        }
        if (!this.f.equals(kfy.f)) {
            return false;
        }
        final String l = this.l;
        Label_0225: {
            if (l != null) {
                if (l.equals(kfy.l)) {
                    break Label_0225;
                }
            }
            else if (kfy.l == null) {
                break Label_0225;
            }
            return false;
        }
        final String k = this.k;
        if (k != null) {
            equals = k.equals(kfy.k);
        }
        else if (kfy.k == null) {
            return true;
        }
        return equals;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final int hashCode = this.b.hashCode();
        final String c = this.c;
        int hashCode2 = 0;
        int hashCode3;
        if (c != null) {
            hashCode3 = c.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int hashCode4 = this.d.hashCode();
        final int hashCode5 = this.e.hashCode();
        final int hashCode6 = this.f.hashCode();
        final String l = this.l;
        int hashCode7;
        if (l != null) {
            hashCode7 = l.hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final byte g = this.g;
        final byte h = this.h;
        final byte i = this.i;
        final byte j = this.j;
        final String k = this.k;
        if (k != null) {
            hashCode2 = k.hashCode();
        }
        return (((((((((((a + 31) * 31 + hashCode) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + g) * 31 + h) * 31 + i) * 31 + j) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final String b = this.b;
        final String c = this.c;
        final String d = this.d;
        final String e = this.e;
        final String f = this.f;
        final String l = this.l;
        final byte g = this.g;
        final byte h = this.h;
        final byte i = this.i;
        final byte j = this.j;
        final String k = this.k;
        final StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 211 + String.valueOf(c).length() + String.valueOf(d).length() + String.valueOf(e).length() + String.valueOf(f).length() + String.valueOf(l).length() + String.valueOf(k).length());
        sb.append("AncsNotificationParcelable{, id=");
        sb.append(a);
        sb.append(", appId='");
        sb.append(b);
        sb.append("', dateTime='");
        sb.append(c);
        sb.append("', notificationText='");
        sb.append(d);
        sb.append("', title='");
        sb.append(e);
        sb.append("', subtitle='");
        sb.append(f);
        sb.append("', displayName='");
        sb.append(l);
        sb.append("', eventId=");
        sb.append(g);
        sb.append(", eventFlags=");
        sb.append(h);
        sb.append(", categoryId=");
        sb.append(i);
        sb.append(", categoryCount=");
        sb.append(j);
        sb.append(", packageName='");
        sb.append(k);
        sb.append("'}");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.n(parcel, 2, this.a);
        jwn.v(parcel, 3, this.b);
        jwn.v(parcel, 4, this.c);
        jwn.v(parcel, 5, this.d);
        jwn.v(parcel, 6, this.e);
        jwn.v(parcel, 7, this.f);
        String s;
        if ((s = this.l) == null) {
            s = this.b;
        }
        jwn.v(parcel, 8, s);
        jwn.k(parcel, 9, this.g);
        jwn.k(parcel, 10, this.h);
        jwn.k(parcel, 11, this.i);
        jwn.k(parcel, 12, this.j);
        jwn.v(parcel, 13, this.k);
        jwn.i(parcel, g);
    }
}
