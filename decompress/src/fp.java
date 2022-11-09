import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class fp
{
    public final ArrayList a;
    public final HashMap b;
    public final HashMap c;
    public fk d;
    
    public fp() {
        this.a = new ArrayList();
        this.b = new HashMap();
        this.c = new HashMap();
    }
    
    final ei a(final String s) {
        final fo fo = this.b.get(s);
        if (fo != null) {
            return fo.c;
        }
        return null;
    }
    
    final ei b(final String s) {
        for (final fo fo : this.b.values()) {
            if (fo != null) {
                ei ei2;
                final ei ei = ei2 = fo.c;
                if (!s.equals(ei.m)) {
                    ei2 = ei.C.a.b(s);
                }
                if (ei2 != null) {
                    return ei2;
                }
                continue;
            }
        }
        return null;
    }
    
    final fm c(final String s, final fm fm) {
        if (fm != null) {
            return this.c.put(s, fm);
        }
        return this.c.remove(s);
    }
    
    final fo d(final String s) {
        return this.b.get(s);
    }
    
    final List e() {
        final ArrayList list = new ArrayList();
        for (final fo fo : this.b.values()) {
            if (fo != null) {
                list.add(fo);
            }
        }
        return list;
    }
    
    final List f() {
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            return new ArrayList(this.a);
        }
    }
    
    final void g(final ei ei) {
        if (!this.a.contains(ei)) {
            synchronized (this.a) {
                this.a.add(ei);
                monitorexit(this.a);
                ei.s = true;
                return;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Fragment already added: ");
        sb.append(ei);
        throw new IllegalStateException(sb.toString());
    }
    
    final void h() {
        this.b.values().removeAll(Collections.singleton((Object)null));
    }
    
    final void i(final fo fo) {
        final ei c = fo.c;
        if (this.l(c.m)) {
            return;
        }
        this.b.put(c.m, fo);
        final boolean k = c.K;
        if (fi.R(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Added fragment to active set ");
            sb.append(c);
            sb.toString();
        }
    }
    
    final void j(final fo fo) {
        final ei c = fo.c;
        if (c.J) {
            this.d.c(c);
        }
        if (this.b.put(c.m, null) == null) {
            return;
        }
        if (fi.R(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Removed fragment from active set ");
            sb.append(c);
            sb.toString();
        }
    }
    
    final void k(final ei ei) {
        synchronized (this.a) {
            this.a.remove(ei);
            monitorexit(this.a);
            ei.s = false;
        }
    }
    
    final boolean l(final String s) {
        return this.b.get(s) != null;
    }
}
