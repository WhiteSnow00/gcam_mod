import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bui implements oun
{
    private final pii a;
    private final pii b;
    private final /* synthetic */ int c;
    
    public bui(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public bui(final pii a, final pii b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public bui(final pii b, final pii a, final int c, final byte[] array) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    public final Executor a() {
        switch (this.c) {
            default: {
                return new cty(((krp)this.b).a(), (cxl)this.a.get(), new kjs(mcn.h("CameraFatalErrorTracker")));
            }
            case 1: {
                return new bua((Executor)this.a.get(), (oey)this.b.get());
            }
            case 0: {
                return ((bty)this.b.get()).a((Executor)this.a.get());
            }
        }
    }
}
