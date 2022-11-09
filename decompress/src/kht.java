import android.os.Parcel;
import java.io.Serializable;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kht extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final String b;
    public final byte[] c;
    public final String d;
    
    static {
        CREATOR = (Parcelable$Creator)new kgw(9);
    }
    
    public kht(final int a, final String b, final byte[] c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final String b = this.b;
        final byte[] c = this.c;
        Serializable value;
        if (c == null) {
            value = "null";
        }
        else {
            value = c.length;
        }
        final String value2 = String.valueOf(value);
        final StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 43 + String.valueOf(value2).length());
        sb.append("MessageEventParcelable[");
        sb.append(a);
        sb.append(",");
        sb.append(b);
        sb.append(", size=");
        sb.append(value2);
        sb.append("]");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.n(parcel, 2, this.a);
        jwn.v(parcel, 3, this.b);
        jwn.q(parcel, 4, this.c);
        jwn.v(parcel, 5, this.d);
        jwn.i(parcel, g);
    }
}
