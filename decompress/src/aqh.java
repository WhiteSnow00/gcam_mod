// 
// Decompiled by Procyon v0.6.0
// 

public abstract class aqh
{
    public int a;
    
    public aqh() {
        this.a = 0;
    }
    
    public aqh(final int n) {
        this.a = 0;
        this.b(n);
        this.g(n);
    }
    
    private final void b(final int n) {
        final int n2 = ~this.a() & n;
        if (n2 == 0) {
            this.e(n);
            return;
        }
        final String hexString = Integer.toHexString(n2);
        final StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 33);
        sb.append("The option bit(s) 0x");
        sb.append(hexString);
        sb.append(" are invalid!");
        throw new ape(sb.toString(), 103);
    }
    
    protected abstract int a();
    
    protected void e(final int n) {
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this.a == ((aqh)o).a;
    }
    
    public final void f(int a, final boolean b) {
        if (b) {
            a |= this.a;
        }
        else {
            a = (~a & this.a);
        }
        this.a = a;
    }
    
    public final void g(final int a) {
        this.b(a);
        this.a = a;
    }
    
    public final boolean h(final int n) {
        return (n & this.a) != 0x0;
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(Integer.toHexString(this.a));
        String concat;
        if (value.length() != 0) {
            concat = "0x".concat(value);
        }
        else {
            concat = new String("0x");
        }
        return concat;
    }
}
