import android.os.Parcel;
import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kep extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final boolean a;
    public final boolean b;
    private final List c;
    
    static {
        new kep(null, false, false);
        CREATOR = (Parcelable$Creator)new kbr(20);
    }
    
    public kep(final List list, final boolean a, final boolean b) {
        ArrayList c;
        if (list == null) {
            c = new ArrayList(0);
        }
        else {
            c = new ArrayList(list);
        }
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof kep)) {
            return false;
        }
        final kep kep = (kep)o;
        return jvu.m(this.c, kep.c) && jvu.m(this.a, kep.a);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.c, this.a });
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.z(parcel, 1, new ArrayList(this.c));
        jwn.j(parcel, 2, this.a);
        jwn.j(parcel, 3, this.b);
        jwn.i(parcel, g);
    }
}
