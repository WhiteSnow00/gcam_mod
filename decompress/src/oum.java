// 
// Decompiled by Procyon v0.6.0
// 

public final class oum implements pii, oui
{
    private static final Object a;
    private volatile pii b;
    private volatile Object c;
    
    static {
        a = new Object();
    }
    
    private oum(final pii b) {
        this.c = oum.a;
        this.b = b;
    }
    
    public static oui a(final pii pii) {
        if (pii instanceof oui) {
            return (oui)pii;
        }
        pii.getClass();
        return new oum(pii);
    }
    
    public static pii b(final pii pii) {
        pii.getClass();
        if (pii instanceof oum) {
            return pii;
        }
        return new oum(pii);
    }
    
    public static void c(final Object o, final Object o2) {
        if (o != oum.a && !(o instanceof ouq) && o != o2) {
            final String value = String.valueOf(o);
            final String value2 = String.valueOf(o2);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 118 + String.valueOf(value2).length());
            sb.append("Scoped provider was invoked recursively returning different results: ");
            sb.append(value);
            sb.append(" & ");
            sb.append(value2);
            sb.append(". This is likely due to a circular dependency.");
            throw new IllegalStateException(sb.toString());
        }
    }
    
    @Override
    public final Object get() {
        final Object c = this.c;
        final Object a = oum.a;
        final Object o = c;
        if (c == a) {
            synchronized (this) {
                if (this.c == a) {
                    final Object value = this.b.get();
                    c(this.c, value);
                    this.c = value;
                    this.b = null;
                }
            }
        }
        return o;
    }
}
