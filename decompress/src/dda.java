import android.database.Cursor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dda implements dcu
{
    public final aq a;
    public final ai b;
    public final ba c;
    private final ah d;
    private final ba e;
    
    public dda(final aq a) {
        this.a = a;
        this.b = new dcv(a);
        new dcw(a);
        this.d = new dcx(a);
        this.c = new dcy(a);
        this.e = new dcz(a);
    }
    
    @Override
    public final int a(final long n, final long n2) {
        this.a.g();
        final afn e = this.e.e();
        e.e(1, n2);
        e.e(2, n);
        this.a.h();
        try {
            final int a = e.a();
            this.a.j();
            return a;
        }
        finally {
            this.a.i();
            this.e.f(e);
        }
    }
    
    @Override
    public final ddc b(final long n) {
        final at a = at.a("SELECT * FROM shots WHERE shot_id = ?", 1);
        a.e(1, n);
        this.a.g();
        final Cursor s = gz.s(this.a, a, false);
        try {
            final int v = gz.v(s, "shot_id");
            final int v2 = gz.v(s, "title");
            final int v3 = gz.v(s, "start_millis");
            final int v4 = gz.v(s, "persisted_millis");
            final int v5 = gz.v(s, "canceled_millis");
            final int v6 = gz.v(s, "deleted_millis");
            final int v7 = gz.v(s, "most_recent_event_millis");
            final int v8 = gz.v(s, "capture_session_type");
            final int v9 = gz.v(s, "capture_session_shot_id");
            final int v10 = gz.v(s, "pid");
            final int v11 = gz.v(s, "stuck");
            final int v12 = gz.v(s, "failed");
            ddc ddc;
            if (s.moveToFirst()) {
                ddc = new ddc();
                ddc.a = s.getLong(v);
                if (s.isNull(v2)) {
                    ddc.b = null;
                }
                else {
                    ddc.b = s.getString(v2);
                }
                ddc.c = s.getLong(v3);
                ddc.d = s.getLong(v4);
                ddc.e = s.getLong(v5);
                ddc.f = s.getLong(v6);
                ddc.g = s.getLong(v7);
                if (s.isNull(v8)) {
                    ddc.h = null;
                }
                else {
                    ddc.h = s.getString(v8);
                }
                if (s.isNull(v9)) {
                    ddc.i = null;
                }
                else {
                    ddc.i = s.getString(v9);
                }
                ddc.j = s.getLong(v10);
                ddc.k = (s.getInt(v11) != 0);
                ddc.l = (s.getInt(v12) != 0);
            }
            else {
                ddc = null;
            }
            return ddc;
        }
        finally {
            s.close();
            a.j();
        }
    }
    
    @Override
    public final void c(final ddc ddc) {
        this.a.g();
        this.a.h();
        try {
            this.d.a(ddc);
            this.a.j();
        }
        finally {
            this.a.i();
        }
    }
}
