// 
// Decompiled by Procyon v0.6.0
// 

public final class awf
{
    private static final awe e;
    public final Object a;
    public final awe b;
    public final String c;
    public volatile byte[] d;
    
    static {
        e = new awd();
    }
    
    private awf(final String c, final Object a, final awe b) {
        bit.c(c);
        this.c = c;
        this.a = a;
        bit.a(b);
        this.b = b;
    }
    
    public static awf a(final String s, final Object o, final awe awe) {
        return new awf(s, o, awe);
    }
    
    public static awf b(final String s) {
        return new awf(s, null, awf.e);
    }
    
    public static awf c(final String s, final Object o) {
        return new awf(s, o, awf.e);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof awf && this.c.equals(((awf)o).c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String c = this.c;
        final StringBuilder sb = new StringBuilder(c.length() + 14);
        sb.append("Option{key='");
        sb.append(c);
        sb.append("'}");
        return sb.toString();
    }
}
