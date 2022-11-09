import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahb extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public int b;
    public Parcelable c;
    
    static {
        CREATOR = (Parcelable$Creator)new tu(5);
    }
    
    public ahb(final Parcel parcel, final ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readParcelable(classLoader);
    }
    
    public ahb(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeParcelable(this.c, n);
    }
}
