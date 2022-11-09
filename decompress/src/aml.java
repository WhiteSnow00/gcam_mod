import android.database.Cursor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aml
{
    private final aq a;
    private final ai b;
    
    public aml(final aq a) {
        this.a = a;
        this.b = new amk(a);
    }
    
    public final Long a(final String s) {
        final at a = at.a("SELECT long_value FROM Preference where `key`=?", 1);
        a.g(1, s);
        this.a.g();
        final Cursor s2 = gz.s(this.a, a, false);
        try {
            final boolean moveToFirst = s2.moveToFirst();
            Long value = null;
            if (moveToFirst) {
                if (!s2.isNull(0)) {
                    value = s2.getLong(0);
                }
            }
            return value;
        }
        finally {
            s2.close();
            a.j();
        }
    }
    
    public final void b(final amj amj) {
        this.a.g();
        this.a.h();
        try {
            this.b.a(amj);
            this.a.j();
        }
        finally {
            this.a.i();
        }
    }
}
