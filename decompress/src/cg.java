import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class cg implements Serializable
{
    private static final long serialVersionUID = 1L;
    public final String a;
    public final ca b;
    public final cd c;
    public final cd d;
    
    public cg(final String a, final ca b, final cd c, final cd d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Deprecated
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String string = this.b.toString();
        final cd c = this.c;
        String concat = "";
        String concat2;
        if (c == null) {
            concat2 = "";
        }
        else {
            final String value = String.valueOf(c.toString());
            if (value.length() != 0) {
                concat2 = " ".concat(value);
            }
            else {
                concat2 = new String(" ");
            }
        }
        final cd d = this.d;
        if (d != null) {
            final String value2 = String.valueOf(d.toString());
            if (value2.length() != 0) {
                concat = " ".concat(value2);
            }
            else {
                concat = new String(" ");
            }
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2 + String.valueOf(string).length() + String.valueOf(concat2).length() + String.valueOf(concat).length());
        sb.append(a);
        sb.append(": ");
        sb.append(string);
        sb.append(concat2);
        sb.append(concat);
        return sb.toString();
    }
}
