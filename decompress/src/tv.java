import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tv extends abm
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public boolean b;
    
    static {
        CREATOR = (Parcelable$Creator)new tu();
    }
    
    public tv(final Parcel parcel, final ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.b = (parcel.readInt() != 0);
    }
    
    public tv(final Parcelable parcelable) {
        super(parcelable);
    }
    
    @Override
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.a);
        parcel.writeInt((int)(this.b ? 1 : 0));
    }
}
