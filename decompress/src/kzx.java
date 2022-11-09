import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import android.util.LongSparseArray;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kzx extends kxc
{
    private final krr a;
    private final Set b;
    private final LongSparseArray c;
    private boolean d;
    
    public kzx(final kjk kjk, final krr krr) {
        this.b = new HashSet();
        this.c = new LongSparseArray(8);
        this.d = false;
        this.a = krr.a("MetadataDst");
        kjk.c(new kzw(this));
    }
    
    private static final void r(final Collection collection) {
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            ((kzp)iterator.next()).j(null);
        }
    }
    
    @Override
    public final void aO(final lem lem) {
        monitorenter(this);
        if (lem == null) {
            monitorexit(this);
            return;
        }
        try {
            if (!this.d) {
                final krr a = this.a;
                final long b = lem.b();
                String s;
                if (!lem.c()) {
                    s = "";
                }
                else {
                    s = " (images were captured)";
                }
                final StringBuilder sb = new StringBuilder(s.length() + 46);
                sb.append("onCaptureFailed for Frame ");
                sb.append(b);
                sb.append(s);
                a.h(sb.toString());
            }
            final Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                final kzp kzp = (kzp)iterator.next();
                final kvx b2 = kzp.b;
                if (b2 != null && b2.b == lem.b()) {
                    kzp.j(null);
                    iterator.remove();
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void b(final ljm ljm) {
        monitorenter(this);
        try {
            if (this.d) {
                monitorexit(this);
                return;
            }
            this.c.put(ljm.b(), (Object)ljm);
            long key;
            if (this.c.size() >= 8) {
                key = this.c.keyAt(0);
                this.c.remove(key);
            }
            else {
                key = -1L;
            }
            final Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                final kzp kzp = (kzp)iterator.next();
                final kvx b = kzp.b;
                if (b != null) {
                    if (b.b == ljm.b()) {
                        kzp.j(ljm);
                        iterator.remove();
                    }
                    else {
                        if (key < 0L || b.b >= key) {
                            continue;
                        }
                        kzp.j(null);
                        iterator.remove();
                    }
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    final void j() {
        synchronized (this) {
            if (!this.d) {
                this.d = true;
                r(this.b);
                this.b.clear();
            }
        }
    }
    
    public final void k(final Collection collection) {
        monitorenter(this);
        try {
            if (this.d) {
                r(collection);
                monitorexit(this);
                return;
            }
            for (final kzp kzp : collection) {
                final kvx b = kzp.b;
                if (b != null) {
                    final ljm ljm = (ljm)this.c.get(b.b);
                    if (ljm != null) {
                        kzp.j(ljm);
                    }
                    else {
                        this.b.add(kzp);
                    }
                }
                else {
                    this.b.add(kzp);
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
