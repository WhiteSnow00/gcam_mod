import java.util.Iterator;
import java.util.ArrayList;
import android.database.MatrixCursor;
import android.database.Cursor;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import android.content.UriMatcher;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dbd
{
    public static final nsd a;
    public static final dbb b;
    public final UriMatcher c;
    public final Map d;
    public final Map e;
    private final String f;
    
    static {
        a = nsd.g("com/google/android/apps/camera/debug/contentprovider/TimingContentProvider");
        b = day.a;
    }
    
    public dbd(final String f) {
        this.c = new UriMatcher(-1);
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = f;
    }
    
    private final void d(final String s, final String s2, final njp njp) {
        final int n = this.d.size() + 1;
        this.c.addURI(s, s2, n);
        this.d.put(n, njp);
    }
    
    public final Cursor a(final dbc dbc, final boolean b, final dbb dbb) {
        final Object a = dbc.a();
        String[] array;
        if (b) {
            array = new String[] { "_id", "run", "name", "time_ns" };
        }
        else {
            array = new String[] { "run", "time_ns" };
        }
        final MatrixCursor matrixCursor = new MatrixCursor(array);
        if (!((List)a).isEmpty()) {
            for (int i = 0; i < ((List)a).size(); ++i) {
                final hwh hwh = (hwh)((List)a).get(i);
                final ArrayList list = new ArrayList<Object>(hwh.m.length + 1);
                list.add(hwb.a("TIMING_CREATION", -1, hwh.l));
                for (final Enum enum1 : hwh.m) {
                    list.add(hwb.a(enum1.name(), enum1.ordinal(), hwh.g(enum1)));
                }
                for (final hwb hwb : list) {
                    if (dbb.a((List)a, i, hwb)) {
                        final int b2 = hwb.b;
                        final String a2 = hwb.a;
                        final long c = hwb.c;
                        if (b) {
                            matrixCursor.newRow().add("_id", (Object)b2).add("run", (Object)i).add("name", (Object)a2).add("time_ns", (Object)c);
                        }
                        else {
                            matrixCursor.newRow().add("run", (Object)i).add("time_ns", (Object)c);
                        }
                    }
                }
            }
        }
        return (Cursor)matrixCursor;
    }
    
    public final void b(final String s, final Class clazz, final dbc dbc) {
        this.d(this.f, s, new daz(this, dbc));
        for (final String s2 : hwh.h(clazz)) {
            final String f = this.f;
            final StringBuilder sb = new StringBuilder(s.length() + 1 + String.valueOf(s2).length());
            sb.append(s);
            sb.append("/");
            sb.append(s2);
            this.d(f, sb.toString(), new dba(this, dbc, s2));
        }
        this.e.put(s, dbc);
    }
}
