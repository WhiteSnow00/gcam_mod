import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jzb extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    
    static {
        CREATOR = (Parcelable$Creator)new ul(19);
    }
    
    public jzb(final boolean a, final boolean b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof jzb)) {
            return false;
        }
        final jzb jzb = (jzb)o;
        return this.a == jzb.a && this.b == jzb.b && this.c == jzb.c;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c });
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.j(parcel, 1, this.a);
        jwn.j(parcel, 2, this.b);
        jwn.j(parcel, 3, this.c);
        jwn.i(parcel, g);
    }
}
