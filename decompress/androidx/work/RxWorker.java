// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work;

import android.content.Context;
import java.util.concurrent.Executor;

public abstract class RxWorker extends ListenableWorker
{
    public static final Executor f;
    private ajd g;
    
    static {
        f = new bim(1);
    }
    
    public RxWorker(final Context context, final WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
    
    @Override
    public void aG() {
        final ajd g = this.g;
        if (g != null) {
            g.a();
            this.g = null;
        }
    }
    
    @Override
    public final oey b() {
        this.g = new ajd();
        final pfk pfk = new pfk(this.h(), pib.a(this.d()));
        pip.o();
        final pfg pfg = new pfg(pfk, pib.a(super.b.f.a));
        pip.o();
        pfg.m(this.g);
        return this.g.a;
    }
    
    public abstract oxk h();
}
