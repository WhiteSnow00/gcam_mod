import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.List;
import java.util.ArrayList;
import java.net.URISyntaxException;
import java.net.URI;
import java.util.HashMap;
import android.text.TextUtils;
import java.util.Map;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

final class jmn extends jmc implements Closeable
{
    public static final String a;
    public static final String c;
    public final jnv d;
    public final jnv e;
    private final jmm f;
    
    static {
        a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id");
        c = String.format("SELECT MAX(%s) FROM %s WHERE 1;", "hit_time", "hits2");
    }
    
    public jmn(final jmf jmf) {
        super(jmf);
        this.d = new jnv();
        this.e = new jnv();
        this.f = new jmm(this, jmf.a);
    }
    
    final Map C(String value) {
        if (TextUtils.isEmpty((CharSequence)value)) {
            return new HashMap(0);
        }
        String concat = value;
        try {
            if (!value.startsWith("?")) {
                value = String.valueOf(value);
                if (value.length() != 0) {
                    concat = "?".concat(value);
                }
                else {
                    concat = new String("?");
                }
            }
            return jwo.a(new URI(concat));
        }
        catch (final URISyntaxException ex) {
            this.o("Error parsing hit parameters", ex);
            return new HashMap(0);
        }
    }
    
    public final void D(final long n) {
        jlw.a();
        this.z();
        final ArrayList list = new ArrayList(1);
        final Long value = n;
        list.add(value);
        this.r("Deleting hit, id", value);
        this.E(list);
    }
    
    public final void E(final List list) {
        jvu.a(list);
        jlw.a();
        this.z();
        if (list.isEmpty()) {
            return;
        }
        final StringBuilder sb = new StringBuilder("hit_id");
        sb.append(" in (");
        for (int i = 0; i < list.size(); ++i) {
            final Long n = list.get(i);
            if (n == null || n == 0L) {
                throw new SQLiteException("Invalid hit id");
            }
            if (i > 0) {
                sb.append(",");
            }
            sb.append(n);
        }
        sb.append(")");
        final String string = sb.toString();
        try {
            final SQLiteDatabase b = this.b();
            this.r("Deleting dispatched hits. count", list.size());
            final int delete = b.delete("hits2", string, (String[])null);
            if (delete != list.size()) {
                super.w(5, "Deleted fewer hits then expected", list.size(), delete, string);
            }
        }
        catch (final SQLiteException ex) {
            this.o("Error deleting hits", ex);
            throw ex;
        }
    }
    
    public final void F() {
        this.z();
        this.b().endTransaction();
    }
    
    public final void G() {
        this.z();
        this.b().setTransactionSuccessful();
    }
    
    final boolean H() {
        jlw.a();
        this.z();
        final SQLiteDatabase b = this.b();
        final Cursor cursor = null;
        Object o = null;
        Object o2 = null;
        Label_0113: {
            try {
                final Cursor rawQuery = b.rawQuery("SELECT COUNT(*) FROM hits2", (String[])null);
                try {
                    if (rawQuery.moveToFirst()) {
                        boolean b2 = false;
                        final long long1 = rawQuery.getLong(0);
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                        if (long1 == 0L) {
                            b2 = true;
                        }
                        return b2;
                    }
                    o = new SQLiteException("Database returned empty set");
                    throw o;
                }
                catch (final SQLiteException cursor) {}
            }
            catch (final SQLiteException ex) {}
            finally {
                o2 = cursor;
                break Label_0113;
            }
            try {
                this.p("Database error", "SELECT COUNT(*) FROM hits2", cursor);
                throw cursor;
            }
            finally {
                o2 = o;
                final SQLiteException ex2;
                o = ex2;
            }
        }
        if (o2 != null) {
            ((Cursor)o2).close();
        }
        throw o;
    }
    
    @Override
    protected final void a() {
    }
    
    final SQLiteDatabase b() {
        try {
            return this.f.getWritableDatabase();
        }
        catch (final SQLiteException ex) {
            this.u("Error opening database", ex);
            throw ex;
        }
    }
    
    public final List c(long long1) {
        jvu.b(long1 >= 0L);
        jlw.a();
        this.z();
        final SQLiteDatabase b = this.b();
        Cursor cursor = null;
        Object string = null;
        Object o = null;
        Label_0330: {
            try {
                final Cursor query = b.query("hits2", new String[] { "hit_id", "hit_time", "hit_string", "hit_url", "hit_app_id" }, (String)null, (String[])null, (String)null, (String)null, String.format("%s ASC", "hit_id"), Long.toString(long1));
                try {
                    final ArrayList list = new ArrayList();
                    if (query.moveToFirst()) {
                        do {
                            final long long2 = query.getLong(0);
                            long1 = query.getLong(1);
                            final String string2 = query.getString(2);
                            string = query.getString(3);
                            string = new jng(this, this.C(string2), long1, TextUtils.isEmpty((CharSequence)string) || !((String)string).startsWith("http:"), long2, query.getInt(4));
                            list.add(string);
                        } while (query.moveToNext());
                    }
                    if (query != null) {
                        query.close();
                    }
                    return list;
                }
                catch (final SQLiteException cursor) {}
                finally {
                    string = (cursor = query);
                }
            }
            catch (final SQLiteException cursor) {
                o = string;
            }
            finally {
                break Label_0330;
            }
            try {
                this.o("Error loading hits from the database", cursor);
                throw cursor;
            }
            finally {
                cursor = (Cursor)o;
                final SQLiteException ex;
                o = ex;
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        throw o;
    }
    
    @Override
    public final void close() {
        try {
            this.f.close();
        }
        catch (final IllegalStateException ex) {
            this.o("Error closing database", ex);
        }
        catch (final SQLiteException ex2) {
            this.o("Sql error closing database", ex2);
        }
    }
}
