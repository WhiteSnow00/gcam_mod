// 
// Decompiled by Procyon v0.6.0
// 

public enum ntg
{
    a("STRING", 0, 's', nti.a, "-#", true), 
    b("BOOLEAN", 1, 'b', nti.b, "-", true), 
    c("CHAR", 2, 'c', nti.c, "-", true), 
    d("DECIMAL", 3, 'd', nti.d, "-0+ ,(", false), 
    e("OCTAL", 4, 'o', nti.d, "-#0(", false), 
    f("HEX", 5, 'x', nti.d, "-#0(", true), 
    g("FLOAT", 6, 'f', nti.e, "-#0+ ,(", false), 
    h("EXPONENT", 7, 'e', nti.e, "-#0+ (", true), 
    i("GENERAL", 8, 'g', nti.e, "-0+ ,(", true), 
    j("EXPONENT_HEX", 9, 'a', nti.e, "-#0+ ", true);
    
    public static final ntg[] k;
    public final char l;
    public final nti m;
    public final int n;
    public final String o;
    
    static {
        int l = 0;
        k = new ntg[26];
        for (ntg[] values = values(); l < values.length; ++l) {
            final ntg ntg11 = values[l];
            ntg.k[a(ntg11.l)] = ntg11;
        }
    }
    
    private ntg(final String s, final int n, final char l, final nti m, final String s2, final boolean b) {
        this.l = l;
        this.m = m;
        this.n = nth.a(s2, b);
        final StringBuilder sb = new StringBuilder(2);
        sb.append("%");
        sb.append(l);
        this.o = sb.toString();
    }
    
    public static int a(final char c) {
        return (c | ' ') - 97;
    }
}
