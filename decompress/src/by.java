// 
// Decompiled by Procyon v0.6.0
// 

final class by extends bz
{
    private static final long serialVersionUID = 7766999779862263523L;
    
    public by(final ca ca, final ca ca2) {
        super(ca, ca2);
    }
    
    @Override
    public final boolean a(final cb cb) {
        return this.a.a(cb) && this.b.a(cb);
    }
    
    @Override
    public final String toString() {
        final String string = this.a.toString();
        final String string2 = this.b.toString();
        final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 5 + String.valueOf(string2).length());
        sb.append(string);
        sb.append(" and ");
        sb.append(string2);
        return sb.toString();
    }
}
