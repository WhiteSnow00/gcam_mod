import android.os.Parcel;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jpu extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    @Deprecated
    public final int b;
    private final long c;
    
    static {
        CREATOR = (Parcelable$Creator)new uj(16);
    }
    
    public jpu(final String a) {
        this.a = a;
        this.c = 1L;
        this.b = -1;
    }
    
    public jpu(final String a, final int b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final long a() {
        long c;
        if ((c = this.c) == -1L) {
            c = this.b;
        }
        return c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof jpu) {
            final jpu jpu = (jpu)o;
            final String a = this.a;
            if (((a != null && a.equals(jpu.a)) || (this.a == null && jpu.a == null)) && this.a() == jpu.a()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.a() });
    }
    
    @Override
    public final String toString() {
        final ArrayList list = new ArrayList();
        jvu.o("name", this.a, list);
        jvu.o("version", this.a(), list);
        return jvu.n(list, this);
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.v(parcel, 1, this.a);
        jwn.n(parcel, 2, this.b);
        jwn.o(parcel, 3, this.a());
        jwn.i(parcel, g);
    }
}
