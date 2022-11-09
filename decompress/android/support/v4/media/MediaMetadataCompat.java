// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class MediaMetadataCompat implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    static final yu a;
    final Bundle b;
    
    static {
        final yu yu = a = new yu();
        final Integer value = 1;
        yu.put("android.media.metadata.TITLE", value);
        yu.put("android.media.metadata.ARTIST", value);
        final Integer value2 = 0;
        yu.put("android.media.metadata.DURATION", value2);
        yu.put("android.media.metadata.ALBUM", value);
        yu.put("android.media.metadata.AUTHOR", value);
        yu.put("android.media.metadata.WRITER", value);
        yu.put("android.media.metadata.COMPOSER", value);
        yu.put("android.media.metadata.COMPILATION", value);
        yu.put("android.media.metadata.DATE", value);
        yu.put("android.media.metadata.YEAR", value2);
        yu.put("android.media.metadata.GENRE", value);
        yu.put("android.media.metadata.TRACK_NUMBER", value2);
        yu.put("android.media.metadata.NUM_TRACKS", value2);
        yu.put("android.media.metadata.DISC_NUMBER", value2);
        yu.put("android.media.metadata.ALBUM_ARTIST", value);
        final Integer value3 = 2;
        yu.put("android.media.metadata.ART", value3);
        yu.put("android.media.metadata.ART_URI", value);
        yu.put("android.media.metadata.ALBUM_ART", value3);
        yu.put("android.media.metadata.ALBUM_ART_URI", value);
        final Integer value4 = 3;
        yu.put("android.media.metadata.USER_RATING", value4);
        yu.put("android.media.metadata.RATING", value4);
        yu.put("android.media.metadata.DISPLAY_TITLE", value);
        yu.put("android.media.metadata.DISPLAY_SUBTITLE", value);
        yu.put("android.media.metadata.DISPLAY_DESCRIPTION", value);
        yu.put("android.media.metadata.DISPLAY_ICON", value3);
        yu.put("android.media.metadata.DISPLAY_ICON_URI", value);
        yu.put("android.media.metadata.MEDIA_ID", value);
        yu.put("android.media.metadata.BT_FOLDER_TYPE", value2);
        yu.put("android.media.metadata.MEDIA_URI", value);
        yu.put("android.media.metadata.ADVERTISEMENT", value2);
        yu.put("android.media.metadata.DOWNLOAD_STATUS", value2);
        CREATOR = (Parcelable$Creator)new dm(7);
    }
    
    public MediaMetadataCompat(final Parcel parcel) {
        this.b = parcel.readBundle(hj.class.getClassLoader());
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeBundle(this.b);
    }
}
