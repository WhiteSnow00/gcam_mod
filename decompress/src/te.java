import java.util.Arrays;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class te implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    int b;
    int[] c;
    boolean d;
    
    static {
        CREATOR = (Parcelable$Creator)new dm(19);
    }
    
    te() {
    }
    
    public te(final Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        final int int1 = parcel.readInt();
        boolean d = true;
        if (int1 != 1) {
            d = false;
        }
        this.d = d;
        final int int2 = parcel.readInt();
        if (int2 > 0) {
            parcel.readIntArray(this.c = new int[int2]);
        }
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("FullSpanItem{mPosition=");
        sb.append(this.a);
        sb.append(", mGapDir=");
        sb.append(this.b);
        sb.append(", mHasUnwantedGapAfter=");
        sb.append(this.d);
        sb.append(", mGapPerSpan=");
        sb.append(Arrays.toString(this.c));
        sb.append('}');
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt((int)(this.d ? 1 : 0));
        final int[] c = this.c;
        if (c != null) {
            parcel.writeInt(c.length);
            parcel.writeIntArray(this.c);
            return;
        }
        parcel.writeInt(0);
    }
}
