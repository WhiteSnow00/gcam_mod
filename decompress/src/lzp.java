// 
// Decompiled by Procyon v0.6.0
// 

public final class lzp
{
    public static final mdm a;
    public static final mdm b;
    public final int c;
    
    static {
        a = mdm.a(33321, 36756, 33325, 33326, 33330, 33329, 33332, 33331, 33334, 33333, 33323, 36757, 33327, 33328, 33336, 33335, 33338, 33337, 33340, 33339, 32849, 35905, 36194, 36758, 35898, 35901, 34843, 34837, 36221, 36239, 36215, 36233, 36209, 36227, 32856, 35907, 36759, 32855, 32854, 32857, 34842, 34836, 36220, 36238, 36975, 36214, 36232, 36226, 36208);
        mdm.a(33321, 33330, 33329, 33332, 33331, 33334, 33333, 33323, 33336, 33335, 33338, 33337, 33340, 33339, 32849, 36194, 32856, 35907, 32855, 32854, 32857, 36220, 36238, 36975, 36214, 36232, 36226, 36208);
        b = mdm.a(33321, 36756, 33325, 33323, 36757, 33327, 32849, 35905, 36194, 36758, 35898, 35901, 34843, 32856, 35907, 36759, 32855, 32854, 32857, 34842);
    }
    
    private lzp() {
        final boolean b = lzp.a.b();
        final StringBuilder sb = new StringBuilder(40);
        sb.append("Not a valid GL sized format: ");
        sb.append(32856);
        njo.e(b, sb.toString());
        this.c = 32856;
    }
    
    public static lzp a() {
        return new lzp();
    }
    
    public static final boolean b() {
        return lzp.b.b();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lzp)) {
            return false;
        }
        final int c = ((lzp)o).c;
        return true;
    }
    
    @Override
    public final int hashCode() {
        return 32856;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(21);
        sb.append("GLFormat[");
        sb.append(32856);
        sb.append("]");
        return sb.toString();
    }
}
