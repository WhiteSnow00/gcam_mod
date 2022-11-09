import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

final class ff implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    final String a;
    final int b;
    
    static {
        CREATOR = (Parcelable$Creator)new dm(2);
    }
    
    public ff(final Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
    }
    
    public ff(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }
}
