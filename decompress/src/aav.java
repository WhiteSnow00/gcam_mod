import android.util.Base64;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aav
{
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    
    public aav(final String a, final String b, final String c, final List d) {
        this.a = a;
        this.b = b;
        this.c = c;
        hh.d(d);
        this.d = d;
        final StringBuilder sb = new StringBuilder(a);
        sb.append("-");
        sb.append(b);
        sb.append("-");
        sb.append(c);
        this.e = sb.toString();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: ");
        sb2.append(this.a);
        sb2.append(", mProviderPackage: ");
        sb2.append(this.b);
        sb2.append(", mQuery: ");
        sb2.append(this.c);
        sb2.append(", mCertificates:");
        sb.append(sb2.toString());
        for (int i = 0; i < this.d.size(); ++i) {
            sb.append(" [");
            final List list = this.d.get(i);
            for (int j = 0; j < list.size(); ++j) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[])list.get(j), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}mCertificatesArray: 0");
        return sb.toString();
    }
}
