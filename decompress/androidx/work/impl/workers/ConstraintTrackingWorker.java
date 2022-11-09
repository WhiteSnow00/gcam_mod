// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work.impl.workers;

import java.util.List;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.ListenableWorker;

public class ConstraintTrackingWorker extends ListenableWorker implements ale
{
    public static final String f;
    public WorkerParameters g;
    public final Object h;
    public volatile boolean i;
    public ListenableWorker j;
    public aox k;
    
    static {
        f = aiy.b("ConstraintTrkngWrkr");
    }
    
    public ConstraintTrackingWorker(final Context context, final WorkerParameters g) {
        super(context, g);
        this.g = g;
        this.h = new Object();
        this.i = false;
        this.k = aox.h();
    }
    
    @Override
    public final void aG() {
        final ListenableWorker j = this.j;
        if (j != null && !j.c) {
            this.j.aH();
        }
    }
    
    @Override
    public final oey b() {
        this.d().execute(new apb(this));
        return this.k;
    }
    
    @Override
    public final void e(final List list) {
    }
    
    @Override
    public final void f(final List list) {
        final aiy a = aiy.a();
        String.format("Constraints changed for %s", list);
        a.d(new Throwable[0]);
        synchronized (this.h) {
            this.i = true;
        }
    }
    
    @Override
    public final boolean g() {
        final ListenableWorker j = this.j;
        return j != null && j.g();
    }
    
    public final void h() {
        this.k.e(cwx.e());
    }
    
    public final void i() {
        this.k.e(new aiw());
    }
}
