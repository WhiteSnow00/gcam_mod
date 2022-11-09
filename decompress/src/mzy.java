import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250AutoWorker;
import com.google.android.libraries.vision.visionkit.f250.internal.uploader.work.F250Worker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mzy extends ajk
{
    final /* synthetic */ mzw a;
    final /* synthetic */ mzh b;
    
    public mzy(final mzw a, final mzh b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final ListenableWorker a(final Context context, final String s, final WorkerParameters workerParameters) {
        context.getClass();
        s.getClass();
        workerParameters.getClass();
        F250Worker f250Worker;
        if (plr.b(s, F250Worker.class.getName())) {
            final mzw a = this.a;
            final lmy lmy = (lmy)a.a.get();
            lmy.getClass();
            final mwt mwt = (mwt)a.b.get();
            mwt.getClass();
            final mws mws = (mws)a.c.get();
            mws.getClass();
            final nar nar = (nar)a.d.get();
            nar.getClass();
            final mza mza = (mza)a.e.get();
            mza.getClass();
            final naa a2 = ((nab)a.f).a();
            final Integer n = (Integer)a.g.get();
            n.getClass();
            final int intValue = n;
            final oxj oxj = (oxj)a.h.get();
            oxj.getClass();
            final Context context2 = (Context)a.i.get();
            context2.getClass();
            workerParameters.getClass();
            f250Worker = new F250Worker(lmy, mwt, mws, nar, mza, a2, intValue, oxj, context2, workerParameters);
        }
        else {
            if (plr.b(s, F250AutoWorker.class.getName())) {
                final mzh b = this.b;
                final lmy lmy2 = (lmy)b.a.get();
                lmy2.getClass();
                final mza mza2 = (mza)b.b.get();
                mza2.getClass();
                final mvy mvy = (mvy)b.c.get();
                mvy.getClass();
                final nae a3 = ((naf)b.d).a();
                final mwm mwm = (mwm)b.e.get();
                mwm.getClass();
                final myy myy = (myy)b.f.get();
                myy.getClass();
                final Context context3 = (Context)b.g.get();
                context3.getClass();
                workerParameters.getClass();
                return new F250AutoWorker(lmy2, mza2, mvy, a3, mwm, myy, context3, workerParameters);
            }
            f250Worker = null;
        }
        return f250Worker;
    }
}
