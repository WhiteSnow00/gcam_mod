import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lne
{
    public final Context a;
    public final niz b;
    public final niz c;
    public final boolean d;
    
    public lne() {
    }
    
    public lne(final Context a, final niz b, final niz c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof lne) {
            final lne lne = (lne)o;
            if (this.a.equals(lne.a) && this.b.equals(lne.b) && this.c.equals(lne.c) && this.d == lne.d) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.c.hashCode();
        int n;
        if (!this.d) {
            n = 1237;
        }
        else {
            n = 1231;
        }
        return (((hashCode ^ 0xF4243) * 1000003 ^ 0x79A31AAC) * 1000003 ^ hashCode2) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final boolean d = this.d;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 92 + String.valueOf(value2).length() + String.valueOf(value3).length());
        sb.append("CollectionBasisContext{context=");
        sb.append(value);
        sb.append(", accountNames=");
        sb.append(value2);
        sb.append(", stacktrace=");
        sb.append(value3);
        sb.append(", googlerOverridesCheckbox=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
