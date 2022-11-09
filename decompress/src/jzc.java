import android.os.Parcel;
import java.util.Arrays;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jzc extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final long b;
    
    static {
        CREATOR = (Parcelable$Creator)new ul(20);
    }
    
    public jzc(int a, final long b) {
        boolean b2 = true;
        if (a == 0) {
            if (b > 0L) {
                a = 0;
            }
            else {
                a = 0;
                b2 = false;
            }
        }
        jvu.c(b2, "Recurrent jobs cannot have non-positive minimal interval.");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof jzc)) {
            return false;
        }
        final jzc jzc = (jzc)o;
        return this.a == jzc.a && this.b == jzc.b;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.n(parcel, 1, this.a);
        jwn.o(parcel, 2, this.b);
        jwn.i(parcel, g);
    }
}
