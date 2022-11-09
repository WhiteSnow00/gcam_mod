// 
// Decompiled by Procyon v0.6.0
// 

public final class apz
{
    public final /* synthetic */ String a;
    final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ aqf d;
    
    public apz(final String a, final String b, final String c, final aqf d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final String toString() {
        final String b = this.b;
        final String c = this.c;
        final String a = this.a;
        final String value = String.valueOf(this.d);
        final StringBuilder sb = new StringBuilder(b.length() + 14 + c.length() + a.length() + String.valueOf(value).length());
        sb.append(b);
        sb.append(c);
        sb.append(" NS(");
        sb.append(a);
        sb.append("), FORM (");
        sb.append(value);
        sb.append(")");
        return sb.toString();
    }
}
