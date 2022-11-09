import android.content.Context;
import java.util.Collections;
import android.text.TextUtils;
import androidx.work.impl.workers.ConstraintTrackingWorker;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apb implements Runnable
{
    final /* synthetic */ ConstraintTrackingWorker a;
    
    public apb(final ConstraintTrackingWorker a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final ConstraintTrackingWorker a = this.a;
        final Object value = a.a().b.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        String s;
        if (value instanceof String) {
            s = (String)value;
        }
        else {
            s = null;
        }
        if (TextUtils.isEmpty((CharSequence)s)) {
            aiy.a();
            aiy.e(ConstraintTrackingWorker.f, "No worker to delegate to.", new Throwable[0]);
            a.h();
            return;
        }
        a.j = a.b.d.b(a.a, s, a.g);
        if (a.j == null) {
            aiy.a().d(new Throwable[0]);
            a.h();
            return;
        }
        final ana a2 = akh.e(a.a).d.s().a(a.c().toString());
        if (a2 == null) {
            a.h();
            return;
        }
        final Context a3 = a.a;
        final alf alf = new alf(a3, akh.e(a3).j, a);
        alf.a(Collections.singletonList(a2));
        if (alf.c(a.c().toString())) {
            final aiy a4 = aiy.a();
            String.format("Constraints met for delegate %s", s);
            a4.d(new Throwable[0]);
            try {
                final oey b = a.j.b();
                b.d(new apc(a, b), a.d());
                return;
            }
            finally {
                final aiy a5 = aiy.a();
                String.format("Delegated worker %s threw exception in startWork.", s);
                final Throwable t;
                a5.d(t);
                synchronized (a.h) {
                    if (a.i) {
                        aiy.a().d(new Throwable[0]);
                        a.i();
                    }
                    else {
                        a.h();
                    }
                    return;
                }
            }
        }
        final aiy a6 = aiy.a();
        String.format("Constraints not met for delegate %s. Requesting retry.", s);
        a6.d(new Throwable[0]);
        a.i();
    }
}
