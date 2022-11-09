import j$.util.Map$_EL;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ivc
{
    final Set a;
    final Map b;
    
    public ivc(final iuk iuk) {
        final EnumSet<iuk> none = EnumSet.noneOf(iuk.class);
        this.a = none;
        this.b = new EnumMap(iuk.class);
        none.add(iuk);
    }
    
    final void a(final iva iva) {
        final iuk[] values = iuk.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            Map$_EL.putIfAbsent(this.b, (Object)values[i], (Object)iva);
        }
    }
    
    final void b(final iuk iuk, final iva iva) {
        this.b.put(iuk, iva);
    }
    
    final void c(final iuk iuk) {
        this.b(iuk, ivb.a);
    }
}
