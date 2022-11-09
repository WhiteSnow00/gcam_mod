import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ano
{
    public final aq a;
    public final ai b;
    
    public ano(final aq a) {
        this.a = a;
        this.b = new ann(a);
    }
    
    public final List a(String s) {
        final at a = at.a("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (s == null) {
            a.f(1);
        }
        else {
            a.g(1, s);
        }
        this.a.g();
        s = (String)gz.s(this.a, a, false);
        try {
            final ArrayList list = new ArrayList(((Cursor)s).getCount());
            while (((Cursor)s).moveToNext()) {
                list.add(((Cursor)s).getString(0));
            }
            ((Cursor)s).close();
            a.j();
            return list;
        }
        finally {
            ((Cursor)s).close();
            a.j();
            while (true) {}
        }
    }
}
