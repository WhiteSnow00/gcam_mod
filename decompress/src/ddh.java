import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ddh implements ddd
{
    public final aq a;
    private final ai b;
    
    public ddh(final aq a) {
        this.a = a;
        this.b = new dde(a);
        new ddf(a);
        new ddg(a);
    }
    
    @Override
    public final List a(final long n) {
        final at a = at.a("SELECT * FROM shot_log WHERE shot_id = ? ORDER BY sequence", 1);
        a.e(1, n);
        this.a.g();
        final Cursor s = gz.s(this.a, a, false);
        try {
            final int v = gz.v(s, "sequence");
            final int v2 = gz.v(s, "shot_id");
            final int v3 = gz.v(s, "time_millis");
            final int v4 = gz.v(s, "message");
            final ArrayList list = new ArrayList(s.getCount());
            while (s.moveToNext()) {
                final ddi ddi = new ddi();
                ddi.a = s.getInt(v);
                ddi.b = s.getLong(v2);
                ddi.c = s.getLong(v3);
                if (s.isNull(v4)) {
                    ddi.d = null;
                }
                else {
                    ddi.d = s.getString(v4);
                }
                list.add((Object)ddi);
            }
            s.close();
            a.j();
            return list;
        }
        finally {
            s.close();
            a.j();
            while (true) {}
        }
    }
    
    @Override
    public final void b(final ddi ddi) {
        this.a.g();
        this.a.h();
        try {
            this.b.a(ddi);
            this.a.j();
        }
        finally {
            this.a.i();
        }
    }
}
