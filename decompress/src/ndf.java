import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.os.Parcelable;
import android.os.Parcel;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ndf extends abm
{
    public static final Parcelable$Creator CREATOR;
    public final int a;
    public final int b;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    
    static {
        CREATOR = (Parcelable$Creator)new nde();
    }
    
    public ndf(final Parcel parcel, final ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        final int int1 = parcel.readInt();
        final boolean b = false;
        this.e = (int1 == 1);
        this.f = (parcel.readInt() == 1);
        boolean g = b;
        if (parcel.readInt() == 1) {
            g = true;
        }
        this.g = g;
    }
    
    public ndf(final Parcelable parcelable, final BottomSheetBehavior bottomSheetBehavior) {
        super(parcelable);
        this.a = bottomSheetBehavior.s;
        this.b = bottomSheetBehavior.b;
        this.e = bottomSheetBehavior.a;
        this.f = bottomSheetBehavior.p;
        this.g = bottomSheetBehavior.q;
    }
    
    @Override
    public final void writeToParcel(final Parcel parcel, final int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt((int)(this.e ? 1 : 0));
        parcel.writeInt((int)(this.f ? 1 : 0));
        parcel.writeInt((int)(this.g ? 1 : 0));
    }
}
