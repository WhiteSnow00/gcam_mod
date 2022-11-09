import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteProgram;
import android.database.Cursor;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase$CursorFactory;

// 
// Decompiled by Procyon v0.6.0
// 

final class afg implements SQLiteDatabase$CursorFactory
{
    final /* synthetic */ aff a;
    
    public afg(final aff a) {
        this.a = a;
    }
    
    public final Cursor newCursor(final SQLiteDatabase sqLiteDatabase, final SQLiteCursorDriver sqLiteCursorDriver, final String s, final SQLiteQuery sqLiteQuery) {
        this.a.h(new afm((SQLiteProgram)sqLiteQuery));
        return (Cursor)new SQLiteCursor(sqLiteCursorDriver, s, sqLiteQuery);
    }
}
