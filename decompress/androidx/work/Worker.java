// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work;

import android.content.Context;

public abstract class Worker extends ListenableWorker
{
    public aox f;
    
    public Worker(final Context context, final WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
    
    @Override
    public final oey b() {
        this.f = aox.h();
        this.d().execute(new aji(this));
        return this.f;
    }
    
    public abstract cwx h();
}
