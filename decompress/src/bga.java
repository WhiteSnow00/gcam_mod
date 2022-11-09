import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bga
{
    private final List a;
    
    public bga() {
        this.a = new ArrayList();
    }
    
    public final bfy a(final Class clazz, final Class clazz2) {
        monitorenter(this);
        try {
            if (clazz2.isAssignableFrom(clazz)) {
                final bgb a = bgb.a;
                monitorexit(this);
                return a;
            }
            for (bfz bfz : this.a) {
                if (bfz.a(clazz, clazz2)) {
                    final bfy a2 = bfz.a;
                    monitorexit(this);
                    return a2;
                }
            }
            final String value = String.valueOf(clazz);
            final String value2 = String.valueOf(clazz2);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 47 + String.valueOf(value2).length());
            sb.append("No transcoder registered to transcode from ");
            sb.append(value);
            sb.append(" to ");
            sb.append(value2);
            throw new IllegalArgumentException(sb.toString());
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
            if (clazz2.isAssignableFrom(clazz)) {
                list.add(clazz2);
                monitorexit(this);
                return list;
            }
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                if (((bfz)iterator.next()).a(clazz, clazz2)) {
                    list.add(clazz2);
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
    
    public final void c(final Class clazz, final Class clazz2, final bfy bfy) {
        synchronized (this) {
            this.a.add(new bfz(clazz, clazz2, bfy));
        }
    }
}
