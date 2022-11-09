import java.util.HashSet;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bgq
{
    public final Set a;
    public final Set b;
    public boolean c;
    
    public bgq() {
        this.a = Collections.newSetFromMap(new WeakHashMap<Object, Boolean>());
        this.b = new HashSet();
    }
    
    public final boolean a(final bhj bhj) {
        boolean b = true;
        if (bhj == null) {
            return true;
        }
        final boolean remove = this.a.remove(bhj);
        if (!this.b.remove(bhj)) {
            if (!remove) {
                b = false;
            }
        }
        if (b) {
            bhj.c();
        }
        return b;
    }
    
    @Override
    public final String toString() {
        final String string = super.toString();
        final int size = this.a.size();
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 41);
        sb.append(string);
        sb.append("{numRequests=");
        sb.append(size);
        sb.append(", isPaused=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
