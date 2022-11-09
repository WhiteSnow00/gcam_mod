import java.util.concurrent.ScheduledFuture;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mji
{
    private static final mjh d;
    public volatile mjh a;
    public ScheduledFuture b;
    public ScheduledFuture c;
    
    static {
        d = mjc.a;
    }
    
    public mji(final mfp mfp, final ofb ofb) {
        this.a = mji.d;
        mfp.a(new mje(this, ofb));
        mfp.a(new mjg(this, ofb));
    }
    
    public final void a() {
        final ScheduledFuture b = this.b;
        if (b != null) {
            b.cancel(true);
            this.b = null;
        }
        final ScheduledFuture c = this.c;
        if (c != null) {
            c.cancel(true);
            this.c = null;
        }
    }
}
