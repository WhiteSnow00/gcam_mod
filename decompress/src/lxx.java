// 
// Decompiled by Procyon v0.6.0
// 

public class lxx
{
    public final lvk a;
    public final lxj[] b;
    public final lxk c;
    private final int d;
    
    public lxx(final lxk lxk, final lvk lvk) {
        this(lxk, lvk, lvk.b() * 32);
    }
    
    protected lxx(final lxk c, final lvk a, final int d) {
        final int b = a.b();
        int i = 0;
        njo.e(d >= b * 32, "row stride that is shorter than row data size");
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = new lxj[4];
        while (i < 4) {
            this.b[i] = new lxj(this.c, i * 8, new int[] { 32, d });
            ++i;
        }
    }
    
    public lxx a(final lvl lvl) {
        return new lxx(this.c, lvl.c());
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lxx)) {
            return false;
        }
        final lxx lxx = (lxx)o;
        final lxj[] b = lxx.b;
        return this.d == lxx.d && this.a.equals(lxx.a) && this.c.equals(lxx.c);
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() * 31 + 4) * 31 + this.d) * 31 + this.c.hashCode();
    }
    
    @Override
    public String toString() {
        final String value = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 4);
        sb.append("RGBA");
        sb.append(value);
        return sb.toString();
    }
}
