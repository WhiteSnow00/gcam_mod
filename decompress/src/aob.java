import java.util.List;
import java.util.Iterator;
import android.database.Cursor;
import java.util.UUID;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aob implements Runnable
{
    final /* synthetic */ akh a;
    final /* synthetic */ String b;
    public final aox c;
    
    public aob() {
        this.c = aox.h();
    }
    
    public aob(final akh a, final String b) {
        this.a = a;
        this.b = b;
        this.c = aox.h();
    }
    
    @Override
    public final void run() {
        try {
            Object s = this.a.d.s();
            final String b = this.b;
            Object a = at.a("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
            ((at)a).g(1, b);
            ((anl)s).a.g();
            ((anl)s).a.h();
            try {
                final Cursor s2 = gz.s(((anl)s).a, (aff)a, true);
                try {
                    final int v = gz.v(s2, "id");
                    final int v2 = gz.v(s2, "state");
                    final int v3 = gz.v(s2, "output");
                    final int v4 = gz.v(s2, "run_attempt_count");
                    final yu yu = new yu();
                    final yu yu2 = new yu();
                    while (s2.moveToNext()) {
                        if (!s2.isNull(v)) {
                            final String string = s2.getString(v);
                            if (yu.get(string) == null) {
                                yu.put(string, new ArrayList());
                            }
                        }
                        if (!s2.isNull(v)) {
                            final String string2 = s2.getString(v);
                            if (yu2.get(string2) != null) {
                                continue;
                            }
                            yu2.put(string2, new ArrayList());
                        }
                    }
                    s2.moveToPosition(-1);
                    ((anl)s).m(yu);
                    ((anl)s).l(yu2);
                    final ArrayList list = new ArrayList(s2.getCount());
                    while (s2.moveToNext()) {
                        final boolean null = s2.isNull(v);
                        final ArrayList list2 = null;
                        ArrayList list3;
                        if (!null) {
                            list3 = (ArrayList)yu.get(s2.getString(v));
                        }
                        else {
                            list3 = null;
                        }
                        ArrayList d = list3;
                        if (list3 == null) {
                            d = new ArrayList();
                        }
                        ArrayList list4;
                        if (!s2.isNull(v)) {
                            list4 = (ArrayList)yu2.get(s2.getString(v));
                        }
                        else {
                            list4 = list2;
                        }
                        ArrayList e = list4;
                        if (list4 == null) {
                            e = new ArrayList();
                        }
                        final amz amz = new amz();
                        amz.a = s2.getString(v);
                        amz.f = cxa.g(s2.getInt(v2));
                        amz.b = aiq.a(s2.getBlob(v3));
                        amz.c = s2.getInt(v4);
                        amz.d = d;
                        amz.e = e;
                        list.add((Object)amz);
                    }
                    ((anl)s).a.j();
                    s2.close();
                    ((at)a).j();
                    ((anl)s).a.i();
                    final int s3 = ana.s;
                    final ArrayList list5 = new ArrayList(list.size());
                    final Iterator iterator = list.iterator();
                    while (iterator.hasNext()) {
                        s = iterator.next();
                        final List e2 = ((amz)s).e;
                        aiq a2;
                        if (e2 != null && !e2.isEmpty()) {
                            a2 = ((amz)s).e.get(0);
                        }
                        else {
                            a2 = aiq.a;
                        }
                        a = new aje(UUID.fromString(((amz)s).a), ((amz)s).f, ((amz)s).b, ((amz)s).d, a2, ((amz)s).c);
                        list5.add(a);
                    }
                    this.c.e(list5);
                }
                finally {
                    s2.close();
                    ((at)a).j();
                }
            }
            finally {
                ((anl)s).a.i();
            }
        }
        finally {
            final Throwable t;
            this.c.f(t);
        }
    }
}
