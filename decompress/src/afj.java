import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

// 
// Decompiled by Procyon v0.6.0
// 

final class afj extends SQLiteOpenHelper
{
    final afh[] a;
    final aez b;
    private boolean c;
    
    public afj(final Context context, final String s, final afh[] a, final aez b) {
        super(context, s, (SQLiteDatabase$CursorFactory)null, b.a, (DatabaseErrorHandler)new afi(a));
        this.b = b;
        this.a = a;
    }
    
    static afh b(final afh[] array, final SQLiteDatabase sqLiteDatabase) {
        final afh afh = array[0];
        if (afh != null && afh.a == sqLiteDatabase) {
            return afh;
        }
        return array[0] = new afh(sqLiteDatabase);
    }
    
    final afh a(final SQLiteDatabase sqLiteDatabase) {
        return b(this.a, sqLiteDatabase);
    }
    
    final afh c() {
        synchronized (this) {
            this.c = false;
            final SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.c) {
                this.close();
                return this.c();
            }
            return this.a(writableDatabase);
        }
    }
    
    public final void close() {
        synchronized (this) {
            super.close();
            this.a[0] = null;
        }
    }
    
    public final void onConfigure(final SQLiteDatabase sqLiteDatabase) {
        this.a(sqLiteDatabase);
    }
    
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        final aez b = this.b;
        final afh a = this.a(sqLiteDatabase);
        sqLiteDatabase = (SQLiteDatabase)a.b("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            final boolean moveToFirst = ((Cursor)sqLiteDatabase).moveToFirst();
            boolean b2 = false;
            if (moveToFirst) {
                if (((Cursor)sqLiteDatabase).getInt(0) == 0) {
                    b2 = true;
                }
            }
            ((Cursor)sqLiteDatabase).close();
            b.c.c(a);
            if (!b2) {
                sqLiteDatabase = (SQLiteDatabase)b.c.b(a);
                if (!((as)sqLiteDatabase).a) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Pre-packaged database has an invalid schema: ");
                    sb.append(((as)sqLiteDatabase).b);
                    throw new IllegalStateException(sb.toString());
                }
            }
            b.c(a);
            b.c.a();
        }
        finally {
            ((Cursor)sqLiteDatabase).close();
        }
    }
    
    public final void onDowngrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        this.c = true;
        this.b.b(this.a(sqLiteDatabase), n, n2);
    }
    
    public final void onOpen(SQLiteDatabase sqLiteDatabase) {
        if (!this.c) {
            final aez b = this.b;
            final afh a = this.a(sqLiteDatabase);
            sqLiteDatabase = (SQLiteDatabase)a.b("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                final boolean b2 = ((Cursor)sqLiteDatabase).moveToFirst() && ((Cursor)sqLiteDatabase).getInt(0) != 0;
                ((Cursor)sqLiteDatabase).close();
                Label_0188: {
                    if (b2) {
                        final Cursor a2 = a.a(new aey("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                        try {
                            String string;
                            if (a2.moveToFirst()) {
                                string = a2.getString(0);
                            }
                            else {
                                string = null;
                            }
                            a2.close();
                            if (b.d.equals(string)) {
                                break Label_0188;
                            }
                            if (b.e.equals(string)) {
                                break Label_0188;
                            }
                            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                        }
                        finally {
                            a2.close();
                        }
                    }
                    sqLiteDatabase = (SQLiteDatabase)b.c.b(a);
                    if (!((as)sqLiteDatabase).a) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Pre-packaged database has an invalid schema: ");
                        sb.append(((as)sqLiteDatabase).b);
                        throw new IllegalStateException(sb.toString());
                    }
                    b.c.f(a);
                    b.c(a);
                }
                b.c.e(a);
                b.b = null;
            }
            finally {
                ((Cursor)sqLiteDatabase).close();
            }
        }
    }
    
    public final void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        this.c = true;
        this.b.b(this.a(sqLiteDatabase), n, n2);
    }
}
