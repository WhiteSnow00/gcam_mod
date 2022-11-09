import java.util.concurrent.locks.Lock;
import android.util.Log;
import android.database.sqlite.SQLiteException;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Map;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class an
{
    private static final String[] m;
    final HashMap a;
    final String[] b;
    public Map c;
    final aq d;
    AtomicBoolean e;
    public volatile boolean f;
    public ak g;
    final xg h;
    Runnable i;
    volatile afn j;
    a k;
    public jp l;
    
    static {
        m = new String[] { "UPDATE", "DELETE", "INSERT" };
    }
    
    public an(final aq d, final Map map, final Map c, final String... array) {
        this.k = null;
        int i = 0;
        this.e = new AtomicBoolean(false);
        this.f = false;
        this.h = new xg();
        this.i = new aj(this);
        this.d = d;
        final int length = array.length;
        this.g = new ak(length);
        this.a = new HashMap();
        this.c = c;
        new jp();
        this.b = new String[length];
        while (i < length) {
            final String lowerCase = array[i].toLowerCase(Locale.US);
            this.a.put(lowerCase, i);
            final String s = map.get(array[i]);
            if (s != null) {
                this.b[i] = s.toLowerCase(Locale.US);
            }
            else {
                this.b[i] = lowerCase;
            }
            ++i;
        }
        for (final Map.Entry<K, String> entry : map.entrySet()) {
            final String lowerCase2 = entry.getValue().toLowerCase(Locale.US);
            if (this.a.containsKey(lowerCase2)) {
                final String lowerCase3 = ((String)entry.getKey()).toLowerCase(Locale.US);
                final HashMap a = this.a;
                a.put(lowerCase3, a.get(lowerCase2));
            }
        }
    }
    
    private static void c(final StringBuilder sb, final String s, final String s2) {
        sb.append("`room_table_modification_trigger_");
        sb.append(s);
        sb.append("_");
        sb.append(s2);
        sb.append("`");
    }
    
    final void a() {
        if (!this.d.l()) {
            return;
        }
        this.b(this.d.b.a());
    }
    
    final void b(final afh ex) {
        if (!((afh)ex).i()) {
            try {
                while (true) {
                    final Lock e = this.d.e();
                    e.lock();
                    try {
                        Object g = this.g;
                        synchronized (g) {
                            Object c2;
                            if (((ak)g).d && !((ak)g).e) {
                                final int length = ((ak)g).a.length;
                                int n = 0;
                                while (true) {
                                    int n2 = 1;
                                    if (n >= length) {
                                        break;
                                    }
                                    final long n3 = ((ak)g).a[n];
                                    final boolean b = n3 > 0L;
                                    final boolean[] b2 = ((ak)g).b;
                                    if (b != b2[n]) {
                                        final int[] c = ((ak)g).c;
                                        if (n3 <= 0L) {
                                            n2 = 2;
                                        }
                                        c[n] = n2;
                                    }
                                    else {
                                        ((ak)g).c[n] = 0;
                                    }
                                    b2[n] = b;
                                    ++n;
                                }
                                ((ak)g).e = true;
                                ((ak)g).d = false;
                                c2 = ((ak)g).c;
                                monitorexit(g);
                            }
                            else {
                                monitorexit(g);
                                c2 = null;
                            }
                            if (c2 == null) {
                                return;
                            }
                            final int length2 = c2.length;
                            int n4;
                            if (((afh)ex).k()) {
                                ((afh)ex).e();
                                n4 = 0;
                            }
                            else {
                                ((afh)ex).d();
                                n4 = 0;
                            }
                        Block_17_Outer:
                            while (true) {
                                Label_0505: {
                                    if (n4 >= length2) {
                                        break Label_0505;
                                    }
                                    Label_0331: {
                                        switch (c2[n4]) {
                                            default: {
                                                break Label_0331;
                                            }
                                            case 2: {
                                                break;
                                            }
                                            case 1: {
                                                break Label_0331;
                                            }
                                        }
                                        try {
                                            final String s = this.b[n4];
                                            g = new StringBuilder();
                                            final String[] m = an.m;
                                            for (int i = 0; i < 3; ++i) {
                                                final String s2 = m[i];
                                                ((StringBuilder)g).setLength(0);
                                                ((StringBuilder)g).append("DROP TRIGGER IF EXISTS ");
                                                c((StringBuilder)g, s, s2);
                                                ((afh)ex).g(((StringBuilder)g).toString());
                                            }
                                            ++n4;
                                            continue Block_17_Outer;
                                            while (true) {
                                                final String[] j;
                                                int n5 = 0;
                                                g = j[n5];
                                                final StringBuilder sb;
                                                sb.setLength(0);
                                                sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
                                                final String s3;
                                                c(sb, s3, (String)g);
                                                sb.append(" AFTER ");
                                                sb.append((String)g);
                                                sb.append(" ON `");
                                                sb.append(s3);
                                                sb.append("` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
                                                sb.append(n4);
                                                sb.append(" AND invalidated = 0; END");
                                                ((afh)ex).g(sb.toString());
                                                ++n5;
                                                Label_0395: {
                                                    break Label_0395;
                                                    g = new StringBuilder();
                                                    ((StringBuilder)g).append("INSERT OR IGNORE INTO room_table_modification_log VALUES(");
                                                    ((StringBuilder)g).append(n4);
                                                    ((StringBuilder)g).append(", 0)");
                                                    ((afh)ex).g(((StringBuilder)g).toString());
                                                    s3 = this.b[n4];
                                                    sb = new StringBuilder();
                                                    j = an.m;
                                                    n5 = 0;
                                                }
                                                iftrue(Label_0499:)(n5 >= 3);
                                                continue;
                                            }
                                            ((afh)ex).h();
                                            ((afh)ex).f();
                                            final ak g2 = this.g;
                                            synchronized (g2) {
                                                g2.e = false;
                                            }
                                        }
                                        finally {
                                            ((afh)ex).f();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    finally {
                        e.unlock();
                    }
                }
            }
            catch (final SQLiteException ex) {}
            catch (final IllegalStateException ex2) {}
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", (Throwable)ex);
        }
    }
}
