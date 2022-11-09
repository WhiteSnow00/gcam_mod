import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class ch implements Serializable
{
    private static final long serialVersionUID = 1L;
    public boolean a;
    public final List b;
    
    public ch() {
        this.a = false;
        this.b = new ArrayList();
    }
    
    public final void a(final cg cg) {
        final String a = cg.a;
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            if (a.equals(((cg)iterator.next()).a)) {
                final String value = String.valueOf(a);
                String concat;
                if (value.length() != 0) {
                    concat = "Duplicate keyword: ".concat(value);
                }
                else {
                    concat = new String("Duplicate keyword: ");
                }
                throw new IllegalArgumentException(concat);
            }
        }
        this.b.add(cg);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        for (final cg cg : this.b) {
            if (sb.length() != 0) {
                sb.append(";  ");
            }
            sb.append(cg);
        }
        return sb.toString();
    }
}
