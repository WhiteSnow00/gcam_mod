import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class blu
{
    public final nns a;
    public final nns b;
    public final int c;
    public final int d;
    
    public blu() {
    }
    
    public blu(final nns a, final nns b, final int c, final int d) {
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
        if (o instanceof blu) {
            final blu blu = (blu)o;
            if (nqb.t(this.a, blu.a) && nqb.t(this.b, blu.b)) {
                final int c = this.c;
                final int c2 = blu.c;
                if (c == 0) {
                    throw null;
                }
                if (c == c2) {
                    final int d = this.d;
                    final int d2 = blu.d;
                    if (d == 0) {
                        throw null;
                    }
                    if (d == d2) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final int c = this.c;
        if (c == 0) {
            throw null;
        }
        final int d = this.d;
        if (d != 0) {
            return (((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ c) * 1000003 ^ d;
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final int c = this.c;
        String string = "null";
        String string2;
        if (c != 0) {
            string2 = Integer.toString(c - 1);
        }
        else {
            string2 = "null";
        }
        final int d = this.d;
        if (d != 0) {
            string = Integer.toString(d - 1);
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 90 + String.valueOf(value2).length() + String.valueOf(string2).length() + String.valueOf(string).length());
        sb.append("Stats3AData{dataFieldsFloat=");
        sb.append(value);
        sb.append(", dataFieldsInteger=");
        sb.append(value2);
        sb.append(", cameraPosition=");
        sb.append(string2);
        sb.append(", cameraApplicationMode=");
        sb.append(string);
        sb.append("}");
        return sb.toString();
    }
}
