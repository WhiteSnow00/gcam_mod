import java.util.UUID;
import android.content.Context;
import androidx.work.ListenableWorker;

// 
// Decompiled by Procyon v0.6.0
// 

final class aof implements Runnable
{
    final /* synthetic */ aog a;
    final /* synthetic */ aox b;
    
    public aof(final aog a, final aox b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        try {
            final ais ais = (ais)this.b.get();
            if (ais != null) {
                final aiy a = aiy.a();
                final int g = aog.g;
                String.format("Updating notification for %s", this.a.b.b);
                a.d(new Throwable[0]);
                final aog a2 = this.a;
                final ListenableWorker c = a2.c;
                c.e = true;
                final aox f = a2.f;
                final ait d = a2.d;
                final Context a3 = a2.a;
                final UUID c2 = c.c();
                final aox h = aox.h();
                ((aoi)d).c.a(new aoh((aoi)d, h, c2, ais, a3));
                f.g(h);
                return;
            }
            throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", this.a.b.b));
        }
        finally {
            final Throwable t;
            this.a.f.f(t);
        }
    }
}
