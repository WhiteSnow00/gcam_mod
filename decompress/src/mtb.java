import java.util.List;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mtb
{
    public final Uri a;
    public final omj b;
    public final msu c;
    public final nns d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final mte h;
    
    public mtb() {
    }
    
    public mtb(final Uri a, final omj b, final msu c, final nns d, final mte h, final boolean e, final boolean f, final boolean g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static mta a() {
        final mta mta = new mta();
        mta.c = mte.a;
        mta.c(mtz.a);
        mta.b = false;
        mta.b();
        mta.a = true;
        return mta;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof mtb) {
            final mtb mtb = (mtb)o;
            if (this.a.equals((Object)mtb.a) && this.b.equals(mtb.b) && this.c.equals(mtb.c) && nqb.t(this.d, mtb.d) && this.h.equals(mtb.h) && this.e == mtb.e && this.f == mtb.f && this.g == mtb.g) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final int hashCode3 = this.c.hashCode();
        final int hashCode4 = this.d.hashCode();
        final int hashCode5 = this.h.hashCode();
        final boolean e = this.e;
        int n = 1237;
        int n2;
        if (!e) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        int n3;
        if (!this.f) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        if (this.g) {
            n = 1231;
        }
        return (((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ n2) * 1000003 ^ n3) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final String value5 = String.valueOf(this.h);
        final boolean e = this.e;
        final boolean f = this.f;
        final boolean g = this.g;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 162 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length() + String.valueOf(value5).length());
        sb.append("ProtoDataStoreConfig{uri=");
        sb.append(value);
        sb.append(", schema=");
        sb.append(value2);
        sb.append(", handler=");
        sb.append(value3);
        sb.append(", migrations=");
        sb.append(value4);
        sb.append(", variantConfig=");
        sb.append(value5);
        sb.append(", useGeneratedExtensionRegistry=");
        sb.append(e);
        sb.append(", updateSequencingBugFix=");
        sb.append(f);
        sb.append(", enableTracing=");
        sb.append(g);
        sb.append("}");
        return sb.toString();
    }
}
