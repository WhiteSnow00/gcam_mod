import j$.util.Objects;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dlb
{
    private final String a;
    private final dlb[] b;
    
    public dlb(final String a, final dlb[] b) {
        this.a = a;
        this.b = b;
    }
    
    public static dlb b(final String s) {
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        if (Pattern.matches("feature\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+(:\\d+)?", s)) {
            return dew.b(s, list, list2);
        }
        final StringBuilder sb = new StringBuilder(s.length() + 30);
        sb.append("Feature with bad type name '");
        sb.append(s);
        sb.append("'!");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final int a() {
        final dlb[] b = this.b;
        final int length = b.length;
        int n = -1;
        int a;
        for (int i = 0; i < length; ++i, n = a) {
            final dlb dlb = b[i];
            if (dlb.a() > (a = n)) {
                a = dlb.a();
            }
        }
        return n + 1;
    }
    
    public final Set c() {
        final HashSet set = new HashSet();
        for (final dlb dlb : this.b) {
            set.add(dlb);
            set.addAll(dlb.c());
        }
        return set;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && this.a.equals(((dlb)o).a));
    }
    
    @Override
    public final int hashCode() {
        return Objects.hashCode((Object)this.a);
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
}
