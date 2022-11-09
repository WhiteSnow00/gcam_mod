import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afh implements Closeable
{
    private static final String[] b;
    public final SQLiteDatabase a;
    
    static {
        b = new String[0];
    }
    
    public afh(final SQLiteDatabase a) {
        this.a = a;
    }
    
    public final Cursor a(final aff aff) {
        return this.a.rawQueryWithFactory((SQLiteDatabase$CursorFactory)new afg(aff), aff.b(), afh.b, (String)null);
    }
    
    public final Cursor b(final String s) {
        return this.a(new aey(s));
    }
    
    public final String c() {
        return this.a.getPath();
    }
    
    @Override
    public final void close() {
        this.a.close();
    }
    
    public final void d() {
        this.a.beginTransaction();
    }
    
    public final void e() {
        this.a.beginTransactionNonExclusive();
    }
    
    public final void f() {
        this.a.endTransaction();
    }
    
    public final void g(final String s) {
        this.a.execSQL(s);
    }
    
    public final void h() {
        this.a.setTransactionSuccessful();
    }
    
    public final boolean i() {
        return this.a.inTransaction();
    }
    
    public final boolean j() {
        return this.a.isOpen();
    }
    
    public final boolean k() {
        return this.a.isWriteAheadLoggingEnabled();
    }
    
    public final afn l(final String s) {
        return new afn(this.a.compileStatement(s));
    }
    
    public final void m(final Object[] array) {
        this.a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", array);
    }
}
