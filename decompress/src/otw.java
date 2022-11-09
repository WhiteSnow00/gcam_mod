import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class otw extends otl
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public int b;
    public float c;
    public float f;
    
    static {
        CREATOR = (Parcelable$Creator)new oti(10);
    }
    
    public otw() {
    }
    
    public otw(final Parcel parcel) {
        this.a(parcel);
    }
    
    @Override
    public final void a(final Parcel parcel) {
        super.a(parcel);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readFloat();
        this.f = parcel.readFloat();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.f);
    }
}
