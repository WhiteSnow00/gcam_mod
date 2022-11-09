import android.content.Intent;
import android.content.Context;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

final class aoh implements Runnable
{
    final /* synthetic */ UUID a;
    final /* synthetic */ ais b;
    final /* synthetic */ Context c;
    final /* synthetic */ aoi d;
    final /* synthetic */ aox e;
    
    public aoh(final aoi d, final aox e, final UUID a, final ais b, final Context c) {
        this.d = d;
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        try {
            Label_0255: {
                if (!this.e.isCancelled()) {
                    final String string = this.a.toString();
                    final int h = this.d.b.h(string);
                    if (h != 0 && !cwz.f(h)) {
                        final alz a = this.d.a;
                        final ais b = this.b;
                        Object o = ((ajp)a).g;
                        synchronized (o) {
                            aiy.a();
                            String.format("Moving WorkSpec (%s) to the foreground", string);
                            aiy.f(new Throwable[0]);
                            final akl akl = ((ajp)a).e.remove(string);
                            if (akl != null) {
                                if (((ajp)a).b == null) {
                                    (((ajp)a).b = aod.a(((ajp)a).c, "ProcessorForegroundLck")).acquire();
                                }
                                ((ajp)a).d.put(string, akl);
                                aak.c(((ajp)a).c, amc.c(((ajp)a).c, string, b));
                            }
                            monitorexit(o);
                            o = amc.b(this.c, string, this.b);
                            this.c.startService((Intent)o);
                            break Label_0255;
                        }
                    }
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
            }
            this.e.e(null);
        }
        finally {
            final Throwable t;
            this.e.f(t);
        }
    }
}
