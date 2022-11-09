import java.io.Serializable;
import java.util.List;
import android.os.Parcelable;
import android.os.Parcel;
import android.net.Uri;
import j$.time.Instant;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class czi extends czx
{
    public static final Parcelable$Creator CREATOR;
    
    static {
        CREATOR = (Parcelable$Creator)new uj(6);
    }
    
    public czi(final long n, final him him, final nns nns, final String s, final String s2, final Instant instant, final Instant instant2, final Uri uri, final boolean b, final kre kre, final int n2) {
        super(n, him, nns, s, s2, instant, instant2, uri, b, kre, n2);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(super.b);
        parcel.writeParcelable((Parcelable)super.c, n);
        parcel.writeList((List)super.d);
        parcel.writeString(super.e);
        parcel.writeString(super.f);
        parcel.writeSerializable((Serializable)super.g);
        parcel.writeSerializable((Serializable)super.h);
        parcel.writeParcelable((Parcelable)super.i, n);
        parcel.writeInt((int)(super.j ? 1 : 0));
        parcel.writeSerializable((Serializable)super.k);
        parcel.writeInt(super.l);
    }
}
