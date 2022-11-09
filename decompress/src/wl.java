import android.os.Parcel;
import android.content.Intent;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wl implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final Intent b;
    
    static {
        CREATOR = (Parcelable$Creator)new aga(1);
    }
    
    public wl(final int a, final Intent b) {
        this.a = a;
        this.b = b;
    }
    
    public wl(final Parcel parcel) {
        this.a = parcel.readInt();
        Intent b;
        if (parcel.readInt() == 0) {
            b = null;
        }
        else {
            b = (Intent)Intent.CREATOR.createFromParcel(parcel);
        }
        this.b = b;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ActivityResult{resultCode=");
        final int a = this.a;
        String value = null;
        switch (a) {
            default: {
                value = String.valueOf(a);
                break;
            }
            case 0: {
                value = "RESULT_CANCELED";
                break;
            }
            case -1: {
                value = "RESULT_OK";
                break;
            }
        }
        sb.append(value);
        sb.append(", data=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        int n2;
        if (this.b == null) {
            n2 = 0;
        }
        else {
            n2 = 1;
        }
        parcel.writeInt(n2);
        final Intent b = this.b;
        if (b != null) {
            b.writeToParcel(parcel, n);
        }
    }
}
