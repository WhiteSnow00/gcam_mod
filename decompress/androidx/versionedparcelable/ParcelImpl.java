// 
// Decompiled by Procyon v0.6.0
// 

package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class ParcelImpl implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final agc a;
    
    static {
        CREATOR = (Parcelable$Creator)new aga();
    }
    
    public ParcelImpl(final Parcel parcel) {
        this.a = new agb(parcel).c();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        new agb(parcel).k(this.a);
    }
}
