import android.os.Parcel;
import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class keo extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final byte[] b;
    public final List c;
    
    static {
        CREATOR = (Parcelable$Creator)new kbr(19);
    }
    
    public keo(final String a, final byte[] b, final List list) {
        this.a = a;
        this.b = b;
        ArrayList c;
        if (list == null) {
            c = new ArrayList(0);
        }
        else {
            c = new ArrayList(list);
        }
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof keo)) {
            return false;
        }
        final keo keo = (keo)o;
        return jvu.m(this.a, keo.a) && jvu.m(this.b, keo.b) && jvu.m(this.c, keo.c);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c });
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        final int g = jwn.g(parcel);
        jwn.v(parcel, 1, this.a);
        jwn.q(parcel, 2, this.b);
        final ArrayList list = new ArrayList(this.c);
        final int h = jwn.h(parcel, 3);
        final int size = list.size();
        parcel.writeInt(size);
        for (i = 0; i < size; ++i) {
            parcel.writeInt((int)list.get(i));
        }
        jwn.i(parcel, h);
        jwn.i(parcel, g);
    }
}
