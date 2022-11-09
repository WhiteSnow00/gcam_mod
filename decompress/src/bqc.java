import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bqc extends bwx
{
    private final pii a;
    private final kse b;
    private final ewy c;
    private boolean d;
    
    public bqc(final pii a, final kjm kjm, final ewy c, final kse b) {
        super(kjm);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = false;
    }
    
    @Override
    protected final void a() {
        if (!this.c()) {
            this.c.c(new bqb(this));
        }
    }
    
    public final boolean c() {
        if (this.d) {
            return true;
        }
        this.b.f("CameraActivityControllerInitializer#initialize");
        final bqm bqm = (bqm)this.a.get();
        this.b.i();
        this.d = bqm.w();
        this.b.i();
        this.b.g();
        return this.d;
    }
}
