import java.util.Iterator;
import java.util.EnumMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fnc
{
    private final EnumMap a;
    
    public fnc(final Iterable iterable, final jbm jbm) {
        this.a = new EnumMap((Class<K>)jbm.class);
        for (final fnd fnd : iterable) {
            if (fnd != null) {
                final jbm a = fnd.b.a;
                njo.e(jbm.a != a, "ModuleManager: The ApplicationMode can not be UNINITIALIZED");
                if (this.a.get(a) != null) {
                    final String value = String.valueOf(a);
                    final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 42);
                    sb.append("ModuleManager: Mode ");
                    sb.append(value);
                    sb.append(" is registered already");
                    throw new IllegalArgumentException(sb.toString());
                }
                this.a.put(a, fnd);
            }
        }
        this.a.get(jbm).getClass();
    }
    
    public final fnd a(final jbm jbm) {
        final fnd fnd = this.a.get(jbm);
        fnd.getClass();
        return fnd;
    }
}
