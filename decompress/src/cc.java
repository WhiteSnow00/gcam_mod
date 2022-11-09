// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class cc
{
    @Deprecated
    public final cb a;
    @Deprecated
    public final cb b;
    
    @Deprecated
    public cc(final cb a, final cb b) {
        if (a.b == b.b) {
            this.a = a;
            this.b = b;
            return;
        }
        final String value = String.valueOf(a);
        final String value2 = String.valueOf(b);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 55 + String.valueOf(value2).length());
        sb.append("Ranges must have the same number of visible decimals: ");
        sb.append(value);
        sb.append("~");
        sb.append(value2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Deprecated
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final cb b = this.b;
        String string;
        if (b == this.a) {
            string = "";
        }
        else {
            final String value2 = String.valueOf(b);
            final StringBuilder sb = new StringBuilder(String.valueOf(value2).length() + 1);
            sb.append("~");
            sb.append(value2);
            string = sb.toString();
        }
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + String.valueOf(string).length());
        sb2.append(value);
        sb2.append(string);
        return sb2.toString();
    }
}
