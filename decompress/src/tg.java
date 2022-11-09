import android.os.Parcel;
import java.util.List;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tg implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    public int a;
    public int b;
    public int c;
    public int[] d;
    public int e;
    public int[] f;
    public List g;
    public boolean h;
    public boolean i;
    public boolean j;
    
    static {
        CREATOR = (Parcelable$Creator)new dm(20);
    }
    
    public tg() {
    }
    
    public tg(final Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        final int int1 = parcel.readInt();
        this.c = int1;
        if (int1 > 0) {
            parcel.readIntArray(this.d = new int[int1]);
        }
        final int int2 = parcel.readInt();
        if ((this.e = int2) > 0) {
            parcel.readIntArray(this.f = new int[int2]);
        }
        final int int3 = parcel.readInt();
        final boolean b = false;
        this.h = (int3 == 1);
        this.i = (parcel.readInt() == 1);
        this.j = (parcel.readInt() == 1 || b);
        this.g = parcel.readArrayList(te.class.getClassLoader());
    }
    
    public tg(final tg tg) {
        this.c = tg.c;
        this.a = tg.a;
        this.b = tg.b;
        this.d = tg.d;
        this.e = tg.e;
        this.f = tg.f;
        this.h = tg.h;
        this.i = tg.i;
        this.j = tg.j;
        this.g = tg.g;
    }
    
    public final void a() {
        this.d = null;
        this.c = 0;
        this.a = -1;
        this.b = -1;
    }
    
    public final void b() {
        this.d = null;
        this.c = 0;
        this.e = 0;
        this.f = null;
        this.g = null;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        if (this.c > 0) {
            parcel.writeIntArray(this.d);
        }
        parcel.writeInt(this.e);
        if (this.e > 0) {
            parcel.writeIntArray(this.f);
        }
        parcel.writeInt((int)(this.h ? 1 : 0));
        parcel.writeInt((int)(this.i ? 1 : 0));
        parcel.writeInt((int)(this.j ? 1 : 0));
        parcel.writeList(this.g);
    }
}
