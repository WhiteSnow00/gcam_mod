// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media.session;

import android.text.TextUtils;
import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class PlaybackStateCompat$CustomAction implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private final String a;
    private final CharSequence b;
    private final int c;
    private final Bundle d;
    
    static {
        CREATOR = (Parcelable$Creator)new dm(14);
    }
    
    public PlaybackStateCompat$CustomAction(final Parcel parcel) {
        this.a = parcel.readString();
        this.b = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.c = parcel.readInt();
        this.d = parcel.readBundle(hj.class.getClassLoader());
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Action:mName='");
        sb.append((Object)this.b);
        sb.append(", mIcon=");
        sb.append(this.c);
        sb.append(", mExtras=");
        sb.append(this.d);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        TextUtils.writeToParcel(this.b, parcel, n);
        parcel.writeInt(this.c);
        parcel.writeBundle(this.d);
    }
}
