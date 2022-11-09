// 
// Decompiled by Procyon v0.6.0
// 

public final class kmz
{
    public final kmr a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    
    public kmz(final kmr a, final int b, final int c, final int d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final int c = this.c;
        final int d = this.d;
        final int b = this.b;
        final int e = this.e;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 112);
        sb.append("encoder=");
        sb.append(value);
        sb.append(", sampling rate=");
        sb.append(c);
        sb.append(", capture sample rate=");
        sb.append(d);
        sb.append(", bit rate=");
        sb.append(b);
        sb.append(", channels=");
        sb.append(e);
        return sb.toString();
    }
}
