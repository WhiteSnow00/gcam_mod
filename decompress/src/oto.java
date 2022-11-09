import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oto extends otl
{
    public static final Parcelable$Creator CREATOR;
    public float a;
    public float b;
    public float c;
    
    static {
        CREATOR = (Parcelable$Creator)new oti(5);
    }
    
    public oto() {
    }
    
    public oto(final Parcel parcel) {
        this.a(parcel);
    }
    
    @Override
    public final void a(final Parcel parcel) {
        super.a(parcel);
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
    }
}
