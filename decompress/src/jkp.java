import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jkp implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final Parcelable a;
    
    static {
        CREATOR = (Parcelable$Creator)new jko();
    }
    
    public jkp(final Parcelable a) {
        final String name = a.getClass().getName();
        if (!name.startsWith("android.os.") && !name.equals("android.content.Intent") && !name.equals("android.app.PendingIntent")) {
            throw new IllegalArgumentException("Only Android system classes can be passed in SystemParcelableWrapper.");
        }
        this.a = a;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable(this.a, n);
    }
}
