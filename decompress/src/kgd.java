import android.os.Parcel;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgd extends jwc implements kfd
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final List b;
    private final Object c;
    private Set d;
    
    static {
        CREATOR = (Parcelable$Creator)new kff(6);
    }
    
    public kgd(final String a, final List b) {
        this.c = new Object();
        this.a = a;
        this.b = b;
        this.d = null;
        jvu.a(a);
        jvu.a(b);
    }
    
    @Override
    public final Set a() {
        synchronized (this.c) {
            if (this.d == null) {
                this.d = new HashSet(this.b);
            }
            return this.d;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final kgd kgd = (kgd)o;
            final String a = this.a;
            Label_0062: {
                if (a != null) {
                    if (a.equals(kgd.a)) {
                        break Label_0062;
                    }
                }
                else if (kgd.a == null) {
                    break Label_0062;
                }
                return false;
            }
            final List b = this.b;
            if (b != null) {
                if (b.equals(kgd.b)) {
                    return true;
                }
            }
            else if (kgd.b == null) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final List b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return (hashCode2 + 31) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String value = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 18 + String.valueOf(value).length());
        sb.append("CapabilityInfo{");
        sb.append(a);
        sb.append(", ");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int g) {
        g = jwn.g(parcel);
        jwn.v(parcel, 2, this.a);
        jwn.z(parcel, 3, this.b);
        jwn.i(parcel, g);
    }
}
