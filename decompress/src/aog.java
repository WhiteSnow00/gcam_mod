import androidx.work.ListenableWorker;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aog implements Runnable
{
    final Context a;
    final ana b;
    final ListenableWorker c;
    final ait d;
    final apa e;
    public final aox f;
    
    static {
        aiy.b("WorkForegroundRunnable");
    }
    
    public aog(final Context a, final ana b, final ListenableWorker c, final ait d, final apa e) {
        this.f = aox.h();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final void run() {
        if (this.b.o && !aah.b()) {
            final aox h = aox.h();
            this.e.c.execute(new aoe(h));
            h.d(new aof(this, h), this.e.c);
            return;
        }
        this.f.e(null);
    }
}
