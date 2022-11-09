import com.google.googlex.gcam.StaticMetadata;
import java.util.concurrent.Executors;
import com.google.googlex.gcam.creativecamera.seedark.SeeDarkNativeImpl;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ohh implements krc
{
    public final ogz a;
    public final ohs b;
    public final ohv c;
    public final Object d;
    public final ExecutorService e;
    public boolean f;
    public Future g;
    public Future h;
    public long i;
    
    public ohh(final lfg lfg, final lfh lfh) {
        final StaticMetadata q = ohv.q(lfg);
        final SeeDarkNativeImpl a = new SeeDarkNativeImpl();
        final ohs b = new ohs();
        final ohv c = new ohv(lfg, lfh);
        final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        this.d = new Object();
        this.f = false;
        this.i = 0L;
        this.a = a;
        this.b = b;
        this.c = c;
        (this.e = singleThreadExecutor).execute(new ohc(this, StaticMetadata.b(q)));
    }
    
    @Override
    public final void close() {
        synchronized (this.d) {
            if (this.f) {
                return;
            }
            this.f = true;
            this.e.execute(new ohb(this));
            this.e.shutdown();
        }
    }
}
