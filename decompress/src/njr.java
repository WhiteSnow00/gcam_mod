// 
// Decompiled by Procyon v0.6.0
// 

public final class njr implements njp
{
    volatile njp a;
    volatile boolean b;
    Object c;
    
    public njr(final njp a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final Object a() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    final njp a = this.a;
                    a.getClass();
                    final Object a2 = a.a();
                    this.c = a2;
                    this.b = true;
                    this.a = null;
                    return a2;
                }
            }
        }
        return this.c;
    }
    
    @Override
    public final String toString() {
        Object o = this.a;
        if (o == null) {
            final String value = String.valueOf(this.c);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(value);
            sb.append(">");
            o = sb.toString();
        }
        final String value2 = String.valueOf(o);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(value2);
        sb2.append(")");
        return sb2.toString();
    }
}
