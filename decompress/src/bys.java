import java.util.concurrent.Executor;
import java.util.Collection;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bys
{
    public static final nsd a;
    public final byt b;
    public final lmy c;
    public final Random d;
    public final ExecutorService e;
    public final Map f;
    
    static {
        a = nsd.g("com/google/android/apps/camera/brella/examplestore/lib/CamSqliteExampleStore");
    }
    
    public bys(final Context context, final List list, final lmy c, final Random d, final ExecutorService e) {
        final ArrayList list2 = new ArrayList();
        this.f = new HashMap();
        final nrw t = ((nns)list).t();
        while (t.hasNext()) {
            final byq byq = t.next();
            this.f.put(byq.a, byq);
            list2.add(String.format("CREATE TABLE %s(media_id INTEGER PRIMARY KEY, time INTEGER NOT NULL,value BLOB NOT NULL)", byq.a));
            final nns b = byq.b;
            for (int c2 = ((nql)b).c, i = 0; i < c2; ++i) {
                final byp byp = b.get(i);
                final String format = String.format("ALTER TABLE %s ADD ", byq.a);
                final String a = byp.a;
                final String b2 = byp.b;
                final StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 1 + a.length() + b2.length());
                sb.append(format);
                sb.append(a);
                sb.append(" ");
                sb.append(b2);
                list2.add(sb.toString());
            }
        }
        list2.add("CREATE TABLE media_record(media_id INTEGER PRIMARY KEY, session_id INTEGER,source_id STRING NOT NULL,selection_key INTEGER NOT NULL,time INTEGER NOT NULL)");
        this.b = new byt(context, nns.j(list2));
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final nns a() {
        final nnn e = nns.e();
        e.g("media_record");
        e.h(this.f.keySet());
        return e.f();
    }
    
    public final oey b(final nir nir) {
        return ofi.r(new byl(this, nir), this.e);
    }
}
