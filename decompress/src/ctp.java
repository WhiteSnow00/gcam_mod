import android.database.Cursor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ctp extends ctl
{
    public final aq a;
    public final ba b;
    public final cve c;
    private final ai d;
    private final ai e;
    
    public ctp(final aq a) {
        this.c = new cve();
        this.a = a;
        this.d = new ctm(a);
        this.e = new ctn(a);
        this.b = new cto(a);
    }
    
    @Override
    public final ctk a(final ctq ctq) {
        this.a.h();
        try {
            final ctk ctk = new ctk(ctq);
            this.a.g();
            this.a.h();
            try {
                this.d.c(ctk);
                this.a.j();
                this.a.i();
                final at a = at.a("SELECT * FROM HardwareHelpDialogCounts WHERE reason = ?", 1);
                a.e(1, ctq.ordinal());
                this.a.g();
                final Cursor s = gz.s(this.a, a, false);
                try {
                    final int v = gz.v(s, "reason");
                    final int v2 = gz.v(s, "impressionsBeforeReboot");
                    final int v3 = gz.v(s, "impressionsAfterReboot");
                    final int v4 = gz.v(s, "rebootCount");
                    ctk ctk2;
                    if (s.moveToFirst()) {
                        ctk2 = new ctk(ctq.values()[s.getInt(v)]);
                        ctk2.b = s.getInt(v2);
                        ctk2.c = s.getInt(v3);
                        ctk2.d = s.getInt(v4);
                    }
                    else {
                        ctk2 = null;
                    }
                    s.close();
                    a.j();
                    this.a.j();
                    return ctk2;
                }
                finally {
                    s.close();
                    a.j();
                }
            }
            finally {
                this.a.i();
            }
        }
        finally {
            this.a.i();
        }
    }
    
    @Override
    public final void b(final ctk ctk) {
        this.a.g();
        this.a.h();
        try {
            this.e.a(ctk);
            this.a.j();
        }
        finally {
            this.a.i();
        }
    }
}
