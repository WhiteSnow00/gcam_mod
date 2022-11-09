import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nck extends abm
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    float b;
    boolean e;
    
    static {
        CREATOR = (Parcelable$Creator)new nde(1);
    }
    
    public nck(final Parcel parcel, final ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.b = parcel.readFloat();
        this.e = (parcel.readByte() != 0);
    }
    
    public nck(final Parcelable parcelable) {
        super(parcelable);
    }
    
    @Override
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
        parcel.writeByte((byte)(byte)(this.e ? 1 : 0));
    }
}
