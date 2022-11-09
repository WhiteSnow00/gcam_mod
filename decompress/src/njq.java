import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class njq implements Serializable, njp
{
    private static final long serialVersionUID = 0L;
    final njp a;
    transient volatile boolean b;
    transient Object c;
    
    public njq(final njp a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final Object a() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    final Object a = this.a.a();
                    this.c = a;
                    this.b = true;
                    return a;
                }
            }
        }
        return this.c;
    }
    
    @Override
    public final String toString() {
        Object o;
        if (this.b) {
            final String value = String.valueOf(this.c);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 25);
            sb.append("<supplier that returned ");
            sb.append(value);
            sb.append(">");
            o = sb.toString();
        }
        else {
            o = this.a;
        }
        final String value2 = String.valueOf(o);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(value2);
        sb2.append(")");
        return sb2.toString();
    }
}
