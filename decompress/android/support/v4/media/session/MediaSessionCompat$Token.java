// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class MediaSessionCompat$Token implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final Object a;
    
    static {
        CREATOR = (Parcelable$Creator)new dm(11);
    }
    
    public MediaSessionCompat$Token(final Object a) {
        this.a = a;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final boolean equals(Object a) {
        if (this == a) {
            return true;
        }
        if (!(a instanceof MediaSessionCompat$Token)) {
            return false;
        }
        final MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token)a;
        a = this.a;
        if (a == null) {
            return mediaSessionCompat$Token.a == null;
        }
        final Object a2 = mediaSessionCompat$Token.a;
        return a2 != null && a.equals(a2);
    }
    
    @Override
    public final int hashCode() {
        final Object a = this.a;
        if (a == null) {
            return 0;
        }
        return a.hashCode();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.a, n);
    }
}
