import android.database.Cursor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amp
{
    public final aq a;
    private final ai b;
    private final ba c;
    
    public amp(final aq a) {
        this.a = a;
        this.b = new amn(a);
        this.c = new amo(a);
    }
    
    public final amm a(final String s) {
        final at a = at.a("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (s == null) {
            a.f(1);
        }
        else {
            a.g(1, s);
        }
        this.a.g();
        final Cursor s2 = gz.s(this.a, a, false);
        try {
            final int v = gz.v(s2, "work_spec_id");
            final int v2 = gz.v(s2, "system_id");
            amm amm;
            if (s2.moveToFirst()) {
                amm = new amm(s2.getString(v), s2.getInt(v2));
            }
            else {
                amm = null;
            }
            return amm;
        }
        finally {
            s2.close();
            a.j();
        }
    }
    
    public final void b(final amm amm) {
        this.a.g();
        this.a.h();
        try {
            this.b.a(amm);
            this.a.j();
        }
        finally {
            this.a.i();
        }
    }
    
    public final void c(final String s) {
        this.a.g();
        final afn e = this.c.e();
        if (s == null) {
            e.f(1);
        }
        else {
            e.g(1, s);
        }
        this.a.h();
        try {
            e.a();
            this.a.j();
        }
        finally {
            this.a.i();
            this.c.f(e);
        }
    }
}
