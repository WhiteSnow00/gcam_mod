// 
// Decompiled by Procyon v0.6.0
// 

package android.support.wearable.watchface.decomposition;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class KerningPair implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public char b;
    public char c;
    
    static {
        CREATOR = (Parcelable$Creator)new KerningPair$1();
    }
    
    protected KerningPair(final Parcel parcel) {
        this.a = parcel.readInt();
        this.b = (char)parcel.readInt();
        this.c = (char)parcel.readInt();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeInt((int)this.b);
        parcel.writeInt((int)this.c);
    }
}
