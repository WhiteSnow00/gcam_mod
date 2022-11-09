import android.database.sqlite.SQLiteException;
import java.io.File;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

// 
// Decompiled by Procyon v0.6.0
// 

final class byt extends SQLiteOpenHelper
{
    private static final nsd a;
    private final Context b;
    private final String c;
    private final nns d;
    private final int e;
    private boolean f;
    
    static {
        a = nsd.g("com/google/android/apps/camera/brella/examplestore/lib/VersionedSqliteOpenHelper");
    }
    
    public byt(final Context b, final nns d) {
        super(b, "example_store_ng", (SQLiteDatabase$CursorFactory)null, d.size());
        this.b = b;
        this.c = "example_store_ng";
        this.d = d;
        this.e = d.size();
    }
    
    public final SQLiteDatabase getWritableDatabase() {
        Label_0046: {
            try {
                final SQLiteDatabase sqLiteDatabase = super.getWritableDatabase();
                break Label_0046;
            }
            catch (final SQLiteException ex) {
                a.m(byt.a.b(), "Error opening database, deleting the database and trying again", '\u00f3', (Throwable)ex);
                if (SQLiteDatabase.deleteDatabase(this.b.getDatabasePath(this.c))) {
                    try {
                        final SQLiteDatabase sqLiteDatabase = super.getWritableDatabase();
                        SQLiteDatabase writableDatabase = sqLiteDatabase;
                        if (this.f) {
                            final String path = sqLiteDatabase.getPath();
                            sqLiteDatabase.close();
                            SQLiteDatabase.deleteDatabase(new File(path));
                            this.f = false;
                            try {
                                writableDatabase = super.getWritableDatabase();
                            }
                            catch (final SQLiteException ex2) {
                                a.m(byt.a.b(), "Error getting database after downgrading", '\u00f2', (Throwable)ex2);
                                throw ex2;
                            }
                        }
                        return writableDatabase;
                    }
                    catch (final SQLiteException ex3) {
                        a.m(byt.a.b(), "failed to get the database after recreating", '\u00f4', (Throwable)ex3);
                        throw ex3;
                    }
                }
                byt.a.b().h((Throwable)ex).E(245).r("Deletion of %s failed", this.c);
                throw ex;
            }
        }
    }
    
    public final void onCreate(final SQLiteDatabase sqLiteDatabase) {
        this.onUpgrade(sqLiteDatabase, 0, this.e);
    }
    
    public final void onDowngrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        this.f = true;
    }
    
    public final void onUpgrade(final SQLiteDatabase sqLiteDatabase, int n, final int n2) {
        final boolean b = false;
        njo.d(n >= 0);
        njo.d(n < n2);
        njo.d(n2 == this.e || b);
        sqLiteDatabase.beginTransaction();
        while (true) {
            Label_0093: {
                if (n >= n2) {
                    break Label_0093;
                }
                try {
                    sqLiteDatabase.execSQL((String)this.d.get(n));
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
