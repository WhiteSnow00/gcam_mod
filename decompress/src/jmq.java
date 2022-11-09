import android.database.sqlite.SQLiteException;

// 
// Decompiled by Procyon v0.6.0
// 

final class jmq extends jmy
{
    final /* synthetic */ jmt a;
    
    public jmq(final jmt a, final jmf jmf) {
        this.a = a;
        super(jmf);
    }
    
    @Override
    public final void a() {
        final jmt a = this.a;
        try {
            final jmn c = a.c;
            jlw.a();
            c.z();
            if (c.d.c(86400000L)) {
                c.d.b();
                c.q("Deleting stale hits (if any)");
                c.r("Deleted stale hits, count", c.b().delete("hits2", "hit_time < ?", new String[] { Long.toString(System.currentTimeMillis() - 2592000000L) }));
            }
            a.F();
        }
        catch (final SQLiteException ex) {
            a.u("Failed to delete stale hits", ex);
        }
        a.d.d(86400000L);
    }
}
