import java.util.List;
import android.text.TextUtils;
import android.os.Parcel;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

final class dl implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    final int[] a;
    final ArrayList b;
    final int[] c;
    final int[] d;
    final int e;
    final String f;
    final int g;
    final int h;
    final CharSequence i;
    final int j;
    final CharSequence k;
    final ArrayList l;
    final ArrayList m;
    final boolean n;
    
    static {
        CREATOR = (Parcelable$Creator)new dm(1);
    }
    
    public dl(final Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = (parcel.readInt() != 0);
    }
    
    public dl(final dk dk) {
        final int size = dk.d.size();
        this.a = new int[size * 6];
        if (dk.j) {
            this.b = new ArrayList(size);
            this.c = new int[size];
            this.d = new int[size];
            int i = 0;
            int n = 0;
            while (i < size) {
                final fq fq = dk.d.get(i);
                final int n2 = n + 1;
                this.a[n] = fq.a;
                final ArrayList b = this.b;
                final ei b2 = fq.b;
                String m;
                if (b2 != null) {
                    m = b2.m;
                }
                else {
                    m = null;
                }
                b.add(m);
                final int[] a = this.a;
                final int n3 = n2 + 1;
                a[n2] = (fq.c ? 1 : 0);
                final int n4 = n3 + 1;
                a[n3] = fq.d;
                final int n5 = n4 + 1;
                a[n4] = fq.e;
                final int n6 = n5 + 1;
                a[n5] = fq.f;
                a[n6] = fq.g;
                this.c[i] = fq.h.ordinal();
                this.d[i] = fq.i.ordinal();
                ++i;
                n = n6 + 1;
            }
            this.e = dk.i;
            this.f = dk.k;
            this.g = dk.c;
            this.h = dk.l;
            this.i = dk.m;
            this.j = dk.n;
            this.k = dk.o;
            this.l = dk.p;
            this.m = dk.q;
            this.n = dk.r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList((List)this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList((List)this.l);
        parcel.writeStringList((List)this.m);
        parcel.writeInt((int)(this.n ? 1 : 0));
    }
}
