import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rd implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public int b;
    public boolean c;
    
    static {
        CREATOR = (Parcelable$Creator)new dm(18);
    }
    
    public rd() {
    }
    
    public rd(final Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        final int int1 = parcel.readInt();
        boolean c = true;
        if (int1 != 1) {
            c = false;
        }
        this.c = c;
    }
    
    public rd(final rd rd) {
        this.a = rd.a;
        this.b = rd.b;
        this.c = rd.c;
    }
    
    public final void a() {
        this.a = -1;
    }
    
    public final boolean b() {
        return this.a >= 0;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt((int)(this.c ? 1 : 0));
    }
}
