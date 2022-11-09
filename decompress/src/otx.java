import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class otx extends otl
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    
    static {
        CREATOR = (Parcelable$Creator)new oti(11);
    }
    
    public otx() {
        this.a = 0;
    }
    
    public otx(final Parcel parcel) {
        this.a = 0;
        this.a(parcel);
    }
    
    @Override
    public final void a(final Parcel parcel) {
        final int dataPosition = parcel.dataPosition();
        final int int1 = parcel.readInt();
        super.a(parcel);
        this.a = parcel.readInt();
        parcel.setDataPosition(dataPosition + int1);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int dataPosition = parcel.dataPosition();
        parcel.writeInt(20);
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.a);
        if (parcel.dataPosition() - dataPosition == 20) {
            return;
        }
        throw new IllegalStateException("Parcelable implemented incorrectly, getByteSize() must return the correct size for each ControllerEvent subclass.");
    }
}
