// 
// Decompiled by Procyon v0.6.0
// 

package android.support.wearable.watchface.decomposition;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class GlyphDescriptor implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public short a;
    public char b;
    
    static {
        CREATOR = (Parcelable$Creator)new GlyphDescriptor$1();
    }
    
    protected GlyphDescriptor(final Parcel parcel) {
        this.a = (short)parcel.readInt();
        this.b = (char)parcel.readInt();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt((int)this.a);
        parcel.writeInt((int)this.b);
    }
}
