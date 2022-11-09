import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jr extends View$BaseSavedState
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    
    static {
        CREATOR = (Parcelable$Creator)new dm(16);
    }
    
    public jr(final Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }
    
    public jr(final Parcelable parcelable) {
        super(parcelable);
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.a);
    }
}
