import java.io.Serializable;
import android.net.Uri;
import java.util.HashMap;
import com.google.android.gms.common.data.DataHolder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kgm extends juc
{
    private final int d;
    
    public kgm(final DataHolder dataHolder, final int n, final int d) {
        super(dataHolder, n);
        this.d = d;
    }
    
    @Override
    public final String toString() {
        final DataHolder a = super.a;
        final int b = super.b;
        final int c = super.c;
        a.c("data", b);
        final byte[] blob = a.d[c].getBlob(b, a.c.getInt("data"));
        final HashMap hashMap = new HashMap(this.d);
        for (int i = 0; i < this.d; ++i) {
            final juc juc = new juc(this.a, this.b + i);
            if (juc.c() != null) {
                hashMap.put(juc.c(), juc);
            }
        }
        final StringBuilder sb = new StringBuilder("DataItemRef{ ");
        final String value = String.valueOf(Uri.parse(this.a("path")));
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 4);
        sb2.append("uri=");
        sb2.append(value);
        sb.append(sb2.toString());
        Serializable value2;
        if (blob == null) {
            value2 = "null";
        }
        else {
            value2 = blob.length;
        }
        final String value3 = String.valueOf(value2);
        final StringBuilder sb3 = new StringBuilder(String.valueOf(value3).length() + 9);
        sb3.append(", dataSz=");
        sb3.append(value3);
        sb.append(sb3.toString());
        final int size = hashMap.size();
        final StringBuilder sb4 = new StringBuilder(23);
        sb4.append(", numAssets=");
        sb4.append(size);
        sb.append(sb4.toString());
        sb.append(" }");
        return sb.toString();
    }
}
