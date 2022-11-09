import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class plo implements pmd, pln
{
    private static final Map a;
    private static final HashMap b;
    private static final HashMap c;
    private static final HashMap d;
    private final Class e;
    
    static {
        final List s = pjf.s(new Class[] { pkn.class, pky.class, plc.class, pld.class, ple.class, plf.class, plg.class, plh.class, pli.class, plj.class, pko.class, pkp.class, pkq.class, pkr.class, pks.class, pkt.class, pku.class, pkv.class, pkw.class, pkx.class, pkz.class, pla.class, plb.class });
        final ArrayList list = new ArrayList(pjf.o(s));
        final Iterator iterator = s.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (n < 0) {
                pjf.e();
            }
            list.add((Object)pjf.w(next, n));
            ++n;
        }
        Map<Object, Object> a2 = null;
        Label_0345: {
            switch (list.size()) {
                default: {
                    final LinkedHashMap linkedHashMap = new LinkedHashMap(pjf.a(list.size()));
                    final Iterator iterator2 = list.iterator();
                    while (true) {
                        a2 = (Map<Object, Object>)linkedHashMap;
                        if (!iterator2.hasNext()) {
                            break Label_0345;
                        }
                        final pim pim = (pim)iterator2.next();
                        linkedHashMap.put(pim.a, pim.b);
                    }
                    break;
                }
                case 1: {
                    final pim pim2 = (pim)list.get(0);
                    pim2.getClass();
                    a2 = Collections.singletonMap(pim2.a, pim2.b);
                    a2.getClass();
                    break;
                }
                case 0: {
                    a2 = pjb.a;
                    break;
                }
            }
        }
        a = a2;
        final HashMap<String, String> b2 = new HashMap<String, String>();
        b2.put("boolean", "kotlin.Boolean");
        b2.put("char", "kotlin.Char");
        b2.put("byte", "kotlin.Byte");
        b2.put("short", "kotlin.Short");
        b2.put("int", "kotlin.Int");
        b2.put("float", "kotlin.Float");
        b2.put("long", "kotlin.Long");
        b2.put("double", "kotlin.Double");
        b = b2;
        final HashMap<String, String> c2 = new HashMap<String, String>();
        c2.put("java.lang.Boolean", "kotlin.Boolean");
        c2.put("java.lang.Character", "kotlin.Char");
        c2.put("java.lang.Byte", "kotlin.Byte");
        c2.put("java.lang.Short", "kotlin.Short");
        c2.put("java.lang.Integer", "kotlin.Int");
        c2.put("java.lang.Float", "kotlin.Float");
        c2.put("java.lang.Long", "kotlin.Long");
        c2.put("java.lang.Double", "kotlin.Double");
        c = c2;
        final HashMap d2 = new HashMap();
        d2.put("java.lang.Object", "kotlin.Any");
        d2.put("java.lang.String", "kotlin.String");
        d2.put("java.lang.CharSequence", "kotlin.CharSequence");
        d2.put("java.lang.Throwable", "kotlin.Throwable");
        d2.put("java.lang.Cloneable", "kotlin.Cloneable");
        d2.put("java.lang.Number", "kotlin.Number");
        d2.put("java.lang.Comparable", "kotlin.Comparable");
        d2.put("java.lang.Enum", "kotlin.Enum");
        d2.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        d2.put("java.lang.Iterable", "kotlin.collections.Iterable");
        d2.put("java.util.Iterator", "kotlin.collections.Iterator");
        d2.put("java.util.Collection", "kotlin.collections.Collection");
        d2.put("java.util.List", "kotlin.collections.List");
        d2.put("java.util.Set", "kotlin.collections.Set");
        d2.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        d2.put("java.util.Map", "kotlin.collections.Map");
        d2.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        d2.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        d2.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        d2.putAll(b2);
        d2.putAll(c2);
        final Collection<String> values = b2.values();
        values.getClass();
        for (final String s2 : values) {
            final StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            s2.getClass();
            sb.append(plr.t(s2));
            sb.append("CompanionObject");
            final String string = sb.toString();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s2);
            sb2.append(".Companion");
            final pim w = pjf.w(string, sb2.toString());
            d2.put(w.a, w.b);
        }
        for (final Map.Entry<Class, V> entry : plo.a.entrySet()) {
            final Class clazz = entry.getKey();
            final int intValue = ((Number)entry.getValue()).intValue();
            final String name = clazz.getName();
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("kotlin.Function");
            sb3.append(intValue);
            d2.put(name, sb3.toString());
        }
        d = d2;
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap(pjf.a(d2.size()));
        for (final Map.Entry<Object, V> entry2 : d2.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), (Object)plr.t((String)entry2.getValue()));
        }
    }
    
    public plo(final Class e) {
        e.getClass();
        this.e = e;
    }
    
    @Override
    public final Class a() {
        return this.e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof plo && plr.b(plr.f(this), plr.f((pmd)o));
    }
    
    @Override
    public final int hashCode() {
        return plr.f(this).hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.e.toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
