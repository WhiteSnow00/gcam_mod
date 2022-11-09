import android.os.Parcelable;
import android.os.Parcel;
import java.util.Iterator;
import android.util.Base64;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Map;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kcj extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final byte[] b;
    public final String c;
    public final kci[] d;
    public final Map e;
    public final boolean f;
    public final long g;
    
    static {
        CREATOR = (Parcelable$Creator)new kbr(8);
    }
    
    public kcj(final String a, final String c, final kci[] d, final boolean f, final byte[] b, final long g) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.f = f;
        this.b = b;
        this.g = g;
        this.e = new TreeMap();
        for (final kci kci : d) {
            this.e.put(kci.a, kci);
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof kcj) {
            final kcj kcj = (kcj)o;
            if (lwt.o(this.a, kcj.a) && lwt.o(this.c, kcj.c) && this.e.equals(kcj.e) && this.f == kcj.f && Arrays.equals(this.b, kcj.b) && this.g == kcj.g) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.c, this.e, this.f, this.b, this.g });
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.a);
        sb.append("', '");
        sb.append(this.c);
        sb.append("', (");
        final Iterator iterator = this.e.values().iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f);
        sb.append(", ");
        final byte[] b = this.b;
        String encodeToString;
        if (b == null) {
            encodeToString = "null";
        }
        else {
            encodeToString = Base64.encodeToString(b, 3);
        }
        sb.append(encodeToString);
        sb.append(", ");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.v(parcel, 2, this.a);
        jwn.v(parcel, 3, this.c);
        jwn.y(parcel, 4, (Parcelable[])this.d, n);
        jwn.j(parcel, 5, this.f);
        jwn.q(parcel, 6, this.b);
        jwn.o(parcel, 7, this.g);
        jwn.i(parcel, g);
    }
}
