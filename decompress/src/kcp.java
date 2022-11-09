import android.os.Parcel;
import java.util.Iterator;
import java.util.List;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kcp extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final List a;
    
    static {
        CREATOR = (Parcelable$Creator)new kbr(13);
    }
    
    public kcp(final List a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof kcp && this.a.equals(((kcp)o).a));
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("FlagOverrides(");
        final Iterator iterator = this.a.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final kco kco = (kco)iterator.next();
            if (n == 0) {
                sb.append(", ");
            }
            kco.a(sb);
            n = 0;
        }
        sb.append(")");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.z(parcel, 2, this.a);
        jwn.i(parcel, g);
    }
}
