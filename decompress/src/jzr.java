import android.database.sqlite.SQLiteException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jzr extends SQLiteException
{
    public jzr(final SQLiteException ex) {
        super(njb.c(ex.getMessage()), (Throwable)ex);
    }
}
