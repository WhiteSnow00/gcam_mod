import java.util.concurrent.Executor;
import androidx.work.WorkerParameters;
import java.util.UUID;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Iterator;
import android.database.Cursor;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import androidx.work.ListenableWorker;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akl implements Runnable
{
    static final String a;
    final Context b;
    ana c;
    ListenableWorker d;
    oey e;
    public volatile boolean f;
    final apa g;
    final aox h;
    cwx i;
    private final String k;
    private final List l;
    private final ail m;
    private final alz n;
    private final WorkDatabase o;
    private final anb p;
    private List q;
    private String r;
    private final ami s;
    private final ano t;
    
    static {
        a = aiy.b("WorkerWrapper");
    }
    
    public akl(final akk akk) {
        this.i = cwx.e();
        this.h = aox.h();
        this.e = null;
        this.b = akk.a;
        this.g = akk.g;
        this.n = akk.b;
        this.k = akk.e;
        this.l = akk.f;
        this.d = null;
        this.m = akk.c;
        final WorkDatabase d = akk.d;
        this.o = d;
        this.p = d.s();
        this.s = d.u();
        this.t = d.z();
    }
    
    private final void d() {
        this.o.h();
        try {
            this.p.k(1, this.k);
            this.p.g(this.k, System.currentTimeMillis());
            this.p.j(this.k, -1L);
            this.o.j();
        }
        finally {
            this.o.i();
            this.f(true);
        }
    }
    
    private final void e() {
        this.o.h();
        try {
            this.p.g(this.k, System.currentTimeMillis());
            this.p.k(1, this.k);
            final anb p = this.p;
            final String k = this.k;
            ((anl)p).a.g();
            final afn e = ((anl)p).d.e();
            if (k == null) {
                e.f(1);
            }
            else {
                e.g(1, k);
            }
            ((anl)p).a.h();
            try {
                e.a();
                ((anl)p).a.j();
                ((anl)p).a.i();
                ((anl)p).d.f(e);
                this.p.j(this.k, -1L);
                this.o.j();
            }
            finally {
                ((anl)p).a.i();
                ((anl)p).d.f(e);
            }
        }
        finally {
            this.o.i();
            this.f(false);
        }
    }
    
    private final void f(final boolean b) {
        this.o.h();
        try {
            final anb s = this.o.s();
            Object o = at.a("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
            ((anl)s).a.g();
            Object o2 = gz.s(((anl)s).a, (aff)o, false);
            try {
                final boolean b2 = ((Cursor)o2).moveToFirst() && ((Cursor)o2).getInt(0) != 0;
                ((Cursor)o2).close();
                ((at)o).j();
                if (!b2) {
                    anv.a(this.b, RescheduleReceiver.class, false);
                }
                if (b) {
                    this.p.k(1, this.k);
                    this.p.j(this.k, -1L);
                }
                if (this.c != null) {
                    o = this.d;
                    if (o != null && ((ListenableWorker)o).g()) {
                        final alz n = this.n;
                        o2 = this.k;
                        synchronized (((ajp)n).g) {
                            ((ajp)n).d.remove(o2);
                            ((ajp)n).d();
                        }
                    }
                }
                this.o.j();
                this.o.i();
                this.h.e(b);
            }
            finally {
                ((Cursor)o2).close();
                ((at)o).j();
            }
        }
        finally {
            this.o.i();
        }
    }
    
    private final void g() {
        final int h = this.p.h(this.k);
        if (h == 2) {
            final aiy a = aiy.a();
            String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.k);
            a.d(new Throwable[0]);
            this.f(true);
            return;
        }
        final aiy a2 = aiy.a();
        String.format("Status for %s is %s; not doing any work", this.k, cwz.e(h));
        a2.d(new Throwable[0]);
        this.f(false);
    }
    
    final void a() {
        if (!this.c()) {
            this.o.h();
            try {
                final int h = this.p.h(this.k);
                Object o = this.o.y();
                final String k = this.k;
                ((amx)o).a.g();
                Object o2 = ((amx)o).b.e();
                if (k == null) {
                    ((afm)o2).f(1);
                }
                else {
                    ((afm)o2).g(1, k);
                }
                ((amx)o).a.h();
                try {
                    ((afn)o2).a();
                    ((amx)o).a.j();
                    ((amx)o).a.i();
                    ((amx)o).b.f((afn)o2);
                    Label_0615: {
                        if (h == 0) {
                            this.f(false);
                        }
                        else if (h == 2) {
                            o = this.i;
                            if (o instanceof aix) {
                                aiy.a();
                                String.format("Worker result SUCCESS for %s", this.r);
                                aiy.f(new Throwable[0]);
                                if (this.c.d()) {
                                    this.e();
                                    break Label_0615;
                                }
                                this.o.h();
                                try {
                                    this.p.k(3, this.k);
                                    this.p.f(this.k, ((aix)this.i).a);
                                    final long currentTimeMillis = System.currentTimeMillis();
                                    o2 = this.s.a(this.k).iterator();
                                    while (((Iterator)o2).hasNext()) {
                                        final String s = ((Iterator<String>)o2).next();
                                        if (this.p.h(s) == 5) {
                                            final ami s2 = this.s;
                                            final at a = at.a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
                                            if (s == null) {
                                                a.f(1);
                                            }
                                            else {
                                                a.g(1, s);
                                            }
                                            s2.a.g();
                                            final Cursor s3 = gz.s(s2.a, a, false);
                                            try {
                                                final boolean b = s3.moveToFirst() && s3.getInt(0) != 0;
                                                s3.close();
                                                a.j();
                                                if (b) {
                                                    aiy.a();
                                                    String.format("Setting status to enqueued for %s", s);
                                                    aiy.f(new Throwable[0]);
                                                    this.p.k(1, s);
                                                    this.p.g(s, currentTimeMillis);
                                                    continue;
                                                }
                                                continue;
                                            }
                                            finally {
                                                s3.close();
                                                a.j();
                                            }
                                            break;
                                        }
                                    }
                                    this.o.j();
                                    break Label_0615;
                                }
                                finally {
                                    this.o.i();
                                    this.f(false);
                                }
                            }
                            if (o instanceof aiw) {
                                aiy.a();
                                String.format("Worker result RETRY for %s", this.r);
                                aiy.f(new Throwable[0]);
                                this.d();
                            }
                            else {
                                aiy.a();
                                String.format("Worker result FAILURE for %s", this.r);
                                aiy.f(new Throwable[0]);
                                if (this.c.d()) {
                                    this.e();
                                }
                                else {
                                    this.b();
                                }
                            }
                        }
                        else if (!cwz.f(h)) {
                            this.d();
                        }
                    }
                    this.o.j();
                }
                finally {
                    ((amx)o).a.i();
                    ((amx)o).b.f((afn)o2);
                }
            }
            finally {
                this.o.i();
            }
        }
        final List l = this.l;
        if (l != null) {
            final Iterator iterator = l.iterator();
            while (iterator.hasNext()) {
                ((ajq)iterator.next()).b(this.k);
            }
            ajr.b(this.m, this.o, this.l);
        }
    }
    
    final void b() {
        this.o.h();
        try {
            final String k = this.k;
            final LinkedList<String> list = new LinkedList<String>();
            list.add(k);
            while (!list.isEmpty()) {
                final String s = list.remove();
                if (this.p.h(s) != 6) {
                    this.p.k(4, s);
                }
                list.addAll(this.s.a(s));
            }
            this.p.f(this.k, ((aiv)this.i).a);
            this.o.j();
            this.o.i();
            this.f(false);
        }
        finally {
            this.o.i();
            this.f(false);
            while (true) {}
        }
    }
    
    public final boolean c() {
        if (this.f) {
            final aiy a = aiy.a();
            String.format("Work interrupted for %s", this.r);
            a.d(new Throwable[0]);
            final int h = this.p.h(this.k);
            if (h == 0) {
                this.f(false);
            }
            else {
                this.f(cwz.f(h) ^ true);
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final void run() {
        final List a = this.t.a(this.k);
        this.q = a;
        final StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.k);
        sb.append(", tags={ ");
        final Iterator iterator = a.iterator();
        final int n = 0;
        int n2 = 1;
        while (iterator.hasNext()) {
            final String s = (String)iterator.next();
            if (n2 == 0) {
                sb.append(", ");
            }
            sb.append(s);
            n2 = 0;
        }
        sb.append(" } ]");
        this.r = sb.toString();
        if (this.c()) {
            return;
        }
        this.o.h();
        try {
            final ana a2 = this.p.a(this.k);
            this.c = a2;
            WorkDatabase workDatabase = null;
            Label_0206: {
                if (a2 == null) {
                    aiy.a();
                    aiy.e(akl.a, String.format("Didn't find WorkSpec for id %s", this.k), new Throwable[0]);
                    this.f(false);
                    this.o.j();
                    workDatabase = this.o;
                }
                else if (a2.p != 1) {
                    this.g();
                    this.o.j();
                    final aiy a3 = aiy.a();
                    String.format("%s is not in ENQUEUED state. Nothing more to do.", this.c.b);
                    a3.d(new Throwable[0]);
                    workDatabase = this.o;
                }
                else {
                    if (a2.d() || this.c.c()) {
                        final long currentTimeMillis = System.currentTimeMillis();
                        final ana c = this.c;
                        if (c.l != 0L) {
                            if (currentTimeMillis < c.a()) {
                                final aiy a4 = aiy.a();
                                String.format("Delaying execution for %s because it is being executed before schedule.", this.c.b);
                                a4.d(new Throwable[0]);
                                this.f(true);
                                this.o.j();
                                workDatabase = this.o;
                                break Label_0206;
                            }
                        }
                    }
                    this.o.j();
                    this.o.i();
                    Label_0626: {
                        if (this.c.d()) {
                            final Object o = this.c.d;
                            break Label_0626;
                        }
                        final aiu b = aiu.b(this.c.c);
                        if (b == null) {
                            aiy.a();
                            aiy.e(akl.a, String.format("Could not create Input Merger %s", this.c.c), new Throwable[0]);
                            this.b();
                            return;
                        }
                        final ArrayList list = new ArrayList();
                        list.add(this.c.d);
                        final anb p = this.p;
                        final String k = this.k;
                        Object o = at.a("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                        if (k == null) {
                            ((at)o).f(1);
                        }
                        else {
                            ((at)o).g(1, k);
                        }
                        final anl anl = (anl)p;
                        anl.a.g();
                        Object o2 = gz.s(anl.a, (aff)o, false);
                        try {
                            final ArrayList list2 = new ArrayList(((Cursor)o2).getCount());
                            while (((Cursor)o2).moveToNext()) {
                                list2.add((Object)aiq.a(((Cursor)o2).getBlob(0)));
                            }
                            ((Cursor)o2).close();
                            ((at)o).j();
                            list.addAll(list2);
                            o = b.a(list);
                            final UUID fromString = UUID.fromString(this.k);
                            final List q = this.q;
                            final int j = this.c.j;
                            final ail m = this.m;
                            o2 = m.a;
                            final apa g = this.g;
                            final ajk c2 = m.c;
                            int a5 = aoj.a;
                            o = new WorkerParameters(fromString, (aiq)o, q, (Executor)o2, g, c2, new aoi(this.o, this.n, g));
                            if (this.d == null) {
                                this.d = this.m.c.b(this.b, this.c.b, (WorkerParameters)o);
                            }
                            final ListenableWorker d = this.d;
                            if (d == null) {
                                aiy.a();
                                aiy.e(akl.a, String.format("Could not create Worker %s", this.c.b), new Throwable[0]);
                                this.b();
                                return;
                            }
                            if (d.d) {
                                aiy.a();
                                aiy.e(akl.a, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.c.b), new Throwable[0]);
                                this.b();
                                return;
                            }
                            d.d = true;
                            this.o.h();
                            try {
                                Label_1021: {
                                    if (this.p.h(this.k) == 1) {
                                        this.p.k(2, this.k);
                                        final anb p2 = this.p;
                                        o2 = this.k;
                                        ((anl)p2).a.g();
                                        final afn e = ((anl)p2).c.e();
                                        if (o2 == null) {
                                            e.f(1);
                                        }
                                        else {
                                            e.g(1, (String)o2);
                                        }
                                        ((anl)p2).a.h();
                                        try {
                                            e.a();
                                            ((anl)p2).a.j();
                                            ((anl)p2).a.i();
                                            ((anl)p2).c.f(e);
                                            a5 = 1;
                                            break Label_1021;
                                        }
                                        finally {
                                            ((anl)p2).a.i();
                                            ((anl)p2).c.f(e);
                                        }
                                    }
                                    a5 = n;
                                }
                                this.o.j();
                                this.o.i();
                                if (a5 == 0) {
                                    this.g();
                                    return;
                                }
                                if (!this.c()) {
                                    final aox h = aox.h();
                                    final aog aog = new aog(this.b, this.c, this.d, ((WorkerParameters)o).e, this.g);
                                    this.g.c.execute(aog);
                                    final aox f = aog.f;
                                    f.d(new aki(this, f, h), this.g.c);
                                    h.d(new akj(this, h, this.r), this.g.a);
                                }
                                return;
                            }
                            finally {
                                this.o.i();
                            }
                        }
                        finally {
                            ((Cursor)o2).close();
                            ((at)o).j();
                        }
                    }
                }
            }
            workDatabase.i();
        }
        finally {
            this.o.i();
            while (true) {}
        }
    }
}
