import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class glf implements hub, exn, ewp
{
    public final Context a;
    public final ewn b;
    public final brk c;
    private final Executor d;
    private final kse e;
    
    public glf(final Context a, final Executor d, final kse e, final ewn b, final brk c) {
        this.a = a;
        this.d = d;
        this.e = e;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a() {
        this.b();
    }
    
    public final void b() {
        this.d.execute(this.e.c("PhenotypeHelper#commitFlags", new gle(this, 1)));
    }
    
    @Override
    public final void run() {
        this.d.execute(this.e.c("PhenotypeHelper#retrieveFlags", new gle(this)));
    }
}
