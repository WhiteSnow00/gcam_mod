import java.util.Iterator;
import java.util.Set;
import java.util.List;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aez
{
    public final int a;
    public af b;
    public final ar c;
    public final String d;
    public final String e;
    
    public aez(final int a) {
        this.a = a;
    }
    
    public aez(final af b, final ar c, final String d, final String e) {
        this(c.a);
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static final void a(final String s) {
        if (!s.equalsIgnoreCase(":memory:")) {
            if (s.trim().length() != 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("deleting the database file: ");
                sb.append(s);
                Log.w("SupportSQLite", sb.toString());
                try {
                    SQLiteDatabase.deleteDatabase(new File(s));
                }
                catch (final Exception ex) {
                    Log.w("SupportSQLite", "delete failed: ", (Throwable)ex);
                }
            }
        }
    }
    
    public final void b(final afh afh, final int n, final int n2) {
        final af b = this.b;
        if (b != null) {
            final ap d = b.d;
            final List list = null;
            List<be> emptyList = null;
            Label_0261: {
                if (n == n2) {
                    emptyList = Collections.emptyList();
                }
                else {
                    final ArrayList list2 = new ArrayList();
                    int n3 = n;
                    int i;
                Label_0252:
                    do {
                        Label_0066: {
                            if (n2 > n) {
                                if (n3 >= n2) {
                                    break Label_0066;
                                }
                            }
                            else if (n3 <= n2) {
                                break Label_0066;
                            }
                            final TreeMap treeMap = d.a.get(n3);
                            if (treeMap == null) {
                                emptyList = list;
                                break Label_0261;
                            }
                            Set set;
                            if (n2 > n) {
                                set = treeMap.descendingKeySet();
                            }
                            else {
                                set = treeMap.keySet();
                            }
                            final Iterator iterator = set.iterator();
                            boolean b2;
                            int n4;
                            int intValue;
                            do {
                                final boolean hasNext = iterator.hasNext();
                                n4 = 1;
                                b2 = false;
                                if (!hasNext) {
                                    i = 0;
                                    continue Label_0252;
                                }
                                intValue = (int)iterator.next();
                                if (n2 > n) {
                                    if (intValue > n2 || intValue <= n3) {
                                        continue;
                                    }
                                    b2 = true;
                                }
                                else {
                                    if (intValue < n2 || intValue >= n3) {
                                        continue;
                                    }
                                    b2 = true;
                                }
                            } while (!b2);
                            list2.add(treeMap.get(intValue));
                            n3 = intValue;
                            i = n4;
                            continue;
                        }
                        emptyList = list2;
                        break Label_0261;
                    } while (i != 0);
                    emptyList = list;
                }
            }
            if (emptyList != null) {
                this.c.g(afh);
                final Iterator<be> iterator2 = emptyList.iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().a(afh);
                }
                final as b3 = this.c.b(afh);
                if (b3.a) {
                    this.c.f(afh);
                    this.c(afh);
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Migration didn't properly handle: ");
                sb.append(b3.b);
                throw new IllegalStateException(sb.toString());
            }
        }
        final af b4 = this.b;
        if (b4 != null && ((n > n2 && b4.l) || !b4.k)) {
            this.c.d(afh);
            this.c.c(afh);
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("A migration from ");
        sb2.append(n);
        sb2.append(" to ");
        sb2.append(n2);
        sb2.append(" was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void c(final afh afh) {
        afh.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        final String d = this.d;
        final StringBuilder sb = new StringBuilder();
        sb.append("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
        sb.append(d);
        sb.append("')");
        afh.g(sb.toString());
    }
}
