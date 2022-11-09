import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteStatement;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afn extends afm implements afe
{
    private final SQLiteStatement a;
    
    public afn(final SQLiteStatement a) {
        super((SQLiteProgram)a);
        this.a = a;
    }
    
    public final int a() {
        return this.a.executeUpdateDelete();
    }
    
    public final void b() {
        this.a.executeInsert();
    }
}
