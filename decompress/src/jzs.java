import java.io.File;
import android.util.Log;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

// 
// Decompiled by Procyon v0.6.0
// 

final class jzs extends SQLiteOpenHelper
{
    private final Context a;
    private final String b;
    private final nns c;
    private final int d;
    private boolean e;
    
    public jzs(final Context a, final nns c) {
        final nql nql = (nql)c;
        super(a, "primes_example_store", (SQLiteDatabase$CursorFactory)null, nql.c);
        this.a = a;
        this.b = "primes_example_store";
        this.c = c;
        this.d = nql.c;
    }
    
    private static SQLiteException a(final SQLiteException ex) {
        if (ex instanceof SQLiteCantOpenDatabaseException) {
            return new jzr(ex);
        }
        return ex;
    }
    
    public final SQLiteDatabase getWritableDatabase() {
        Label_0040: {
            try {
                final SQLiteDatabase sqLiteDatabase = super.getWritableDatabase();
                break Label_0040;
            }
            catch (final SQLiteException ex) {
                Log.e("brella.SqliteOpenHelper", "Error opening database, deleting the database and trying again", (Throwable)ex);
                if (SQLiteDatabase.deleteDatabase(this.a.getDatabasePath(this.b))) {
                    try {
                        final SQLiteDatabase sqLiteDatabase = super.getWritableDatabase();
                        SQLiteDatabase writableDatabase = sqLiteDatabase;
                        if (this.e) {
                            final String path = sqLiteDatabase.getPath();
                            sqLiteDatabase.close();
                            SQLiteDatabase.deleteDatabase(new File(path));
                            this.e = false;
                            try {
                                writableDatabase = super.getWritableDatabase();
                            }
                            catch (final SQLiteException ex2) {
                                Log.e("brella.SqliteOpenHelper", "Error getting database after downgrading", (Throwable)ex2);
                                throw a(ex2);
                            }
                        }
                        return writableDatabase;
                    }
                    catch (final SQLiteException ex3) {
                        Log.e("brella.SqliteOpenHelper", "failed to get the database after recreating", (Throwable)ex3);
                        throw a(ex3);
                    }
                }
                final String b = this.b;
                final StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 19);
                sb.append("Deletion of ");
                sb.append(b);
                sb.append(" failed");
                Log.e("brella.SqliteOpenHelper", sb.toString(), (Throwable)ex);
                throw a(ex);
            }
        }
    }
    
    public final void onCreate(final SQLiteDatabase sqLiteDatabase) {
        this.onUpgrade(sqLiteDatabase, 0, this.d);
    }
    
    public final void onDowngrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        this.e = true;
    }
    
    public final void onUpgrade(final SQLiteDatabase sqLiteDatabase, int n, final int n2) {
        final boolean b = false;
        njo.d(n >= 0);
        njo.d(n < n2);
        njo.d(n2 == this.d || b);
        sqLiteDatabase.beginTransaction();
        while (true) {
            Label_0093: {
                if (n >= n2) {
                    break Label_0093;
                }
                try {
                    sqLiteDatabase.execSQL((String)this.c.get(n));
                    ++n;
                    continue;
                    sqLiteDatabase.setTransactionSuccessful();
                    sqLiteDatabase.endTransaction();
                }
                finally {
                    sqLiteDatabase.endTransaction();
                    while (true) {}
                }
            }
        }
    }
}
