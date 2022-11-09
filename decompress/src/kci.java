import android.os.Parcelable;
import android.os.Parcel;
import java.util.Iterator;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.Map;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kci extends jwc implements Comparable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final kcn[] b;
    public final String[] c;
    public final Map d;
    
    static {
        CREATOR = (Parcelable$Creator)new kbr(7);
    }
    
    public kci(int i, final kcn[] b, final String[] c) {
        this.a = i;
        this.b = b;
        this.d = new TreeMap();
        int length;
        kcn kcn;
        for (length = b.length, i = 0; i < length; ++i) {
            kcn = b[i];
            this.d.put(kcn.a, kcn);
        }
        if ((this.c = c) != null) {
            Arrays.sort(c);
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof kci) {
            final kci kci = (kci)o;
            if (this.a == kci.a && lwt.o(this.d, kci.d) && Arrays.equals(this.c, kci.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.a);
        sb.append(", (");
        final Iterator iterator = this.d.values().iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            sb.append(", ");
        }
        sb.append("), (");
        final String[] c = this.c;
        if (c != null) {
            for (int length = c.length, i = 0; i < length; ++i) {
                sb.append(c[i]);
                sb.append(", ");
            }
        }
        else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.n(parcel, 2, this.a);
        jwn.y(parcel, 3, (Parcelable[])this.b, n);
        jwn.w(parcel, 4, this.c);
        jwn.i(parcel, g);
    }
}
