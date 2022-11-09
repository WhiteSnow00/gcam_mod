import android.database.sqlite.SQLiteException;

// 
// Decompiled by Procyon v0.6.0
// 

final class ctx implements Runnable
{
    private final krr a;
    private final Boolean b;
    private final Runnable c;
    
    public ctx(final krr a, final Runnable c) {
        this.a = a;
        this.b = false;
        this.c = c;
    }
    
    @Override
    public final void run() {
        try {
            this.c.run();
        }
        catch (final SQLiteException ex) {
            this.a.e(ksc.c("SQLite error while recording fatal error", new Object[0]), (Throwable)ex);
            if (!this.b) {
                return;
            }
            throw new njv((Throwable)ex);
        }
    }
}
