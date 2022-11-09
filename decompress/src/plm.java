import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public class plm implements Serializable, plq
{
    public static final Object b;
    private final Class a;
    protected final Object c;
    public final String d;
    public final String e;
    private final int f;
    private final int g;
    private transient plm h;
    
    static {
        b = pll.a;
    }
    
    public plm(final int f, final Class a, final String d, final String e) {
        final Object b = plm.b;
        this.c = b;
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = 0;
    }
    
    public final pme b() {
        return plu.b(this.a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof plm) {
            final plm plm = (plm)o;
            if (plr.b(this.b(), plm.b()) && this.d.equals(plm.d) && this.e.equals(plm.e)) {
                final int g = plm.g;
                if (this.f == plm.f && plr.b(this.c, plm.c)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        this.b();
        return (this.b().hashCode() * 31 + this.d.hashCode()) * 31 + this.e.hashCode();
    }
    
    @Override
    public final int i() {
        return this.f;
    }
    
    @Override
    public final String toString() {
        plm h;
        if ((h = this.h) == null) {
            final int a = plu.a;
            this.h = this;
            h = this;
        }
        if (h != this) {
            return h.toString();
        }
        String string;
        if ("<init>".equals(this.d)) {
            string = "constructor (Kotlin reflection is not available)";
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append("function ");
            sb.append(this.d);
            sb.append(" (Kotlin reflection is not available)");
            string = sb.toString();
        }
        return string;
    }
}
