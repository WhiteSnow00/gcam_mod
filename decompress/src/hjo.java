import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class hjo
{
    public static final Map a;
    public final String b;
    final hjn c;
    
    static {
        a = new HashMap();
    }
    
    public hjo(final String b, final hjn c) {
        this.b = b;
        this.c = c;
        this.c();
    }
    
    public hjo(final String s, final Object o) {
        this(s, new hjm(o));
    }
    
    private final void c() {
        synchronized (this) {
            final Map a = hjo.a;
            if (a.containsKey(this.b)) {
                final String b = this.b;
                String concat;
                if (b.length() != 0) {
                    concat = "Duplicate setting key for: ".concat(b);
                }
                else {
                    concat = new String("Duplicate setting key for: ");
                }
                throw new IllegalArgumentException(concat);
            }
            a.put(this.b, this);
        }
    }
    
    public abstract Object a(final String p0);
    
    public String b(final Object o) {
        return o.toString();
    }
}
