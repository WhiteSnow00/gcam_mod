import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drq extends SQLiteOpenHelper
{
    public drq(final Context context) {
        super(context, "special_type_db_helper", (SQLiteDatabase$CursorFactory)null, 1);
    }
    
    public final void onCreate(final SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE type_uri (media_store_id INTEGER PRIMARY KEY, special_type_id TEXT NOT NULL)");
    }
    
    public final void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        throw new UnsupportedOperationException();
    }
}
