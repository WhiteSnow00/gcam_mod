import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public class abm implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public static final abm c;
    public final Parcelable d;
    
    static {
        c = new abl();
        CREATOR = (Parcelable$Creator)new tu(3);
    }
    
    public abm() {
        this.d = null;
    }
    
    protected abm(final Parcel parcel, final ClassLoader classLoader) {
        Object d;
        if ((d = parcel.readParcelable(classLoader)) == null) {
            d = abm.c;
        }
        this.d = (Parcelable)d;
    }
    
    protected abm(final Parcelable parcelable) {
        if (parcelable != null) {
            Parcelable d;
            if ((d = parcelable) == abm.c) {
                d = null;
            }
            this.d = d;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable(this.d, n);
    }
}
