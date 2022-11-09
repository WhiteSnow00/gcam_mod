import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pn extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    boolean a;
    
    static {
        CREATOR = (Parcelable$Creator)new dm(17);
    }
    
    public pn(final Parcel parcel) {
        super(parcel);
        this.a = (parcel.readByte() != 0);
    }
    
    public pn(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeByte((byte)(byte)(this.a ? 1 : 0));
    }
}
