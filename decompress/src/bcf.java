import java.util.Iterator;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bcf
{
    private static final bbw a;
    private final List b;
    private final Set c;
    private final hp d;
    
    static {
        a = new bcd();
    }
    
    public bcf(final hp d) {
        this.b = new ArrayList();
        this.c = new HashSet();
        this.d = d;
    }
    
    private final bbw e(final bce bce) {
        final bbw b = bce.b.b(this);
        bit.a(b);
        return b;
    }
    
    public final bbw a(final Class clazz, final Class clazz2) {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList();
            final Iterator iterator = this.b.iterator();
            boolean b = false;
            while (iterator.hasNext()) {
                final bce bce = (bce)iterator.next();
                if (this.c.contains(bce)) {
                    b = true;
                }
                else {
                    if (!bce.a(clazz) || !bce.a.isAssignableFrom(clazz2)) {
                        continue;
                    }
                    this.c.add(bce);
                    list.add(this.e(bce));
                    this.c.remove(bce);
                }
            }
            if (list.size() > 1) {
                final bcc bcc = new bcc(list, this.d);
                monitorexit(this);
                return bcc;
            }
            if (list.size() == 1) {
                final bbw bbw = (bbw)list.get(0);
                monitorexit(this);
                return bbw;
            }
            if (b) {
                final bbw a = bcf.a;
                monitorexit(this);
                return a;
            }
            throw new aur(clazz, clazz2);
        }
        finally {
            try {
                this.c.clear();
            }
            finally {
                monitorexit(this);
                while (true) {}
            }
        }
    }
    
    final List b(final Class clazz) {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList();
            for (final bce bce : this.b) {
                if (!this.c.contains(bce) && bce.a(clazz)) {
                    this.c.add(bce);
                    list.add(this.e(bce));
                    this.c.remove(bce);
                }
            }
            monitorexit(this);
            return list;
        }
        finally {
            try {
                this.c.clear();
            }
            finally {
                monitorexit(this);
                while (true) {}
            }
        }
    }
    
    final List c(final Class clazz) {
        monitorenter(this);
        try {
            final ArrayList list = new ArrayList();
            for (final bce bce : this.b) {
                if (!list.contains(bce.a) && bce.a(clazz)) {
                    list.add(bce.a);
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
    
    final void d(final Class clazz, final Class clazz2, final bbx bbx) {
        synchronized (this) {
            final bce bce = new bce(clazz, clazz2, bbx);
            final List b = this.b;
            b.add(b.size(), bce);
        }
    }
}
