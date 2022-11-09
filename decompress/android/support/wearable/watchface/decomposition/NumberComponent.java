// 
// Decompiled by Procyon v0.6.0
// 

package android.support.wearable.watchface.decomposition;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class NumberComponent extends BaseDrawnComponent implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new NumberComponent$1();
    }
    
    public NumberComponent(final Parcel parcel) {
        super(parcel.readBundle());
        this.a.setClassLoader(this.getClass().getClassLoader());
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeBundle(this.a);
    }
}
