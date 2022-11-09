import java.util.List;
import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

final class fj implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    ArrayList a;
    ArrayList b;
    ArrayList c;
    dl[] d;
    int e;
    String f;
    ArrayList g;
    ArrayList h;
    ArrayList i;
    ArrayList j;
    ArrayList k;
    
    static {
        CREATOR = (Parcelable$Creator)new dm(3);
    }
    
    public fj() {
        this.f = null;
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
    }
    
    public fj(final Parcel parcel) {
        this.f = null;
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.a = parcel.createTypedArrayList(fm.CREATOR);
        this.b = parcel.createStringArrayList();
        this.c = parcel.createStringArrayList();
        this.d = (dl[])parcel.createTypedArray(dl.CREATOR);
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.createStringArrayList();
        this.h = parcel.createTypedArrayList(dn.CREATOR);
        this.i = parcel.createStringArrayList();
        this.j = parcel.createTypedArrayList(Bundle.CREATOR);
        this.k = parcel.createTypedArrayList(ff.CREATOR);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeTypedList((List)this.a);
        parcel.writeStringList((List)this.b);
        parcel.writeStringList((List)this.c);
        parcel.writeTypedArray((Parcelable[])this.d, n);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeStringList((List)this.g);
        parcel.writeTypedList((List)this.h);
        parcel.writeStringList((List)this.i);
        parcel.writeTypedList((List)this.j);
        parcel.writeTypedList((List)this.k);
    }
}
