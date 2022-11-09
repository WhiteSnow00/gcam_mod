import java.util.Iterator;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fk extends y
{
    public static final z c;
    public final HashMap d;
    public final HashMap e;
    public final HashMap f;
    public final boolean g;
    public boolean h;
    public boolean i;
    
    static {
        c = new adq(1);
    }
    
    public fk(final boolean g) {
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
        this.h = false;
        this.i = false;
        this.g = g;
    }
    
    @Override
    public final void a() {
        if (fi.R(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
            sb.toString();
        }
        this.h = true;
    }
    
    public final void b(final String s) {
        final fk fk = this.e.get(s);
        if (fk != null) {
            fk.a();
            this.e.remove(s);
        }
        final ac ac = this.f.get(s);
        if (ac != null) {
            ac.a();
            this.f.remove(s);
        }
    }
    
    final void c(final ei ei) {
        if (this.i) {
            return;
        }
        if (this.d.remove(ei.m) != null && fi.R(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(ei);
            sb.toString();
        }
    }
    
    final boolean d(final ei ei) {
        return !this.d.containsKey(ei.m) || !this.g || this.h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final fk fk = (fk)o;
            return this.d.equals(fk.d) && this.e.equals(fk.e) && this.f.equals(fk.f);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.d.hashCode() * 31 + this.e.hashCode()) * 31 + this.f.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        final Iterator iterator = this.d.values().iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        final Iterator iterator2 = this.e.keySet().iterator();
        while (iterator2.hasNext()) {
            sb.append((String)iterator2.next());
            if (iterator2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        final Iterator iterator3 = this.f.keySet().iterator();
        while (iterator3.hasNext()) {
            sb.append((String)iterator3.next());
            if (iterator3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
