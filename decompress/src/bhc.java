import java.util.Collection;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bhc
{
    private final List a;
    private final Map b;
    
    public bhc() {
        this.a = new ArrayList();
        this.b = new HashMap();
    }
    
    private final List e(final String s) {
        synchronized (this) {
            if (!this.a.contains(s)) {
                this.a.add(s);
            }
            List list;
            if ((list = this.b.get(s)) == null) {
                list = new ArrayList();
                this.b.put(s, list);
            }
            return list;
        }
    }
    
    public final List a(final Class clazz, final Class clazz2) {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList();
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                final List list2 = this.b.get(iterator.next());
                if (list2 != null) {
                    for (final bhb bhb : list2) {
                        if (bhb.a(clazz, clazz2)) {
                            list.add(bhb.b);
                        }
                    }
                }
            }
            monitorexit(this);
            return list;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final List b(final Class clazz, final Class clazz2) {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList();
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                final List list2 = this.b.get(iterator.next());
                if (list2 != null) {
                    for (final bhb bhb : list2) {
                        if (bhb.a(clazz, clazz2) && !list.contains(bhb.a)) {
                            list.add(bhb.a);
                        }
                    }
                }
            }
            monitorexit(this);
            return list;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final void c(final String s, final awi awi, final Class clazz, final Class clazz2) {
        synchronized (this) {
            this.e(s).add(new bhb(clazz, clazz2, awi));
        }
    }
    
    public final void d(final List list) {
        monitorenter(this);
        try {
            final ArrayList list2 = new ArrayList(this.a);
            this.a.clear();
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                this.a.add(iterator.next());
            }
            for (int size = list2.size(), i = 0; i < size; ++i) {
                final String s = (String)list2.get(i);
                if (!list.contains(s)) {
                    this.a.add(s);
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
