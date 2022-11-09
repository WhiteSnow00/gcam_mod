import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

final class dn implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    final List a;
    final List b;
    
    static {
        CREATOR = (Parcelable$Creator)new dm();
    }
    
    public dn(final Parcel parcel) {
        this.a = parcel.createStringArrayList();
        this.b = parcel.createTypedArrayList(dl.CREATOR);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeStringList(this.a);
        parcel.writeTypedList(this.b);
    }
}
