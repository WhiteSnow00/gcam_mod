import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class neh extends abm
{
    public static final Parcelable$Creator CREATOR;
    public boolean a;
    
    static {
        CREATOR = (Parcelable$Creator)new nde(3);
    }
    
    public neh(final Parcel parcel, final ClassLoader classLoader) {
        super(parcel, classLoader);
        final int int1 = parcel.readInt();
        boolean a = true;
        if (int1 != 1) {
            a = false;
        }
        this.a = a;
    }
    
    public neh(final Parcelable parcelable) {
        super(parcelable);
    }
    
    @Override
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt((int)(this.a ? 1 : 0));
    }
}
