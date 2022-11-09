// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.media;

import android.media.MediaDescription$Builder;
import android.os.Parcel;
import android.os.Bundle;
import android.net.Uri;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public final class MediaDescriptionCompat implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public MediaDescription a;
    private final String b;
    private final CharSequence c;
    private final CharSequence d;
    private final CharSequence e;
    private final Bitmap f;
    private final Uri g;
    private final Bundle h;
    private final Uri i;
    
    static {
        CREATOR = (Parcelable$Creator)new dm(6);
    }
    
    public MediaDescriptionCompat(final String b, final CharSequence c, final CharSequence d, final CharSequence e, final Bitmap f, final Uri g, final Bundle h, final Uri i) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)this.c);
        sb.append(", ");
        sb.append((Object)this.d);
        sb.append(", ");
        sb.append((Object)this.e);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        MediaDescription a = this.a;
        if (a == null) {
            final MediaDescription$Builder b = hg.b();
            hg.n(b, this.b);
            hg.p(b, this.c);
            hg.o(b, this.d);
            hg.j(b, this.e);
            hg.l(b, this.f);
            hg.m(b, this.g);
            hg.k(b, this.h);
            hh.b(b, this.i);
            a = hg.c(b);
            this.a = a;
        }
        a.writeToParcel(parcel, n);
    }
}
