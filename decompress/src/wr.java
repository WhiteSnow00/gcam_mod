import android.os.Parcel;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wr implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final IntentSender a;
    public final Intent b;
    public final int c;
    public final int d;
    
    static {
        CREATOR = (Parcelable$Creator)new uj(5);
    }
    
    public wr(final IntentSender a, final int c, final int d) {
        this.a = a;
        this.b = null;
        this.c = c;
        this.d = d;
    }
    
    public wr(final Parcel parcel) {
        this.a = (IntentSender)parcel.readParcelable(IntentSender.class.getClassLoader());
        this.b = (Intent)parcel.readParcelable(Intent.class.getClassLoader());
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.a, n);
        parcel.writeParcelable((Parcelable)this.b, n);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
