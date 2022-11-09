// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media.session;

import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class MediaSessionCompat$QueueItem implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final MediaDescriptionCompat a;
    private final long b;
    
    static {
        CREATOR = (Parcelable$Creator)new dm(9);
    }
    
    public MediaSessionCompat$QueueItem(final Parcel parcel) {
        this.a = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.b = parcel.readLong();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MediaSession.QueueItem {Description=");
        sb.append(this.a);
        sb.append(", Id=");
        sb.append(this.b);
        sb.append(" }");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        this.a.writeToParcel(parcel, n);
        parcel.writeLong(this.b);
    }
}
