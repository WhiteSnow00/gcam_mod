import android.os.Parcel;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class otl implements Parcelable
{
    public long d;
    public int e;
    
    public otl() {
        this.e = 0;
    }
    
    public void a(final Parcel parcel) {
        this.d = parcel.readLong();
        this.e = parcel.readInt();
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.d);
        parcel.writeInt(this.e);
    }
}
