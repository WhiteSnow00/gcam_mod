import java.util.Iterator;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

final class anq extends anr
{
    final /* synthetic */ akh a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;
    
    public anq(final akh a, final String b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a() {
        final WorkDatabase d = this.a.d;
        d.h();
        try {
            final anb s = d.s();
            final String b = this.b;
            Object a = at.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
            if (b == null) {
                ((at)a).f(1);
            }
            else {
                ((at)a).g(1, b);
            }
            ((anl)s).a.g();
            Object o = gz.s(((anl)s).a, (aff)a, false);
            try {
                final ArrayList list = new ArrayList(((Cursor)o).getCount());
                while (((Cursor)o).moveToNext()) {
                    list.add((Object)((Cursor)o).getString(0));
                }
                ((Cursor)o).close();
                ((at)a).j();
                o = list.iterator();
                while (((Iterator)o).hasNext()) {
                    a = ((Iterator)o).next();
                    anr.c(this.a, (String)a);
                }
                d.j();
                d.i();
                if (this.c) {
                    anr.d(this.a);
                }
            }
            finally {
                ((Cursor)o).close();
                ((at)a).j();
            }
        }
        finally {
            d.i();
            while (true) {}
        }
    }
}
