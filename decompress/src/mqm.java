import android.os.StrictMode$ThreadPolicy;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import android.os.StrictMode;
import java.util.Map;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

final class mqm extends mpi
{
    private volatile String a;
    
    public mqm(final mny mny, final String s, final boolean b) {
        super(mny, s, b);
    }
    
    @Override
    protected final oey a() {
        if (this.a.isEmpty()) {
            return oev.a;
        }
        return oco.i(this.d.c().a(this.a), mom.class, new mqj(this, 1), this.d.b());
    }
    
    @Override
    protected final Map b() {
        final StrictMode$ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            try {
                final mqp mqp = (mqp)okn.C(mqo.g(this.d, this.e, this.f, super.i).a());
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
            }
            finally {}
        }
        catch (final CancellationException ex) {}
        catch (final ExecutionException ex2) {}
        final String e = this.e;
        final StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 51);
        sb.append("Unable to retrieve flag snapshot for ");
        sb.append(e);
        sb.append(" from storage.");
        final CancellationException ex;
        Log.w("ProtoDataStoreFlagStore", sb.toString(), (Throwable)ex);
        StrictMode.setThreadPolicy(allowThreadDiskWrites);
        ex = null;
        if (ex != null && !((mqp)ex).b.isEmpty()) {
            this.a = ((mqp)ex).b;
            this.d.b().execute(new mqk(this, 1));
            this.d.b().execute(new mqk(this, 2));
            return mqo.c((mqp)ex);
        }
        this.d.b().execute(new mqk(this));
        final String e2 = this.e;
        final StringBuilder sb2 = new StringBuilder(String.valueOf(e2).length() + 54);
        sb2.append("Unable to retrieve flag snapshot for ");
        sb2.append(e2);
        sb2.append(", using defaults.");
        Log.w("ProtoDataStoreFlagStore", sb2.toString());
        return nqq.a;
        StrictMode.setThreadPolicy(allowThreadDiskWrites);
    }
    
    @Override
    protected final void c() {
        final oey d = mqo.d(this.d, this.e, super.f);
        odg.i(d, new mqj(this), this.d.b()).d(new mql(this, d, 1), this.d.b());
    }
}
