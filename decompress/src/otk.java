import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class otk extends otl
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public boolean b;
    
    static {
        CREATOR = (Parcelable$Creator)new oti(2);
    }
    
    public otk() {
    }
    
    public otk(final Parcel parcel) {
        this.a(parcel);
    }
    
    @Override
    public final void a(final Parcel parcel) {
        super.a(parcel);
        this.a = parcel.readInt();
        this.b = (parcel.readInt() != 0);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.a);
        parcel.writeInt((int)(this.b ? 1 : 0));
    }
}
