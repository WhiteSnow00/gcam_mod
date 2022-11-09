import android.os.Parcelable;
import android.os.Parcel;
import java.io.Serializable;
import java.util.Iterator;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.HashMap;
import android.os.Bundle;
import java.util.Map;
import android.net.Uri;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgl extends jwc
{
    public static final Parcelable$Creator CREATOR;
    public final Uri a;
    public byte[] b;
    private final Map c;
    
    static {
        CREATOR = (Parcelable$Creator)new kff(13);
    }
    
    public kgl(final Uri a, final Bundle bundle, final byte[] b) {
        this.a = a;
        final HashMap c = new HashMap();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (final String s : bundle.keySet()) {
            c.put(s, bundle.getParcelable(s));
        }
        this.c = c;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("DataItemParcelable[");
        sb.append("@");
        sb.append(Integer.toHexString(this.hashCode()));
        final byte[] b = this.b;
        Serializable value;
        if (b == null) {
            value = "null";
        }
        else {
            value = b.length;
        }
        final String value2 = String.valueOf(value);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 8);
        sb2.append(",dataSz=");
        sb2.append(value2);
        sb.append(sb2.toString());
        final int size = this.c.size();
        final StringBuilder sb3 = new StringBuilder(23);
        sb3.append(", numAssets=");
        sb3.append(size);
        sb.append(sb3.toString());
        final String value3 = String.valueOf(this.a);
        final StringBuilder sb4 = new StringBuilder(String.valueOf(value3).length() + 6);
        sb4.append(", uri=");
        sb4.append(value3);
        sb.append(sb4.toString());
        sb.append("]");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final int g = jwn.g(parcel);
        jwn.u(parcel, 2, (Parcelable)this.a, n);
        final Bundle bundle = new Bundle();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (final Map.Entry<String, V> entry : this.c.entrySet()) {
            bundle.putParcelable((String)entry.getKey(), (Parcelable)new DataItemAssetParcelable((kfg)entry.getValue()));
        }
        jwn.p(parcel, 4, bundle);
        jwn.q(parcel, 5, this.b);
        jwn.i(parcel, g);
    }
}
