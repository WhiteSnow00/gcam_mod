import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mrf implements Comparable, Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final String a;
    public final long b;
    public final int c;
    public final String d;
    
    static {
        CREATOR = (Parcelable$Creator)new kgw(20);
    }
    
    public mrf(final Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readLong();
        this.c = parcel.readInt();
        this.d = parcel.readString();
    }
    
    public mrf(final String a, final long b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = "";
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof mrf && this.a.equals(((mrf)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
    }
}
