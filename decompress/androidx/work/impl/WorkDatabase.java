// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl;

import java.util.ArrayList;
import java.util.concurrent.Executor;
import android.content.Context;
import java.util.concurrent.TimeUnit;

public abstract class WorkDatabase extends aq
{
    private static final long j;
    
    static {
        j = TimeUnit.DAYS.toMillis(1L);
    }
    
    public static WorkDatabase r(final Context context, final Executor b, final boolean b2) {
        ao d;
        if (b2) {
            d = new ao(context, WorkDatabase.class, null);
            d.c();
        }
        else {
            d = cp.d(context, WorkDatabase.class, akf.b());
            d.c = new ajt(context);
        }
        d.b = b;
        final aju aju = new aju();
        if (d.a == null) {
            d.a = new ArrayList();
        }
        d.a.add(aju);
        d.b(ake.a);
        d.b(new akc(context, 2, 3));
        d.b(ake.b);
        d.b(ake.c);
        d.b(new akc(context, 5, 6));
        d.b(ake.d);
        d.b(ake.e);
        d.b(ake.f);
        d.b(new akd(context));
        d.b(new akc(context, 10, 11));
        d.b(ake.g);
        d.d();
        return (WorkDatabase)d.a();
    }
    
    public static String t() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ");
        sb.append(System.currentTimeMillis() - WorkDatabase.j);
        sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
        return sb.toString();
    }
    
    public abstract anb s();
    
    public abstract ami u();
    
    public abstract aml v();
    
    public abstract amp w();
    
    public abstract ams x();
    
    public abstract amx y();
    
    public abstract ano z();
}
