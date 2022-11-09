import java.util.Arrays;
import android.os.Parcel;
import android.os.Parcelable;

// 
// Decompiled by Procyon v0.6.0
// 

public class otb implements Parcelable
{
    public byte[] a;
    
    public otb() {
        this.a = null;
    }
    
    protected otb(final Parcel parcel) {
        this.a = null;
        this.a = parcel.createByteArray();
    }
    
    public final void a(final omj omj) {
        if (omj != null) {
            final oky oky = (oky)omj;
            int ab;
            if ((ab = oky.aB) == -1) {
                ab = omr.a.b(omj).a(omj);
                oky.aB = ab;
            }
            if (ab != 0) {
                this.a = omj.g();
                return;
            }
        }
        this.a = null;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = false;
        if (o != this) {
            if (!(o instanceof otb)) {
                return b;
            }
            if (!Arrays.equals(((otb)o).a, this.a)) {
                return false;
            }
        }
        b = true;
        return b;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        final byte[] a = this.a;
        int length;
        if (a == null) {
            length = 0;
        }
        else {
            length = a.length;
        }
        final StringBuilder sb = new StringBuilder(38);
        sb.append("ParcelableProtoLite[");
        sb.append(length);
        sb.append(" bytes]");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeByteArray(this.a);
    }
}
