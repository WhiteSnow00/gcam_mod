import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

final class fm implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    final String a;
    final String b;
    final boolean c;
    final int d;
    final int e;
    final String f;
    final boolean g;
    final boolean h;
    final boolean i;
    final Bundle j;
    final boolean k;
    final int l;
    Bundle m;
    
    static {
        CREATOR = (Parcelable$Creator)new dm(4);
    }
    
    public fm(final Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        final int int1 = parcel.readInt();
        final boolean b = true;
        this.c = (int1 != 0);
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = (parcel.readInt() != 0);
        this.h = (parcel.readInt() != 0);
        this.i = (parcel.readInt() != 0);
        this.j = parcel.readBundle();
        this.k = (parcel.readInt() != 0 && b);
        this.m = parcel.readBundle();
        this.l = parcel.readInt();
    }
    
    public fm(final ei ei) {
        this.a = ei.getClass().getName();
        this.b = ei.m;
        this.c = ei.v;
        this.d = ei.E;
        this.e = ei.F;
        this.f = ei.G;
        this.g = ei.J;
        this.h = ei.t;
        this.i = ei.I;
        this.j = ei.n;
        this.k = ei.H;
        this.l = ei.W.ordinal();
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.a);
        sb.append(" (");
        sb.append(this.b);
        sb.append(")}:");
        if (this.c) {
            sb.append(" fromLayout");
        }
        if (this.e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.e));
        }
        final String f = this.f;
        if (f != null && !f.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f);
        }
        if (this.g) {
            sb.append(" retainInstance");
        }
        if (this.h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt((int)(this.c ? 1 : 0));
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt((int)(this.g ? 1 : 0));
        parcel.writeInt((int)(this.h ? 1 : 0));
        parcel.writeInt((int)(this.i ? 1 : 0));
        parcel.writeBundle(this.j);
        parcel.writeInt((int)(this.k ? 1 : 0));
        parcel.writeBundle(this.m);
        parcel.writeInt(this.l);
    }
}
