import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iog
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final nns d;
    
    public iog() {
    }
    
    public iog(final boolean a, final boolean b, final boolean c, final nns d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static iof a() {
        final iof iof = new iof();
        iof.b(false);
        iof.c(false);
        iof.d(false);
        iof.e(nns.l());
        return iof;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof iog) {
            final iog iog = (iog)o;
            if (this.a == iog.a && this.b == iog.b && this.c == iog.c && nqb.t(this.d, iog.d)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final boolean a = this.a;
        int n = 1237;
        int n2;
        if (!a) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        int n3;
        if (!this.b) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        if (this.c) {
            n = 1231;
        }
        return (((n2 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ n) * 1000003 ^ this.d.hashCode();
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final boolean b = this.b;
        final boolean c = this.c;
        final String value = String.valueOf(this.d);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 148);
        sb.append("LensPostCaptureFeatureCapability{supportDocumentScanning=");
        sb.append(a);
        sb.append(", supportTextFilterIntent=");
        sb.append(b);
        sb.append(", supportTranslate=");
        sb.append(c);
        sb.append(", supportedTranslateLanguages=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
